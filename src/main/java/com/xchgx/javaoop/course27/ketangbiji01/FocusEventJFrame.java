/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xchgx.javaoop.course27.ketangbiji01;

import java.awt.BorderLayout;
import java.awt.HeadlessException;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 * 焦点事件
 *
 * @author 陈老师 现代管理学院
 */
public class FocusEventJFrame extends JFrame {

    public FocusEventJFrame() throws HeadlessException {
        initWindow();//调用初始化窗体设置
        start();
    }

    private void initWindow() {//初始化窗体设置
        setTitle("焦点事件");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 500);
        setLocationRelativeTo(null);
    }

    private void start() {
        JTextField textField = new JTextField();
        textField.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {//获得焦点
                System.out.println("获得焦点");
            }

            @Override
            public void focusLost(FocusEvent e) { //丢失焦点（失去焦点）
                String text = textField.getText();
                if(!text.contains("@")){//如果文本框中输入的内容不包含@符号，那么就告诉用户，该输入不是邮箱
                    JOptionPane.showMessageDialog(null, "您输入的不是邮箱地址");                    
                }
            }
        });
        JButton button = new JButton("按钮");
        getContentPane().add(textField,BorderLayout.NORTH);//默认是放在边框布局的中间，这里放在北方（上面）
        getContentPane().add(button,BorderLayout.SOUTH);//默认是放在边框布局的中间，这里放在南方（下面）
    }

    public static void main(String[] args) {
        new FocusEventJFrame().setVisible(true);
    }
}
