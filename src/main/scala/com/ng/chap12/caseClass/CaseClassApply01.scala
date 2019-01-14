package com.ng.chap12.caseClass

/**
  * 样例类最佳实践1:
  * 当我们有一个类型为Amount的对象时，可以用模式匹配来匹配他的类型，并将属性值绑定到变量
  * (即：把样例类对象的属性值提取到某个变量,该功能有用)
  */
object CaseClassApply01 {
  def main(args: Array[String]): Unit = {
    for(amt <- Array(Dollar(8888.8),Currency(1000.0,"RMB"),NoAmout)){
      //模式匹配
      val result = amt match{
        //说明
        //1. 这里使用到对象提取,   Dollar(8888.8) 的 8888.8 给  v
        case Dollar(v) => "$" + v
        //说明
        //2. 进行对象提取操作
        case Currency(v,u) => v + " " + u
        case NoAmout => ""
      }
      println("result = " + result)
      /*
      result = $8888.8
      result = 1000.0 RMB
      result =
       */
    }
  }
}
