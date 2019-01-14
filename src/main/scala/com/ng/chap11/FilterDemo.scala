package com.ng.chap11

/**
  * 	filter：将符合要求的数据(筛选)放置到新的集合中
  */
object FilterDemo {
  def main(args: Array[String]): Unit = {
    val names = List("Alice","Bob","Nike")
    def startA(str:String):Boolean={
      str.startsWith("A")
    }
    val names2 = names.filter(startA)
    println("names2 = " + names2)

    //exer
    val nums = List(1,2,3,4,5,6)
    def f1(n:Int):Boolean={
      if(n % 2 == 0)true else false
    }
    val num2 = nums.filter(f1)
    println("nums2 = " + num2)
  }
}
