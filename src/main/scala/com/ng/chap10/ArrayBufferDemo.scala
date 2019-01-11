package com.ng.chap10
import scala.collection.mutable.ArrayBuffer

/**
  * 变长数组
  * 1)	ArrayBuffer是变长数组，类似java的ArrayList
  * 2)	val arr2 = ArrayBuffer[Int]() 也是使用的apply方法构建对象
  * 3)	def append(elems: A*) { appendAll(elems) } 接收的是可变参数.
  * 4)	每append一次，arr在底层会重新分配空间，进行扩容，arr2的内存地址会发生变化，也就成为新的ArrayBuffer，
  */
object ArrayBufferDemo {
  def main(args: Array[String]): Unit = {
    //定义/声明
    val arr01 = ArrayBuffer[Any](3,2,5)
    println("arr01(1) = " + arr01(1)) //获取第二个元素
    for (i <- arr01){ //遍历
      println(i)
    }
    println(arr01.length) //3

    println("arr01.hash = " + arr01.hashCode())
    //arr01.hash = 110266112
    //追加值/元素
    arr01.append(88)  //append一次，内存地址变化一次
    println("arr01.hash = " + arr01.hashCode())
    //arr01.hash = -1129906108

    arr01(0) = 99 //修改
    println("--------------------------")
    for (i <- arr01) {
      println(i) //  (99,2,5,88)
    }

    //删除
    arr01.remove(2) //remove 表示删除第几个元素，从0开始编号
    println("--------------------------")
    for (i <- arr01) {
      println(i) //(99,2,88)
    }
    println("最新的长度=" + arr01.length) //3
  }
}
