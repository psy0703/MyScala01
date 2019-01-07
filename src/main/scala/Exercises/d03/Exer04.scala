package Exercises.d03

/**
  * 编写一个过程countdown(n:Int)，打印从n到0的数字
  */
object Exer04 {
  def main(args: Array[String]): Unit = {
    countdown(5)
  }
  def countdown(n:Int): Unit = { //n 为val类型，不能修改值
    var n1 = n
    (0 to n).reverse.foreach(println(_))
    println("---------------------")
    while(n1 >= 0){
      println("n = " + n1)
      n1 -= 1
    }
  }
}
