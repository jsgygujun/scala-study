package com.jsgygujun.chapter06

import scala.beans.BeanProperty

/**
 *
 * @author jsgygujun@gmail.com
 * @since 2020/8/4 1:56 下午
 */
// 如果主构造器无参数，小括号可省略
// class PersonExp() {
class PersonExp {
  var name: String = "dalao" // 定义属性
  var age: Int = _ // 表示给属性一个默认值

  // 自动生成规范的 setXxx/getXxx 方法
  @BeanProperty
  var sex: String = "male"

  // 辅助构造器
  def this(age: Int) {
    this()
    this.age = age
  }
}

object PersonExp {
  def main(args: Array[String]): Unit = {
    var person = new PersonExp;
    println(person.name)
    person.setSex("female")
    println(person.getSex)
  }
}
