package com.jsgygujun.chapter06

/**
 * 在Java 中，通常会用到既有示例方法又有静态方法的类，在Scala中，可以通过类和类的同名的"伴生"对象来达到同样的目的。
 * 类和类的伴生对象可以相互访问私有特性，但是必须位于同一个源文件中。
 * @author jsgygujun@gmail.com
 * @since 2020/8/3 9:58 上午
 */
class Account {
  // 必须加上Account.来访问伴生对象的方法
  val id = Account.newUniqueNumber()

  private var balance = 0.0

  def deposit(amount : Double): Unit = {
    balance += amount
  }

}

/**
 * 伴生对象
 */
object Account {
  private var lastNumber = 0

  private def newUniqueNumber() = {
    lastNumber += 1
    lastNumber
  }
}
