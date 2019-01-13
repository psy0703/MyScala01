package com.ng.chap10

/**
  * 集是不重复元素的结合。集不保留顺序，默认是以哈希集实现
  * 默认情况下，Scala 使用的是不可变集合，如果你想使用可变集合，需要引用 scala.collection.mutable.Set 包
  * @author cloud9831 
  *         @2019-01-13 10:51 
  */
object ScalaSetDemo {
  def main(args: Array[String]): Unit = {
    val set1 = Set(1,2,4,"abc")
    println(set1) ////不可变的Set仍然有序

    import scala.collection.mutable
    val set2 = scala.collection.mutable.Set(1,2,4,"abc")
    set2.add("aa")
    set2.add("bb")
    set2 += 4
    set2.add("aa") //如果添加时，有重复的数据，也不会报错
    println(set2) //Set(aa, 1, 2, abc, 4, bb)

    //删除
    set2 -= 4
    set2.remove("aa")
    println(set2) //Set(1, 2, abc, bb)

    val set3 = mutable.Set(1,2,4,19, -1, 56, 7)
    println(set3.max)
    println(set3.min)

    println(set3 max)
    println(set3 min)
  }
}
