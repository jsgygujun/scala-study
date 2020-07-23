package com.jsgygujun.chapter07

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

  }
}
