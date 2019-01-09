package com.ng.chap08.TraitDemos

/**
  * @author cloud9831 
  *         @2019-01-09 23:35 
  */
object TraitCreateSeq01 {
  def main(args: Array[String]): Unit = {
//    第1种方式实际是构建类对象, 在混入特质时，该对象还没有创建。
//    第2种方式实际是构造匿名子类，可以理解成在混入特质时，对象已经创建了
    /*
    E.. -->A.. --> B.. --> C.. --> D..--> F..
     */
    val ff = new FF

    println("==============================")
    /*
    E.. --> K.. --> A.. --> B.. --> C.. --> D..
     */
    val ff2 = new KK2 with CC with DD
  }
}
trait AA {
  println("A...")
}
trait BB extends  AA {
  println("B....")
}
trait CC extends  BB {
  println("C....")
}
trait DD extends  BB {
  println("D....")
}
class EE {
  println("E...")
}
class FF extends EE with CC with DD {
  println("F....")
}
class KK2 extends EE {
  println("K....")
}