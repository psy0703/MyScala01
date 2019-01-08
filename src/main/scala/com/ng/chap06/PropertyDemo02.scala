package com.ng.chap06
import scala.beans.BeanProperty

object PropertyDemo02 {
  def main(args: Array[String]): Unit = {
    val jack = new Monster3("jack")
    jack.name = "tom"
    println(jack.name)

    val car = new Car
    car.name = "Tesla"
    car.setName("QQ")

    println(car.name)
    println(car.getName)
  }
}

class Car{
  //说明
  //1.当给某个属性增加了  @BeanProperty ， 会生成对应的 setName 和 getName
  //2.并且和以前的name() 和 name_$eq() 不冲突
  @BeanProperty var name : String = "BMW 525"
}


class Monster (name : String){ // 默认是 public Monster(String name) {}

}
//如果形参列表为 val name:String
//1. val name:String => private String name
//2. public String name() { name }
class Monster2 (val name:String){

}
/*
底层代码：
public class Monster2
{
  private final String name;
  public String name()
  {
    return this.name;
  }
  public Monster2(String name){}
}
*/

//如果形参列表为 var name:String
//1. var name:String => private String name
//2. public String name() { return this.name; }
//3. public void name_$eq(String x$1) { this.name = x$1; }
class Monster3(var name : String){

}
/*底层代码：
public class Monster3
{
  private String name;

  public String name()
  {
    return this.name; }
  public void name_$eq(String x$1) { this.name = x$1; }

  public Monster3(String name)
  {
  }
}
 */

// class Car 底层代码
/*public class Car
{
  public String getName()
  {
    return name();
  }

  public void setName(String x$1)
  {
    this.name = x$1;
  }

  public void name_$eq(String x$1)
  {
    this.name = x$1;
  }

  public String name()
  {
    return this.name;
  }

  private String name = "BMW 525";
}
*/