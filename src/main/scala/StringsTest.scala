object StringsTest {
  val num = 10
  val floatNum = 12.4
  val str = "Hello World!"

  def main(args: Array[String]): Unit = {
    printf("%d -- %f -- %s" , num ,floatNum ,str)
    println()
    println("%d -- %f -- %s".format(num ,floatNum ,str))
  }
}
