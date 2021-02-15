object mapExamples {
	var groceries = Map(1 -> "milk", 2 -> "bread", 3 -> "juice", 4 ->"eggs")
                                                  //> groceries  : scala.collection.immutable.Map[Int,String] = Map(1 -> milk, 2 ->
                                                  //|  bread, 3 -> juice, 4 -> eggs)
	groceries = groceries+(5->"hashbrowns")
	groceries.get(3)                          //> res0: Option[String] = Some(juice)
	groceries(3)                              //> res1: String = juice
	groceries.getOrElse(6,"No Match")         //> res2: String = No Match
	for(v<-groceries.values)println(v)        //> hashbrowns
                                                  //| milk
                                                  //| bread
                                                  //| juice
                                                  //| eggs
	var z = for((k,v)<-groceries) yield (v,k) //> z  : scala.collection.immutable.Map[String,Int] = Map(eggs -> 4, milk -> 1, 
                                                  //| hashbrowns -> 5, juice -> 3, bread -> 2)
	groceries.foreach(println)                //> (5,hashbrowns)
                                                  //| (1,milk)
                                                  //| (2,bread)
                                                  //| (3,juice)
                                                  //| (4,eggs)

}