package com.jsgygujun.gui

import scala.swing._

/**
 *
 * @author jsgygujun@gmail.com
 * @since 2020/8/11 3:50 下午
 */
object FirstSwingApp extends SimpleSwingApplication {
  // 定义顶级 GUI 组件的代码
  def top = new MainFrame {
    // 标题栏
    title = "First Swing App"
    // 定义按钮
    contents = new Button {
      text = "Click me"
    }
  }
}
