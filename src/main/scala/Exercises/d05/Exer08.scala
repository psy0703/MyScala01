package Exercises.d05

/*
定义一个抽象类Shape，一个抽象方法centerPoint，
以及该抽象类的子类Rectangle和Circle。为子类提供合适的构造器，并重写centerPoint方法
 */
object Exer08 {
  def main(args: Array[String]): Unit = {
    val rectangle = new Rectangle(3, 4)
    rectangle.centerPoint()

    val circle = new Circle(5)
    circle.centerPoint()
  }

}

abstract class Shape {
  def centerPoint()
}

/**
  * 矩形
  * @param length 边长
  * @param width  宽
  */
class Rectangle(length: Double, width: Double) extends Shape {
  var len = this.length
  var wide = this.width

  override def centerPoint(): Unit = {
    println(s"the centerPoint is (${this.len},${this.wide})")
  }
}

/**
  * 圆形
  * @param radius 半径
  */
class Circle(radius: Double) extends Shape {
  var ras = this.radius

  override def centerPoint(): Unit = {
    println(s"the centerPoint is (${this.ras},${this.ras})")
  }
}

