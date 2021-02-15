object arrayExample {
  var nums = new Array[Any](10)                   //> nums  : Array[Any] = Array(null, null, null, null, null, null, null, null, nu
                                                  //| ll, null)
  var furniture = Array("chair", "sofa", "table", "bed")
                                                  //> furniture  : Array[String] = Array(chair, sofa, table, bed)
  
  for(f<-furniture)println(f)                     //> chair
                                                  //| sofa
                                                  //| table
                                                  //| bed
  println(furniture(0))                           //> chair
  var a = Array(1,2,3,4,5)                        //> a  : Array[Int] = Array(1, 2, 3, 4, 5)
  var result = for(n<-a) yield 2*n                //> result  : Array[Int] = Array(2, 4, 6, 8, 10)
  var even = for(n<-a if n%2==0) yield n          //> even  : Array[Int] = Array(2, 4)
}