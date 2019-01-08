package Exercises.d04

/*
编写一个Time类，加入只读属性hours和minutes，
和一个检查某一时刻是否早于另一时刻的方法before(other:Time):Boolean。
Time对象应该以new Time(hrs,min)方式构建。
 */
object Exer01 {

  def main(args: Array[String]): Unit = {
    val time = new Time(5,40)
    try{
      val res = time.before(new Time(5 ,40))
      if (res == true){
        println("this time is before other time ")
      } else {
        println("other time is before this time")
      }
    }catch {
      case ex:Exception => (ex.getMessage)
        println(ex.getMessage)
    }
  }
}
class Time(hrs:Short,min:Short) {
  val hours:Short = hrs
  val minutes:Short = min

  def before(other:Time):Boolean = {
    if (other.hours > this.hours){
      true
    } else if( other.hours < this.hours){
      false
    } else{
      if (other.minutes > this.minutes){
        true
      } else if( other.minutes < this.minutes){
        false
      } else{
        throw new Exception("this time and other time is the same time")
      }
    }
  }
}