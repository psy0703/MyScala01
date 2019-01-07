package com.ng.chap06

/**
  * scala在声明对象变量时，可以根据创建对象的类型自动推断，所以类型声明可以省略，
  * 但当类型和后面new 对象类型有继承关系即多态时，就必须写了
  */
object CreateObjectDemo {

  def main(args: Array[String]): Unit = {
    val worker = new Worker // worker 就是Worker

    //使用多态, new Worker  ,对象赋给 Emp 变量
    val emp:Emp = new Worker //emp
  }
}
class Emp //空类
class Worker extends  Emp // 空类