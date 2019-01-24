package com.ng.chap17

object LowerBoundsDemo {

  def main(args: Array[String]): Unit = {
    biophony(Seq(new Earth, new Earth)).map(_.sound()) //对   hello ! hello !
    biophony(Seq(new Animal, new Animal)).map(_.sound()) //对 animal sound animal sound
    biophony(Seq(new Bird, new Bird)).map(_.sound())// 不会报错, bird sounds bird sounds
    val res3 = biophony(Seq(new Moon)) //这里传递的Moon, 底层按照 Object

    res3(0).asInstanceOf[Moon].sound() //正确, 输入 Moon Sounds

    val res = biophony(Seq(new Bird))
    val res2 = biophony(Seq(new Earth))

    //    val res2 = biophony(Seq(new Object))
    //    val res3 = biophony(Seq(new Moon))
    //    println("\nres2=" + res2)
    //    println("\nres3=" + res2)

  }

  //说明
  //1. [T >: Animal] 这是一个下界的语法，即 Animal是T的下界
  //2. things: Seq[T] 表示Seq[T] 是Seq集合可以放T类型
  //3. 编译器从下界判断 Animal有sound,但是父类不一定有sound
  /*
  正确的理解 [T>:Animal]
  如果是 下界  [T <: Animal ]
1）也就是说，可以随便传, 只不过和Animal直系的，是Animal父类的还是父类处理，是Animal子类的按照Animal处理，
2）和Animal无关的，一律按照Object处理！(语法层面, 运行时，仍然使用动态绑定机制）
   */
  def biophony[T >: Animal](things: Seq[T]) = things
}

class Earth { //Earth 类
  def sound() { //方法
    println("hello !")
  }
}

class Animal extends Earth {
  override def sound() = { //重写了Earth的方法sound()
    println("animal sound")
  }
}

class Bird extends Animal {
  override def sound() = { //将Animal的方法重写
    print("bird sounds")
  }
}

class Moon { //这是一个独立的类
  def sound() = { //将Animal的方法重写
    print("Moon sounds")
  }
}

