package com.ng.chap07

object ScalaPackage {
  def main(args: Array[String]): Unit = {
    val cat1 = new com.ng.chap07.xm.Cat
    val cat2 = new com.ng.chap07.xq.Cat

    println("cat1 = " + cat1)
    println("cat2 = " + cat2)
    /*
    cat1 = com.ng.chap07.xm.Cat@66d33a
    cat2 = com.ng.chap07.xq.Cat@5a39699c
     */
  }

}
