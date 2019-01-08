package com.ng.chap07.pkg

/**
  * 引入包的使用
  */

import scala.collection.mutable

object ImportDemo {

  def main(args: Array[String]): Unit = {

    //scala支持给不同的类，在引入时取别名
    import java.util.{HashMap => JavaHashMap}
    import scala.collection.mutable.HashMap

    var map = new JavaHashMap() // 此时使用的java中hashMap的别名
    var map2 = new mutable.HashMap() // 此时的HashMap指向的是scala中的HashMap
  }

  def test1(): Unit ={
    import scala.collection.mutable.HashMap
    // 含义为 引入java.util包的所有类，但是忽略 HahsMap类.
    import  java.util.{HashMap => _,_}

    // 此时的HashMap指向的是scala中的HashMap,
    // 而且idea工具，的提示也不会显示java.util的HashMaple
    var map = new mutable.HashMap()
  }

  def test2(): Unit ={
    import scala.collection.mutable.{HashMap,HashSet}
    var map = new mutable.HashMap()
    var set = new HashSet()
  }
}

class User{
  //import 语句可以在需要使用到包的使用在引入.
  //import 的作用域在代码块{}
  import scala.beans.BeanProperty
  @BeanProperty var name:String = "jack"
}
class Dog {

  //@BeanProperty var  name : String = "" //可以吗? 不可以
  //import语句的作用一直延伸到包含该语句的块末尾
}