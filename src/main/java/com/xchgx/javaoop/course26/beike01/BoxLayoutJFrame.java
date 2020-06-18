/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.xchgx.javaoop.course26.beike01;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author 陈老师 现代管理学院
 */
public class BoxLayoutJFrame extends JFrame{
    private JButton[] buttons = new JButton[10];
    public BoxLayoutJFrame() {
            initWindow();
        initJButtonArray();
        start();
    }
    
    private void initJButtonArray(){
        for (int i = 0; i < buttons.length; i++) {
            buttons[i] = new JButton("第i个按钮".replace("i", ""+(i+1))); 
        } 
    }
    private  void start(){
        JPanel panel = new JPanel();
        BoxLayout boxLayout = new BoxLayout(panel, BoxLayout.Y_AXIS);
        panel.setLayout(boxLayout);
        panel.add(buttons[0]);
        panel.add(buttons[1]);
        panel.add(buttons[2]);
        panel.add(buttons[3]);
        panel.add(buttons[4]);
        
        getContentPane().add(panel);
    }
    private void initWindow(){//初始化窗体
        setTitle("流式布局窗体");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400,400);
        setLocationRelativeTo(null);
    }
    public static void main(String[] args) {
        new BoxLayoutJFrame().setVisible(true);
    }
}
