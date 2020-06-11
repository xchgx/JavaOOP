/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.xchgx.javaoop.course22.beike05;

import java.awt.Color;
import java.awt.HeadlessException;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author 陈老师 现代管理学院
 */
public class JPanelJFrame  extends  JFrame{
    public JPanelJFrame() throws HeadlessException {
        setTitle("Hello JPanel");
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        
        
        JPanel panel = new JPanel();
        panel.setBackground(Color.red);
        panel.setBounds(0, 0, getWidth()/2, getHeight()/2);
        getContentPane().add(panel);
        
      
    }
    public static void main(String[] args) {
        JPanelJFrame f = new JPanelJFrame();
        f.setVisible(true);
    }
}
