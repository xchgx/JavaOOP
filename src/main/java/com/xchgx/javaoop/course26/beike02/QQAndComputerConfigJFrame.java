/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xchgx.javaoop.course26.beike02;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTabbedPane;

/**
 *
 * @author 陈老师 现代管理学院
 */
public class QQAndComputerConfigJFrame extends JFrame { 
    
    public QQAndComputerConfigJFrame() throws HeadlessException {
        initWindow(); 
        start();
    } 
    private void initWindow() {//初始化窗体
        setTitle("流式布局窗体");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 500);
        setLocationRelativeTo(null);
    }

    private void start() {
        
        
        JLabel label = new JLabel("软件系统设置",JLabel.CENTER);
        label.setPreferredSize(new Dimension(200, 50));
        JPanel p1 = new JPanel(new BorderLayout());  
        
        JPanel p1Left = new  JPanel(); 
        p1Left.add(new JLabel("通用",JLabel.CENTER));
        JPanel p1Right = new JPanel(new GridLayout(11,1));
        JCheckBox cbx1 = new JCheckBox("开启新消息提醒声音"); cbx1.setSelected(true);
        JCheckBox cbx2 = new JCheckBox("开启语音和视频通话提醒声音"); cbx2.setSelected(true);
        JCheckBox cbx3 = new JCheckBox("有更新时自动升级微信"); cbx3.setSelected(true);
        JCheckBox cbx4 = new JCheckBox("开机自动启动微信");
        JCheckBox cbx5 = new JCheckBox("保留聊天记录");  cbx5.setSelected(true);
        JCheckBox cbx6 = new JCheckBox("适配系统缩放比例"); cbx6.setSelected(true);
        JCheckBox cbx7 = new JCheckBox("使用系统默认浏览器打开网页");
        JCheckBox cbx8 = new JCheckBox("聊天中的语音消息自动转成文字"); cbx8.setSelected(true);
        JButton button = new JButton("清空聊天记录(3.3G)");
        JComboBox cbx9 = new JComboBox();
        cbx9.addItem("简体中文");
        cbx9.addItem("英文");
        cbx9.addItem("繁体中文");
        p1Right.add(cbx1);
        p1Right.add(cbx2);
        p1Right.add(cbx3);
        p1Right.add(cbx4);
        p1Right.add(cbx5);
        p1Right.add(cbx6);
        p1Right.add(cbx7);
        p1Right.add(cbx8);
        p1Right.add(button);
        p1Right.add(cbx9);
        p1.add(p1Left,BorderLayout.WEST);
        p1.add(p1Right);
        
        JPanel p2 = new JPanel(new GridLayout(3,1));  
        JPanel p21 = new JPanel(new GridLayout(2,1));
        p21.setBorder(BorderFactory.createTitledBorder("搜索内容"));
        p21.add(new JRadioButton("在邮搜因的位置搜索文件名和内容。，在没有索引的位置，只搜索文件名。"));
        p21.add(new JRadioButton("适中搜索文件名和内容（此过程可能需要几分钟）"));
        
        JPanel p22 = new JPanel(new GridLayout(4,1));
        p22.setBorder(BorderFactory.createTitledBorder("搜索内容"));
        p22.add(new JCheckBox("在搜索文件夹时在搜索结果中包含子文件夹"));
        p22.add(new JCheckBox("查找部分匹配"));
        p22.add(new JCheckBox("使用自然语言搜索"));
        p22.add(new JCheckBox("在文件夹中搜索系统文件时不要使用索引（此过程可能需要较长的时间）"));
        
        JPanel p23_parent = new JPanel(new BorderLayout());
        JPanel p23 = new JPanel(new GridLayout(2,1));
        p23.setBorder(BorderFactory.createTitledBorder("在搜索没有索引的位置时"));
        p23.add(new JCheckBox("包括系统目录"));
        p23.add(new JCheckBox("包括压缩文件（ZIP、CAB...）"));
        p23_parent.add(p23,BorderLayout.NORTH);
        p2.add(p21);
        p2.add(p22);
        p2.add(p23_parent);
//        p2.add(p21,BorderLayout.NORTH);
//        p2.add(p22,BorderLayout.CENTER);
//        p2.add(p23,BorderLayout.SOUTH);
        
        JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
        tabbedPane.add("账号设置", p1);
        tabbedPane.add("通用设置", p2);

        getContentPane().add(label,BorderLayout.NORTH);
        getContentPane().add(tabbedPane,BorderLayout.CENTER);
        
    }

    public static void main(String[] args) {
        new QQAndComputerConfigJFrame().setVisible(true);
    }
}
