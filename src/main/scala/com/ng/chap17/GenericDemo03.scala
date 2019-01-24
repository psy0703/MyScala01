package com.ng.chap17

/**
  * 1) 定义一个函数，可以获取各种类型的 List 的中间index的值
  * 2) 使用泛型完成
  */
object GenericDemo03 {
  def main(args: Array[String]): Unit = {
    println(getMid[Int](List[Int](1, 2, 3, 4)))
    println(getMid[Int](List[Int](1, 2, 3, 4, 5)))

  }
  //说明
  //1. 在方法后可以使用泛型, T 就是泛型
  //2. 泛型可以直接放在形参内部
  def getMid[T](list: List[T]): Any = {
    if (list.length % 2 == 0) {
      (list(list.length / 2 - 1), list(list.length / 2))
    } else {
      list(list.length / 2)
    }
  }
}


