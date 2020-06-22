/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xchgx.javaoop.course27.ketangbiji03;

import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * 贪吃蛇窗体类
 *
 * @author 陈老师 现代管理学院
 */
public class SnakeJFrame extends JFrame {
    private int x=0,y=0;//创建贪吃蛇的蛇头坐标
    public SnakeJFrame() throws HeadlessException {
        initWindow();//调用初始化窗体设置
        start();
    }

    private void initWindow() {//初始化窗体设置
        setTitle("贪吃蛇窗体");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 500);
        setLocationRelativeTo(null);
        //设JFrame主窗体的布局管理器为null
        setLayout(null);//绝对定位
        setAlwaysOnTop(true);
    }

    private void start() {
        JButton snakeHead = new JButton("头");//这是贪吃蛇的蛇头，
        //应该使用JLabel
        //尺寸正方形
        snakeHead.setSize(100, 100);
        snakeHead.setLocation(x, y);//设置蛇头的初始坐标为x=0,y=0
        snakeHead.setBackground(Color.pink);

        snakeHead.addKeyListener(new KeyAdapter() {//是KeyListener监听器的实现类
            @Override
            public void keyPressed(KeyEvent e) {
                char keyChar = e.getKeyChar();
//                System.out.println("keyChar = " + keyChar);
//                int keyCode = e.getKeyCode();
//                System.out.println("keyCode = " + keyCode);
//                int x = snakeHead.getLocation().x;//这是移动之前的坐标x
//                int y = snakeHead.getLocation().y;//这是移动之前的坐标y
                //y=0
                switch (keyChar) {//判断按键，不同的按键对坐标进行相应运算
                    case 'w':
//                        System.out.print("上");
                        y-=10;//计算贪吃蛇蛇头下一次出现的位置
                        //递增
                        //y=-10;
//                        snakeHead.setLocation(x, y);//0,-10
                        break;
                    case 's':
//                        System.out.print("下");
                        y+=10;
//                        snakeHead.setLocation(x, y);
                        break;
                    case 'a':
//                        System.out.print("左");
                        x-=10;
//                        snakeHead.setLocation(x, y);
                        break;
                    case 'd':
//                        System.out.print("右");
                        x+=10;
//                       snakeHead.setLocation(x, y);
                        break;
                    default:
//                        System.out.println("[无效按键]");
                }
                //更新贪吃蛇蛇头的位置（坐标）
                snakeHead.setLocation(x, y);
            }
        });

        getContentPane().add(snakeHead);

    }

    public static void main(String[] args) {
        new SnakeJFrame().setVisible(true);
    }
}
