package com.jsgygujun.chapter08

import org.junit.Test

/**
 * 模式匹配
 *
 * @author jsgygujun@gmail.com
 * @since 2020/8/7 2:48 下午
 */
class MatchExp {

  @Test
  def basic(): Unit = {
    var a = 10
    var b = 20
    var operator = 'd'
    val result = operator match {
      /**
       * 如果所有case都不匹配，那么会执行case _ 分支
       * 每个case中，不用break语句，自动中断case。
       * match case语句可以匹配任何类型，而不只是字面量。
       * => 后面的代码块，是作为一个整体执行，可以使用{}括起来，也可以不括
       */
      case '+' => a + b
      case '-' => a - b
      case '*' => a * b
      case '/' => a / b
      case _ => "illegal"
    }
    println(result)
  }

  /**
   * 守卫模式
   */
  @Test
  def test_2(): Unit = {
    def abs(x: Int) = x match {
      case i: Int if i >= 0 => i
      case j: Int if j < 0 => -j
      case _ => "type illegal"
    }
    println(abs(-0))
  }

  /**
   * 匹配常量
   */
  @Test
  def test_3(): Unit = {
    def describe(x: Any) = x match {
      case 5 => "Int five"
      case "hello" => "String hello"
      case true => "Boolean true"
      case '+' => "Char +"
      case _ => "Unknown"
    }
    println(describe(5))
    println(describe("hello"))
    println(describe(true))
    println(describe('+'))
    println(describe("/"))
  }

  /**
   * 匹配类型
   * 需要进行类型判断时，isInstanceOf[T]和asInstanceOf[T]，也可使用模式匹配实现同样的功能。
   */
  @Test
  def test_4(): Unit = {
    def f(x: Any) = x match {
      case i: Int => "Int"
      case s: String => "String"
      case m: List[_] => "List"
      case c: Array[Int] => "Array[INt]"
      case someThing => "something else " + someThing
    }
    println(f(List(1,2,3,4))) // List
    println(f(Array(1,2,3,4))) // Array[INt]
    println(f(Array("abc"))) // something else [Ljava.lang.String;@59494225
  }

  /**
   * 匹配数组
   * scala模式匹配可以对集合进行精确的匹配，例如匹配只有两个元素的、且第一个元素为0的数组。
   */
  @Test
  def test_5(): Unit = {
    def f(array: Array[_]) = array match {
      case Array(0) => "0" // 匹配Array(0) 这个数组
      case Array(x, y) => x + "," + y // 匹配有两个元素的数组，然后将将元素值赋给对应的x,y
      case Array(0, _*) => "以0开头的数组"
      case _ => "something else"
    }
    println(f(Array(0)))
    println(f(Array(1,2)))
    println(f(Array(1,2,3)))
    println(f(Array(0,2,3,4)))
  }

  /**
   * 匹配元组
   */
  @Test
  def test_6(): Unit = {
    def f(t: (_, _)) = t match {
      case (0, _) => "0,x" // 是第一个元素是0的元组
      case (_, 0) => "y,0" // 匹配后一个元素是0元组
      case (a, b) => "" + a + " " + b
      case _ => "something else"
    }
    println(f((0,1)))
    println(f((1,0)))
    println(f((1,1)))
  }

  /**
   * 匹配样例类
   */
  @Test
  def test_7(): Unit = {
    case class User(name: String, age: Int)
    def f(user: User) = user match {
      case User("zhangsan", 11) => "yes"
      case _ => "no"
    }
    println(f(User("zhangsan",11)))
    println(f(User("lisi", 12)))
  }
}
