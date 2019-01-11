package com.ng.chap09

/**
  * 隐式转换丰富类库功能
  * 使用隐式转换方式动态的给MySQL类增加delete方法
  */
object ImplicitRichClass {
  def main(args: Array[String]): Unit = {
    //使用隐式转换丰富类库
    implicit def addDelete(m:MySQL):DB={
      //将返回一个DB实例
      new DB
    }
    val mySQL = new MySQL
    mySQL.insert()

    mySQL.delete() //底层 -》 addDelete$1(mySQL).delete()
    mySQL.cry()    //底层 -》 addDelete$1(mySQL).cry()
  }
}
class MySQL {
  def insert(): Unit ={
    println("insert")
  }
}

class DB{
  def delete(): Unit ={
    println("delete")
  }
  def cry(): Unit ={
    println("DB....")
  }
}