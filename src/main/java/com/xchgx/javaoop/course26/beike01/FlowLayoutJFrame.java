/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xchgx.javaoop.course26.beike01;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * 布局管理器
 *
 * @author 陈老师 现代管理学院
 */
public class FlowLayoutJFrame extends JFrame {
    private JButton b1 = new JButton("第1个按钮");
    private JButton b2 = new JButton("第2个按钮");
    private JButton b3 = new JButton("第3个按钮");
    private JButton b4 = new JButton("第4个按钮");
    private JButton b5 = new JButton("第5个按钮");
    private JButton b6 = new JButton("第6个按钮");
    private JButton b7 = new JButton("第7个按钮");
    private JButton b8 = new JButton("第8个按钮");
    private JButton b9 = new JButton("第9个按钮");
    public FlowLayoutJFrame() throws HeadlessException {
        initWindow();
        start();
    }
    
    private void initWindow(){//初始化窗体
        setTitle("流式布局窗体");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400,400);
        setLocationRelativeTo(null);
    }
    private void start(){
        JPanel p1 = new JPanel(new FlowLayout());
        p1.add(b1);
        p1.add(b2);
        p1.add(b3);
        
        JPanel p2 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        p2.add(b4);
        p2.add(b5);
        p2.add(b6);
        
        JPanel p3 = new JPanel(new FlowLayout(FlowLayout.RIGHT,10,2));
        p3.add(b7);
        p3.add(b8);
        p3.add(b9);
        
        getContentPane().setLayout(new GridLayout(0,1));
        getContentPane().add(p1);
        getContentPane().add(p2);
        getContentPane().add(p3);
    }
    public static void main(String[] args) {
        new FlowLayoutJFrame().setVisible(true);
    }
}
