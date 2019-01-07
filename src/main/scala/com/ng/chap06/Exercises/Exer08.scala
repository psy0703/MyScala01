package com.ng.chap06.Exercises

import scala.io.StdIn
import scala.util.control.Breaks._

/**
  * 景区门票案例
  * 一个景区根据游人的年龄收取不同价格的门票。
  * 请编写游人类，根据年龄段决定能够购买的门票价格并输出
  * 规则：年龄>18 , 门票为20元，其它情况免费。
  * 可以循环从控制台输入名字和年龄，打印门票收费情况, 如果名字输入 n ,则退出程序。
  *
  * @author cloud9831 
  *         @2019-01-08 0:00 
  */
object Exer08 {
  def main(args: Array[String]): Unit = {
    var flag = true
    breakable {
      while (flag) {
        val visitor = new visitor
        if ("n".equals(visitor.name)) {
          flag = false
          println("退出程序")
          break()
        }
        visitor.payment(visitor.name, visitor.age, visitor.ticket)
      }
    }

  }

  class visitor {
    println("请输入游客姓名：")
    val name: String = StdIn.readLine()
    println("请输入游客年龄：")
    val age: Short = StdIn.readShort()
    val ticket = 20

    def payment(name: String, age: Short, ticket: Int) = {

      if (age > 18) {
        printf("%s的年龄为%d，门票价格为：%d元\n", name, age, ticket)
      } else {
        printf("%s的年龄为%d，门票免费\n", name, age)
      }
    }
  }

}
