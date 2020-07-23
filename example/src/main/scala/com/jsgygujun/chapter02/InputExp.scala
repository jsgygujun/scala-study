package com.jsgygujun.chapter02

import scala.io.StdIn

/**
 *
 * @author gujun@qiyi.com
 * @since 2020/7/23 10:24 上午
 */
object InputExp {
  def main(args: Array[String]): Unit = {
    println("input name:")
    var name = StdIn.readLine()
    println("input age:")
    var age = StdIn.readShort()
    var salary = StdIn.readDouble()
    println(s"name=$name, age=$age, salary=$salary")
  }
}
