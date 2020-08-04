package com.jsgygujun.chapter05

/**
 * 柯里化
 * 是把接受多个参数的函数变换成接受一个单一参数(最初函数的第一个参数)的函数，并且返回接受余下的参数且返回结果的新函数的技术。
 * @author jsgygujun@gmail.com
 * @since 2020/8/4 11:43 上午
 */
object CurryingExp {

  def main(args: Array[String]): Unit = {

  }

  def CurryingDemo01(): Unit = {
    // 普通函数
    val sum = (x: Int, y: Int, z: Int) => x + y + z

    // 柯里化1
    val sum1 = (x: Int) => {
      y: Int => {
        z: Int => {
          x + y + z
        }
      }
    }

    // 柯里化2
    val sum2 = (x: Int) => (y: Int) => (z: Int) => x + y + z

    // 柯里化3
    def sum3(x: Int)(y: Int)(z: Int) = x + y + z

    sum(1, 2, 3)
    sum1(1)(2)(3)
    sum2(1)(2)(3)
    sum3(1)(2)(3)
  }
}
