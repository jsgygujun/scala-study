package com.jsgygujun.chapter02

/**
 *
 * @author jsgygujun@gmail.com
 * @since 2020/7/23 10:20 上午
 */
object StringExp {
  def main(args: Array[String]): Unit = {
    var name: String = "Tom"
    var age = 18
    // 字符串，通过+号连接
    println(name + ", " + age)

    // printf 用法字符串，通过%传值。
    printf("name=%s,age=%d", name, age)

    // 字符串，通过$引用
    println(s"name=$name, age=$age")

    println(
      s"""name=${name}
         |age=${age}""".stripMargin
    )
  }
}
