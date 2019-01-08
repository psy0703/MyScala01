package Exercises.d04

/**
  * 编写一段程序,将Java哈希映射中的所有元素拷贝到Scala哈希映射。
  * 用引入语句重命名这两个类
  */
import java.util.{HashMap => JavaHashMap}
import scala.collection.mutable.HashMap
object Exer04 {

  def main(args: Array[String]): Unit = {
    var javaHash = new JavaHashMap[Any,Any]
    var sHash = new HashMap[Any,Any]

    for(i <- 1 to 10){
      javaHash.put(i,"javaHash " + i)
    }
    sHash = javaHashMap2ScalaHashMap(javaHash)
    sHash.foreach(println(_))
  }

  def javaHashMap2ScalaHashMap(jHashMap:JavaHashMap[Any,Any]):HashMap[Any,Any] = {
    var sHash = new HashMap[Any,Any]
    for (i <- jHashMap.keySet().toArray()){
      sHash.put(i,jHashMap.get(i))
    }
    return sHash
  }
}
