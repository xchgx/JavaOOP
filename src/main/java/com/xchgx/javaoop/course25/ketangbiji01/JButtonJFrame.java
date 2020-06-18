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
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author 陈老师 现代管理学院
 */
public class JButtonJFrame extends  JFrame{

    public JButtonJFrame() throws HeadlessException {
        initWindow();
        start();//这里才是我们添加组件的方法
    }
    private void initWindow(){//初始化窗体
        setTitle("按钮窗体");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400,400);
        setLocationRelativeTo(null);
    }
    private void start(){//添加组件到窗体
        JButton btn1 = new JButton("刀(B)");
        JButton btn2 = new JButton("枪(C)");
        JButton btn3 = new JButton("剑(D)");
        //设置按钮的快捷键（热键）
        btn1.setMnemonic('B');//ALt+B
        btn2.setMnemonic('C');//ALt+C
        btn3.setMnemonic('D');//ALt+D
        //添加单击事件
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btn1.setEnabled(false);//按钮禁用
                btn2.setEnabled(true);//按钮启用
                btn3.setEnabled(true);//按钮启用
            }
        });
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btn1.setEnabled(true);//按钮启用
                btn2.setEnabled(false);//按钮禁用
                btn3.setEnabled(true);//按钮启用
            }
        });
        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btn1.setEnabled(true);//按钮启用
                btn2.setEnabled(true);//按钮启用
                btn3.setEnabled(false);//按钮禁用
            }
        });
        //准备水平排列放入到中间层容器中
//        JPanel panel = new JPanel();
        JPanel panel = new JPanel(new GridLayout(1, 3));
        panel.add(btn1);
        panel.add(btn2);
        panel.add(btn3);
        getContentPane().add(panel);
    }
    public static void main(String[] args) {//主方法
        new JButtonJFrame().setVisible(true);
    }
}
