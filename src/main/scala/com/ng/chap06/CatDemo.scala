package com.ng.chap06

object CatDemo {
  /*
  val cat: Nothing = new Nothing
  cat.name_$eq("小白")
  cat.age_$eq(3)
*/
  def main(args: Array[String]): Unit = {
    val cat = new Cat
    cat.name = "小白" // 底层 cat.name_$eq("小白")
    cat.age = 3 // 底层 cat.age_$eq(3)
    cat.color = "白色" // 底层 cat.color_$eq("白色")

    //cat.name 底层 cat.name() , cat.age() cat.color()
    println(cat.name + " " + cat.age + " " + cat.color)
  }

}
//快速入门-面向对象的方式解决养猫问题
//张老太养了只猫猫:一只名字叫小白,今年3岁,白色。还有一只叫小花,今年10岁,花色。请编写一个程
// 当用户输入小猫的名字时，就显示该猫的名字，年龄，颜色。如果用户输入的小猫名错误，则显示
// 张老太没有这只猫猫。
class Cat{
  //定义一个属性name,在底层会生成两个方法(getter, setter)
  //1. public String name() [getter]
  //2. public void name_$eq(String x$) [setter]

  //在底层 var name:String = _  => private String name = ""
  var name :String = _ // 在scala中类的属性，必须显式的初始化 _ 或者具体值
  var age :Int = _
  var color:String = _

}

/*
java 反编译代码
class Cat { private var name: String = null
private var age: Int = 0
private var color: String = null
def name: String =  { return this.name
}
def name_$eq(x$1: String): Unit =  { this.name = x$1
}
def age: Int =  { return this.age
}
def age_$eq(x$1: Int): Unit =  { this.age = x$1
}
def color: String =  { return this.color
}
def color_$eq(x$1: String): Unit =  { this.color = x$1
}
}
 */