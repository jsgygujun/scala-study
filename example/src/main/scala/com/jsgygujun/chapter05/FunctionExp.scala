package com.jsgygujun.chapter05

/**
 * 函数至简原则
 * (1)return 可以省略，Scala 会使用函数体的最后一行代码作为返回值
 * (2)返回值类型如果能够推断出来，那么可以省略
 * (3)如果函数体只有一行代码，可以省略花括号
 * (4)如果函数无参，则可以省略小括号。若定义函数时省略小括号，则调用该函数时，
 * 也需省略小括号;若定时函数时未省略，则调用时，可省可不省
 * (5)如果函数明确声明 Unit，那么即使函数体中使用 return 关键字也不起作用
 * (6)Scala 如果想要自动推断无返回值，可以省略等号
 * (7)如果不关心名称，只关系逻辑处理，那么函数名(def)可以省略
 * (8)如果函数明确使用 return 关键字，那么函数返回就不能使用自行推断了，需要声
 * 明返回值类型
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


  def functionDemo01(): Unit = {
    // 函数 1:无参，无返回值
    def f1(): Unit = {
      println("无参，无返回值")
    }
    f1()
  }

  def functionDemo02(): Unit = {
    // 函数 2:无参，有返回值
    def f2(): String = {
      "无参，有返回值"
    }
    println(f2())
  }

  def functionDemo03(): Unit = {
    // 函数 3:有参，无返回值
    def f3(name: String): Unit = {
      println(s"name: $name")
    }
    f3("Tom")
  }

  def functionDemo04(): Unit = {
    // 函数 4:有参，有返回值
    def f4(name: String): String = {
      "有参数，有返回值"
    }
    println(f4("hello"))
  }

  def functionDemo05(): Unit = {
    // 函数 5:多参，无返回值
    def f5(name: String, age: Int): Unit = {
      println(s"$name, $age")
    }
    f5("dalao", 40)
  }

  /**
   * 可变参数
   * 如果参数列表中存在多个参数，那么可变参数一般放置在最后
   */
  def functionDemo06(): Unit = {
    def f6(s: String*): Unit = {
      println(s)
    }
    f6("Hello", ",", "Scala") // ArraySeq(Hello, ,, Scala)

    // 可变参数一般放置在最后
    def f7(name: String, s: String*): Unit = {
      println(s"name: $name, " + s)
    }
    f7("dalao", "hello", "world")
  }

  /**
   * 参数默认值
   * 一般情况下，将有默认值的参数放置在参数列表的后面
   */
  def functionDemo07(): Unit = {
    def f(name: String, age: Int = 30): Unit = {
      println(s"name: $name, age: $age")
    }
    f("dalao", 40)
    f("dalao")
  }
}
