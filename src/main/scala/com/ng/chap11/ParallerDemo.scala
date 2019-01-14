package com.ng.chap11

/**
  * 并行集合
  * 1) 主要用到的算法有：
  * Divide and conquer : 分治算法，Scala通过splitters(分解器)，combiners(合并器) 等抽象层来实现，主要原理是将计算工作分解很多任务，分发给一些处理器去完成，并将它们处理结果合并返回
  * 2) Work stealin算法(工作窃取算法)，主要用于任务调度负载均衡（load-balancing），通俗点完成自己的所有任务之后，发现其他人还有活没干完，主动（或被安排）帮他人一起干，这样达到尽早干完的目的
  */
object ParallerDemo {
  def main(args: Array[String]): Unit = {
    (1 to 5).foreach(print(_)) //12345
    println()
    (1 to 5).par.foreach(print(_)) //54123

    val result1 = (0 to 100).map{case _=>Thread.currentThread.getName}.distinct
    val result2 = (0 to 100).par.map{case _ => Thread.currentThread.getName}.distinct
    println(result1) //Vector(main)
    println(result2) //ParVector(ForkJoinPool-1-worker-29, ForkJoinPool-1-worker-31...)
  }
}
