package com.ng.chap06

object ScalaConstructorDemo2 {
  def main(args: Array[String]): Unit = {
    //    val p1 = new Person4() // 调用的主构造器，输出  Person4 主构造器
    //
    //    //调用的是this(name: String)，Person4 主构造器
    //    // this(name : String) 辅助构造器被调用
    //    val p2 = new Person4("jack")
    //
    //    val p3 = new Person4("tom", 10)

    val p4 = new Person4(10)

    println("p4.name=" + p4.name + " p4.age=" + p4.age)
    // 1 => name = "匿名" age = 10  "Person4 主构造器"
    // 2. this(name : String) 辅助构造器被调用
    // 3. this(age: Int)
    // 4.
    /*
    Person4 主构造器
    this(name : String) 辅助构造器被调用
    this(age: Int)
    p4.name=匿名 p4.age=10
     */

    //val aaa = new AAA //ok
  }
}

class Person4 {
  var name: String = _
  var age: Int = _
  println("Person4 主构造器")

  //这里是一个辅助构造器, 可以接受一个name
  def this(name: String) {
    //在scala中，辅助构造器无论是直接或间接，最终都一定要调用主构造器，执行主构造器的逻辑
    //，因为通过这个机制，scala能够完成 父类构造

    //而且需要放在辅助构造器的第一行[这点和java一样，java中一个构造器要调用同类的其它构造器，也需要放在第一行]
    this // 直接 调用的是 Person4 主构造器
    this.name = name
    println("this(name : String) 辅助构造器被调用")
  }

  def this(name: String, age: Int) {
    this() //直接调用主构造器
    this.name = name
    this.age = age
  }

  def this(age: Int) {
    this("匿名") //间接调用主构造器,因为 def this(name : String) 中调用了主构造器!
    println("this(age: Int)")
    this.age = age
  }


}



class AAA private() { //如果希望将主构造器做成private ,只需要加入 private即可

}

//class BBB(name:String) { //主构造器和辅助构造器形参不能完全一样.
//
//  def this(kk:String) {
//    this("xx")
//  }
//}
