/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xchgx.javaoop.course27.ketangbiji01;

import java.awt.HeadlessException;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 * 窗口事件
 *
 * @author 陈老师 现代管理学院
 */
public class WindowEventJFrame extends JFrame {

    public WindowEventJFrame() throws HeadlessException {
        initWindow();//调用初始化窗体设置
        start();
    }
    private  void initWindow(){//初始化窗体设置
        setTitle("窗体事件");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400,500);
        setLocationRelativeTo(null);        
    }
    private void start(){
        addWindowListener(new WindowListener() {//匿名实现类
            @Override
            public void windowOpened(WindowEvent e) {
                System.out.println("windowOpened");
            }

            @Override
            public void windowClosing(WindowEvent e) {
                System.out.println("系统检测到你的窗口正在关闭...");
                System.out.println("当前内容正在保存..");
                JOptionPane.showMessageDialog(null, "已经完成数据保存工作，可以正常退出程序了。");
                        
            }

            @Override
            public void windowClosed(WindowEvent e) {
                //dispose()
                System.out.println("windowClosed");
            }

            @Override
            public void windowIconified(WindowEvent e) {
                System.out.println("windowIconified");
            }

            @Override
            public void windowDeiconified(WindowEvent e) {
                System.out.println("windowDeiconified");
            }

            @Override
            public void windowActivated(WindowEvent e) {
                System.out.println("windowActivated");
            }

            @Override
            public void windowDeactivated(WindowEvent e) {
                System.out.println("windowDeactivated");
            }
        });//窗口事件对应的是windowListenenr窗口的监听器
    }
    public static void main(String[] args) {//在主方法当中运行类
        new WindowEventJFrame().setVisible(true);//显示窗体
    }
}
