/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.xchgx.javaoop.course27.beike02;

import java.awt.HeadlessException;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

/**
 *
 * @author 陈老师 现代管理学院
 */
public class ItemListenerEventJFrame extends JFrame{

    public ItemListenerEventJFrame() throws HeadlessException {
        initWindow();
        start();
    }

    private void initWindow() {
        setTitle("切换组件状态改变事件窗体");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 500);
        setLocationRelativeTo(null);
    }

    private void start() {
        JCheckBox box = new JCheckBox("改变");
        box.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                System.out.println(e.getStateChange());
                System.out.println(e.paramString());
                System.out.println(box.isSelected());
            }
        });
        getContentPane().add(box);
    }
    public static void main(String[] args) {
        new ItemListenerEventJFrame().setVisible(true);
    }

}
