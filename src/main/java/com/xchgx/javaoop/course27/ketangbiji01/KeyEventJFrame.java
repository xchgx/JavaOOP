/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.xchgx.javaoop.course27.ketangbiji01;

import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;

/**
 * 键盘事件
 * @author 陈老师 现代管理学院
 */
public class KeyEventJFrame extends JFrame{

    public KeyEventJFrame() throws HeadlessException {
        initWindow();//调用初始化窗体设置
        start();
    }

    private void initWindow() {//初始化窗体设置
        setTitle("键盘事件");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 500);
        setLocationRelativeTo(null);
    }

    private void start() {
        addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {//单击键盘
                System.out.println("keyTyped");
            }

            @Override
            public void keyPressed(KeyEvent e) {//按下键盘
                System.out.println("keyPressed");
            }

            @Override
            public void keyReleased(KeyEvent e) {//释放（弹起）键盘
                System.out.println("keyReleased");
            }
        });
    }
    public static void main(String[] args) {
        new KeyEventJFrame().setVisible(true);
    }
}
