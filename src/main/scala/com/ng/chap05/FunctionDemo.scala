package com.ng.chap05

/**
  * 函数的使用案例
  */
object FunctionDemo {
  def main(args: Array[String]): Unit = {
    //函数
    val f1 = (n1:Int,n2:Int,oper:Char) => {
      if (oper == '+'){
        n1 + n2
      } else if(oper == '-'){
        n1 -n2
      } else{
        println("oper is illegal")
      }
    }

    val n1 = 10
    val n2 = 5
    var oper = '+'
    println(f1(n1,n2,oper))
    println("------做了其他的工作...")
    val n3 = 10
    val n4 = 20
    oper = '-'
    println("res2=" + f1(n3,n4,oper))

  }
}
