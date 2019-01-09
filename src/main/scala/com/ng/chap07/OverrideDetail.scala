package com.ng.chap07

/**
  * Scala的重写的细节
  */
object OverrideDetail {
  def main(args: Array[String]): Unit = {
    println("Scala的重写的细节")
  }
}
class A1{
  def sal(): Int ={  //读
    return 10
  }
}

class B1 extends  A1{
  override def sal(): Int = {
    0
  }
}

abstract class A3{
  var age = 10 //普通属性
  var name : String //抽象属性
}

class B3 extends  A3{
  //说明:override var name : String = "jack" 表示实现了
  //1. A3  抽象类的抽象属性var name : String, 本质就是去实现了方法
  //2. override 这个可以不写，因为本质是实现而不是重写，但是写上也不报错
  override var name: String = "jack"
}

/*A3在底层的代码
public abstract class A3
{
  private int age = 10;

  public int age() { return this.age; }
  public void age_$eq(int x$1) { this.age = x$1; }

  public abstract String name();
  public abstract void name_$eq(String paramString);
}
 */

class AAAAA {
  var name: String = "" // name name_$eq()
}
class BBBBB extends AAAAA {
  //val只能重写另一个val 属性
  //override  val name: String = "jj"// name()
}