/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.xchgx.javaoop.course25.beike01;

import java.awt.GridLayout;
import java.awt.HeadlessException;
import javax.swing.BorderFactory;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author 陈老师 现代管理学院
 */
public class ConfigJFrame extends JFrame{
    
    public ConfigJFrame() throws HeadlessException {
        initWindow();
        start();
    }
    private void initWindow(){ 
        setTitle("测试");
        setSize(400, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    private void start(){
        JPanel panel1 = new JPanel(new GridLayout(1,2));
        panel1.setBorder(BorderFactory.createTitledBorder("速度设置"));
        panel1.add(new JCheckBox("使用加速器"));
        panel1.add(new JCheckBox("使用加密隧道"));
        
        
        JPanel panel2 = new JPanel(new GridLayout(1,0));
        panel2.setBorder(BorderFactory.createTitledBorder("浏览设置"));
        panel2.add(new JCheckBox("显示地址栏",true));
        panel2.add(new JCheckBox("显示源代码"));
        panel2.add(new JCheckBox("显示历史记录"));
        panel2.add(new JCheckBox("显示图片",true));
        
        
        setLayout(new GridLayout(2,1));
        getContentPane().add(panel1);
        getContentPane().add(panel2);
        pack();
    }
    public static void main(String[] args) {
        new ConfigJFrame().setVisible(true);
    }
}
