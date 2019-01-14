package com.ng.chap12

object MatchObjectDemo02 {
  def main(args: Array[String]): Unit = {
    val namesString = "Alice,Bob,Thomas"
    //说明
    namesString match {
      //当匹配到  case Names(first, second, third) ， 默认调用
      // 1. Names unapplySeq(str: String)
      // 2. namesString 传给 str
      // 3. 返回Some还要求个数和Names(first, second, third) 一样
      case Names(first, second, third)  =>{
        println("the string contains three people's names")
        // 打印字符串
        println(s"$first $second $third")
        /*
        unapply 被调用
the string contains three people's names
Alice Bob Thomas
         */
      }
      case _ => println("nothing matched")
    }
  }
}
class Names{
}
object Names {
  //提取器
  def unapplySeq(str : String): Option[Seq[String]] ={
    println("unapply 被调用")
    if(str.contains(",")) Some(str.split(",")) //Some("Alice","BobThomas")
    else None
  }

}
