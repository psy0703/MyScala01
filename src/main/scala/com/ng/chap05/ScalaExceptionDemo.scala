package com.ng.chap05
//异常处理的说明
//1.处理结构时 try-catch {case ....}
//2.case ex:Exception  捕获的异常的类型
//3. => 后面是处理代码
//4. => 后面会当做一个整体，可以使用{} 括起来，也可以不写
//5.在scala中，异常捕获的顺序不是非常的严格，你把返回大的异常写到前面，也不会报错

object ScalaExceptionDemo {

  def main(args: Array[String]): Unit = {
    try{
      //可疑代码
      val res = 10 / 0
    }catch {
      //如果需要捕获多个不同异常
      case ex:ArithmeticException => {
        println("异常信息1 = " + ex.getMessage)
        println("~~~")
      }
      case ex2 : Exception =>{
        println("异常信息2 = " + ex2.getMessage)
      }
    }finally {
      println("hello")
    }

    println("程序继续执行")
  }
  /*
  异常信息1 = / by zero
  ~~~
  hello
  程序继续执行
   */
}
