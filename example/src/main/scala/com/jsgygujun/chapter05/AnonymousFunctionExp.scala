package com.jsgygujun.chapter05

/**
 * 没有名字的函数就是匿名函数，可以直接通过函数字面量(𝛌表达式)来设置匿名函数，
 * 函数字面量定义格式如下。
 * val sum: (Int, Int) => Int = (x: Int, y: Int) = x + y
 *
 * @author jsgygujun@gmail.com
 * @since 2020/8/4 11:15 上午
 */
object AnonymousFunctionExp {

  def AnonymousFunctionDemo01(): Unit = {
    // 定义高阶函数
    // op: (Int, Int) => Int  定义函数类型的参数
    def calc(a: Int, b: Int, op: (Int, Int) => Int) = {
      op(a, b)
    }
    // 匿名函数作为参数
    println(calc(2, 3, (x, y) => x + y))
    // 匿名函数简写
    println(calc(2, 3, _ + _))
  }
}
