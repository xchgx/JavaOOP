/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xchgx.javaoop.course27.beike01;

import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;

/**
 *
 * @author 陈老师 现代管理学院
 */
public class KeyListenerEventJFrame extends JFrame {

    public KeyListenerEventJFrame() throws HeadlessException {
        initWindow();
        start();
    }

    private void initWindow() {
        setTitle("键盘事件窗体");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 500);
        setLocationRelativeTo(null);
    }

    private void start() {
        addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                System.out.println("按下某个键时调用此方法");
//                int keyCode = e.getKeyCode();

            }

            @Override
            public void keyPressed(KeyEvent e) {
                System.out.println("键入某个键时调用此方法。");
//                switch (e.getKeyChar()) {
//                    case KeyEvent.VK_ENTER:
//                        System.out.println("回车键被激活。即将进入神秘地带.");
//                        break;
//                    case KeyEvent.VK_W:
//                        System.out.print("上");
//                        break;
//                    case KeyEvent.VK_S:
//                        System.out.print("下");
//                        break;
//                    case KeyEvent.VK_A:
//                        System.out.print("左");
//                        break;
//                    case KeyEvent.VK_D:
//                        System.out.print("右");
//                        break;
//                }

            }

            @Override
            public void keyReleased(KeyEvent e) {
                System.out.println("释放某个键时调用此方法。");
            }
        });
    }

    public static void main(String[] args) {
        new KeyListenerEventJFrame().setVisible(true);
    }
}
