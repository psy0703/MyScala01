package com.ng.chap12

/**
  * 模式匹配之match
  * 模式匹配语法中，采用match关键字声明，每个分支采用case关键字进行声明，
  * 当需要匹配时，会从第一个case分支开始，如果匹配成功，那么执行对应的逻辑代码，
  * 如果匹配不成功，继续执行下一个分支进行判断。
  * 如果所有case都不匹配，那么会执行case _ 分支，类似于Java中default语句。
  */
object MatchDemo01 {
  def main(args: Array[String]): Unit = {
    val oper = '+'
    val n1 = 20
    val n2 = 10
    var res = 0
    //根据oper 的值，去执行对应的代码

    //匹配模式说明
    //1. match --- case 是匹配的基本结构
    //2. 如果匹配成功，就执行 case => 后面的代码, 执行后，就退出match
    //3. => 可以理解成就是类似 java  :
    //4. case _ 就是就默认匹配
    //5. 如果一个都匹配不到，又没有case _ ，则会抛出异常
    oper match{

      //在scala中，不需要break,只要执行一个case完毕后，就退出
      case '+' => {
        res = n1 + n2
        println("执行到+")
      }
      case '-' => res = n1 - n2
      case '*' => res = n1 * n2
      case '/' => res = n1 / n2
      case 11 => {
        println("匹配到ok")
      }
      case _=> println("oper error") //默认匹配
    }
    println("res = " + res)
  }
}
