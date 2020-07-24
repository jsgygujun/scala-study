package com.jsgygujun.chapter07

import scala.collection.mutable.ArrayBuffer

/**
 *
 * @author jsgygujun@gmail.com
 * @since 2020/7/23 2:13 下午
 */
object ArrayExp {
  def main(args: Array[String]): Unit = {
    // 不可变数组
    // new 是关键字
    // [Int]是指定可以存放的数据类型，如果希望存放任意数据类型，则指定 Any
    // (10)，表示数组的大小，确定后就不可以变化
    val arr1 = new Array[Int](10)
    println(arr1.length) // 10

    val s = Array("Hello", "World") // 长度为2类型为String的数组

    // 数组赋值的两种方式
    arr1(3) = 10
    arr1.update(4, 9)

    // 查看数组
    println(arr1.mkString(","))

    // 普通遍历数组
    for (i <- arr1) print(i+",")
    println()
    // 简化遍历数组
    def p(e: Int): Unit = print(e+",")
    arr1.foreach(p)
    arr1.foreach(println(_))


    // 变长数组
    val b = ArrayBuffer[Int]() // 或者 new ArrayBuffer[Int]，一个空的数组缓冲，准备存放整数
    b += 1 // ArrayBuffer(1)，用 += 在尾端添加元素
    b += (1,2,3,4,5) // ArrayBuffer(1,1,2,3,4,5), 在尾端追加多个元素
    b ++= Array(8,13,21) // ArrayBuffer(1,1,2,3,4,5,8,13,21) ++= 操作符追加任何集合
    b.trimEnd(5) // 移除最后5个元素
    b.toArray // 转数组


    // 数组转换，不修改原数组，而是产生一个全新的数组
    val a = Array(2,3,5,7,11)
    val result = for (e <- a) yield 2 * e // Array(4,6,10,14,22)
    val aa = a.filter(_ % 2 == 0).map(_ * 2) // 过滤 + 转化

    // 给定一个数组缓冲，移除除第一个负数意外的所有负数
    // 1. 搜集需要保留的下标，2. 将元素移动到该去的地方，并切断尾端
    var array = ArrayBuffer(3,-1,3,-4,3,-9,2,4)
    var first = true
    val index = for (i <- array.indices if first || array(i) >= 0) yield {
      if (array(i) < 0) first = false; i
    }
    for (j <- index.indices) array(j) = a(index(j))
    array.trimEnd(array.length-index.length)


  }
}
