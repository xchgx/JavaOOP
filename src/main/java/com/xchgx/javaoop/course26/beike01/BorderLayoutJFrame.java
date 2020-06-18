/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.xchgx.javaoop.course26.beike01;

import java.awt.BorderLayout;
import java.awt.HeadlessException;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author 陈老师 现代管理学院
 */
public class BorderLayoutJFrame extends JFrame{
    private JButton east = new JButton("东");
    private JButton south = new JButton("南");
    private JButton west = new JButton("西");
    private JButton north = new JButton("北");
    private JButton center = new JButton("中");
    public BorderLayoutJFrame() throws HeadlessException {
        initWindow();
        start();
    }
    
    private void initWindow(){//初始化窗体
        setTitle("边框布局窗体");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400,400);
        setLocationRelativeTo(null);
    }
    private void start(){
//        getContentPane().setLayout(new BorderLayout());
        setLayout(new BorderLayout(5, 10));
        add(north,BorderLayout.NORTH);
        add(south,BorderLayout.SOUTH);
        add(east,BorderLayout.EAST);
        add(west,BorderLayout.WEST);
        add(center,BorderLayout.CENTER);
    }
    
    public static void main(String[] args) {
        new BorderLayoutJFrame().setVisible(true);
    }

}
