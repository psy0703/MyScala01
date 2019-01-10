package Exercises.d05.Day05_2
/*
练习1
编写Computer类，包含CPU、内存、硬盘等属性，getDetails方法用于返回Computer的详细信息
编写PC子类，继承Computer类，添加特有属性【品牌brand】
编写NotePad子类，继承Computer类，添加特有属性【颜色color】
编写Test Object，在main方法中创建PC和NotePad对象，分别对象中特有的属性赋值，以及从Computer类继承的属性赋值，并使用方法并打印输出信息
 */
object Exer01 {
  def main(args: Array[String]): Unit = {
    val pc = new PC()
    pc.brand = "HP"
    pc.getDetails()

    val pad = new NotePad()
    pad.color = "white"
    pad.getDetails()
  }
}

class Computer{
  var CPU:String = "Intel"
  var Memory:String = "16G"
  var disk:String = "1TB"

  def this(cpu:String,memory:String,disk:String){
    this()
    this.CPU = cpu
    this.Memory = memory
    this.disk = disk
  }
  def getDetails(): Unit ={
    println(s"CPU :${this.CPU} 内存：${this.Memory} 硬盘：${this.disk}")
  }
}

class PC extends Computer{
  var brand:String = _

  override def getDetails(){
    println(s"CPU :${this.CPU} 内存：${this.Memory} 硬盘：${this.disk} 品牌：${this.brand}")
  }
}

class NotePad extends Computer{
  var color:String = _

  override def getDetails(): Unit = {
    println(s"CPU :${this.CPU} 内存：${this.Memory} 硬盘：${this.disk} 颜色：${this.color}")
  }
}
