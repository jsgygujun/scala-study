package com.jsgygujun.chapter03

/**
 *
 * @author jsgygujun@gmail.com
 * @since 2020/7/24 9:45 上午
 */
object IfExp {
  def main(args: Array[String]): Unit = {
    ifDemo01()
    println(max(4, 8))
  }

  def ifDemo01(): Unit = {
    val age = 19
    val isAdult = if (age >= 18) true else false
    println(isAdult)
  }

  def max(x: Int, y: Int): Int = {
    if (x > y) x else y
  }

}
