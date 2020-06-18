/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xchgx.javaoop.course26.beike01;

import java.awt.CardLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author 陈老师 现代管理学院
 */
public class CardLayoutJFrame extends JFrame {

    private JButton[] buttons = new JButton[10];

    public CardLayoutJFrame() throws HeadlessException {
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
        cardLayout = new CardLayout();
        cards = new JPanel(cardLayout);
        JPanel p1 = new JPanel();
        p1.add(buttons[0]);
        p1.add(buttons[1]);
        p1.add(buttons[2]);
        p1.add(buttons[3]);
        p1.add(buttons[4]);
        JPanel p2 = new JPanel();
        p2.add(buttons[5]);
        p2.add(buttons[6]);
        p2.add(buttons[7]);
        p2.add(buttons[8]);
        p2.add(buttons[9]);
        cards.add(p1, "card1");
        cards.add(p2, "card2");
        
        getContentPane().add(cards);

    }

    private void initWindow() {//初始化窗体
        setTitle("流式布局窗体");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        new CardLayoutJFrame().setVisible(true);
    }
}
