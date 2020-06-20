/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xchgx.javaoop.course27.beike04;

import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * 贪吃蛇
 *
 * @author 陈老师 现代管理学院
 */
public class 贪吃蛇 extends JFrame {

    JLabel snakeHead = new JLabel("蛇头", JLabel.CENTER);//创建标签组件，用来表示贪吃蛇头
    private int x, y;//贪吃蛇蛇头的当前坐标

    public 贪吃蛇() throws HeadlessException {
        initWindow();//初始化窗体设置
        start();//开始添加组件和布局
    }

    private void initWindow() {//初始化窗体设置
        setTitle("计算器窗体");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 600);
        setLocationRelativeTo(null);
    }

    private void start() {
        setLayout(null);//关闭布局管理器，所有组件的位置和大小都由程序员控制
        snakeHead.setBorder(BorderFactory.createLineBorder(Color.green));//绿色实线边框
        snakeHead.setOpaque(true);//设置为不透明
        snakeHead.setBackground(Color.pink);//贪吃蛇头粉色的背景色
        snakeHead.setBounds(0, 0, 60, 60);//坐标是(0,0)，宽度高度均为60
        getContentPane().add(snakeHead);//将贪吃蛇头组件放入到窗体中

        addKeyListener(new KeyAdapter() {//给窗体添加键盘事件
            @Override
            public void keyPressed(KeyEvent e) { //当监听到键盘按下的事件，就执行这个方法
                int keyCode = e.getKeyCode();
                System.out.println("keyCode = " + keyCode);
                int keyLocation = e.getKeyLocation();
                System.out.println("keyLocation = " + keyLocation);
                char keyChar = e.getKeyChar();//获得按下的键盘字符
                System.out.println("keyChar = " + keyChar);
                switch (keyChar) {//判断按下的是什么字符
                    case 'a'://如果是字符a
                        x -= 10;//计算贪吃蛇下一步到达的x坐标
                        break;//退出switch分支结构
                    case 'd'://如果是字符d
                        x += 10;//计算贪吃蛇下一步到达的x坐标
                        break;//退出switch分支结构
                    case 'w'://如果是字符w
                        y -= 10;//计算贪吃蛇下一步到达的y坐标
                        break;//退出switch分支结构
                    case 's'://如果是字符s
                        y += 10;//计算贪吃蛇下一步到达的y坐标
                        break;//退出switch分支结构
                    //其它字符全部忽略，不处理
                }
                snakeHead.setLocation(x, y);//将计算好的坐标(x,y)设置到贪吃蛇头组件上，让组件产生一次瞬间移动。
            }
        });
    }

    public static void main(String[] args) {
        new 贪吃蛇().setVisible(true);
    }
}
