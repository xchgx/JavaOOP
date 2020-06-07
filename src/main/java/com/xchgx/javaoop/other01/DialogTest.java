/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.xchgx.javaoop.other01;

import java.awt.BorderLayout;
import java.awt.Dialog;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 *
 * @author 陈老师 现代管理学院
 */
public class DialogTest extends Dialog {

    public DialogTest(Frame owner) {
        super(owner);
    }

    public void createDialog() {
        final Dialog dialog = new Dialog(DialogTest.this, "对话框", true);
        dialog.setSize(267, 117);
        dialog.setLayout(new GridLayout(2, 1));
        //窗口关闭事件
        dialog.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                dialog.dispose();
            }
        });

        //显示消息
        Panel topPanel = new Panel();
        Label label = new Label("这是一个对话框");
        topPanel.add(label, BorderLayout.NORTH);
        dialog.add(topPanel);
        dialog.setVisible(true);
    }
    public static void main(String[] args) {
        new DialogTest(null).createDialog();
    }
}
