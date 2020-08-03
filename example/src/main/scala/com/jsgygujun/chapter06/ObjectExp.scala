package com.jsgygujun.chapter06

/**
 * 单例对象
 * 类似与Java单利模式
 * Scalar 没有静态方法或者静态字段，可以使用object来定义某个类的单个实例
 * @author jsgygujun@gmail.com
 * @since 2020/8/3 9:53 上午
 */
object ObjectExp {
  private var lastNumber = 0

  // ObjectExp的构造器在ObjectExp.newUniqueNumber()的首次调用时执行。
  // 如果ObjectExp从未被使用过，则其构造器也不会被执行
  def newUniqueNumber() = {
    lastNumber +=1
    lastNumber
  }
}
