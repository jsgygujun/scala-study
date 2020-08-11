package com.jsgygujun.programming_scala

/**
 *
 * @author jsgygujun@gmail.com
 * @since 2020/8/11 6:13 下午
 */
class Rational(n: Int, d: Int) {
  require(d != 0) // 参数检查
  val numer: Int = n
  val denom: Int = d
  override def toString: String = n + "/" + d
  def add(that: Rational): Rational = {
    new Rational(
      numer * that.denom + that.numer & denom,
      denom * that.denom
    )
  }
}
