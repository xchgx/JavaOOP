/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xchgx.javaoop.course19.beike03;

import javax.swing.JFrame;

/**
 *
 * @author 陈老师 现代管理学院
 */
public class GetJFrameAttributeTest {

    public static void main(String[] args) {
        JFrame frame = new JFrame("测试题");//创建窗体类
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//点击关闭按钮则退出程序 
        frame.setSize(400, 200);//设置宽度400，高度200的窗口
//        frame.setLocation(400, 200);//出现在水平400像素，垂直200像素的位置
        frame.setLocationRelativeTo(null);//水平垂直居中
        frame.setAlwaysOnTop(true);//在最前端
        frame.setVisible(true);//显示界面
        System.out.println("窗体宽度："+frame.getWidth());
        System.out.println("窗体高度："+frame.getHeight());
        boolean visible = frame.isVisible();
        System.out.println("当前窗口是:"+(visible?"显示的":"隐藏的"));
        String title = frame.getTitle();
        System.out.println("窗口标题是:"+title); 
    }
}
