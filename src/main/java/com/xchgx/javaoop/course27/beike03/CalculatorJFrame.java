/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xchgx.javaoop.course27.beike03;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;

/**
 * 计算器窗体
 *
 * @author 陈老师 现代管理学院
 */
public class CalculatorJFrame extends JFrame {

    JLabel label = new JLabel("0", JLabel.RIGHT);
    JButton btn0 = new JButton("0");
    JButton btn1 = new JButton("1");
    JButton btn2 = new JButton("2");
    JButton btn3 = new JButton("3");
    JButton btn4 = new JButton("4");
    JButton btn5 = new JButton("5");
    JButton btn6 = new JButton("6");
    JButton btn7 = new JButton("7");
    JButton btn8 = new JButton("8");
    JButton btn9 = new JButton("9");
    JButton btnJia = new JButton("+");
    JButton btnJian = new JButton("-");
    JButton btnCheng = new JButton("*");
    JButton btnChu = new JButton("/");
    JButton btnDengyu = new JButton("=");
    JButton btnDian = new JButton(".");

    public CalculatorJFrame() throws HeadlessException {
        initWindow();
        start();
    }

    private void initWindow() {
        setTitle("计算器窗体");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 500);
        setLocationRelativeTo(null);
    }

    private void addNumberButtonActionListener(JButton btn) {
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                System.out.println("command = "+e.getActionCommand());
                if (label.getText().equals("0")) {
                    label.setText(e.getActionCommand());
                } else {
                    label.setText(label.getText() + e.getActionCommand());
                }
            }
        });
    }

    private void start() {
        addNumberButtonActionListener(btn0);
        addNumberButtonActionListener(btn1);
        addNumberButtonActionListener(btn2);
        addNumberButtonActionListener(btn3);
        addNumberButtonActionListener(btn4);
        addNumberButtonActionListener(btn5);
        addNumberButtonActionListener(btn6);
        addNumberButtonActionListener(btn7);
        addNumberButtonActionListener(btn8);
        addNumberButtonActionListener(btn9);
        

        Border lineBorder = BorderFactory.createLineBorder(Color.BLACK);//实线边框
        Border emptyBorder = BorderFactory.createEmptyBorder(5, 5, 5, 5);//空白边框，但是有边距
        CompoundBorder compoundBorder = BorderFactory.createCompoundBorder(lineBorder, emptyBorder);//外部边框是实线，内部是边距
        label.setBorder(compoundBorder);
        JPanel panel = new JPanel(new BorderLayout());
        JPanel northPanel = new JPanel(new GridLayout(1, 1));
        northPanel.add(label);

        JPanel buttonPanel = new JPanel(new GridLayout(4, 4));
        buttonPanel.add(btn7);
        buttonPanel.add(btn8);
        buttonPanel.add(btn9);
        buttonPanel.add(btnChu);
        buttonPanel.add(btn4);
        buttonPanel.add(btn5);
        buttonPanel.add(btn6);
        buttonPanel.add(btnCheng);
        buttonPanel.add(btn1);
        buttonPanel.add(btn2);
        buttonPanel.add(btn3);
        buttonPanel.add(btnJian);
        buttonPanel.add(btn0);
        buttonPanel.add(btnDian);
        buttonPanel.add(btnDengyu);
        buttonPanel.add(btnJia);
        panel.add(northPanel, "North");
        panel.add(buttonPanel);
        getContentPane().add(panel);
        pack();
    }

    public static void main(String[] args) {
        new CalculatorJFrame().setVisible(true);
    }
}
