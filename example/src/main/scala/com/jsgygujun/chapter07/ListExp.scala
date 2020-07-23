package com.jsgygujun.chapter07

import scala.collection.mutable.ListBuffer

/**
 *
 * @author jsgygujun@gmail.com
 * @since 2020/7/23 2:04 下午
 */
object ListExp {
  def main(args: Array[String]): Unit = {
    // 不可变List
    val immutableList: List[Int] = List(1,2,3,4,5)
    println(immutableList)
    // 对不可变List进行修改，在头部添加一个元素0
    val newImmutableList: List[Int] = 0 +: immutableList
    println(newImmutableList)

    // 可变List
    val mutableList: ListBuffer[Int] = ListBuffer(1,2,3,4,5)
    println(mutableList)
    //对可变 List 进行修改，在头部添加一个元素 0
    val newMutableList: ListBuffer[Int] = 0 +=: mutableList
    println(newMutableList)
  }
}
