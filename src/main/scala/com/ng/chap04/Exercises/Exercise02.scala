package com.ng.chap04.Exercises

import scala.io.StdIn
import scala.util.control.Breaks._

/**
  * 实现登录验证，有三次机会，
  * 如果用户名为”张无忌” ,密码”888”提示登录成功，
  * 否则提示还有几次机会，请使用for 循环完成
  *
  * @author cloud9831 
  *         @2019-01-06 21:31 
  */
object Exercise02 {
  def main(args: Array[String]): Unit = {
    var count = 3
    breakable {
      for (i <- 1 to 3) {
        println("请输入用户名：")
        val userName = StdIn.readLine()
        println("请输入密码：")
        val password = StdIn.readLine()
        if ("张无忌".equals(userName) && "888".equals(password)) {
          println("登陆成功！")
          break()
        } else {
          count -= 1
          printf("用户名或密码错误， 还有%d次机会 \n", count)
          if (count == 0) {
            break()
          }
        }
      }
    }
  }
}
