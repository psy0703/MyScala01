package Exercises.d05

/**
  * 2、定义一个 Point 类和一个伴生对象,使得我们可以不用 new 而直接用 Point(3,4)来构造 Point 实例 apply 方法的使用
  */
object Exer02 {
  def main(args: Array[String]): Unit = {
    val point = Point(3,4)
  }
}

class Point(x:Int,y:Int){
  var xValue:Int = x
  var yValue: Int = y
}

object Point{
  def apply(x: Int, y: Int): Point = new Point(x, y)
}
