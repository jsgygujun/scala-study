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

    // 基本类型转 String 类型(语法:将基本类型的值+"" 即可)
    var str1: String = true + ""
    var str2: String = 4.5 + ""
    var str3: String = 100 + ""
    println(str1+","+str2+","+str3)

    // String 类型转基本数值类型(语法:调用相关 API)
    var s1 = "12"
    var n1 = s1.toByte
    var n2 = s1.toShort
    var n3 = s1.toInt
    var n4 = s1.toLong

  }
}
