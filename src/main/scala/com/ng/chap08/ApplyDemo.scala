package com.ng.chap08

/**
  * 在伴生对象中定义apply方法，可以实现： 类名(参数) 方式来创建对象实例.
  */
object ApplyDemo {
  def main(args: Array[String]): Unit = {
    val arr = Array[Int](10,10) //底层使用的伴生对象的apply

    //步骤
    //1. 会去调用 object Car 的 apply 方法，会根据 参数来对应apply
    //2. 即apply可以重载
    val car = Car("Tesla",999999)
    println(car)

    val car2 = Car("BMW",555555)
    println(car2)

  }
}

class Car(cName:String,cPrice:Double){
  var name = cName
  var price = cPrice

  override def toString:String = {
    s"信息如下：${this.name}  price is ${this.price} \n"
  }

  def this(cName: String){
    this(cName,99999.9)
  }
}

object Car{
  //在伴生对象中定义apply方法，可以实现： 类名(参数) 方式来创建对象实例.
  def apply(cName: String, cPrice: Double): Car = new Car(cName, cPrice)

  def apply(cName: String): Car = new Car(cName)
}
