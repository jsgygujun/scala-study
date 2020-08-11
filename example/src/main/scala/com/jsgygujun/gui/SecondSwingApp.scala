package com.jsgygujun.gui

import scala.swing.SimpleSwingApplication

import scala.swing._
/**
 *
 * @author jsgygujun@gmail.com
 * @since 2020/8/11 3:54 下午
 */
object SecondSwingApp extends SimpleSwingApplication {
  def top = new MainFrame {
    title = "Second Swing App"
    val button = new Button {
      text = "Click Me"
    }
    val label = new Label {
      text = "No Button clicks registered"
    }
    contents = new BoxPanel(Orientation.Vertical) {
      contents += button
      contents += label
      border = Swing.EmptyBorder(30,30,10,10)
    }
  }

}
