package com.jsgygujun.chapter05

/**
 *
 * @author jsgygujun@gmail.com
 * @since 2020/8/4 11:07 上午
 */
object AdvancedFunctionExp {
  def main(args: Array[String]): Unit = {
    advancedFunctionDemo01()
  }

  /**
   * 参数为函数的函数称为高阶函数
   */
  def advancedFunctionDemo01(): Unit = {
    // 定义高阶函数
    // op: (Int, Int) => Int  定义函数类型的参数
    def calc(a: Int, b: Int, op: (Int, Int) => Int) = {
      op(a, b)
    }
    def plus(x: Int, y: Int) = {
      x + y
    }
    def minus(x: Int, y: Int) = {
      x - y
    }
    def multiply(x: Int, y: Int) = {
      x * y
    }
    def divide(x: Int, y: Int) = {
      x / y
    }
    println(calc(2, 3, plus))
    println(calc(3, 2, minus))
    println(calc(2, 3, multiply))
    println(calc(6, 2, divide))
  }
}
