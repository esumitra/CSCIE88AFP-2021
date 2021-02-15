object setExamples {
  val fruit = Set("apple", "orange", "banana")    //> fruit  : scala.collection.immutable.Set[String] = Set(apple, orange, banana)
                                                  //| 
  var moreFruit = Set("kiwi", "pineapple")        //> moreFruit  : scala.collection.immutable.Set[String] = Set(kiwi, pineapple)
  var nums = Set(1,2,3,4,5)                       //> nums  : scala.collection.immutable.Set[Int] = Set(5, 1, 2, 3, 4)
  var moreNums = Set(6, 7, 8, 9)                  //> moreNums  : scala.collection.immutable.Set[Int] = Set(6, 7, 8, 9)
  nums.contains(5)                                //> res0: Boolean = true
  nums(3)                                         //> res1: Boolean = true
  var mixed = fruit ++ nums                       //> mixed  : scala.collection.immutable.Set[Any] = Set(5, banana, 1, orange, 2, 
                                                  //| 3, apple, 4)
  nums -= 5
  println(nums)                                   //> Set(1, 2, 3, 4)
  nums & moreNums                                 //> res2: scala.collection.immutable.Set[Int] = Set()
  moreFruit.head                                  //> res3: String = kiwi
  moreFruit.tail                                  //> res4: scala.collection.immutable.Set[String] = Set(pineapple)
  moreNums.isEmpty                                //> res5: Boolean = false
                                           
                                                  
                                                 
}