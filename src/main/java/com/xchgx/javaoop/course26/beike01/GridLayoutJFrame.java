/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xchgx.javaoop.course26.beike01;

import java.awt.GridLayout;
import java.awt.HeadlessException;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * 网格布局窗体
 *
 * @author 陈老师 现代管理学院
 */
public class GridLayoutJFrame extends JFrame {

    private JButton[] btns = new JButton[10];

    public GridLayoutJFrame() throws HeadlessException {
        initWindow();
        initJButtonArray();
        start();
    }

    private void initJButtonArray() {
        for (int i = 0; i < btns.length; i++) {
            btns[i] = new JButton("第i个按钮".replace("i", "" + (i + 1)));
        }
    }

    private void initWindow() {
        setTitle("网格布局窗体");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);
        setLocationRelativeTo(null);
    }

    private void start() {
//        setLayout(new GridLayout());//默认填满一行，这里属于N*M不足，按行扩展
//        setLayout(new GridLayout(0,1));//列数限定为1，行是0，自动按列扩展
//        setLayout(new GridLayout(1,1));//10按钮，超过1*1，默认按行扩展
        setLayout(new GridLayout(3, 3, 2, 10));//10按钮，不超过4*4,按行排列
        for (int i = 0; i < btns.length; i++) {
            JButton btn = btns[i];
            add(btn);
        }
    }

    public static void main(String[] args) {
        new GridLayoutJFrame().setVisible(true);
    }
}
