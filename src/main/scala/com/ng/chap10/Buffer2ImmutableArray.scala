package com.ng.chap10
import scala.collection.mutable.ArrayBuffer
/**
  * 定长数组与变长数组的转换
  * 1) arr1.toBuffer  //将定长数组转成变长数组
  * 2) arr2.toArray  //将可变数组转成不可变数
  */
object Buffer2ImmutableArray {
  def main(args: Array[String]): Unit = {
    val arr2 = new ArrayBuffer[Int]()
    arr2.append(55,66,77,88)
    println(arr2) //ArrayBuffer(55, 66, 77, 88)

    val arr1 = arr2.toArray //将可变数组arr2转成不可变数arr1
    println(arr1) //[I@880ec60

    val newArr2 = arr1.toBuffer //将定长数组arr1转成变长数组 newArr2
    newArr2.append(99)
    println(newArr2) //ArrayBuffer(55, 66, 77, 88, 99)
  }
}
/*
说明：
1)	arr2.toArray 返回结果才是一个定长数组， arr2本身没有变化
2)	arr1.toBuffer返回结果才是一个可变数组， arr1本身没有变化
 */