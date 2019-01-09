package com.ng.chap08.TraitDemos

/**
  * Scala 特质：带有具体实现的特质
  * 和Java中的接口不太一样的是特质中的方法并不一定是抽象的，
  * 也可以有非抽象方法(即：实现了的方法)。
  */
object TraitDemo03 {
  def main(args: Array[String]): Unit = {
    val mySQL = new MySQL
    mySQL.insert(100)
    /*
    向数据库中
    保存数据 = 100
     */
  }
}
trait Operate{
  def insert(id:Int): Unit ={
    println("保存数据 = " + id)
  }
}

trait DB extends Operate{
  override def insert(id:Int): Unit ={
    println("向数据库中")
    super.insert(id) // 这里的 super.insert 调用的是 Operate的
  }
}

class MySQL extends DB{

}
