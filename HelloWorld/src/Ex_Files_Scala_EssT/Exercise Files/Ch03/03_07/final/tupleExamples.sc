object tupleExamples {
  val v = (1, 1.4, "Hello")                       //> v  : (Int, Double, String) = (1,1.4,Hello)
  var x = v._3                                    //> x  : String = Hello
  val(first, second, third) = v                   //> first  : Int = 1
                                                  //| second  : Double = 1.4
                                                  //| third  : String = Hello
  val symbols = Array("<", "-", ">")              //> symbols  : Array[String] = Array(<, -, >)
  val counts = Array(2,10,2)                      //> counts  : Array[Int] = Array(2, 10, 2)
  val pairs = symbols.zip(counts)                 //> pairs  : Array[(String, Int)] = Array((<,2), (-,10), (>,2))
  for((s,n)<- pairs)print(s*n)                    //> <<---------->>
  println                                         //> 
  def divide10(n:Int):Tuple2[Int, Int] =
  	(n/10,n%10)                               //> divide10: (n: Int)(Int, Int)
  val(tens,ones) = divide10(9)                    //> tens  : Int = 0
                                                  //| ones  : Int = 9
}