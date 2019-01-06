package com.ng.chap03
object LogicOperatorDemo {

  def f1(): Boolean ={
    println("fi is invoke")
    true
  }

  def main(args: Array[String]): Unit = {
    //在scala中逻辑与和逻辑或都同样遵守短路操作
    if ((10 > 9 ) && f1()){
      println("ok....")
    }

    if ((10 > 9) || f1()){
      println("heihei~~~")
    }
  }
}
