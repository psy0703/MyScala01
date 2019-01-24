package com.ng.chap14

/**
  * 使用递归求最大值
  * @author cloud9831 
  *         @2019-01-16 22:37 
  */
object RecursiveApp01 {
  def main(args: Array[String]): Unit = {
    val list = List(1,2,3,4,5,6,7,8,10)
    val i = myMax(list)
    println(i)
  }

  /**
    * 求出List的最大值
    * @param xs lIst[Int]
    * @return 最大值
    */
  def myMax(xs:List[Int]):Int={

    if(xs.size == 0){ //为空，返回异常
      throw new java.util.NoSuchElementException()
    }

    if (xs.size == 1){ // 为1 ，返回这个值
      return xs.head
    } else if (xs.head > myMax(xs.tail)){ //如果xs.head > max(xs.tail) 就返回头，否则递归找
      xs.head
    }else {
      myMax(xs.tail)
    }
  }
}
