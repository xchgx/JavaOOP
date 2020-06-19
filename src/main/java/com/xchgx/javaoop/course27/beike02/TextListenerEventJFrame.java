/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xchgx.javaoop.course27.beike02;

import java.awt.HeadlessException;
import java.awt.TextField;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;
import javax.swing.JFrame;

/**
 * 文本事件窗体
 *
 * @author 陈老师 现代管理学院
 */
public class TextListenerEventJFrame extends JFrame {

    public TextListenerEventJFrame() throws HeadlessException {
        initWindow();
        start();
    }

    private void initWindow() {
        setTitle("文本事件窗体");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 500);
        setLocationRelativeTo(null);
    }

    private void start() {
        TextField textField= new TextField();
        textField.addTextListener(new TextListener() {
            @Override
            public void textValueChanged(TextEvent e) {
                System.out.println("文本发生改变："+e.getSource().toString());
            }
        });
        getContentPane().add(textField);
    }

    public static void main(String[] args) {
        new TextListenerEventJFrame().setVisible(true);
    }

}
