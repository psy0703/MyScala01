package com.ng.chap10

/**
  * 元组Tuple-元组的基本使用
  * 元组也是可以理解为一个容器，可以存放各种相同或不同类型的数据
  * 元组中最大只能有22个元素 即 Tuple1...Tuple22
  * 访问元组中的数据,可以采用顺序号（_顺序号），也可以通过索引（productElement）访问
  * Tuple是一个整体，遍历需要调其迭代器
  */
object TupleDemo {
  def main(args: Array[String]): Unit = {
    val t1 = (1,2,3,"hello",(1,3,9))  //t1 => Tuple5
    println(t1)

    //访问Tuple的元素的方式有两种
    //1. 方式1 t1_顺序号 , 顺序号是从1开始编号
    println(t1._2)

    //2. 方式2 productElement(索引号) 访问元组的第一个元素，从0开始
    println(t1.productElement(3))

    //遍历元组
    for (i <- t1.productIterator){
      println("i" + i)
    }
  }
}
