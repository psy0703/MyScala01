package Exercises.d05

/*
1、扩展如下的BankAccount类，新类CheckingAccount对每次存款和取款都收取1美元的手续费
class BankAccount(initialBalance:Double){
   private var balance = initialBalance
   def deposit(amount:Double) = { balance += amount; balance}
   def withdraw(amount:Double) = {balance -= amount; balance}
}
 */
object Exer05 {
  def main(args: Array[String]): Unit = {
    val accout = new CheckingAccout(10000)
    accout.deposit(500)
    try {
      accout.withdraw(20000)
    } catch {
      case ex: Exception => {
        println(ex.getMessage)
      }
    }
  }
}

class BankAccount(initialBalance: Double) {
  private var balance = initialBalance //余额

  /**
    * 存款
    *
    * @param amount 存款金额
    * @return 余额
    */
  def deposit(amount: Double) = {
    balance += amount;
    balance
  }

  /**
    * 取款
    *
    * @param amount 取款金额
    * @return 余额
    */
  def withdraw(amount: Double) = {
    balance -= amount;
    balance
  }
}

class CheckingAccout(init: Double) extends BankAccount(init: Double) {

  var balance = init

  override def deposit(amount: Double): Double = {
    balance += amount
    balance -= 1.0
    println("余额为：" + balance)
    balance
  }

  override def withdraw(amount: Double): Double = {
    if ((balance - amount + 1) <= 0) throw new Exception("余额为：" + balance + " ,余额不足!!")
    balance -= amount
    balance -= 1.0
    println("余额为：" + balance)
    balance
  }
}
/*
  扩展前一个练习的BankAccount类，
  新类SavingsAccount每个月都有利息产生(earnMonthlyInterest方法被调用)，
  并且有每月三次免手续费的存款或取款。在earnMonthlyInterest方法中重置交易计数。
  */
class SavingsAccount(init:Double) extends BankAccount(init){
  var balance = init
  var count = 3

  def earnMonthlyInterest (): Unit ={

  }

  override def deposit(amount: Double): Double = {
    balance += amount
    balance -= 1.0
    println("余额为：" + balance)
    balance
  }

  override def withdraw(amount: Double): Double = {
    if ((balance - amount + 1) <= 0) throw new Exception("余额为：" + balance + " ,余额不足!!")
    balance -= amount
    balance -= 1.0
    println("余额为：" + balance)
    balance
  }
}