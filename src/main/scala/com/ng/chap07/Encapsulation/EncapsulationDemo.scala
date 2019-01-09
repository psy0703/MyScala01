package com.ng.chap07.Encapsulation

import scala.io.StdIn

object EncapsulationDemo {
  def main(args: Array[String]): Unit = {
    val person = new Person("jack")
    person.setAge(19)
    println("请输入密码:")
    val password = StdIn.readLine()
    val res = person.getAge(password)
    if (res.isInstanceOf[Exception]){
      println(res.asInstanceOf[Exception].getMessage)
    } else{
      println(s"查看的结果如下：${person.name} age = ${person.getAge(password)}")
    }
  }
}

/*
那么在Scala中如何实现封装的控制呢?
一个小程序(TestEncap.scala),不能随便查看人的年龄,工资等隐私，
并对输入的年龄进行合理的验证[要求1-120之间，否则给一个默认年龄18]。
 */
class Person(pName:String){
  var name = pName
  private var age = 18
  private var sal = 0.0
  private var pwd = "123456"

  def setAge (age:Int ): Unit ={
    if(age <= 0 || age > 120){
      println("age范围不对")
      return
    }
    this.age = age
  }

  def getAge(pwd:String): Any ={
    //假如判断条件
    if (!this.pwd.equals(pwd)){
      return new Exception("你无权查看")
    }
    return this.age
  }
}


