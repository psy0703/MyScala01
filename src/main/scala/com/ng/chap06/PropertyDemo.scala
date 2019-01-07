package com.ng.chap06

/**
  * 属性/成员变量
  * 1) 属性的定义语法同变量，示例：[访问修饰符] var 属性名称 [：类型] = 属性值 访问修饰符如果不写，默认为private
  * 2) 属性的定义类型可以为任意类型，包含值类型或引用类型[案例演示]
  * 3) Scala中声明一个属性,必须显示的初始化，然后根据初始化数据的类型自动推断，属性类型可以省略(这点和Java不同)。[案例演示]
  * 4) 如果赋值为null,则一定要加类型，因为不加类型, 那么该属性的类型就是Null类型.
  * 5) 如果在定义属性时，暂时不赋值，也可以使用符号_(下划线)，让系统分配默认值.
  * 6) 不同对象的属性是独立，互不影响
  */
object PropertyDemo {

  def main(args: Array[String]): Unit = {
    val p1 = new Person
    println(p1.age + p1.sal + p1.Name + " " + p1.address)
    //910.88 null null

    println(p1.address == null) // true [String]
    println(p1.Name == null) // true [Null]
    println(p1.lover == null) // true [Person]
  }
}
class  Person{
  var Name = null //Name 的类型为Null
  var age:Int = 22
  var sal = 888.88
  var address :String = null //address 的类型为string
  var lover:Person = _ //  当我们给一个对象一个 _ 默认值，也是 null
}
