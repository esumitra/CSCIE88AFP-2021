

object payroll extends App {
  var e1 = new Employee("Sam", "Paulson")
  var e2 = new Employee("Doris", "Jones", salaried = 's')
  println(e1)
  println(e2)

}

class Employee(val fName:String, val lName:String, var salaried:Char = 'n') {
  def fullName:String = fName + " " +lName
  var employeeID = Employee.newEEID()
  override def toString = "Employee name: " + fullName + "\nEmployee ID: " + 
  employeeID +
  (if(salaried == 'n') "\nHourly Employee" else "\nSalaried Employee")+
  ("\n" + "="*20)
  
}
object Employee {
  var employeeID = 0
  def newEEID() = {employeeID +=1
    employeeID
  }
}
     