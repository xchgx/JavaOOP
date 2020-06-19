/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.xchgx.javaoop.course26.ketangbiji01;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * 边框布局窗体类
 * @author 陈老师 现代管理学院
 */
public class BorderLayoutJFrame extends JFrame{
    //JFrame和JDialog默认的布局管理器就是 边框布局管理器
    private JButton east = new JButton("东"); 
    private JButton south = new JButton("南"); 
    private JButton west = new JButton("西"); 
    private JButton north = new JButton("北"); 
    private JButton center = new JButton("中"); 
    public BorderLayoutJFrame() {
        initWindow();
        start();
    }
    private void initWindow(){
        setTitle("边框布局窗体");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setSize(400,500);
    } 
    
    private void start(){ //开始
        //如果往容器中添加组件没有设置方位（东南西北中）时，默认放入到中间层。
//        getContentPane().add(north);//默认放到中间位置
//        getContentPane().add(north,BorderLayout.NORTH);//顶层容器就是JFrame的容器
//        getContentPane().add(south,BorderLayout.SOUTH);//顶层容器就是JFrame的容器
        JPanel panel = new JPanel(new GridLayout(3,1));
        panel.add(west);
        panel.add(north);
        panel.add(south);
        getContentPane().add(panel,BorderLayout.WEST);//顶层容器就是JFrame的容器
        getContentPane().add(east,BorderLayout.EAST);//顶层容器就是JFrame的容器
        getContentPane().add(center,BorderLayout.CENTER);//顶层容器就是JFrame的容器
        
    }
    public static void main(String[] args) {
        new BorderLayoutJFrame().setVisible(true);//显示窗体
       //Ctrl+Shift+I 自动导入包
    }
}
