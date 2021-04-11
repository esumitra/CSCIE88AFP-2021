package com.cscie88a.akka_kafka

import akka.stream._
import akka.stream.scaladsl._
import akka.{Done, NotUsed}
import akka.util.ByteString
import akka.actor.ActorSystem

import scala.concurrent._
import scala.concurrent.duration._
import cats.implicits._
import org.apache.kafka.clients.producer.ProducerRecord
import akka.kafka.{ConsumerSettings, ProducerSettings}
import org.apache.kafka.common.serialization.{ByteArrayDeserializer, StringDeserializer, StringSerializer}
import akka.kafka.scaladsl._
import org.apache.kafka.clients.consumer.ConsumerRecord
import akka.kafka.Subscriptions
import com.cscie88a.util.StreamUtils._

object MyKafkaConsumer {
  import defaultActorSystem._

  // source config
  val MyTopic = "orders"
  val KafkaConfPath = "com.example.akka.kafka.consumer"
  val config = akkaStreams1System.settings.config.getConfig(KafkaConfPath)
  val consumerSettings =
    ConsumerSettings(config, new StringDeserializer, new StringDeserializer)

  // Source
  val kafkaSource: Source[ConsumerRecord[String, String], Consumer.Control] =
    Consumer
      .plainSource(consumerSettings, Subscriptions.topics(MyTopic))

  // Flow
  val maxFlow: Flow[ConsumerRecord[String, String], Int, NotUsed] =
    Flow[ConsumerRecord[String, String]]
      .map { record =>
        record.value.toInt
      }
      .conflate((a, b) => if (a < b) b else a)
      .throttle(1, 5 seconds)

  // Sink
  def printSink[I]: Sink[I, Future[Done]] =
    Sink.foreach(v => println(s"record: $v"))

  // Processing Pipeline 1
  val kafkaConsumerPipeline: RunnableGraph[Future[Done]] =
    kafkaSource
      .via(maxFlow)
      .toMat(printSink)(Keep.right)
}
