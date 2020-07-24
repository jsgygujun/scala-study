package com.jsgygujun.chapter07

import org.junit.Test

import scala.collection.mutable

/**
 *
 * @author jsgygujun@gmail.com
 * @since 2020/7/24 3:30 下午
 */
class QueueExp {

  @Test
  def queue(): Unit = {
    val queue = new mutable.Queue[String]()
    queue.enqueue("a","b","c")
    println(queue.dequeue())
    println(queue.dequeue())
    println(queue.dequeue())
  }

}
