package Exercises.d05.Day05_2

/**
  * 根据下图实现类。在TestCylinder类中创建Cylinder类的对象，设置圆柱的底面半径和高，并输出圆柱的体积
  */
object TestCylinder {

  def main(args: Array[String]): Unit = {
    val cylinder = new Cylinder
    cylinder.length = 5
    cylinder.radius = 3
    val area = cylinder.findArea()
    println("area = " + area)
  }
}

class Circle2 {
  private var radius: Double = 1 //圆的半径

  def getRadius(): Double = {
    this.radius
  }

  def setRadius(radius: Double): Unit = {
    this.radius = radius
  }

  def findArea(): Double = {

    (math.Pi * this.radius * this.radius).formatted("%.2f").toDouble
  }
}

class Cylinder extends Circle2 {
  var length: Double = 1.0 //圆柱的高

  var radius = super.getRadius()

  def getLength(): Double = {
    this.length
  }

  def setLength(length: Double): Unit = {
    this.radius = length
  }

  override def findArea(): Double = {
    val perimeter = (2 * math.Pi * radius).formatted("%.2f").toDouble //圆的周长
    val area = length * perimeter + (2 * math.Pi * this.radius * this.radius)
    return area.formatted("%.2f").toDouble
  }
}
