package com.jsgygujun.programming_scala


import org.junit.Test

/**
 *
 * @author jsgygujun@gmail.com
 * @since 2020/8/18 4:11 下午
 */
class MatchExp {


  @Test
  def test(): Unit = {

  }

  // 常量模式
  // 任何字面量都可以作为常量（模式）使用
  // 任何 Val 或者单例对象也可以被当作常量（模式）使用
  def describe(x: Any) = x match {
    case 5 => "five"
    case true => "true"
    case "hello" => "Hi!"
    case Nil => "The empty list"
    case _ => "Something else"
  }

  // 变量模式
  // 变量模式匹配任何对象
  def describe2(x: Any) = x match {
    case 0 => "zero"
    case other => "not zero" + other
  }

  // 序列模式
  def describe3(x: Any) = x match {
    case List(0, _, _) => println("fount it") // 匹配以0开头的三元素列表模式
    case List(0, _*) => println("fount it") // 匹配以0开头的任意长度的列表模式
    case _ =>
  }

  // 元组模式
  def describe4(x: Any) = x match {
    case (a, b, c) => "匹配任意的三元组"
    case _ => "其他"
  }

  // 带类型的模式
  def describe5(x: Any) = x match {
    case s: String => "匹配String类型"
    case m: Map[_,_] => "匹配Map"
    case _ => "其他"
  }




}
