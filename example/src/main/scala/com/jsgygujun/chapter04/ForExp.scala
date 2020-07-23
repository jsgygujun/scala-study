package com.jsgygujun.chapter04

/**
 *
 * @author gujun@qiyi.com
 * @since 2020/7/23 11:01 上午
 */
object ForExp {

  def main(args: Array[String]): Unit = {
    // 范围数据循环方式 1， 前后闭合
    for (i <- 1 to 3) print(i+",") // 1,2,3
    println()

    // 范围数据循环方式 2， 前闭后开
    for (i <- 1 until 3) print(i+",") // 1,2
    println()

    // 循环守卫, 保护式为 true 则进入循环 体内部，为 false 则跳过，类似于 continue。
    for (i <- 1 until 10 if i % 2 != 0) print(i+",") // 1,3,5,7,9
    println()

    // 循环步长, by 表示步长
    for (i <- 0 until 10 by 2) print(i+",") // 0,2,4,6,8
    println()

    // 嵌套循环
    for (i <- 1 to 3; j <- 1 to 3) print(s"i:$i,j:$j; ")
    println()

    // 引入变量
    // for 推导式一行中有多个表达式时，所以要加;来隔断逻辑
    for (i <- 1 to 3; j = 4-i) print(s"i:$i,j:$j; ")
    println()
    // for 推导式有一个不成文的约定:当 for 推导式仅包含单一表达式时使用圆括号， 当包含多个表达式时，一般每行一个表达式，并用花括号代替圆括号，如下
    for {
      i <- 1 to 3
      j = 4 - i
    } {
      print(s"i:$i,j:$j; ")
    }
    println()

    // 循环返回值 将遍历过程中处理的结果返回到一个新 Vector 集合中，使用 yield 关键字
    var res = for (i <- 1 to 10) yield {
      i * 2
    }
    println(res) //Vector(2, 4, 6, 8, 10, 12, 14, 16, 18, 20)

    // 多重循环，打印乘法表
    val max = 9
    for {
      i <- 1 to max
      j <- 1 to i
    } {
      print(j + "x" + i + "=" + (i*j) + "\t")
      if (j == i) println()
    }
    for (i <- 1 to max) {
      for (j <- 1 to i) {
        print(j + "x" + i + "=" + (i*j) + "\t")
      }
      println()
    }

  }
}
