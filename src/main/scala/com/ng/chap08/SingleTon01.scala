package com.ng.chap08

/**
  * 单例模式之懒汉式
  */
object SingleTon01 extends App {
  private val instance = SingleTon.getInstance
  private val instance2 = SingleTon.getInstance

  println(instance.hashCode() + " " + instance2.hashCode())
  println(instance2 == instance)

}

//将SingleTon的构造方法私有化
class SingleTon private() {
  println("懒汉式")
}

//懒汉式：调用时才创建对象
object SingleTon {
  private var s: SingleTon = null

  def getInstance = {
    if (s == null) {
      s = new SingleTon
    }
  }
}


