package com.ng.chap10
import scala.collection.mutable
import scala.collection.mutable.ArrayBuffer
/**
  * 数组-Scala数组与Java的List的互转
  */
object ArrayBuffer2JavaList {
  def main(args: Array[String]): Unit = {
    // Scala集合和Java集合互相转换
    val arr = ArrayBuffer("1","2","3")
    //引入了bufferAsJavaList 隐式函数
    import scala.collection.JavaConversions.bufferAsJavaList

    val javaArr = new ProcessBuilder(arr)
    val arrList = javaArr.command()
    println(arrList) //[1, 2, 3]

    //java的List 转成 scala的 Buffer  java.util.List ==> Buffer
    import scala.collection.JavaConversions.asScalaBuffer

    val scalaArr: mutable.Buffer[String] = arrList //使用了隐式转化
    println(scalaArr) //ArrayBuffer(1, 2, 3)
  }
}
