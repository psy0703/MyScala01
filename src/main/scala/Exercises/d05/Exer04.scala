package Exercises.d05

/**
  * 4、编写一个扑克牌 4 种花色的枚举,让其 toString 方法分别返回♣,♦,♥,♠，
  * 并实现一个函数,检查某张牌的花色是否为红色
  */
object Exer04 {
  def main(args: Array[String]): Unit = {
    val face = new PokeFace
    println(face.toString)
    println(face.checkType("♥"))

  }
}

class PokeFace {
  //定义四种花色
  val type1 = "♣"
  val type2 = "♦"
  val type3 = "♥"
  val type4 = "♠"

  override def toString: String = {
    type1 + " " + type2 + " " + type3 + " " + type4
  }

  //检查某张牌的花色是否为红色
  def checkType (pokeType: String):Boolean =  {
    if (pokeType == type3) true
    else false
  }
}
