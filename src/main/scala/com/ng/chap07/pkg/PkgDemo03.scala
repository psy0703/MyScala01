package com.ng.chap07.pkg
//import scala.beans.BeanProperty
/**
  * 导包的三种方式
  */
object PkgDemo03 {

}

class Manager(var name :String){
  //第一种形式 import scala.beans.BeanProperty
//  @BeanProperty var age:Int = 10

  //第二种形式  和第一种一样，都是相对路径引入
//  @scala.beans.BeanPorperty var age : Int =22

  //第三种形式  绝对路径引入，可以解决包名冲突, 这个使用的很少
  @_root_.scala.beans.BeanProperty var age: Int = _
}

object TestBean{
  def main(args: Array[String]): Unit = {
    val jack = new Manager("jack")
    println("jack = " + jack)
    //jack = com.ng.chap07.pkg.Manager@66d33a
  }
}
