package com.jsgygujun.chapter05

/**
 * scala 闭包
 * 1. 闭包是一个有状态（不消失的私有数据）的函数。
 * 2. 闭包是一个有记忆的函数。
 * 3. 闭包相当于一个只有一个方法的紧凑对象（a compact object）。
 *
 * 闭包是一个函数，返回值依赖于声明在函数外部的一个或多个变量。
 * 闭包通常来讲可以简单的认为是可以访问一个函数里面局部变量的另外一个函数。
 *
 * @author jsgygujun@gmail.com
 * @since 2020/8/4 11:24 上午
 */
object ClosureExp {
  var factor = 3
  var multiplier: Int => Int = (i: Int) => i * factor // 需要捕获外部的factor变量

  def main(args: Array[String]): Unit = {
    // 这样定义的函数变量 multiplier 成为一个"闭包"，因为它引用到函数外面定义的变量，定义这个函数的过程是将这个自由变量捕获而构成一个封闭的函数。
    println("multiplier(1) value = " +  multiplier(1))
  }
}
