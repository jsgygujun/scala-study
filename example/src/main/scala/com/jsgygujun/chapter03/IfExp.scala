package com.jsgygujun.chapter03

/**
 *
 * @author jsgygujun@gmail.com
 * @since 2020/7/24 9:45 上午
 */
object IfExp {
  def main(args: Array[String]): Unit = {
    def max(x: Int, y: Int): Int = {
      if (x > y) x else y // x > y ? x : y
    }
    println(max(5, 6))
  }

}
