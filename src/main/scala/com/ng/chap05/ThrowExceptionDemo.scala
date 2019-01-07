package com.ng.chap05

/**
  * 用throw关键字，抛出一个异常对象。
  * 所有异常都是Throwable的子类型。
  * throw表达式是有类型的，就是Nothing，
  * 因为Nothing是所有类型的子类型，所以throw表达式可以用在需要类型的地方
  */
object ThrowExceptionDemo {

  def main(args: Array[String]): Unit = {
    try{
      test()
    } catch {
      case ex:Exception =>{
        println(ex.getMessage)
      }
    }finally {
      //资源的是否和关闭，可以将这部分代码写到这里.
      println("finally被执行~~")
    }
    println("go on...")
  }

  def test():Nothing ={
    throw new Exception("自定义异常")
  }
  /*
  自定义异常
  finally被执行~~
  go on...
   */
}
