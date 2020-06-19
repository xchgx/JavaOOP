/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.xchgx.javaoop.course26.ketangbiji01;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * 网格布局窗体类
 * @author 陈老师 现代管理学院
 */
public class GridLayoutJFrame extends JFrame{
    private JButton[] buttons = new JButton[16];//创建是个按钮的数组空间，并不是创建了10个按钮的对象实例
    public GridLayoutJFrame() throws HeadlessException {
        initWindow();
        initJButtonArray();//初始化按钮数组
        start();
    }
    private void initJButtonArray(){//初始化按钮数组
        for (int i = 0; i < buttons.length; i++) {
//            buttons[i] = new JButton("第i个按钮".replace("i", ""+(i+1)));
            String temp = "第i个按钮";
            int j = i+1;
            String txt = temp.replace("i", ""+j);
            buttons[i] = new JButton(txt);
        }
    }
    private void initWindow(){
        setTitle("网格布局窗体");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setSize(400,500);
    } 
    private void start(){ 
//        getContentPane().add(btn);//边框布局，默认放入到中间
//        setLayout(new BorderLayout());//边框布局
        setLayout(new GridLayout(5,3));//网格布局 5*2 11个组件 按行扩展
        for (int i = 0; i < buttons.length; i++) {
            JButton button = buttons[i];
            getContentPane().add(button);//采用网格布局后，添加组件
        }
        
    }
    public static void main(String[] args) {
        new GridLayoutJFrame().setVisible(true);
    }
}
