package com.cscie88a.scala_intermediate

import com.cscie88a.testutils.StandardTest

class FunctionUtils2Test extends StandardTest {
  "an empty list in FunctionUtils2" should {
    val emptyList: List[String] = List.empty

    "have size zero" in {
      emptyList.size should be (0)
    }
  }

}
