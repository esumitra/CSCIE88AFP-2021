object addsubtract {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  def add(a:Int, b:Int) = a + b                   //> add: (a: Int, b: Int)Int
  def subtract(c:Int, d:Int) = c - d              //> subtract: (c: Int, d: Int)Int
  
  add(10,20)                                      //> res0: Int = 30
  subtract(10,20)                                 //> res1: Int = -10
  add(100, 900)                                   //> res2: Int = 1000
  subtract (40, 40)                               //> res3: Int = 0
  
}