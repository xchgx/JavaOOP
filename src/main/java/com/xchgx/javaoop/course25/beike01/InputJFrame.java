/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xchgx.javaoop.course25.beike01;

import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author 陈老师 现代管理学院
 */
public class InputJFrame extends JFrame {
    JLabel label1 = new JLabel("请输入用户名：");
    JLabel label2 = new JLabel("请输入密码：");
    JPasswordField passwordField = new JPasswordField();
    JTextField textField  = new JTextField("输入用户名 ");
    JButton submit = new JButton("登录后台");
            
    public InputJFrame() throws HeadlessException {
        initWindow();
        start();
    }

    private void initWindow() {
        setTitle("切换按钮");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);
        setLocationRelativeTo(null);
    }

    private void start() {
        JPanel panel1 = new JPanel(new GridLayout(1, 2));
        panel1.add(label1);
        panel1.add(textField);
        JPanel panel2 = new JPanel(new GridLayout(1,2));
        panel2.add(label2);
        panel2.add(passwordField);
        JPanel panel3 = new JPanel(new GridLayout(1,2));
        submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = textField.getText();
                char[] password = passwordField.getPassword();
                String passwordStr = new String(password);
                if(passwordStr.equals("ADMIN123") && username.equals("admin")){
                    JOptionPane.showMessageDialog(null, "成功登录");
                }else{
                    JOptionPane.showMessageDialog(null, "登录失败，请重试。");
                }
            }
        });
        panel3.add(submit);
        
        
//        
//        passwordField.setEchoChar('*');//设置显示的掩码字符
//        passwordField.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                JPasswordField passwordField = (JPasswordField) e.getSource();
//                char[] password = passwordField.getPassword();
//                
//                        
//            }
//        });
//        
        JPanel panel = new JPanel(new GridLayout(0, 1));
        panel.setBorder(BorderFactory.createEmptyBorder(20,20,20,20));
        panel.add(panel1);
        panel.add(panel2); 
        panel.add(panel3); 
        getContentPane().add(panel);
        pack();
    }
    public static void main(String[] args) {
        new InputJFrame().setVisible(true);
    }
}
