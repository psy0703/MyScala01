package com.ng.chap04.Exercises

/**
  * while 信管练习
  * @author cloud9831 
  *         @2019-01-06 18:22 
  */
object WhileExercise {

  def main(args: Array[String]): Unit = {
    exec1()
    println()
    exec2()
  }
  //打印1—100之间所有能被3整除的数
  def exec1 ():Unit={

    var n = 1
    while(n <= 100){
      if (n % 3 == 0){
        print(n + "  ")
      }
      n += 1
    }
  }
  //打印40—200之间所有的偶数
  def exec2 ():Unit={
    var n = 40
    while(n <= 200){
      if (n % 2 == 0){
        print(n + "  ")
      }
      n += 1
    }
  }
}
