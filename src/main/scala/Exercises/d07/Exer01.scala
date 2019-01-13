package Exercises.d07

import scala.util.Random

/**
  * 1、编写一段代码，将a设置为一个n个随机整数的数组，要求随机数介于0和n之间。
  * @author cloud9831
  *         @2019-01-13 14:41 
  */
object Exer01 {
  def main(args: Array[String]): Unit = {

    for (i<- a(5)){
      println(i)
    }

    def a(n:Int): Array[Int] ={
      val array = new Array[Int](n)
      for(i<-0 until array.length){
        array(i) = Random.nextInt(n)
      }
      array
    }
  }
}
