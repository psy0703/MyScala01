package com.ng.chap12.caseClass

object CaseClassApply02 {
  def main(args: Array[String]): Unit = {
    val amt = Currency(88.88,"EU")
    val amt1 = amt.copy()
    val amt2 = amt.copy(value = 8888,unit = "RMB") //  默认拷贝，会使用到 amt本身的属性值
    val amt3 = amt.copy(unit = "JMB")
    println(amt1) // amt1.toString
    println(amt2) //
    println(amt3)
/*
Currency(88.88,EU)
Currency(8888.0,RMB)
Currency(88.88,JMB)
 */
  }
}
