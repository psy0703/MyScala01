package com.ng.chap05

/**
  * 函数/方法注意事项和细节讨论
  */
object FunctionDetails {
  def main(args: Array[String]): Unit = {
    //函数的形参列表可以是多个, 如果函数没有形参，调用时 可以不带()
    val f = () => {
      println("hello")
    }
    f()
    //如果函数没有形参，调用时 可以不带()
//    sayOk

//    val res = sayHi()
//    println("res = " + res)

    println(sub(10,5))

    //调用f3
    println(f3("hello"))
    //----------------------------------------------
    def sayOk():Unit={
      println("sayOk")
    }

    //如果函数明确使用return关键字，那么函数返回就不能使用自行推断了,
    // 这时要明确写成 : 返回类型 =  ，
    // 如果什么都不写，即使有return 返回值为()
    def sum (n1:Int,n2:Int):Int = {
      return n1 + n2
    }
    // 如果什么都不写，即使有return 返回值为()
    def sayHi(){
      return 10
    }

    //如果函数明确声明无返回值（声明Unit），
    //那么函数体中即使使用return关键字也不会有返回值
    def sub(n1:Int,n2:Int):Unit ={
      return n1 - n2 //Int
    }

    //如果明确函数无返回值或不确定返回值类型，
    //那么返回值类型可以省略(或声明为Any)
    //建议使用上面，类型推导
    def f3 (s:String){
      if (s.length >= 3){
        s + "123"
      } else{
        3
      }
    }

    //可用，不推荐
    def f4(s: String): Any = {
      if (s.length >= 3)
        s + "123"
      else
        3
    }
  }
}
