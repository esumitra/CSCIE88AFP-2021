package com.cscie88a
import com.cscie88a.util.StreamUtils
import org.scalatest.{AsyncWordSpec, BeforeAndAfterAll, Matchers}

/**
  * To write a new test, extend the AkkaSpec trait as shown below
  *
  * {{{
  * class MyAkkaTest extends AkkaSpec {
  *   (Future {
  *      "future value"
  *   }).map (_ should be "future value")
  * }
  * }}}
  */
trait AkkaSpec extends AsyncWordSpec
  with Matchers
  with BeforeAndAfterAll {
  // create the akka system for stream materialization
  implicit val (sys, mat, _) = StreamUtils.actorSystemInstances("AkkaStreamTest")

  // shutdown the akka system after tests
  override protected def afterAll(): Unit = {
    sys.terminate()
    super.afterAll()
  }
}