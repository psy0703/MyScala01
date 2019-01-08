package Exercises.d04

/**
  * 创建一个Student类，加入可读写的JavaBeans属性name(类型为String)和id(类型为Long)。
  * 有哪些方法被生产？(用javap查看。)
  * 你可以在Scala中调用JavaBeans的getter和setter方法吗？
  */
object Exer02 {
  def main(args: Array[String]): Unit = {
    val student = new Student
    student.name = "Jasmine" //底层调用student.name_$eq() 和 student.id_$eq() 方法，相当于setter方法
    student.id = 1111L
    println(student.name + " " + student.id) //底层调用student.name() 和 student.id() 方法，相当于getter方法
  }
}
class Student{
  var name :String = "jack"
  var id :Long = 1001L
}
/*
java 底层代码：
public class Student
{
  private String name;
  private long id;
  public String name()
  {
    return this.name;
  }
  public void name_$eq(String x$1)
  {
    this.name = x$1;
  }
  public long id()
  {
    return this.id;
  }
  public void id_$eq(long x$1)
  {
    this.id = x$1;
  }
}
 */