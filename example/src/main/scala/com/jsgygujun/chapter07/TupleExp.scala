package com.jsgygujun.chapter07

import org.junit.Test

/**
 *
 * @author jsgygujun@gmail.com
 * @since 2020/7/24 3:01 下午
 */
class TupleExp {

  @Test
  def tuple(): Unit = {
    // 声明元组的方式:(元素，元素 2，元素 3)
    val tuple: (Int, String, Boolean) = (40, "Bob", true)
    // 访问元组
    // 通过元素的顺序进行访问，调用方式:_顺序号
    println(tuple._1)
    println(tuple._2)
    println(tuple._3)
    // 通过索引访问数据
    println(tuple.productElement(0))
    // 通过迭代器访问数据
    for (elem <- tuple.productIterator) {
      println(elem)
    }
    // Map 中的键值对其实就是元组,只不过元组的元素个数为 2，称之为对偶
    val map = Map("a"->1, "b"->2, "c"->3)
    map.foreach(t => println(t._1 + ":" + t._2))
  }

}
