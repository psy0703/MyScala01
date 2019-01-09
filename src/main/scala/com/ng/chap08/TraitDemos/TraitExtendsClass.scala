package com.ng.chap08.TraitDemos

/**
  * 拓展类的特质
  * 特质可以继承类，以用来拓展该特质的一些功能
  * 所有混入该特质的类，会自动成为那个特质所继承的超类的子类
  * 如果混入该特质的类，已经继承了另一个类(A类)，
  * 则要求A类是特质超类的子类，否则就会出现了多继承现象，发生错误。
  * @author cloud9831 
  *         @2019-01-09 23:29 
  */
object TraitExtendsClass {

}
trait LoggedException extends Exception {
  def log(): Unit ={
    println(getMessage())  //方法来自于exception类
  }
}

//UnhappyException 就是Exception的子类
class UnHappyException extends LoggedException{
  // 已经是Exception的子类了，所以可以重写方法
  override def getMessage: String = super.getMessage
}

//如果混入该特质的类，已经继承了另一个类(A类)，则要求A类是特质超类的子类，否则就会出现了多继承现象，发生错误。

// IndexOutOfBoundsException 父类时 Exception
// LoggedException 他的父类也是 Exeption
class UnHappyException2 extends IndexOutOfBoundsException with LoggedException //ok

class CCC
//class UnhappyException3 extends CCC with LoggedException // 不对