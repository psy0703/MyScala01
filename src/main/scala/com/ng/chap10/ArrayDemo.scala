package com.ng.chap10

/**
  * 数组-定长数组(声明泛型)
  */
object ArrayDemo {
  def main(args: Array[String]): Unit = {
    //创建了一个数组，该数组的长度4
    //只能存放Int, 如果希望存放任意类型 [Int] => [Any]
    val arr = new Array[Int](4)
    println(arr.length)// 长度 4

    println("arr(0)" + arr(0))

    for(i <- arr){ // 长度 4
      println(i)
    }
    println("-----------------------------")
    arr(3) = 3 //第四个元素为 10
    for (i <- arr){  //遍历
      println(i)
    }

    println("-------------------------------")
    //定义array的第二种方式
    //在定义数组时，直接赋值//使用apply方法创建数组对象
    var arr2 = Array(1,2,"scala") //apply -》类型为Array[Any]
    for (i <- arr2) { // 长度为3
      println(i)
    }
  }
}
