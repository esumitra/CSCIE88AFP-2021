package com.cscie88a.akka_kafka

import akka.Done
import akka.stream.scaladsl._
import com.cscie88a.AkkaSpec

import scala.concurrent.Future

class MyKafkaProducerTest extends AkkaSpec {

  "KafkaProducer" should {
    "produce finite int values for pipeline 1" in {
      val result: Future[Done] = MyKafkaProducer.kafkaProducerPipeline.run()
      result.map(_ => succeed)
    }
  }

}
