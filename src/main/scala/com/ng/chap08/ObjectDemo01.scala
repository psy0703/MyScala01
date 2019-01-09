package com.ng.chap08
//伴生类和半生对象快速入门
object ObjectDemo01 {
  def main(args: Array[String]): Unit = {

    println(ScalaPerson.sex) // 底层 ScalaPerson$.MODULE$.sex()

    println(ScalaPerson.sayHello()) //底层 ScalaPerson$.MODULE$.sayHello()
  }
}

//说明
//1. 如果在同一个文件中，有  class ScalaPerson 和 object ScalaPerson
//2. 我们就称 class ScalaPerson 为伴生类
//3. 如果在同一个文件中，只有  class ScalaPerson， 就是以普通的类
//4. 在底层会生成 一个 ScalaPerson.calss 文件，将 非静态的内容写入到该类中
class ScalaPerson {
  var name: String = _
}

//说明
//1. 如果在同一个文件中，有  class ScalaPerson 和 object ScalaPerson
//2. 我们就称 object ScalaPerson 为伴生对象
//3. 如果在同一个文件中，只有  object ScalaPerson，在底层仍然会生成两个文件
//   ScalaPerson.calss [默认的内容] ScalaPerson$.calss 对应object ScalaPerson
//4. 如果在同一个文件中，有  class ScalaPerson 和 object ScalaPerson,
// object ScalaPerson 只会生成 ScalaPerson$.calss， class ScalaPerson 会生成
// ScalaPerson.calss
//5. 将类ScalaPerson 的静态的内容写入到  object ScalaPerson
object ScalaPerson {
  var sex: Boolean = true

  def sayHello(): Unit = {
    println("scala hello")
  }
}
