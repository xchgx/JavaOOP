/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xchgx.javaoop.course27.beike06;

import java.awt.HeadlessException;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

/**
 *
 * @author 陈老师 现代管理学院
 */
public class UserRegisterJFrame extends JFrame {
    JButton btn = new JButton("开始注册");
    JCheckBox box = new JCheckBox("我已阅读并同意协议");

    public UserRegisterJFrame() throws HeadlessException {
        initWindow();
        start();
    }

    private void initWindow() {
        setTitle("用户注册窗体");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 500);
        setLocationRelativeTo(null);
    }

    private void start() {
        btn.setEnabled(false);
        box.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                boolean selected = box.isSelected();
                if(selected){
                    btn.setEnabled(true);
                }else{
                    btn.setEnabled(false);
                }
            }
        });
        Box b = Box.createVerticalBox();
        b.add(box);
        b.add(btn);
        getContentPane().add(b);
    }

    public static void main(String[] args) {
        new UserRegisterJFrame().setVisible(true);
    }
}
