package com.jsgygujun.chapter05

/**
 *
 * @author gujun@qiyi.com
 * @since 2020/7/23 11:27 上午
 */
object FunctionExp {

  def main(args: Array[String]): Unit = {
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
  }
}
