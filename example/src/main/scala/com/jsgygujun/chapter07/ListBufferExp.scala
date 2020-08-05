package com.jsgygujun.chapter07

import org.junit.Test

import scala.collection.mutable.ListBuffer

/**
 * ListBuffer 可变List
 *
 * @author jsgygujun@gmail.com
 * @since 2020/8/5 11:57 上午
 */
class ListBufferExp {

  @Test
  def create(): Unit = {
    // 语法
    // var name = new ListBuffer[datatype]()
    val name = ListBuffer("class", "gfg", "scala")
    println(name)
  }

  @Test
  def opt(): Unit = {
    val name = ListBuffer[String]()
    name += "Hello"
    name += "world"
    name += "Scala"
    name += ("1", "2") // 添加多个元素
    name.append("3", "4", "6") // 也可以使用append方法
    println(name)
    name -= "Scala" // 移除元素
    name.remove(0) // 通过下标移除
    println(name)
  }
}
