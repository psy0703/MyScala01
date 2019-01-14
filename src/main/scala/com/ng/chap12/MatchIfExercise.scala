package com.ng.chap12

object MatchIfExercise {
  def main(args: Array[String]): Unit = {

    for (ch <- "+-3!") {
      var sign = 0
      var digit = 0
      ch match {

        case '+' => sign = 1
        case '-' => sign = -1
        // 说明case _ 是默认匹配
        case _  => digit = 3
        case _  => sign = 2
      }
      // + 1 0
      // - -1 0
      // 3 0 3
      // ! 0 3

      println(ch + " " + sign + " " + digit)
    }

  }
}
