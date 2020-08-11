package com.jsgygujun.programming_scala

import scala.io.Source

/**
 *
 * @author jsgygujun@gmail.com
 * @since 2020/8/11 5:24 下午
 */
class ReadFile {
  def main(args: Array[String]): Unit = {
    if (args.length > 0) {
      for (line <- Source.fromFile(args(0)).getLines()) {
        println(line.length + ": " + line)
      }
    } else {
      Console.err.println("Please enter filename")
    }
  }
}
