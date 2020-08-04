package com.jsgygujun.chapter05

/**
 * 惰性求值
 *
 * @author jsgygujun@gmail.com
 * @since 2020/8/4 11:56 上午
 */
object LazyCalcExp {

  def main(args: Array[String]): Unit = {
    lazy val res = sum(10, 29)
    println("--"*10)
    println("res: " + res)
  }

  def sum(x: Int, y: Int) = {
    println("sum 被执行")
    x + y
  }
}
