package Exercises.d05
/*
5、提供一个Square类，扩展自java.awt.Rectangle并且是三个构造器：
一个以给定的端点和宽度构造正方形，一个以(0,0)为端点和给定的宽度构造正方形，一个以(0,0)为端点,0为宽度构造正方形
 */
object Exer09 {
  def main(args: Array[String]): Unit = {
    val square = new Square()
    println(square.toString)

    val square2 = new Square(0,0,5)
    println(square2.toString)

    val square3 = new Square(2,2,3)
    println(square3.toString)
  }
}

class Square extends java.awt.Rectangle{
  var x1:Int = 0
  var y1:Int = 0
  var width1:Int = 0
  var height1 = width1

  def this(x:Int,y:Int,width:Int){
    this()
    this.x1 = x
    this.y1= y
    this.width1 = width
    this.height = width
  }

  def this(width:Int){
    this()
    this.x1 = 0
    this.y1 = 0
    this.width1 = width
    this.height1 = width
  }

  def this(x:Int,y:Int,width:Int,heith:Int){
    this()
    this.x1 = x
    this.y1 = y
    this.width1 = width
    this.height1 = heith
  }

  override def toString: String = {
    s"以 (${this.x1},${this.y1}) 为端点和宽度为：${this.width1} 构造正方形"
  }
}

/*
public Rectangle() {
        this(0, 0, 0, 0);
    }

public Rectangle(int x, int y, int width, int height) {
    this.x = x;
    this.y = y;
    this.width = width;
    this.height = height;
}

public Rectangle(int width, int height) {
    this(0, 0, width, height);
}
 */
