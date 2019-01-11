package com.ng.chap09

/**
  * 隐式类
  * 1)	其所带的构造参数有且只能有一个
  * 2)	隐式类必须被定义在“类”或“伴生对象”或“包对象”里，即隐式类不能是顶级的(top-level  objects)。
  * 3)	隐式类不能是case class（case class在后续介绍 样例类）
  * 4)	作用域内不能有与之相同名称的标识符
  */
object ImplicitClassDemo {
  def main(args: Array[String]): Unit = { //DB1 =》 类$DB1
    implicit class DB1(val mysql:MySQL1){
      def addSuffix():String={ //方法
        mysql + "scala"
      }
    }
    //直接使用，转换工作交给编译器
    val mySQL = new MySQL1
    mySQL.sayOk()
    //说明：
    //1. 底层是 DB$1(mySQL).addSuffix()
    //2.DB1$1(mysql1) 才是一个隐式类[ImplicitClassDemo$DB1$2]的实例
    //3. 隐式类名称 ImplicitClassDemo$DB1$2
    val res = mySQL.addSuffix()
    println("res = " + res)
//    sayOk
//    res = com.ng.chap09.MySQL1@3cb5cdbascala
  }
}
class MySQL1 {
  def sayOk(): Unit = {
    println("sayOk")
  }
}

