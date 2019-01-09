package com.ng.chap08

/**
  * 单例模式之饿汉式
  */
object TestSinleTon02 extends App{
  private val instance: SingleTon02 = SingleTon02.getInstance
  private val instance2: SingleTon02 = SingleTon02.getInstance

  println(instance.hashCode() + " " + instance2.hashCode())
  println(instance == instance2)

  /*
  饿汉式
  249515771 249515771
  true
   */
}

class SingleTon02 private (){
  println("饿汉式")
}
//将SingleTon的构造方法私有化
object SingleTon02 {
  private val s :SingleTon02 = new SingleTon02

  def getInstance = {
    s //当需要使用时，直接返回
  }
}


