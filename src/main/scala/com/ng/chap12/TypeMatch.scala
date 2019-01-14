package com.ng.chap12

/**
  * 类型p匹配
  */
object TypeMatch {
  def main(args: Array[String]): Unit = {
    val a = 1
    val obj = if (a == 1)1
    else if(a == 2) "2"
    else if(a == 3) BigInt(3)
    else if(a == 4) Map("aa" -> 1)
    else if(a == 5) Map(1 -> "aa")
    else if(a == 6) Array(1, 2, 3)
    else if(a == 7) Array("aa", 1)
    else if(a == 8) Array("aa")

    //判断
    val result = obj match{
        //case _ 出现如下情况(忽略匹配的变量值)，则表示隐藏变量名，即不使用,
      // 而不是表示默认匹配
      case _:BigInt => Int.MaxValue
      case a:Int => a //流程是，先把 a = obj ，再判断类型
      case b : Map[String, Int] => "对象是一个字符串-数字的Map集合"
      case c : Map[Int, String] => "对象是一个数字-字符串的Map集合"
      case d : Array[String] => "对象是一个字符串数组" //String[]
      case e : Array[Int] => "对象是一个数字数组" //int[]
      case f : BigInt => Int.MaxValue
      case _ => "啥也不是"
    }
    println(result)

    //1) Map[String, Int] 和Map[Int, String]会类型擦除。
    //2) 在进行类型匹配时，编译器会预先检测是否有可能的匹配，如果没有则报错

  }
}
