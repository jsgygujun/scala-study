package com.jsgygujun.chapter02

/**
 *
 * @author gujun@qiyi.com
 * @since 2020/7/23 10:28 上午
 */
object DataTypeExp {
  def main(args: Array[String]): Unit = {
    // 正确
    var n1: Byte = 127
    var n2: Byte = -128

    // 错误
    // var n1: Byte = 128
    // var n2: Byte = -129

    // Scala 的整型，默认为 Int 型，声明 Long 型，须后加‘l’或‘L’
    var n5 = 10
    println(n5)
    var n6 = 9223372036854775807L
    println(n6)

    // Scala 的浮点型常量默认为 Double 型，声明 Float 型常量，须后加‘f’或‘F’。
    var n7 = 2.2345678912f
    var n8 = 2.2345678912
    println(n7)
    println(n8)

    // 字符类型可以表示单个字符，字符类型是Char，16位无符号Unicode字符(2个字节)， 区间值为 U+0000 到 U+FFFF。
    // 字符常量是用单引号 ' ' 括起来的单个字符。
    var c1: Char = 'a'
    println(c1)

    // 可以直接给 Char 赋一个整数，然后输出时，会按照对应的 unicode 字符输出
    println("c1 码值=" + c1.toInt)

    // Char 类型是可以进行运算的，相当于一个整数，因为它都对应有 Unicode 码。
    var c2: Char = 97
    var c4: Char = ('a' + 1).toChar
    println(s"c2:$c2, c4:$c4")
  }
}
