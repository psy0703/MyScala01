package com.ng.chap04

import scala.io.StdIn

object IfDemo01 {
  def main(args: Array[String]): Unit = {
    println("age: ")
    val age = StdIn.readShort()

    if (age > 18){
      println("age > 18")
    } else{
      println("age <= 18")
    }

    println{"go "}
  }
}
