package com.jsgygujun.chapter06

import scala.beans.BeanProperty

/**
 * 通过伴生对象的apply方法，实现不适用new方法创建对象
 *
 * @author gujun@qiyi.com
 * @since 2020/8/4 2:06 下午
 */
object ApplyExp {
  def main(args: Array[String]): Unit = {
    val p1 = Student("dalao", 40)
    println(p1.name + ", " + p1.getAge)
  }
}

class Student {
  @BeanProperty
  var name: String = _
  @BeanProperty
  var age: Int = _
}

object Student {
  def apply(name: String, age: Int): Student = {
    val s: Student = new Student;
    s.setName(name)
    s.setAge(age)
    s
  }
}
