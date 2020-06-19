/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xchgx.javaoop.course26.ketangbiji01;

import java.awt.HeadlessException;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * 盒子布局窗体类
 *
 * @author 陈老师 现代管理学院
 */
public class BoxLayoutJFrame extends JFrame {

    private JButton[] buttons = new JButton[16];//创建是个按钮的数组空间，并不是创建了10个按钮的对象实例

    public BoxLayoutJFrame() throws HeadlessException {
        initWindow();
        initJButtonArray();//初始化按钮数组
        start();
    }

    private void initJButtonArray() {//初始化按钮数组
        for (int i = 0; i < buttons.length; i++) {
//            buttons[i] = new JButton("第i个按钮".replace("i", ""+(i+1)));
            String temp = "第i个按钮";
            int j = i + 1;
            String txt = temp.replace("i", "" + j);
            buttons[i] = new JButton(txt);
        }
    }

    private void initWindow() {
        setTitle("盒子布局窗体");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setSize(400, 500);
    }

    private void start() {
//        JPanel panel = new JPanel();//创建中间层容器
        Box box1 = Box.createHorizontalBox();
        box1.add(buttons[0]);//把按钮0放入到横排盒子容器中
        box1.add(buttons[1]);//把按钮0放入到横排盒子容器中
        box1.add(buttons[2]);//把按钮0放入到横排盒子容器中
        
        Box box2 = Box.createHorizontalBox();//在创建一个横排的盒子
        box2.add(buttons[3]);
        box2.add(Box.createHorizontalGlue());//放置一个空白的组件，撑开两边的组件
        box2.add(buttons[4]);
        
        Box box3 = Box.createHorizontalBox();//在创建一个横排的盒子
        box3.add(buttons[5]);
        box3.add(Box.createHorizontalStrut(50));//放置宽度为100像素的空白组件
        box3.add(buttons[6]);
        
        Box box4 = Box.createVerticalBox();//创建一个垂直排列的盒子
        box4.add(box1);//把横排排列的盒子放入
        box4.add(box2);//把横排排列的盒子放入
        box4.add(box3);//把横排排列的盒子放入
        
        getContentPane().add(box4);   
        pack();//缩放到自适应的大小
    }

    public static void main(String[] args) {
        new BoxLayoutJFrame().setVisible(true);//显示窗体
    }
}
