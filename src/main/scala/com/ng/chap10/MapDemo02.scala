package com.ng.chap10

/**
  * 映射 Map-对map修改、添加和删除
  * @author cloud9831 
  * @2019-01-12 23:32
  */
object MapDemo02 {
  def main(args: Array[String]): Unit = {
    val map = scala.collection.mutable.Map(("A",1),("B","bb"),("C",3))
    map("A") = 20 ////map4("A~") = 20 //修改和增加,和二为一

    //增加,因为map时可变的，因此时无序的
    map += ("D" -> 4)
    map += ("E" -> 5)

    //增加多个元素
    map += ("F" -> 100, "Y" -> 300)
    //使用元组的方式添加
    map += (("U",9),("Z",88))
    //在添加时，如果该key已经存在，等价于修改
    map += (("U",666))

    println("map = " + map)

    //遍历
    for((k,v) <- map){
      println(k + "is mapped to" + v)
    }

    for(k <- map.keys){ println(k)}

    for (v <- map.values){println(v)}

    for(v<- map){
      println(v + "key = " + v._1 + " value = " + v._2)
    }
  }
}
