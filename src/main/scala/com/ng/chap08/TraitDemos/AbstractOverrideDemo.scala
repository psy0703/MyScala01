package com.ng.chap08.TraitDemos

/**
  * 在特质中重写抽象方法特例
  * 调用父特质的抽象方法，那么在实际使用时，没有方法的具体实现，无法编译通过，为了避免这种情况的发生。
  * 可重写抽象方法，这样在使用时，就必须考虑动态混入的顺序问题。
  */
object AbstractOverrideDemo {
  def main(args: Array[String]): Unit = {
    val mySQL = new MySQL4 with DB4 with File4

    mySQL.insert(666)
    /*将数据保存到文件中..
      将数据保存到数据库中..*/

//    val mysql6 = new MySQL4 with  File4 with DB4//报错
//    mysql6.insert(888)
  }
}
trait Operate4{
  def insert (id:Int)
}

trait File4 extends Operate4{
  abstract override def insert(id: Int): Unit = {
    println("将数据保存到文件中..")
    super.insert(id)
  }
}

trait DB4 extends Operate4{
  def insert(id:Int): Unit ={
    println("将数据保存到数据库中..")
  }
}
class MySQL4 {}