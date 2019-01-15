package com.ng.chap13

/**
  * 参数（类型）推断
  * 1)	参数类型是可以推断时，可以省略参数类型
  * 2)	当传入的函数，只有单个参数时，可以省去括号
  * 3)	如果变量只在=>右边只出现一次，可以用_来代替
  */
object ParameterInfer {
  def main(args: Array[String]): Unit = {
    val list = List(1, 2, 3, 4, -2)
    //每个元素加一
    println(list.map((x: Int) => x + 1)) //结果 List(2,3,4,5)

    //简化一次:参数类型是可以推断时，可以省略参数类型
    println(list.map((x) => x + 1))
    //简化2次：当传入的函数，只有单个参数时，可以省去括号
    println(list.map(x => x + 1))
    //简化三次: 如果变量只在=>右边只出现一次，可以用_来代替
    println(list.map(_ + 1))

    //看一段代码
    println(list.reduceLeft(_ + _)) //结果是 10
    //原型
    println(list.reduceLeft((x:Int,y:Int) => x + y))

  }
}
