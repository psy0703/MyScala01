package com.ng.chap05

object Method2Function {
  def main(args: Array[String]): Unit = {

    //在scala中, 方法的使用方式
    //1. 创建有一个对象实例
    val dog = new Dog
    val res = dog.sum(1, 2)
    println("res=" + res)

    //将方法转换成函数
    //说明
    //1. 表示将 dog.sum 方法转成函数赋给 f1
    //2. f1就是一个函数
    //3. 根据参数的个数不同，对应不同的函数类型 function2
    val f1 = dog.sum _
    println("f1的类型=" + f1)
    //调用函数,和调用方法类似
    println(f1(5, 6))

    //也可以直接定义函数, 和方法很相似
    val sum2 = (n1: Int, n2: Int) => {
      n1 + n2
    }

    println("sum2的类型=" + sum2) //function2
    println(sum2(10, 9)) // 1


  }


}

class Dog {
  //方法
  def sum(n1: Int, n2: Int): Int = {
    n1 + n2
  }
}

