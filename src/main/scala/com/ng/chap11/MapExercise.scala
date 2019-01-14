package com.ng.chap11

import scala.collection.mutable

/*
    val sentence = "AAAAAAAAAABBBBBBBBCCCCCDDDDDDD"
    使用映射集合，统计一句话中，各个字母出现的次数
    提示：Map[Char, Int]()
    思路:
    1. 将结果保存到 Map[Char, Int]()
    2. 使用左折叠的来完成，将Map[Char,Int] 作为第一个元素开始
    3. 把每次遍历出来的Char进行一个统计
    4. 最后返回的结果就在Map
 */
object MapExercise {
  def main(args: Array[String]): Unit = {
    val sentence = "AAAAAAAAAABBBBBBBBCCCCCDDDDDDD"

    def countWord(map:mutable.Map[Char,Int],char:Char):mutable.Map[Char,Int]={
      map += (char -> (map.getOrElse(char,0)+1))
      //val map2 = map + (char -> (map.getOrElse(char,0)+1)) // key-value
    }

    //使用
    val map1 = mutable.Map[Char,Int]()
    val map2 = sentence.foldLeft(map1)(countWord)
    println("map1 = " + map1) //map1 = Map(D -> 7, A -> 10, C -> 5, B -> 8)
    println("map2 = " + map2) //map2 = Map(D -> 7, A -> 10, C -> 5, B -> 8)
    //还有一种调用方法
    val map3 = sentence.foldLeft(mutable.Map[Char,Int]())(countWord)
    println("map3=" + map3)
  }
}
