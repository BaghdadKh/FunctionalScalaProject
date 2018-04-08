// Closures and Currying
object Closures {
  val number =10
  var num =10
  //add is closure ; result is same every excution of number
  def add (x:Int) = x + number

  //sum is closure ; result is differ every excution of num
  def sum (x:Int) = x + num

//currying
  def sum2 (x:Int) = (y:Int) => x+y
  def sum4 (x:Int)(y:Int) = x+y
  def main(args: Array[String]): Unit = {
    num = 20
    println("The result of closure is " + add (4))
    println("The result of another closure is " + sum (4) + " num here is 20 not 10 ")

    println()
    println("Results for currying ")
    println("The sum of 3 , 8   : " + sum4(3)(8))
    val sum3 = sum2(3)
    println("The sum of 3 , 8 : " +sum3(8))
    val s = sum4(3)_
    println("The sum of 3 , 8   : " + s(8))
  }
}
