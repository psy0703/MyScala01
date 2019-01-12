package com.ng.chap10
import scala.collection.mutable.ListBuffer
/**
  * ListBuffer是可变的list集合，可以添加，删除元素,ListBuffer属于序列
  * 继承关系   Seq var listBuffer = ListBuffer(1,2)
  */
object ListBufferDemo {
  def main(args: Array[String]): Unit = {
    val lst0 = ListBuffer[Int](1,2,3) //创建

    println("lst0(2)" + lst0(2))
    for (item <- lst0){
      println("item = " + item)
    }

    val lst1 = new ListBuffer[Int]
    lst1 += 4 //添加 lst1 (4)
    lst1.append(5)  //lst1(4,5)
  }
}
