/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.xchgx.javaoop.course26.beike01;

import java.awt.HeadlessException;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author 陈老师 现代管理学院
 */
public class BoxJFrame extends JFrame{
    private JButton[] buttons = new JButton[10];
    public BoxJFrame() throws HeadlessException {
        initWindow();
        initJButtonArray();
        start();
    }
    
    private void initJButtonArray(){
        for (int i = 0; i < buttons.length; i++) {
            buttons[i] = new JButton("第i个按钮".replace("i", ""+(i+1))); 
        } 
    }
    private void initWindow(){//初始化窗体
        setTitle("流式布局窗体");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400,400);
        setLocationRelativeTo(null);
    }
    private void start(){
        //创建第一个水平箱容器
        Box box1 = Box.createHorizontalBox();
        box1.add(buttons[0]);
        box1.add(buttons[1]);
        box1.add(buttons[2]);
        
//        //创建第二个水平箱容器
        Box box2 = Box.createHorizontalBox();
        box2.add(buttons[3]);
        box2.add(Box.createHorizontalGlue());
//        box2.add(Box.createHorizontalStrut(20));
        box2.add(buttons[4]);
        
        //创建一个垂直箱容器，放置上面两个水平箱（Box组合嵌套）
        Box box3 = Box.createVerticalBox();
        box3.add(box1);
        box3.add(box2);
        getContentPane().add(box3);
        pack();
    }
    public static void main(String[] args) {
        new BoxJFrame().setVisible(true);
    }
}
