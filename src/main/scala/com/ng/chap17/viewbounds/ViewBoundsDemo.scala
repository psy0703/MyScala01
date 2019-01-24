package com.ng.chap17.viewbounds
/*
<% 的意思是“view bounds”(视界)，它比<:适用的范围更广，除了所有的子类型，还允许隐式转换类型。

def method [A <% B](arglist): R = ... 等价于:
def method [A](arglist)(implicit viewAB: A => B): R = ...
或等价于:
implicit def conver(a:A): B = …

<% 除了方法使用之外，class 声明类型参数时也可使用：
class A[T <% Int]
 */
object ViewBoundsDemo {
  def main(args: Array[String]): Unit = {
    val com1 = new ComparaComm(20,30)
    println(com1.greater)

    val compareComm2 = new ComparaComm(202.1f,301.1f)
    println(compareComm2.greater) // 301.1f

    //以前在上界的各种用法仍然ok
    val compareComm3 = new ComparaComm(java.lang.Float.valueOf(1.1f),java.lang.Float.valueOf(9.1f))

    val compareComm4 = new ComparaComm[java.lang.Float](1.1f,9.1f)

  }
}
//说明
//1. [T <% Comparable[T]] 视图界定
//2. T 是 Comparable[T] 子类型
//第一种情况： T 是实现了 Comparable 类型
//第二种情况： 如果T没有实现 Comparable, 会自动的引入隐式转换来实现 scala包
//  Predef 的对象,比如implicit def int2Integer(x: Int): java.lang.Integer
class ComparaComm[T <% Comparable[T]](obj1: T, obj2: T) {
  def greater = if (obj1.compareTo(obj2) > 0) obj1 else obj2
}