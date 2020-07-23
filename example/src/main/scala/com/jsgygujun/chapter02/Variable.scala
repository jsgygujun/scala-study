package com.jsgygujun.chapter02

/**
 *
 * @author jsgygujun@gmail.com
 * @since 2020/7/23 10:11 上午
 */
object Variable {
  def main(args: Array[String]): Unit = {
    // 1. 声明变量时，类型可以省略(编译器自动推导，即类型推导)
    var age = 18
    age = 30
    // 2. 类型确定后，就不能修改，说明 Scala 是强数据类型语言。
    // age = "Tom" // 错误
    // 3. 变量声明时需要初始值
    // var name // 错误

    // 在声明/定义一个变量时，可以使用 var 或者 val 来修饰，var 修饰的变量可改变，val 修饰的变量不可改。
    val num = 1
    // num = 2 // 错误

    // var 修饰的对象引用可以改变，val 修饰的则不可改变，但对象的状态(值)却是 可以改变的。(比如:自定义对象、数组、集合等等)
    var p1 = new Person()
    p1.name = "Jerry"
    p1 = null

    val p2 = new Person()
    p2.name = "Alex" // 可以更改
    // p2 = null // 不可以更改

  }

  class Person {
    var name: String = "Tom"
  }

}
