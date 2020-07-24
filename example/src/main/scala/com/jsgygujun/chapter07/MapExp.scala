package com.jsgygujun.chapter07

import org.junit.Test

import scala.collection.mutable

/**
 *
 * @author jsgygujun@gmail.com
 * @since 2020/7/24 2:43 下午
 */
class MapExp {

  @Test
  def map(): Unit = {
    // 创建不可变Map
    val map = Map("a"->1, "b"->2, "c"->3)
    // 数据访问
    for (key <- map.keys) {
      // 使用get访问map集合的数据，会返回特殊类型Option(选项): 有值(Some)，无值(None)
      println(key + "=" + map(key))
    }
    // 如果不存在返回0
    println(map.getOrElse("d", 0))
    // 循环打印
    map.foreach((kv) => println(kv))
  }

  @Test
  def mutable_map(): Unit = {
    // 创建可变Map
    val map = mutable.Map("a"->1, "b"->2, "c"->3)
    map.foreach((kv) => println(kv))
    // 添加数据或修改
    map.+=("d"->4)
    map.foreach((kv) => println(kv))
    // 删除数据
    map.-=("a","b")
    map.foreach((kv) => println(kv))
    // 修改数据
    map.update("d", 5)
    map.foreach((kv) => println(kv))
  }
}
