package com.ng.chap11

/**
  * 1) 拉链的本质就是两个集合的合并操作，合并后每个元素是一个 对偶元组
  */
object ZipDemo {
  def main(args: Array[String]): Unit = {
    //拉链
    val list1 = List(1,2,3)
    val list2 = List(4,5,6)

    val list3 = list1.zip(list2)
    println(list3) //List((1,4), (2,5), (3,6))

    val arr = Array("aa","bb","cc")
    val arr2 = Array("dd","ee","ff")

    println(arr.zip(arr2).mkString(" "))
    //不输入mkString（）输出[Lscala.Tuple2;@3a03464
    //(aa,dd) (bb,ee) (cc,ff)

    val arr3 = arr.zip(arr2)
    for(item <- arr3){
      println(item._1 + " " + item._2)
    }
  }
}
