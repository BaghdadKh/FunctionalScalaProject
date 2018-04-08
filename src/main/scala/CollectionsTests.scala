object CollectionsTests {
  def main(args: Array[String]): Unit = {
    //Arrays
    val arr = Array(1,2,3)
    val arr2 = new Array[String](2)
    var arr3 = Array()
    //    println(arr3.length)
    arr(2) = 9

    //Lists
    val mylist = List(1,2,3,4,5)
    println(0::mylist)
    println("Creating list by Nil")
    println(1::8::0::Nil)
    println(List.fill(6)(5))// create list 6 items with value 5 repeated
    println(mylist.max)
    println("The sum of mylist elements is  :  " + mylist.sum)

    //Sets
    val myset =Set(1,2,3,3) // remove duplicates
    val set1=Set(1,5,9)
    val set2=Set(2,6,7)
    println(myset)
    println(set1++set2)
    println(set1+15)
    println(set1)
    println(set1&set2) //intersection

    //scala.collection.mutable.Set

    //Maps
    val myMap=Map(1->"map",2->"set",3->"list")
    val myMap2=Map(4->"tuples")
    println(myMap.keys)//keys is set
    println(myMap)
    println(myMap(2))
    myMap.keys.foreach(key => println(key+ "  " + myMap(key)))
    println(myMap ++ myMap2)
    println(myMap + (5->"tuples"))

    //tuples
    val mytuple=(4,7,"hi")
    val mytuple2= new Tuple4(4,7,"hi",true) //possible to tuple22
    val mytuple3 = (2009 , "Baghdad",("just","cpe"))
    println(mytuple)
    println(mytuple._2)
    mytuple2.productIterator.foreach{
      i => println(i)
    }
    println(2009 -> "Baghdad") //create tuple
    println(2009 -> "Baghdad"->"just") // ((200,baghdad),just)

    println(mytuple3._3._1 + "  --  " +mytuple3._3._2)
  }
}

