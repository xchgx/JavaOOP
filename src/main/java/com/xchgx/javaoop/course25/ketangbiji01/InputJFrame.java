/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xchgx.javaoop.course25.ketangbiji01;

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

    public InputJFrame() throws HeadlessException {
        initWindow();
        start();
    }

    private void initWindow() {//初始化窗体
        setTitle("按钮窗体");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 160);
        setLocationRelativeTo(null);
    }
    //成员属性区域
    JLabel userLabel = new JLabel("用户名：");
    JLabel passLabel = new JLabel("密码：");
    JTextField userField = new JTextField();//文本框 默认没有内容
    JPasswordField passwordField = new JPasswordField();//密码框
    JButton submitButton = new JButton("登录后台");
    //创建中间层容器
    JPanel p1 = new JPanel(new GridLayout(1,2));//用户层
    JPanel p2 = new JPanel(new GridLayout(1,2));//密码层
    JPanel p3 = new JPanel(new GridLayout(1,1));//登录层
    private void start() {
        //给按钮添加单击事件
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = userField.getText(); //获得用户输入的用户名
                char[] password = passwordField.getPassword();//获得用户输入的密码
                String passwordStr = new String(password);//将密码字符数组转换为字符串对象
                if(username.equals("admin") && passwordStr.equals("ADMIN123")){
                    JOptionPane.showMessageDialog(null, "登录成功");
                }else{
                    JOptionPane.showMessageDialog(null, "登录失败，请重试");                }
            }
        });
        p1.add(userLabel);          p1.add(userField);
        p2.add(passLabel);          p2.add(passwordField);
        p3.add(submitButton);
        //将上面三个中间层容器加入到顶层容器中，就需要设置布局管理器
        JPanel panel = new JPanel(new GridLayout(3, 1));
        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        panel.add(p1);        panel.add(p2);        panel.add(p3);
        getContentPane().add(panel); 
       // pack();//自适应窗体
    }

    public static void main(String[] args) {
        new InputJFrame().setVisible(true);//显示窗体
    }
}

