object payrollSolution {
  var rate = 10.5                                 //> rate  : Double = 10.5
  def earnings(s:String, h:Double):String = {
  if(s=="h") { if(h<=40) "Weekly paycheck is $"+h*rate
  						 else "Weekly paycheck is $" + (40*rate +
  						 (h-40)*rate*1.5)
  						 }
  else "This is a salaried employee" }            //> earnings: (s: String, h: Double)String
  
  println(earnings("h", 20))                      //> Weekly paycheck is $210.0
  println(earnings("h", 40))                      //> Weekly paycheck is $420.0
  println(earnings("h", 50))                      //> Weekly paycheck is $577.5
  println(earnings("s", 0))                       //> This is a salaried employee
}