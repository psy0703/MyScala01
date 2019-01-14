package com.ng.chap11

/**
  * view方法产出一个总是被懒执行的集合。
  * view不会缓存数据，每次都要重新计算，
  * 比如遍历View时。
  */
object ViewDemo {
  def main(args: Array[String]): Unit = {
    //请找到1-100 中，数字倒序排列 和它
    //本身相同的所有数。(1 2, 11, 22, 33 ...)
    def eq(i:Int):Boolean = {
      i.toString.equals(i.toString.reverse)
    }
    //说明: 没有使用view
    val viewSquare1  = (1 to 100).filter(eq)
    println(viewSquare1)
    //Vector(1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 22, 33, 44, 55, 66, 77, 88, 99)

    //使用view就可以懒加载,而且不缓冲数据
    val viewSquare2 = (1 to 100).view.filter(eq)
    println(viewSquare2) //SeqViewF(...)

    for (item <- viewSquare2){
      println("item = " + item)
    }

    //当数据需要懒加载，而且需要每次使用时，都重新计算，使用view
  }

}
