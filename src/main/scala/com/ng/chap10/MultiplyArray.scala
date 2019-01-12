package com.ng.chap10

/**
  * 多维数组的定义和使用
  * //定义
  * val arr = Array.ofDim[Double](3,4)
  * //说明：
  * 1) [Double] 泛型, 表示元素的类型
  * 2) (3,4) 3:表示有三个元素,都是一维数组4: 每个一维数组中有4个元素
  */
object MultiplyArray {
  def main(args: Array[String]): Unit = {
    val arr1 = Array.ofDim[Int](3,4) //默认元素未0
    arr1(1)(1) = 8 // 给第二个一维数组的第二个元素赋值
    for (item <- arr1){ //item是 Array[Int]
      for (item2 <- item){ // 取出了各个元素
        print(item2 + " ")
      }
      println()
    }
    println("========传统遍历===========")
    for ( i <- 0 until arr1.length){
      for (j <- 0 until arr1(i).length){
        printf("arr[%d][%d]=%d\t", i, j, arr1(i)(j))
      }
      println()
    }

    val arr2 = Array(Array(1,2),Array("a","b","c"),Array(1.2,2.3,3.4,5.6))
    //使用for循环来玩
    for (item <- arr2) {
      for (item2 <- item) {
        print(item2 + "\t")
      }
      println()
    }
  }
}
