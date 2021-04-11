package com.cscie88a.akka_kafka

import akka.stream.scaladsl._
import com.cscie88a.AkkaSpec

import scala.concurrent.Future

class MyAsyncAkkaStreamsTest extends AkkaSpec {

  "empty stream should have size 0" in {
    Source.empty.runWith(Sink.seq).map { s =>
      s.size should be (0)
    }
  }

  // add tests below
  
}
