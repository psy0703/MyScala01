package com.ng.chap11

object FilterDemo {

  def main(args: Array[String]): Unit = {
    val list = List(3,4,2,7,5)
    def MyMin(num1:Int,num2:Int):Int={
      num1 min num2
    }

    println(list.reduceLeft(MyMin))
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