package com.ng.chap11

import scala.collection.mutable.ArrayBuffer

/*
val sentence = "AAAAAAAAAABBBBBBBBCCCCCDDDDDDD"
将sentence 中各个字符，
通过foldLeft存放到 一个ArrayBuffer中
目的：
理解flodLeft的用法. 在进行折叠时，将结果保存到第一个元素中
 */
object FoldLeftExercise01 {
  def main(args: Array[String]): Unit = {
    val sentence = "AAAAAAAAAABBBBBBBBCCCCCDDDDDDD"
    var buf = new ArrayBuffer[Char]()
    //方法, 接收两个参数 ， ArrayBuffer, Char
    def appBuffer(arr:ArrayBuffer[Char],c:Char):ArrayBuffer[Char]={
      arr.append(c)
      arr
    }

    //使用
    //1. 创建一个ArrayBuffer ab
    //2. 调用foldLeft,将ab做到第一个元素进行左折叠
    buf = sentence.foldLeft(buf)(appBuffer) //就是一个左折叠的案例
    println(buf)
  }
}
