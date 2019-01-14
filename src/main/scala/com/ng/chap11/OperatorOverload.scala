package com.ng.chap11

/**
  * 11.12.2	操作符扩展
  * 1) 如果想在变量名、类名等定义中使用语法关键字（保留字），可以配合反引号反引号 [案例演示] val `val` = 42
  * 2) 中置操作符：A 操作符 B 等同于 A.操作符(B)
  * 3) 后置操作符：A操作符 等同于 A.操作符，如果操作符定义的时候不带()则调用时不能加括号 [案例演示+代码说明]
  * 4) 前置操作符，+、-、！、~等操作符A等同于A.unary_操作符
  * 5) 赋值操作符，A 操作符= B 等同于 A = A 操作符 B  ，比如 A += B 等价 A = A + B
  */
object OperatorOverload {
  def main(args: Array[String]): Unit = {
    val n1 = 1
    val n2 = 2
    val r1 = n1 + n2
    val r2 = n1.+(n2) //看Int的源码即可说明
    println("r1=" + r1 + " r2=" + r2) //3

    val dog = new Dog2
    dog.+(10) //中置操作符
    dog + 5
    println(dog.age)

    dog - 10
    println(dog.age)
    dog++ ;
    println(dog.age)
    dog--;
    println(dog.age)
    !dog
    println(dog.age)


  }
}

class Dog2 {
  var age = 0

  def +(n: Int): Unit = {
    this.age += n
  }

  def -(n: Int): Unit = {
    this.age -= n
  }

  //后置操作符
  def ++(): Unit = {
    this.age += 1
  }

  def --(): Unit = {
    this.age -= 1
  }
  def unary_! = {
    this.age = -this.age
  }
}

class Operate {
  var n = 10
  //定义函数/方法的时候，省略的()
  def ++() = {
    this.n += 1
  }
}
