package com.ng.chap08.TraitDemos

/**
  * Scala特质之动态混入
  */
object MixedInDemo {
  def main(args: Array[String]): Unit = {
    //说明
    //1.在创建对象时，混入 特质
    //2.这种方式只会对这里创建的对象的功能扩展，而不会影响到其他类
    val oracle = new OracleDB with Operate2{
      override def sayHi(): Unit = {
        println("say Hi") //say Hi
      }
    }

    oracle.insert(111) //插入数据 = 111
    oracle.sayHi()

    //3.动态混入的本质，就是创建一个匿名子类
    /*
    MYSql2 sql = new MYSql2()
    {
      public void insert(int id)
      {
        Operate2.class.insert(this, id);
      }
     */
    //此种方式也可以应用于对抽象类功能进行扩展
    val sql = new MYSql2 with Operate2 {
      override def cry(): Unit = {}

      override def sayHi(): Unit = {}
    }
    sql
  }
}
trait Operate2 {
  def insert(id:Int): Unit ={
    println("插入数据 = " + id)
  }

  def sayHi()
}
class OracleDB{

}

class KK extends  OracleDB{}

abstract class MYSql2 {
  def cry()
}