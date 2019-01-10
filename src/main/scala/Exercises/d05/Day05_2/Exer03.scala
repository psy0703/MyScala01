package Exercises.d05.Day05_2
/*
	练习3(多态应用、参数多态练习)
定义员工类Employee，包含姓名和月工资，以及计算年工资getAnnual的方法。
普通员工和经理继承了员工，经理类多了奖金bonus属性和管理manage方法，
普通员工类多了work方法，
普通员工和经理类要求分别重写getAnnual方法

测试类中添加一个方法showEmpAnnal，实现如果是普通员工，则调用work方法，如果是经理，则调用manage方法
测试类中添加一个方法，testWork,如果是普通员工，则调用work方法，如果是经理，则调用manage方法
 */

object Exer03 {

  def main(args: Array[String]): Unit = {
    val manager = new Manager
    manager.salary = 10000
    manager.bonus = 50000

    val worker = new Worker
    worker.salary = 5000

    println("manager's annual income is " + showEmpAnnal(manager))
    println("worker's annual income is " + showEmpAnnal(worker))

    testWork(manager)
    testWork(worker)
  }

  //如果是普通员工，则调用work方法，如果是经理，则调用manage方法
  def showEmpAnnal(emp:Employee): Double ={
    if (emp.isInstanceOf[Worker]){
      emp.asInstanceOf[Worker].getAnnual()
    } else if(emp.isInstanceOf[Manager]){
      emp.asInstanceOf[Manager].getAnnual()
    } else{
      emp.getAnnual()
    }
  }
 //如果是普通员工，则调用work方法，如果是经理，则调用manage方法
  def testWork(emp:Employee): Unit ={
    if (emp.isInstanceOf[Worker]){
      emp.asInstanceOf[Worker].work()
    } else if(emp.isInstanceOf[Manager]){
      emp.asInstanceOf[Manager].manage()
    } else{
      throw new Exception("输入的类型错误")
    }
  }
}
class Employee{
  var name:String = _ //姓名
  var salary:Double = _ //薪水
  def getAnnual ():Double={12 * salary} //获取全年工资
}
class Worker extends Employee{

  def work(): Unit ={
    println("普通员工在工作")
  }

  override def getAnnual(): Double = {
    12 * this.salary
  }
}
class Manager extends Employee{
  var bonus:Double = _ //奖金

  def manage(): Unit ={
    println("经理在办公室。。。")
  }
  override def getAnnual(): Double = {
    12 * this.salary + bonus
  }
}