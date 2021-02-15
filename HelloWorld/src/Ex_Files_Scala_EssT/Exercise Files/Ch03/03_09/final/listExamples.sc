object listExamples {
  var l = List(3.0, 5, 'a')                       //> l  : List[Double] = List(3.0, 5.0, 97.0)
  var l2 = 1::2::3::4::5::Nil                     //> l2  : List[Int] = List(1, 2, 3, 4, 5)
  var l3 = List.range(10, 20)                     //> l3  : List[Int] = List(10, 11, 12, 13, 14, 15, 16, 17, 18, 19)
  var l4 = l:::l2                                 //> l4  : List[AnyVal] = List(3.0, 5.0, 97.0, 1, 2, 3, 4, 5)
  
  var sum = 0                                     //> sum  : Int = 0
  l3.foreach(sum+=_)
  println(sum)                                    //> 145
  val list = List((1,2), (3,4), (5,6))            //> list  : List[(Int, Int)] = List((1,2), (3,4), (5,6))
  for((a,b)<-list) yield a+b                      //> res0: List[Int] = List(3, 7, 11)
}