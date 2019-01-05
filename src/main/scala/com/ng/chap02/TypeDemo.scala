package com.ng.chap02

object TypeDemo {

  def say(): Unit={
    println("o!!!")
  }

  def main(args: Array[String]): Unit = {

    var ref = say()  //因为say() 是Unit : res = ()
    println("ref = " + ref)
    /*
    o!!!
    ref = ()
     */
  }

}
