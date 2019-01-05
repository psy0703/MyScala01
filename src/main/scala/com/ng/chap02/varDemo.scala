package com.ng.chap02

object varDemo {
  var a:Int = 10 //private int num1
  var b:Int = 30 //底层 private final int num2

  def main(args: Array[String]): Unit = {
    var age: Int = 1 // 在scala中，变量需要显示的初始化
    //说明
    //1. var是一个关键字，表示name是一个变量(是可变变量), 如果要去变量不可变，则使用val 修饰
    //   这样可以根据实际的开发需求，来规定我们的变量是可变的还是不可变，提供效率
    //Java =》 集合
    //2. 变量名和 类型直接需要：间隔
    var name:String = "Jasmine"

    //类型推断
    var info = "ng"
    //在idea看一个数据的类型
    println("info" + info)
    //类型确定后，就不能修改，说明Scala 是强数据类型语言
//    info = 10

    //在声明或定义一个变量时，可以使用var 或者 val 来修饰， var 修饰的变量可改变，val 修饰的变量不可改
    //1. 更改代码的逻辑确定使用var 还是val
    //2. scala 推荐尽量使用val
    val tax_rate = 0.08;
//    tax_rate = 0.9 tax_rate 就是不可变
    var sal = 9999
    sal = (tax_rate * sal).toInt // var 可以变化
    println("sal = " + sal)
  }
}
