package com.ng.chap11

/**
  * 化简：将二元函数引用于集合中的函数,。
  */
object ReduceDemo {

  def main(args: Array[String]): Unit = {
    val list = List(1,20,30,4,5) //集合
    def sum(n1:Int,n2:Int):Int={ //方法=》接收两个参数
      n1 + n2
    }
    //说明 list.reduceLeft(sum)
    //1. reduceLeft向左化简
    //2. sum 是函数， 是二元函数
    //3. 化简的流程 , 从左开始，取两个值，然后将计算的结果 作为第一个参数，再次传入sum
    ///  直到包所有的元素遍历完毕
    //4. (((1 + 20) + 30) + 4) + 5 => 60
    val res = list.reduceLeft(sum)
    println("res = " + res ) //60

    println("================================")

    val list2 = List(3,4,2,7,5)
    def MyMin(num1:Int,num2:Int):Int={
      num1 min num2
    }

    println(list2.reduceLeft(MyMin))
  }
}
/*
  override /*TraversableLike*/
  def reduceLeft[B >: A](@deprecatedName('f) op: (B, A) => B): B =
    if (isEmpty) throw new UnsupportedOperationException("empty.reduceLeft")
    else tail.foldLeft[B](head)(op)

  override /*IterableLike*/
  def reduceRight[B >: A](op: (A, B) => B): B =
    if (isEmpty) throw new UnsupportedOperationException("Nil.reduceRight")
    else if (tail.isEmpty) head
    else op(head, tail.reduceRight(op))
 */