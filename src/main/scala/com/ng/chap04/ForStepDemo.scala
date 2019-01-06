package com.ng.chap04

/**
  * for循环之控制步长
  * @author cloud9831 
  *         @2019-01-06 18:02 
  */
object ForStepDemo {
  def main(args: Array[String]): Unit = {
    //需求说有个结合  1 to 10
    //输出的步长 3  1 4 7 10

    //1.方式1：使用scala提供的Range
    //说明：Range底层使用的是until
    val start = 1
    val end = 11
    val step = 3
    println("使用Range控制步长")
    for (i <- Range(start,end,step)){
      println("i = " + i)
      /*
      使用Range控制步长
      i = 1
      i = 4
      i = 7
      i = 10
       */

      //2. 方式2： 灵活的使用 守卫实现步长控制
      println("使用守卫实现步长控制")
      for(i <- start until end if i % step ==1){
        println("i = " + i)
      }
    }
  }
}
