package com.ng.chap06.Exercises

import scala.io.StdIn

/**
  * 盒子案例(学员，课后)
  * 编程创建一个Box类，在其中定义三个变量表示一个立方体的长、宽和高，长宽高可以通过控制台输入。
  * 定义一个方法获取立方体的体积(volumn)。长*宽*高
  * 创建一个对象，打印给定尺寸的立方体的体积
  *
  * @author cloud9831 
  *         @2019-01-07 23:59 
  */
object Exer07 {
  def main(args: Array[String]): Unit = {
    val box = new Box
    val vol = box.getVolumn(box.lenth,box.width,box.higth)
    println("volumn = " + vol)
  }

}
class Box{
  println("请输入立方体的长：")
  val lenth:Double = StdIn.readDouble()
  println("请输入立方体的宽：")
  val width:Double = StdIn.readDouble()
  println("请输入立方体的高：")
  val higth: Double = StdIn.readDouble()

  def getVolumn(legth:Double,width:Double,hight:Double):Double={

    legth * width * hight
  }
}
