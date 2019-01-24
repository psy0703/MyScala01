package com.ng.chap17

import com.ng.chap17.SeasonEm.SeasonEm

/**
  * 1) 请设计一个EnglishClass (英语班级类)，在创建EnglishClass的一个实例时，
  * 需要指定[ 班级开班季节(spring,autumn,summer,winter)、班级名称、班级类型]
  * 2) 开班季节只能是指定的，班级名称为String,
  * 班级类型是(字符串类型 "高级班", "初级班"..) 或者是 Int 类型(1, 2, 3 等)
  * 3) 请使用泛型来完成本案例
  */
object GenericDemo02 {
  def main(args: Array[String]): Unit = {
    val class1 = new EnglishClass[SeasonEm,String,String](SeasonEm.spring,"073","high")
    val class2 = new EnglishClass[SeasonEm,String,String](SeasonEm.summer,"1001","High")

    println(class1.classSeason + " " + class1.className + " " + class1.classType)
    println(class2.classSeason + " " + class2.className + " " + class2.classType)
  }
}
//定义EnglishClass (英语班级类)，指定[ 班级开班季节(spring,autumn,summer,winter)、班级名称、班级类型]
class EnglishClass[A,B,C](val classSeason:A,val className:B,val classType:C)

//scala 枚举类
object SeasonEm extends Enumeration{
  type SeasonEm = Value  //自定义SeasonEm，是Value类型,这样才能使用
  val spring,autumn,summer,winter = Value
}