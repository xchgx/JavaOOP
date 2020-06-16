/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xchgx.javaoop.course25.beike01;

import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author 陈老师 现代管理学院
 */
public class JButtonJFrame extends JFrame {

    JButton btn1, btn2, btn3;

    public JButtonJFrame() throws HeadlessException {
        initWindow();
    }

    private void initWindow() {
        setTitle("按钮组件");
        setSize(400, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        btn1 = new JButton();
        btn1.setText("按钮1-张三");
        btn1.setMnemonic(KeyEvent.VK_A);//快捷键Alt+D
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("张三");
                btn1.setEnabled(false);
                btn2.setEnabled(true);
                btn3.setEnabled(true);
            }
        });

        btn2 = new JButton("按钮2-李四"); 
        btn2.setMnemonic(KeyEvent.VK_B);//快捷键Alt+W
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("李四");
                btn1.setEnabled(true);
                btn2.setEnabled(false);
                btn3.setEnabled(true);
            }
        });
        btn3 = new JButton();
        btn3.setText("按钮3-王五");
        btn3.setMnemonic(KeyEvent.VK_C);//快捷键Alt+E
        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("王五");
                btn1.setEnabled(true);
                btn2.setEnabled(true);
                btn3.setEnabled(false);
            }
        });

        JPanel panel = new JPanel();
        panel.add(btn1);
        panel.add(btn2);
        panel.add(btn3);
        getContentPane().add(panel);
    }

    public static void main(String[] args) {
            new JButtonJFrame().setVisible(true);
    }
}
