package com.ng.chap06.Exercises

/**
  * 根据行、列、字符打印 对应行数和列数的字符，
  * 比如：行：3，列：2，字符*,则打印相应的效果
  * @author cloud9831 
  *         @2019-01-07 23:45 
  */
object Exer05 {
  def main(args: Array[String]): Unit = {
    printSymbol(2,3,'@')
  }
  def printSymbol(line:Int,column:Int,symbol:Char):Unit={
    for(i <- 1 to line){
      for(j <- 1 to column){
        print(symbol)
      }
      println()
    }
  }
}
