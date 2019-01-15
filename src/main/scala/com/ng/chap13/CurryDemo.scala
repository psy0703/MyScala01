package com.ng.chap13

/**
  * 函数的柯里化
  * 1) 函数编程中，接受多个参数的函数都可以转化为接受单个参数的函数，这个转化过程就叫柯里化
  * 2) 柯里化就是证明了函数只需要一个参数而已
  */
object CurryDemo {
  def main(args: Array[String]): Unit = {
    /*
    编写一个函数，接收两个整数，可以返回两个数的乘积，要求:
1)	使用常规的方式完成
2)	使用闭包的方式完成
3)	使用函数柯里化完成
     */

//    def mul(x: Int, y: Int) = x * y
//    println(mul(10, 10))
//
//    def mulCurry(x: Int) = (y: Int) => x * y
//    println(mulCurry(10)(9))
//
//    def mulCurry2(x: Int)(y: Int) = x * y
//    println(mulCurry2(10)(8))

    /* 函数柯里化的最佳实践
比较两个字符串在忽略大小写的情况下是否相等，注意，这里是两个任务：
1) 全部转大写（或小写）
2) 比较是否相等
针对这两个操作，我们用一个函数去处理的思想，其实也变成了两个函数处理的思想 集合.map(函数1).map(函数2).函数(函数).函数(函数)
     */
    //我们认为比较字符串是否相等是两件事，先转成小写[函数]， 再比较是否相等[函数]
    //任务1.比较两个字符串是否相等
    def eq(s1:String,s2:String):Boolean = {
      s1.equals(s2)
    }

    //隐式类
    implicit class TestEq(s:String){
      //第一个参数是str，第二个参数是一个匿名函数
      def checkEq(str:String)(f1:(String,String) => Boolean) ={
        //完成任务1 转成小写 , 比较是否相等的任务，就交给 f1
        f1(s.toLowerCase,str.toLowerCase)
      }
    }

    //创建两个字符串
    val str1 = "hello"
    val str2 = "Hello"
    //传递的写法
    println(str1.checkEq(str2)(eq)) //隐式转化

    //简化的写法
    println(str1.checkEq(str2)(_.equals(_)))
  }
}
