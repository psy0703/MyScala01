package Exercises.d03

/**
  * 针对下列Java循环编写一个Scala版本:
  * for(int i=10;i>=0;i–)System.out.println(i);
  */
object Exer03 {
  def main(args: Array[String]): Unit = {
    for ( i <- 0 to 10 reverse){ //reverse对集合内容进行翻转
      println( "i = " + i)
    }
  }
}
