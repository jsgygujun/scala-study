package com.jsgygujun.chapter05

/**
 *
 * @author jsgygujun@gmail.com
 * @since 2020/7/23 11:27 上午
 */
object FunctionExp {

  def main(args: Array[String]): Unit = {

    // {}块的值取最后一个表达式
    def distance(x1: Double, y1: Double, x2: Double, y2: Double): Double = {
      import scala.math.sqrt
      val dx = x2 - x1; val dy = y2 - y1; sqrt(dx * dx + dy * dy)
    }
    print(distance(0.1,0.2,0.3,0.4))

    // 函数 1:无参，无返回值
    def f1(): Unit = {
      println("无参，无返回值")
    }
    f1()

    // 函数 2:无参，有返回值
    def f2(): String = {
      return "无参，有返回值"
    }
    println(f2())

    // 函数 3:有参，无返回值
    def f3(name: String): Unit = {
      println(s"name: $name")
    }
    f3("Tom")

    // 函数 4:有参，有返回值
    def f4(name: String): String = {
      "有参数，有返回值"
    }
    println(f4("hello"))


    // 可变参数
    def f5(s: String*): Unit = {
      println(s)
    }
    f5("Hello", ",", "Scala") // ArraySeq(Hello, ,, Scala)


    // 高阶函数： 参数为函数的函数称为高阶函数
    // 高阶函数————函数作为参数
    def calc(a: Int, b: Int, operator: (Int, Int) => Int): Int = {
      operator(a,b)
    }
    // 函数————求和
    def plus(x: Int, y: Int): Int = {
      x + y
    }
    // 函数————求积
    def mul(x: Int, y: Int): Int = {
      x * y
    }
    println(calc(2,3,plus))
    println(calc(2,3,mul))

    // 匿名函数
    println(calc(6,3,(x: Int, y: Int) => x/y))
  }
}
