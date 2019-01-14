package com.ng.chap12

/**
  * for表达式中的模式匹配
  */
object ForVarMatchDemo {
  def main(args: Array[String]): Unit = {
    val map = Map("A" -> 1, "B" -> 0, "C" -> 3) // 三个k-v
    for ((k, v) <- map) { //遍历map所有的k-v
      println(k + " -> " + v)
    }
    println("---------------------")
    //说明  只匹配 value = 0 的 k
    for ((k, 0) <- map) {
      println(k + "->" + 0)
    }
    println("*********************")
    //说明 匹配 if v > 1 && v < 3  条件的k-v
    for ((k, v) <- map if v > 1 && v <= 3) {
      println(k + " ---> " + v)
    }
  }
}
