package com.jsgygujun.chapter05

import scala.annotation.tailrec

/**
 * 控制抽象
 *
 * @author jsgygujun@gmail.com
 * @since 2020/8/4 11:51 上午
 */
object ControlAbstractExp {

  // 柯里化
  // 代码块 可以作为 => 类型的参数值
  def loop(n: Int)(op: => Unit): Unit = {
    if (n > 0) {
      op
      loop(n-1)(op)
    }
  }

  def main(args: Array[String]): Unit = {
    loop(5) {
      println("hello world!")
    }
  }
}
