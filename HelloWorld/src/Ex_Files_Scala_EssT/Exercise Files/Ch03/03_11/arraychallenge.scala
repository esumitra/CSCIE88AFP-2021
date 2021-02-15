

object arraychallenge extends App {
  def avg(a:Array[Int]):Double ={
    var sum = 0
    for(v<-a) yield sum+=v
    sum/a.length
  }
  var min = (a:Array[Int]) => {
    var m = a(0)
    for(v<-a)if(v<m)m=v
    m
  }
  var max = (a:Array[Int]) => {
    var m = a(0)
    for(v<-a)if(v>m)m = v
    m
  }
  
  var numArray = Array(10, 20, 35, 4, 34, 45, 100)
  println("Average is: " +avg(numArray))
  println("Min value is: "+min(numArray))
  println("Max value is: "+max(numArray))
  
}