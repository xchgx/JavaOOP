/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xchgx.javaoop.course27.beike01;

import java.awt.HeadlessException;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;

/**
 * 鼠标事件监听器
 *
 * @author 陈老师 现代管理学院
 */
public class MouseListenerEventJFrame extends JFrame {

    public MouseListenerEventJFrame() throws HeadlessException {
        initWindow();
        start();
    }

    private void initWindow() {
        setTitle("鼠标事件窗体");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 500);
        setLocationRelativeTo(null);
    }

    private void start() {
        addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("鼠标按键在组件上单击（按下并释放）时调用。");
            }

            @Override
            public void mousePressed(MouseEvent e) {
                System.out.println("鼠标按键在组件上按下时调用");
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                System.out.println(" 鼠标按钮在组件上释放时调用。  ");
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                System.out.println("鼠标进入到组件上时调用。");
            }

            @Override
            public void mouseExited(MouseEvent e) {
                System.out.println("鼠标离开组件时调用。  ");
            }
        });
    }

    public static void main(String[] args) {
        new MouseListenerEventJFrame().setVisible(true);
    }

}
