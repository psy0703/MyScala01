package Exercises.d05

/*
设计一个Point类，其x和y坐标可以通过构造器提供。
提供一个子类LabeledPoint，其构造器接受一个标签值和x,y坐标,比如:new LabeledPoint(“Black Thursday”,1929,230.07)
 */
object Exer07 {
  def main(args: Array[String]): Unit = {
    val point = new LabledPoint("Black Thursday",1929,230.07)
  }
}

class Point2(x:Double,y:Double){
  var xValue = x
  var yValue = y
}

class LabledPoint(x1:Double,y1:Double) extends Point2(x1,y1){
  this.xValue = x1
  this.yValue = y1
  def this(labeled:String,x2:Double,y2:Double){
    this(x2,y2)
  }
}
