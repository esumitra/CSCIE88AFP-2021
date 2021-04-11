package com.cscie88a.akka_kafka

import akka.Done
import akka.stream.scaladsl._
import com.cscie88a.AkkaSpec

import scala.concurrent.Future

class MyKafkaConsumerTest extends AkkaSpec {

  "Kafka Consumer" should {

    "print maximum value so far" in {
      val result: Future[Done] = MyKafkaConsumer.kafkaConsumerPipeline.run()
      result.map(_ => succeed)
    }
  }

}
