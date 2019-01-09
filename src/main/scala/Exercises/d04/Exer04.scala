package Exercises.d04

/**
  * 编写一段程序,将Java哈希映射中的所有元素拷贝到Scala哈希映射。
  * 用引入语句重命名这两个类
  */
import java.util.{HashMap => JavaHashMap}
import scala.collection.mutable.HashMap //mutable 是可变
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
    //将javaMap 的所有key取出（集合）并转成数组
    for (i <- jHashMap.keySet().toArray()){
      //说明：
      //i.asInstanceOf[Int] 表示将JavaMap的key转成Int
      //jHashMap.get(i) 表示通过key 获取到value
      //i.asInstanceOf[Int] -> jHashMap.get(i)  表示一对key-value
      //sHash += (i.asInstanceOf[Int] -> jHashMap.get(i)) 表示将key-value添加（append）到scalaMap
      sHash += (i.asInstanceOf[Int] -> jHashMap.get(i))
//      sHash.put(i,jHashMap.get(i))
    }
    return sHash
  }
}

//继承App可以无需main方法就可以执行代码
object Test extends App { //APP里有main方法
  println("Hello world")
}


/*
def main(args: Array[String]): Unit = {
    import java.util.{HashMap => JavaHashMap} //重命名
    //mutable是可变
    import collection.mutable.{HashMap => ScalaHashMap, _}//重命名

    val javaMap = new JavaHashMap[Int, String] //[Int,String]泛型
    javaMap.put(1, "One"); //加入了四对 key-val
    javaMap.put(2, "Two");
    javaMap.put(3, "Three");
    javaMap.put(4, "Four");
    val scalaMap = new ScalaHashMap[Int, String] //创建scala的map


    //说明
    //1. javaMap.keySet() 将javaMap的所有key取出(集合)并转成数组
    //2. key.asInstanceOf[Int] ： 表将 javaMap的key转成 Int
    //3. javaMap.get(key) : 表示通过key获取到 value
    //4. (key.asInstanceOf[Int] -> javaMap.get(key)) :表示一对 key-value
    //5. scalaMap += (key.asInstanceOf[Int] -> javaMap.get(key)) 将 (key.asInstanceOf[Int] -> javaMap.get(key)) 添加到  scalaMap
    for (key <- javaMap.keySet().toArray) {

      scalaMap += (key.asInstanceOf[Int] -> javaMap.get(key))
    }

    println("scalamap=" + scalaMap)
  }
}


object Test {
  def main(args: Array[String]): Unit = {
    println("hello, world!")
  }
}

object Test2 extends App{ // main方法
  println("hello, scala!")
}
 */