object loopsPractice {
  var x = 10                                      //> x  : Int = 10
  /*while(x >= 0) {
  println(x)
  x -= 1 //same as x = x-1
  }
  do {
  println(x)
  x -= 1
  } while(x >=0 )
  for(x <- 10 to 0 by -1) {
  println(x)
  }
  println("BlastOff!")
  var y = for(num <- 1 to 10) yield num + 1  */
  var word = "Monday"                             //> word  : String = Monday
  for(x <- 0 until word.length) { println(word(x))}
                                                  //> M
                                                  //| o
                                                  //| n
                                                  //| d
                                                  //| a
                                                  //| y
 
}