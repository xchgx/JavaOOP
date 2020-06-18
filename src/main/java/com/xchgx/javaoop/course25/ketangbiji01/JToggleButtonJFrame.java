/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xchgx.javaoop.course25.ketangbiji01;

import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.TitledBorder;

/**
 * 切换按钮窗体类
 *
 * @author 陈老师 现代管理学院
 */
public class JToggleButtonJFrame extends JFrame {
    public JToggleButtonJFrame() {//构造器
        initWindow();//调用窗体设置的初始化方法
        start();
    }
    private void initWindow() {//对窗体的初始化设置
        setTitle("切换组件的使用");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);
        setLocationRelativeTo(null);
    }
    private void start(){
        //多选框组件
        JCheckBox cb1 = new JCheckBox("加速器1");
        JCheckBox cb2 = new JCheckBox("加速器2");
        JCheckBox cb3 = new JCheckBox("加速器3");
        //单选框
        JRadioButton rb1 = new JRadioButton("服务器1");
        JRadioButton rb2 = new JRadioButton("服务器2");
        JRadioButton rb3 = new JRadioButton("服务器3");
        //创建单选按钮组
        ButtonGroup group = new ButtonGroup();
        group.add(rb1);
        group.add(rb2);
        group.add(rb3); 
        //中间层容器
        JPanel p1 = new JPanel();//这个容器放多选框
        JPanel p2 = new JPanel();//这里放单选框
        //给中间层面板边框
        TitledBorder border = BorderFactory.createTitledBorder("加速通道设置");
        p1.setBorder(border);
        p2.setBorder(BorderFactory.createTitledBorder("服务器选择"));
        //添加组件到中间层容器中
        p1.add(cb1);  p1.add(cb2);  p1.add(cb3);
        p2.add(rb1);  p2.add(rb2);  p2.add(rb3);
        setLayout(new GridLayout(2, 1));//设置顶层容器的布局管理
        getContentPane().add(p1);
        getContentPane().add(p2); 
        pack();//自动缩放到最适合的大小
    }
    public static void main(String[] args) {
        new JToggleButtonJFrame().setVisible(true);
    }
}
