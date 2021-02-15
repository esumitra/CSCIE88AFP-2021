object variables {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  var greeting, message:String = null             //> greeting  : String = null
                                                  //| message  : String = null
  
  val list1 = List(1, 2, 3)                       //> list1  : List[Int] = List(1, 2, 3)
  val list2 = List(1, 2, 3.0)                     //> list2  : List[Double] = List(1.0, 2.0, 3.0)
  val list3 = List(1, 2, true)                    //> list3  : List[AnyVal] = List(1, 2, true)
  val list4 = List(1, 2, true, "Peggy")           //> list4  : List[Any] = List(1, 2, true, Peggy)
  
  var a = 10.toString()                           //> a  : String = 10
  var b = 10.to(20)                               //> b  : scala.collection.immutable.Range.Inclusive = Range(10, 11, 12, 13, 14, 
                                                  //| 15, 16, 17, 18, 19, 20)
  var c = 10.+(11)                                //> c  : Int = 21
  var d = 10 to 20                                //> d  : scala.collection.immutable.Range.Inclusive = Range(10, 11, 12, 13, 14, 
                                                  //| 15, 16, 17, 18, 19, 20)
  var e = 10 + 11                                 //> e  : Int = 21
  var f = 97.toChar                               //> f  : Char = a
  var g = 85.97.toInt                             //> g  : Int = 85
  
  a += " ten"
  println(a)                                      //> 10 ten
}