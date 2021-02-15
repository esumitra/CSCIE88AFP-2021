

object caseClassExample extends App {
  val alice = Person("Alice", 25)
  val rabbit = Person("Bugs",  50)
  val duck = Person("Donald",  21)
 
}
case class Person(fName:String, age:Int) 