/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xchgx.javaoop.course27.beike01;

import java.awt.HeadlessException;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JFrame;

/**
 * 事件窗体
 *
 * @author 陈老师 现代管理学院
 */
public class WindowsListenerEventJFrame extends JFrame {

    public WindowsListenerEventJFrame() throws HeadlessException {
        initWindow();
        start();
    }

    private void initWindow() {
        setTitle("窗口事件窗体");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 500);
        setLocationRelativeTo(null);
    }

    private void start() {
            addWindowListener(new WindowListener() {
                @Override
                public void windowOpened(WindowEvent e) {//窗口首次打开时调用
                    System.out.println("窗口首次打开时调用");
                }

                @Override
                public void windowClosing(WindowEvent e) {
                    System.out.println("从系统菜单中关闭窗体时调用");
                }

                @Override
                public void windowClosed(WindowEvent e) {
                    System.out.println("关闭窗体时调用  API: 因对窗口调用 dispose 而将其关闭时调用。");
                }

                @Override
                public void windowIconified(WindowEvent e) {
                    System.out.println("窗体变为最小化时调用");
                }

                @Override
                public void windowDeiconified(WindowEvent e) {
                    System.out.println("窗体变为正常状态事调用");
                }

                @Override
                public void windowActivated(WindowEvent e) {
                    System.out.println("窗体被激活时调用");
                }

                @Override
                public void windowDeactivated(WindowEvent e) {
                    System.out.println("当 Window 不再是活动 Window 时调用");
                }
            });
    }

    public static void main(String[] args) {
        new WindowsListenerEventJFrame().setVisible(true);
    }

}
