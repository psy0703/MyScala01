package com.ng.chap13

/**
  * 控制抽象
  * 1)参数是函数
  * 2) 函数参数没有输入值也没有返回值
  */
object ControlAbstract {
  def main(args: Array[String]): Unit = {

    //myRunInThread 高阶函数
    //1. 可以接受  f1: () => Unit
    //2. 函数特点是没有输入值，也没有返回值
    /*def myRunInThread(f1:() => Unit) ={
      new Thread{
        override def run(): Unit = {
          f1()
        }
      }.start()
    }

    myRunInThread{
      () => {
        println("干活咯！5秒完成...")
        Thread.sleep(5000)
        println("干完咯！")
      }
    }*/

    //使用控制抽象的方法
    def myRunInThread2(f1: => Unit): Unit ={
      new Thread{
        override def run(): Unit = {
          f1
        }
      }.start()
    }
    myRunInThread2{
      println("干活咯！3秒完成~...")
      Thread.sleep(3000)
      println("干完咯！~")
    }
  }
}
