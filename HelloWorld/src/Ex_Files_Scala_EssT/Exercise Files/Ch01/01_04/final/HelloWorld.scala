object HelloWorld {
  def main(args: Array[String]): Unit = {
    //this is my first Scala program
    println("Hello, world!") 
    /*
     * declare variables
     */
    var firstName:String = "Peggy"
    val age:Int = 21
    println(firstName + ", is \n"+age+" years old")
    var sum = 10 + 
    25
    def function1:Unit = {
      println("This is function1")
    }
    function1 
  } 
}