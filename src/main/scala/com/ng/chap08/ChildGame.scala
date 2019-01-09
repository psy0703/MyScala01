package com.ng.chap08

object ChildGame {
  def main(args: Array[String]): Unit = {
    val c1 = new Children("jack")
    val c2 = new Children("tom")
    val c3 = new Children("Jasmine")

    Children.joinGame(c1)
    Children.joinGame(c2)
    Children.joinGame(c3)

    Children.showInfo()

    Children.sayHi()
    /*
    jack join the game
    tom join the game
    Jasmine join the game
    有3个小孩玩游戏呢
    sayOk
     */
  }
}

//如果,设计一个var total Int表示总人数,我们在创建一个小孩时，就把total加1,
// 并且 total是所有对象共享的就ok了!，我们使用伴生对象来解决
class Children(cName:String){
  var name:String = cName
  def sayOk(): Unit ={

  }
}

//将静态属性：小孩总人数，放入 object Child
object Children{
var totalNum = 0
  def joinGame(c:Children): Unit ={
    println(c.name + " join the game")
    totalNum += 1
  }

  def showInfo(): Unit ={
    printf("有%d个小孩玩游戏呢\n" , totalNum)
  }
  def sayHi(): Unit ={
    sayOk()
  }

  private def sayOk(): Unit ={
    println("sayOk")
  }

}