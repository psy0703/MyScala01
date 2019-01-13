package com.ng.chap10
import scala.collection.mutable.ListBuffer
/**
  * ListBuffer是可变的list集合，可以添加，删除元素,ListBuffer属于序列
  * 继承关系   Seq var listBuffer = ListBuffer(1,2)
  */
object ListBufferDemo {
  def main(args: Array[String]): Unit = {
    val lst0 = ListBuffer[Int](1,2,3) //创建

    println("lst0(2) = " + lst0(2))
    for (item <- lst0){
      println("item = " + item)
    }

    val lst1 = new ListBuffer[Int]
    lst1 += 4 //添加 lst1 (4)
    lst1.append(5)  //lst1(4,5)

    lst0 ++= lst1 //追加集合的元素
    val lst2 = lst0 ++ lst1
    val lst3 = lst0 :+ 5

    println("lst0 = " + lst0) //ListBuffer(1, 2, 3, 4, 5)
    println("lst2 = " + lst2) //ListBuffer(1, 2, 3, 4, 5)
    println("lst3 = " + lst3)  //ListBuffer(1, 2, 3, 4, 5, 5)

    println("====删除====")
    println("lst1 = " + lst1 ) //lst1 = ListBuffer(4, 5)
    lst1.remove(1)
    for(item <- lst1){
      println("item = " + item) //lst1 = ListBuffer(4, 5)
    }

  }
}
