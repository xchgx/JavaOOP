/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xchgx.javaoop.course27.beike01;

import java.awt.HeadlessException;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import javax.swing.JFrame;

/**
 *
 * @author 陈老师 现代管理学院
 */
public class MouseWheelListenerEventJFrame extends JFrame {

    public MouseWheelListenerEventJFrame() throws HeadlessException {
        initWindow();
        start();
    }

    private void initWindow() {
        setTitle("鼠标滚轮事件窗体");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 500);
        setLocationRelativeTo(null);
    }

    private void start() {
        addMouseWheelListener(new MouseWheelListener() {
            @Override
            public void mouseWheelMoved(MouseWheelEvent e) {
                if(e.getWheelRotation() == 1){
                    System.out.println("滚轮向上");
                }
                
                if(e.getWheelRotation() == -1){
                    System.out.println("滚轮向下");
                }
                
                System.out.println("滚轮事件");
            }
        });
    }

    public static void main(String[] args) {
        new MouseWheelListenerEventJFrame().setVisible(true);
    }
}
