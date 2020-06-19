/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xchgx.javaoop.course27.beike02;

import java.awt.HeadlessException;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import javax.swing.JFrame;

/**
 *
 * @author 陈老师 现代管理学院
 */
public class ComponentListenerEventJFrame extends JFrame {

    public ComponentListenerEventJFrame() throws HeadlessException {
        initWindow();
        start();
    }

    private void initWindow() {
        setTitle("组件事件窗体");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 500);
        setLocationRelativeTo(null);
    }

    private void start() {
        addComponentListener(new ComponentListener() {
            @Override
            public void componentResized(ComponentEvent e) {
                System.out.println("窗口大小改变了");
                int width = e.getComponent().getWidth();
                System.out.println("width = " + width);
                int height = e.getComponent().getHeight();
                System.out.println("height = " + height);
            }

            @Override
            public void componentMoved(ComponentEvent e) {
                System.out.println("组件移动了");
                int x = e.getComponent().getX();
                System.out.println("x = " + x);
                int y = e.getComponent().getY();
                System.out.println("y = " + y);
            }

            @Override
            public void componentShown(ComponentEvent e) {
                System.out.println("显示了");
            }

            @Override
            public void componentHidden(ComponentEvent e) {
                System.out.println("隐藏了");
            }
        });
    }

    public static void main(String[] args) {
        new ComponentListenerEventJFrame().setVisible(true);
    }
}
