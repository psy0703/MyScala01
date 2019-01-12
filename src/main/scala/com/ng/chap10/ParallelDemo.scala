package com.ng.chap10

object ParallelDemo {
  def main(args: Array[String]): Unit = {
    /*val result2 = (0 to 100).par.map{case _ => Thread.currentThread.getName}.distinct
    //    println(result1)
    result2.foreach(println(_))*/
    for (ch <- "+-3!") {
      var sign = 0
      var digit = 0
      ch match {
        case _  => digit = 3 //默认
        case '+' => sign = 1
        case '-' => sign = -1
        // 说明..
      }
      println(ch + " " + sign + " " + digit)
    }



  }
}
