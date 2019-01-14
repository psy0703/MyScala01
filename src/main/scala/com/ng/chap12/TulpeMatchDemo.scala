package com.ng.chap12

/**
  * 匹配元组
  */
object TulpeMatchDemo {
  def main(args: Array[String]): Unit = {
    for(pair <- Array((0,1), (1, 0), (1, 1),(1,0,2))){
      val result = pair match {
        case (1, _) => "0..." //匹配第一个值为0 ， 第二个值为任意的元组
        case (x, 0) => x //匹配第一个值任意，第二个值为0 的元组
        case (x, y) => println(x + "  " + y)
        case _ => "other"
      }
      println(result)
    }
  }
}
