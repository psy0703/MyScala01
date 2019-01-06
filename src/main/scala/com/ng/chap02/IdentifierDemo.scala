package com.ng.chap02

object IdentifierDemo {

  def main(args: Array[String]): Unit = {
    //首字符为操作符(比如+ - * / )，后续字符也需跟操作符 ,至少一个(反编译)
    var +-*/ = 90
    println(+-*/)
    ////因为在scala 没有 ++ 操作, 在底层 ++*/ 变量名会修改$plus$plus$times$div
    var ++ = 123

    val `true` = 900
    val Int = "Shenzhen"
    //用反引号`....`包汉的任意字符串，即使是关键字(39个)也可以
    println(++ / 10)
    println(`true`) //mysql select * from `表名` [mysql]
    println(Int)
  }
}
