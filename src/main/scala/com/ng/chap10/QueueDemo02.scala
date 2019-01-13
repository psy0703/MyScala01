package com.ng.chap10

/**
  * 队列 Queue-返回队列的元素
  * @author cloud9831 
  * @2019-01-12 21:48
  */
object QueueDemo02 {
  def main(args: Array[String]): Unit = {
    import scala.collection.mutable
    val q1 = new mutable.Queue[Int]
    q1 += 23
    q1 += 34
    q1 ++= List(66,88)
    println("q1 = " + q1)
    //返回队列的第一个元素，对队列本身没有任何影响
    println("q1's head = " + q1.head)
    //返回队列最后一个元素
    println("q1's last = " + q1.last)
    //返回除了第一个外剩余的去拿不元素,可以级联使用，这个在递归时使用较多
    println("q1'tail = " + q1.tail)
    println("q1'tail.tail = " + q1.tail.tail)
    /*
    q1 = Queue(23, 34, 66, 88)
    q1's head = 23
    q1's last = 88
    q1'tail = Queue(34, 66, 88)
    q1'tail.tail = Queue(66, 88)
     */
  }
}
