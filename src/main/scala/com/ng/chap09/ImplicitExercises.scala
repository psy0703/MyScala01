package com.ng.chap09

/**
  * 隐式值练习
  */
object ImplicitExercises {

  implicit var str:String = "jack" //隐式值
  def main(args: Array[String]): Unit = {
    def hello(implicit name:String): Unit ={ // hello$1
      println(name + "  hello")

      def hello(): Unit ={ //   hello$2
        println("aaa")
      }
    }
    //就近原则
    hello  //jack  hello  hello$1(str) 使用隐式值不要带()
  }

  def hello(): Unit ={
    println("bbb")
  }

}

object exercise{
  def main(args: Array[String]): Unit = {
    // 隐式变量（值）
    implicit val name: String = "Scala"
//    implicit val name1: String = "World"

    def hello2(implicit content: String = "jack"): Unit = {
      println("Hello " + content)
    }
    //调用hello
    hello2  //报错 ，因为隐式值重复，编译器无法解析
            //匹配顺序 ：实参--》隐式值--》默认值  没有就报错
    //Hello Scala  ->有默认值和隐式值同时存在，匹配时隐式值优先级高
  }
  }
