/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xchgx.javaoop.course19.ketangbiji02;

import javax.swing.JFrame;

/**
 *
 * @author Administrator
 */
public class JFrameApp {
    //先让程序运行起来
    public static void main(String[] args) {//主方法
        JFrame frame = new JFrame("我的第一个窗口App");//实例化并传入窗体标题
        //点击关闭按钮，程序并没有退出？
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//只在主窗体中设置该属性
        frame.setSize(400, 200);//宽度400，高度200 像素单位
        //frame.setLocation(200, 100);//位置是水平向右200像素，垂直向下100像素
        frame.setLocationRelativeTo(null);//设置水平，垂直居中布局
        frame.setAlwaysOnTop(true);//true表示最顶端，false表示（取消）非最顶端
        //默认窗体是隐藏的。
        //先准备好所有的数据或设置，最后再显示出来
        frame.setVisible(true);//true表示显示窗体，false表示隐藏窗体
    }
}
