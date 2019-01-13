package com.ng.chap10

/**
  * 队列的创建和添加元素
  * @author cloud9831 
  *         @2019-01-12 21:36 
  */
object QueueDemo {
  def main(args: Array[String]): Unit = {
    //Queue 的创建
    import scala.collection.mutable
    val q1 = new mutable.Queue[Int] //队列中存放Int
    println(q1) //Queue()

    //Queue中追加元素
    q1 += 12
    q1 += 34
    q1 ++= List(6,9)
    println(q1) //Queue(12, 34, 6, 9)

    val res  =q1.dequeue() // 从队列的头部，取出一个元素,队列本身会变化
    println(q1) //Queue(34, 6, 9)
    println("res = " + res) //12

    q1.enqueue(88) //入队列，将数据加入队列的尾部
    println(q1) //Queue(34, 6, 9, 88)

    //q1 += List(1,2,3) //泛型为Any才ok Queue(20,21,2,4,6,List(1,2,3))
    //println(q1)
  }
}
