package com.ng.chap05

/**
  * 函数/方法注意事项和细节讨论2
  */
object FunctionDetailPart2 {
  def main(args: Array[String]): Unit = {
    //Scala语法中任何的语法结构都可以嵌套其他语法结构(灵活)，
    //即：函数/方法中可以再声明/定义函数/方法，类中可以再声明类
    def sayOk():Unit={ //==>sayOk$1
      println("sayOk~")

      def sayOk(): Unit ={ //==> sayOk$2
        println("sayOk~~~~")
      }
      sayOk() //调用的是内部的sayOk ,遵守就近原则. 底层 sayOk$2()
    }

    sayOk() //底层是sayOk$1()

    println("---------------")
    sayHello("jack")
    println("---------------")
    //调用mysqlCon
    mySqlCon()
    mySqlCon("127.0.0.0",90) // 给了两个实参，按照从左到右的顺序进行覆盖,类型需要匹配
    println("---------------")
    //目的是让P1使用默认值，p2使用我们指定的值，使用带名参数
    f1(p2 = "v2")
    println("---------------")
    println("sum=" + sum(10, 1, 2, 3))
    println("sum=" + sum(10, 1, 2, 3, 4, -1))

  }

  //Scala函数的形参，在声明参数时，直接赋初始值(默认值)，
  // 这时调用函数时，如果没有指定实参，则会使用默认值。
  // 如果指定了实参，则实参会覆盖默认值
  //说明
  //1. name:String = "tom" 默认给name一个"tom"
  //2. 如果不传递，则是tom , 如果传递了，则给定的值为准
  def sayHello(name:String = "tom"): Unit ={
    println(name + "hello")
  }

  //如果存在多个参数，每一个参数都可以设定默认值，
  // 那么这个时候，传递的参数到底是覆盖默认值，还是赋值给没有默认值的参数，
  // 就不确定了(默认按照声明顺序[从左到右])。
  // 在这种情况下，可以采用带名参数
  def mySqlCon(add:String = "localhost",port:Int = 3306,
               user:String = "root",pwd:String = "root"){
    println("add=" + add)
    println("port=" + port)
    println("user=" + user)
    println("pwd=" + pwd)
  }

  //带名参数的使用
  def f1(p1:String = "v1",p2:String): Unit ={
    println(p1 + p2)
  }

  //递归函数未执行之前是无法推断出来结果类型，在使用时必须有明确的返回值类型
  def f2 (n:Int): Int ={  // 递归不能使用类型推导，必须指定类型
    if(n <= 0){
      1
    }else{
      n * f2(n -1)
    }
  }

  //Scala函数支持可变参数
  //求出 1 到多个 int 的和
  //args 是一个集合 Seq[Int], 是一个序列集合
  def sum(n1 :Int,args:Int*): Int ={
    var res = n1
    for(i <- args){
      res += i
    }
    res
  }

}

class Cat