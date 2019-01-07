package com.ng.chap06.Exercises

import scala.io.StdIn

/**
  * 定义小小计算器类(Calcuator)，实现加减乘除四个功能
  * 实现形式1：分四个方法完成
  * 实现形式2：用一个方法搞定
  *
  * @author cloud9831 
  *         @2019-01-07 23:48 
  */
object Exer06 {

  def main(args: Array[String]): Unit = {
    println("请输入num1：")
    val num1 = StdIn.readInt()
    println("请输入num2：")
    val num2 = StdIn.readInt()
    println("请输入oper：")
    val oper = StdIn.readChar()

    println(calculator(num1,num2,oper))
  }

  def calculator(num1:Int,num2:Int,oper:Char):Any={
    if (oper == '+'){
      add(num1,num2)
    } else if (oper == '-'){
      sub(num1,num2)
    } else if(oper == '*'){
      multi(num1,num2)
    } else if(oper == '/'){
      div(num1,num2)
    } else {
      "oper is illegal"
    }
  }

  //加法
  def add(num1:Int,num2:Int):Int={
    num1 + num2
  }
  //减法
  def sub(num1:Int,num2:Int):Int={
    num1 - num2
  }

  //乘法
  def multi(num1:Int,num2:Int):Int={
    num1 * num2
  }

  //除法
  def div(num1:Int,num2:Int):Double={
    num1.toDouble / num2.toDouble
  }
}
