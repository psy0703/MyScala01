package com.ng.chap10

import scala.collection.mutable

/**
  * @author cloud9831 
  *         @2019-01-12 23:18 
  */
object MapDemo01 {
  def main(args: Array[String]): Unit = {
    //创建不可变Map
    val map1 = Map("Alice" -> 10,"Bob" -> 20,"Killo" -> "深圳")
    println(map1) //Map(Alice -> 10, Bob -> 20, Killo -> 深圳)

    //创建可变Map
    val map2 = scala.collection.mutable.Map("Alice" -> 10,"Bob" -> 20,"Killo" -> "深圳")
    println(map2) //Map(Killo -> 深圳, Bob -> 20, Alice -> 10)

    //方式三：创建空的映射
    val map3 = new mutable.HashMap[String,Int]
    println(map3) //Map()

    //方式四： 直接使用对偶元组
    val map4 = mutable.Map(("Alice",9),("Bob",20),("Kolliin","深圳"))
    println(map4) //Map(Bob -> 20, Alice -> 9, Kolliin -> 深圳)

    //取值
    //方式一：使用map(key)
    //1. 如果key存在，则返回对应值
    //2. 如果key不存在，则抛出异常
    val value1 = map4("Alice")
    println(value1)

    //方式二：使用contains()方法检查是否存在key
    if(map4.contains("Bob")){
      println(map4("Bob"))
    } else{
      println("没有对应的key")
    }

    //方式三：使用map.get(key).get 取值
    val map5 = mutable.Map("Alice" -> 10,"Bob" -> 20,"Catlina" -> "aa")
    println(map5.get("Alice")) //Some(10)
    //这里提示大家如果map5.get("A") 返回的 None， 你再去get就会抛出异常
    println(map5.get("Alice").get) //得到Some在取出10

    //方式四： 使用map.getOrElse() 取值
    val map6 = mutable.Map( ("A", 1), ("B", "北京"), ("C", 3) )
    println(map6.getOrElse("A","默认"))
    // getOrElse底层就是加入 if(map.continas(xx)) {} else{}
  }
}
/*
Scala中的不可变Map是有序，构建Map中的元素底层是Tuple2类型。
如果 map.get(key) key存在返回some,如果key不存在，则返回None
1)	如果我们确定key是存在的，则使用map(key) ,效率高，遍历
2)	如果业务逻辑是，如果key存在，如何如何，如果key不存在，有如何，map.contains() ,进行逻辑分支
3)	如果就是为了返回一个值， 则使用 getOrElse 好，这样可以统一返回默认值
 */
