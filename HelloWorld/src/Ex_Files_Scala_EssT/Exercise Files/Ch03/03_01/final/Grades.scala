
import io.StdIn._
object Grades extends App {
  var done = false
  while(!done)
  {
    var name = readLine("Enter the student name:")
    println("Enter student score: ")
    var score = readDouble()
    println("You received an " + (if(score >90) "A" else
      if(score >80) "B" else
        if(score > 70) "C" else
          if(score > 60) "D" else
            "F" ))
    println("Enter true if done, false to continue: ")
    done = readBoolean()
  }
  
}