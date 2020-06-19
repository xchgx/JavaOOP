/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.xchgx.javaoop.course26.ketangbiji01;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * 布局管理器窗体类
 * @author 陈老师 现代管理学院
 */
public class FlowLayoutJFrame extends JFrame{

    public FlowLayoutJFrame() throws HeadlessException {
        initWindow();
        start();
    }
    private void initWindow(){
        setTitle("流式布局窗体");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setSize(400,500);
    }
    //成员属性\
    //中间层面板容器默认使用FlowLayout流式布局
//    JPanel panel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
    FlowLayout flow = new FlowLayout(FlowLayout.LEFT, 2, 20);//流式布局居左，水平2像素间距，垂直20像素间距
//    JPanel panel = new JPanel(flow);//因为没有把设置好的布局管理器对象，传入到面板容器的构造器中
    JPanel panel = new JPanel(new GridLayout(2,3));
    JButton btn1 = new JButton("第1个按钮");
    JButton btn2 = new JButton("第2个按钮");
    JButton btn3 = new JButton("第3个按钮");
    JButton btn4 = new JButton("第4个按钮");
    JButton btn5 = new JButton("第5个按钮");
    private void start(){
        //把三个按钮组件加入到中间层面板容器中
        panel.add(btn1);    panel.add(btn2);    panel.add(btn3);
        panel.add(btn4);    panel.add(btn5);   
        getContentPane().add(panel);
    }
    public static void main(String[] args) {
        new FlowLayoutJFrame().setVisible(true);
    }
}
