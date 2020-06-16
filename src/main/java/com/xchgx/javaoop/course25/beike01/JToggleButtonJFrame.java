/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.xchgx.javaoop.course25.beike01;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

/**
 *
 * @author 陈老师 现代管理学院
 */
public class JToggleButtonJFrame extends JFrame{
    JCheckBox cb1 = new JCheckBox("JCheckBox1");
    JCheckBox cb2 = new JCheckBox("JCheckBox2");
    JCheckBox cb3 = new JCheckBox("JCheckBox3");
    JRadioButton rb1 = new JRadioButton("JRadioButton1");
    JRadioButton rb2 = new JRadioButton("JRadioButton2");
    JRadioButton rb3 = new JRadioButton("JRadioButton3");
    ButtonGroup buttonGroup = new ButtonGroup();
    public JToggleButtonJFrame() throws HeadlessException {
        initWindow();
        start();
    }
    private  void initWindow(){
        setTitle("切换按钮");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400,400);
        setLocationRelativeTo(null);
        buttonGroup.add(rb1);
        buttonGroup.add(rb2);
        buttonGroup.add(rb3); 
    }
    private  void start(){
        JPanel p1 = new JPanel();//中间层面板容器
        JPanel p2 = new JPanel();//中间层面板容器
        JPanel p3 = new JPanel();//中间层面板容器
        p1.add(cb1);
        p1.add(cb2);
        p1.add(cb3);
        p3.add(cb1);
        p3.add(cb2);
        p3.add(cb3);
        Border createEtchedBorder = BorderFactory.createEtchedBorder();//创建蚀刻边框
        TitledBorder createTitledBorder = BorderFactory.createTitledBorder(createEtchedBorder,"JCheckBox");
        p1.setBorder(createTitledBorder);
        
        p2.add(rb1);
        p2.add(rb2);
        p2.add(rb3);
        Border createLineBorder = BorderFactory.createLineBorder(Color.yellow);
        TitledBorder createTitledBorder1 = BorderFactory.createTitledBorder(createLineBorder,"JRadioButton");
        p2.setBorder(createTitledBorder1);
        
        
        Border createBevelBorder = BorderFactory.createBevelBorder(BevelBorder.LOWERED);
        TitledBorder createTitledBorder2 = BorderFactory.createTitledBorder(createBevelBorder,"测试");
        p3.setBorder(createTitledBorder2);
        
        setLayout(new GridLayout(0, 1));
        getContentPane().add(p1);
        getContentPane().add(p2);
        getContentPane().add(p3);
        
    }
    public static void main(String[] args) {
        new JToggleButtonJFrame().setVisible(true);
    }
}
