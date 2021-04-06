package com.cscie88a.akka_streams

import akka.stream.scaladsl._
import com.cscie88a.AkkaSpec

import scala.concurrent.Future

class MySimpleAkkaStreamTest extends AkkaSpec {

  "empty stream should have size 0" in {
    Source.empty.runWith(Sink.seq).map { s =>
      s.size should be (0)
    }
  }

  "first 5 elements of a stream of ints should materialize correctly" in {
    Source(1 to 100)
      .take(5)
      .runWith(Sink.seq)
      .map {_.toList shouldBe(List(1,2,3,4,5))}
  }

  "print a stream of integers" in {
    Source(1 to 10)
      .runWith(Sink.foreach(println))
      .map(_ => succeed)
  }

  // add tests below
}
