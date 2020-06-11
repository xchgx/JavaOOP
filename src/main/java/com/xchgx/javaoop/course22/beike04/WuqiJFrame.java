/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xchgx.javaoop.course22.beike04;

import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

/**
 *
 * @author 陈老师 现代管理学院
 */
public class WuqiJFrame extends JFrame {

    private  Manager manager = new Manager();

    public WuqiJFrame() throws HeadlessException {
        initWindow();
        initControlButton();
        manager.madeNwuqi(20);
    }

    private void initWindow() {
        setTitle("武器展示v3");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);
    }

    private void initControlButton() {
        JButton btn = new JButton("随机抽取");
        btn.addActionListener(new ActionListener() {//添加单击事件
            @Override
            public void actionPerformed(ActionEvent e) {
                int[] randomExtract = manager.randomExtract(21);
    
                JPanel pane = new JPanel();
                for (int i = 0; i < randomExtract.length; i++) {
                    int j = randomExtract[i];
                    JButton button = new JButton("武器" + j + "号");
                    button.setBackground(Color.GREEN); 
                    pane.add(button);
                }
                pane.setBounds(4, 40, getWidth(), getHeight());
                getContentPane().add(pane);
                pane.revalidate(); //刷新
            }
        });
        btn.setBounds(5, 5, 100, 30);
        getContentPane().add(btn);
    }

    public static void main(String[] args) {
        WuqiJFrame w = new WuqiJFrame();
        w.setVisible(true);
    }
}
