import java.util.Date

object PartiallyAppliedFunction {

  def log (date:Date, message :String )={
    println(date + "   "+ message)
  }

  def main(args: Array[String]): Unit = {
    val date = new Date()
    val log2 = log(date,_ :String)
    log(date,"hello")
    log2("hello")
    log2("hi")
  }
}
