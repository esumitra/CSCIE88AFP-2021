package com.cscie88a.scala_streams

import fs2.Stream
import cats.implicits._
import com.cscie88a.testutils.StandardTest

class MySimpleStreamsTest extends StandardTest {
  "an empty stream in MySimpleStreamsTest" should {
    val emptyStream = Stream.empty

    "have size zero" in {
      emptyStream.toList.size should be (0)
    }
  }

}
