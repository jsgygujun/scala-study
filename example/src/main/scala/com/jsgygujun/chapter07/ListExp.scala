package com.jsgygujun.chapter07

import org.junit.Test

import scala.collection.mutable.ListBuffer

/**
 * List 不可变对象
 * 使用链表实现
 *
 * @author jsgygujun@gmail.com
 * @since 2020/7/23 2:04 下午
 */
class ListExp {

  @Test
  def create(): Unit = {
    // 语法1. val variable_name: List[type] = List(item1, item2, item3)
    // 语法2. val variable_name = List(item1, item2, item3)
    val list1: List[String] = List("Hello", "world", ",", "this", "is", "Scala", "!")
    println(list1)

    // 创建空List
    val list2 = List()
    println(list2)

    // 2-d List
    val list3 = List(List(1,0,0), List(0,1,0), List(0,0,1))
    println(list3)

    // 创建相同元素的List
    val list4 = List.fill(3)("Scala")
    println(list4) // List(Scala, Scala, Scala)
  }

  @Test
  def opt(): Unit = {
    val list = List(1,2,3,4,5,6,7,8,9)
    println(list.head) // 返回List中第一个元素： 1
    println(list.tail) // 返回去除第一个元素的后剩下的元素组成的List： List(2, 3, 4, 5, 6, 7, 8, 9)
    println(list.reverse) // List(9, 8, 7, 6, 5, 4, 3, 2, 1)

    println(-1 +: list) // 在头部添加一个元素0，返回一个新List
  }
}
