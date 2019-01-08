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
    //方法一:高阶函数
    (0 to n).reverse.foreach(println(_))
    //(1 to n) : Range(0,1,2,..,n)
    //foreach 是一个高阶函数；foreach可以接收一个 (Int) => Unit 的函数
    //foreach 会遍历(0 to n).reverse 中的每一个元素，然后传递给println(_),一共传递11次
    //scala规定，如果接收的只有一个参数，类型可以确定，则可以省略(_)
    //(0 to n).reverse.foreach(println

    println("---------------------")
    //方法二
   for(i <- 1 to n reverse){
     println("i = " + i)
   }
  }
}
