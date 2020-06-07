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
public class CreateCloseIsExitJFrameTest {
    public static void main(String[] args) {
        JFrame frame = new JFrame();//创建窗体类
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//点击关闭按钮则退出程序 
        frame.setVisible(true);//显示界面
    }
}
