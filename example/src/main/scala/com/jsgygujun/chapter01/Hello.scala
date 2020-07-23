package com.jsgygujun.chapter01

/**
 *
 * @author jsgygujun@gmail.com
 * @since 2020/7/23 9:48 上午
 */
object Hello {

  /**
   * 定义变量：
   * val/var 变量名: 变量类型 = 变量值
   * val a: Int = 1
   *
   * 定义方法
   * def 函数名(参数名: 参数类型): 返回值类型 = {方法体}
   * def hello(arg: String): Unit = {
   *     println(arg)
   * }
   */

  /**
   * Scala 程序的入口
   * 完全面向对象:scala 完全面向对象，故 scala 去掉了 java 中非面向对象的元素， 如 static 关键字，void 类型
   * 1. static
   *   Scala 没有 static 关键字，由 object 实现类似静态方法的功能（类名.方法名），object 关键字和 class 的关键字定义方式相同，但作用不同。
   *   class 关键字和 java 中的关键字作用相同，用来定义一个类；object 的作用是声明一个单例对象，object 后的 "类名" 可以理解为单例对象的变量名。
   * 2. void
   *   对于无返回值的函数，scala 定义其返回值类型为 Unit 类。
   */
  def main(args: Array[String]): Unit = {
    println("Hello, scala!")
  }

}
