package com.cscie88a.util

import akka.{Done, NotUsed}
import akka.actor.ActorSystem
import akka.stream.ActorMaterializer
import akka.stream.scaladsl.Source

import scala.concurrent.{ExecutionContext, Future}

/**
* Utility methods for working with akka streams
  */
object StreamUtils {

  /**
    * creates and returns actor system, materializer, and execution context
    * @param name name of actor system
    * @return (actor-system, actor-materializer, execution-context)
    */
  def actorSystemInstances(name: String): (ActorSystem,ActorMaterializer,ExecutionContext) = {
    val akkaSystem = ActorSystem(s"$name-Actor-System")
    val akkaMaterializer = ActorMaterializer()(akkaSystem)
    val akkaStreamsEC = akkaSystem.dispatcher
    (akkaSystem, akkaMaterializer, akkaStreamsEC)
  }

  /**
    * default instance of an actor system
    */
  object defaultActorSystem {
    implicit val (akkaStreams1System, akkaStreams1Materializer, akkaStreams1EC) = actorSystemInstances("Default-Actor-System")

    def shutdown() =
      akkaStreams1System.terminate()
  }

  /**
    * helper function to run simple stream processing pipelines in the console
    * Use in the console as shown below
    *
    * {{{
    * import cscie88a.util.StreamUtils
    * // other akka stream imports
    *
    * val src1 = Source(1 to 10)
    * val flow1 = Flow[Int].map(_ + 10)
    * StreamUtils.printStream(src1.via(flow1))
    * }}}
    *
    * @param source
    * @tparam O type of item in stream
    * @return
    */
  def printStream[O](source: Source[O, NotUsed]): Future[Done] = {
    import defaultActorSystem._
    source.runForeach(println)
  }


}
