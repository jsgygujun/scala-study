package com.jsgygujun.chapter07

import org.junit.Test

import scala.collection.mutable

/**
 *
 * @author gujun@qiyi.com
 * @since 2020/7/24 2:27 下午
 */
class SetExp {

  @Test
  def set(): Unit = {
    // Set 默认是不可变集合，数据无序，且不可重复
    val set = Set(1,2,3,4,5,6,6)
    // Set 遍历
    set.foreach(s => print(s+",")) // 5,1,6,2,3,4,
    println()
  }

  @Test
  def mutable_set(): Unit = {
    // 可变Set
    val set = mutable.Set(1,2,3,4,5)
    set.foreach(s => print(s+",")) // 1,2,3,4,5,
    println()
    // 添加元素
    set += 8
    set.foreach(s => print(s+",")) // 1,2,3,4,5,8,
    println()
    // 向集合中添加元素，返回一个新的Set
    val ints = set.+(9)
    ints.foreach(s => print(s+",")) // 1,2,3,4,5,8,9,
    println()
    // 删除数据
    set -= 5
    println(set.mkString(","))

  }



}
