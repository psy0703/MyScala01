package com.ng.chap08.TraitDemos

/**
  * scala的特质之具体字段
  * 特质中可以定义具体字段，如果初始化了就是具体字段，如果不初始化就是抽象字段。
  * 混入该特质的类就具有了该字段，字段不是继承，而是直接加入类，成为自己的字段。
  * @author cloud9831 
  *         @2019-01-09 23:11 
  */
object TraitPropertiesDemo {

  def main(args: Array[String]): Unit = {
    //  MySQL6 mySQL = new MySQL6() { private String opertype;}
    val mySQL = new MySQL5 with DB5

  }
}
trait OPerate5{
  var operType : String
  def insert()
}

trait DB5 extends OPerate5{
  var operType : String = "insert"
  def insert():Unit = {

  }
}

class MySQL5{}
