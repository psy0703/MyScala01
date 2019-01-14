package com.ng.chap11

/**
  * 流Stream
  * stream是一个集合。这个集合，可以用于存放无穷多个元素，
  * 但是这无穷个元素并不会一次性生产出来，而是需要用到多大的区间，
  * 就会动态的生产，末尾元素遵循lazy规则(即：要使用结果才进行计算的)
  * 使用tail，会动态的向stream集合按规则生成新的元素
  */
object StreamDemo {
  def main(args: Array[String]): Unit = {
    //创建stream
    def numsForm(n:BigInt):Stream[BigInt]= n #:: numsForm(n + 1)
    val stream1 = numsForm(1) //Stream(1, ?)
    /*
    1) Stream 集合存放的数据类型是BigInt
    2) numsForm 是自定义的一个函数，函数名是程序员指定的。
    3) 创建的集合的第一个元素是 n , 后续元素生成的规则是 n + 1
    4) 后续元素生成的规则是可以程序员指定的 ，比如 numsForm( n * 4)...
     */
    println(stream1)

    //取出第一个元素
    println(stream1.head) //1
    println(stream1.tail) //Stream(2, ?)
    println(stream1) //Stream(1, 2, ?)
  }
}
