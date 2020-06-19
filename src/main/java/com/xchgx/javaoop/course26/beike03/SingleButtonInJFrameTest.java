/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xchgx.javaoop.course26.beike03;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author 陈老师 现代管理学院
 */
public class SingleButtonInJFrameTest extends JFrame {

    private JButton[] buttons = new JButton[10];

    public SingleButtonInJFrameTest() throws HeadlessException {
        initWindow();
        initJButtonArray();
        start();
    }

    private void initJButtonArray() {
        for (int i = 0; i < buttons.length; i++) {
            buttons[i] = new JButton("第i个按钮".replace("i", "" + (i + 1)));
            String cname = i % 2 == 0 ? "card1" : "card2";
            buttons[i].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    cardLayout.show(cards, cname);
//                    cardLayout.next(cards);
                }
            });
        }
    }
    CardLayout cardLayout;
    JPanel cards;

    private void start() {
//        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
        setLayout(null);
        buttons[0].setBounds(0,0,getWidth(),getHeight());
        getContentPane().add(buttons[0]);

    }

    private void initWindow() {//初始化窗体
        setTitle("流式布局窗体");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        new SingleButtonInJFrameTest().setVisible(true);
    }
}
