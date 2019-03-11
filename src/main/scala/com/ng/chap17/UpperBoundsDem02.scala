package com.ng.chap17

object UpperBoundsDem02 {
  def main(args: Array[String]): Unit = {
    biophony(Seq(new Bird, new Bird)) //?   鸟 sounds.. 鸟 sounds..
    biophony(Seq(new Animal, new Animal)) //? 动物 sound 动物 sound
    biophony(Seq(new Animal, new Bird)) //优越，统一 动物 sound 鸟 sounds.
//    biophony(Seq(new Earth, new Earth)) //? 报错!! 原因是 Earth是Animal父类，

  }
  //说明
  //1 . [T <: Animal] 上界约束
  //2. T 类型是Animal子类, 也可以是Animal
  //3. things: Seq[T] , things是 Seq结合，该集合中存放 T类型
  //4. things map (_.sound) 调用  T的sound
  def biophony[T <: Animal](things:Seq[T]) = things map(_.sound)
}


class Earth1 { //Earth 类
  def sound() { //方法
    println("地球 hello !")
  }
}

class Animal1 extends Earth { //动物类，是Earth子类
  override def sound() = { //重写了Earth的方法sound()
    println("动物 sound")
  }
}

class Bird1 extends Animal { //鸟是Animal子类
  override def sound() = { //将Animal的方法重写
    println("鸟 sounds..")
  }
}
