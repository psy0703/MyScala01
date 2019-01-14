package com.ng.chap12

/**
  * 如果想要表达匹配某个范围的数据，就需要在模式匹配中增加条件守卫
  */
object MatchIfDemo {
  def main(args: Array[String]): Unit = {
    for(ch <- "+-3!"){
      var sign = 0
      var digit = 0
      ch match{
        case '+' => sign = 1
        case '-' => sign = -1
        // 说明1 case _ if 的 _ 不是表示默认匹配，而是忽略
        // 也可以做范围的匹配
        case _ if ch.toString.equals("3") => digit = 3
        //case _ 表示 默认pip
        case _ => sign = 2
      }
      println(ch + " " + sign + " " + digit)
    }

  }
}
/*
+ 1 0
- -1 0
3 0 3
! 2 0
 */
