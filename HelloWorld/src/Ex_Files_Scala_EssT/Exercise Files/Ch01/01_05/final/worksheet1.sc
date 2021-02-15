object worksheet1 {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  var x = 5                                       //> x  : Int = 5
  val str = "Scala Rocks!"                        //> str  : String = Scala Rocks!
  var odds = List(1,3,5,7,9)                      //> odds  : List[Int] = List(1, 3, 5, 7, 9)
  2 to 10                                         //> res0: scala.collection.immutable.Range.Inclusive = Range(2, 3, 4, 5, 6, 7, 8
                                                  //| , 9, 10)
  var y = true                                    //> y  : Boolean = true
  val pi = 3.14159                                //> pi  : Double = 3.14159
  def add(a:Int, b:Int):Int = a + b               //> add: (a: Int, b: Int)Int
  add(4,9)                                        //> res1: Int = 13
}