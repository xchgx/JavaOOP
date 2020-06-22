/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xchgx.javaoop.course27.ketangbiji01;

import java.awt.HeadlessException;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;

/**
 * 鼠标事件
 *
 * @author 陈老师 现代管理学院
 */
public class MouseEventJFrame extends JFrame {

    public MouseEventJFrame() throws HeadlessException {
        initWindow();//调用初始化窗体设置
        start();
    }

    private void initWindow() {//初始化窗体设置
        setTitle("窗体事件");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 500);
        setLocationRelativeTo(null);
    }

    private void start() {
        addMouseListener(new MouseListener() {//鼠标事件监听器接口的匿名实现类
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("mouseClicked");
            }

            @Override
            public void mousePressed(MouseEvent e) {
                System.out.println("mousePressed");
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                System.out.println("mouseReleased");
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                System.out.println("mouseEntered");
            }

            @Override
            public void mouseExited(MouseEvent e) {
                System.out.println("mouseExited");
            }
        });
    }

    public static void main(String[] args) {
        new MouseEventJFrame().setVisible(true);//显示窗体
    }
}
