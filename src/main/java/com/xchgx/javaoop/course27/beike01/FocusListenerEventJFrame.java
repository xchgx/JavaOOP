/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xchgx.javaoop.course27.beike01;

import java.awt.HeadlessException;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.JFrame;
import javax.swing.JTextField;

/**
 *
 * @author 陈老师 现代管理学院
 */
public class FocusListenerEventJFrame extends JFrame {

    public FocusListenerEventJFrame() throws HeadlessException {
        initWindow();
        start();
    }

    private void initWindow() {
        setTitle("键盘事件窗体");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 500);
        setLocationRelativeTo(null);
    }

    private void start() {
        JTextField text2 = new JTextField();
        JTextField text = new JTextField();
        text.addFocusListener(new FocusListener() {
            public void focusGained(FocusEvent e) {
                System.out.println("获得了焦点");
            }
            public void focusLost(FocusEvent e) {
                System.out.println("失去焦点");
            }
        });
        getContentPane().add(text,"North");
        getContentPane().add(text2,"South");
    }

    public static void main(String[] args) {
        new FocusListenerEventJFrame().setVisible(true);
    }
}
