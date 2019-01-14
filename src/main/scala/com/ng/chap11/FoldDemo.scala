package com.ng.chap11

/**
  * 1) fold函数将上一步返回的值作为函数的第一个参数继续传递参与运算，直到list中的所有元素被遍历。
  * 2) 可以把reduceLeft看做简化版的foldLeft
  * 3) 相关函数：fold(等价foldLeft)，foldLeft，foldRight，可以参考reduce的相关方法理解
  */
object FoldDemo {
  def main(args: Array[String]): Unit = {
    val list = List(1,2,3,4)
    def minus(num1:Int,num2:Int):Int={
      num1 - num2
    }
    //list.foldLeft(5)(minus)
    //1. 可以认为是 (5, 1, 2, 3, 4 ) 操作
    //2. ((((5-1)-2) – 3)  - 4) = -5
    println(list.foldLeft(5)(minus)) //-5 函数柯里化
    println("-------------------------------")
    //3.可以认为是 ( 1, 2, 3, 4 , 5) 操作
    //4. 1-(2-(3-(4-5))) = 3
    println(list.foldRight(5)(minus)) //3

    //形式
    //方法和函数
    //方法转成函数
    //直接定义一个函数
    //可以给一个高阶函数，直接传到一个匿名函数
    //可以给一个高阶函数传递方法（方法->函数）
  }
}
