

object Account extends App {
  var b1 = new BankAccount("Peggy Fisher", 50.00)
  var b2 = new BankAccount("Patty Gelin", 500.00, 's')
  List(b1, b2).foreach(println)
}
class BankAccount(name:String, balance:Double, typeOfAcct:Char = 'c') {
  
  var accountNumber = BankAccount.nextAcctNum()
  override def toString = "Client name: " + name + " balance $"+balance + 
  (if(typeOfAcct == 'c') "\nChecking" else "\nSavings") + "\nAccount Number: " + 
  accountNumber + "\n" + "*"*30
}
object BankAccount {
  var accountNum = 5000
  def nextAcctNum() = { accountNum += 1
    accountNum
  }
}