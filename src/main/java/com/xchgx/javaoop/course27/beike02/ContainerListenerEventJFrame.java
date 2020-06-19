/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xchgx.javaoop.course27.beike02;

import java.awt.BorderLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ContainerEvent;
import java.awt.event.ContainerListener;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author 陈老师 现代管理学院
 */
public class ContainerListenerEventJFrame extends JFrame {

    public ContainerListenerEventJFrame() throws HeadlessException {
        initWindow();
        start();
    }

    private void initWindow() {
        setTitle("组件事件窗体");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 500);
        setLocationRelativeTo(null);
    }

    private void start() {
       getContentPane().addContainerListener(new ContainerListener() {
            @Override
            public void componentAdded(ContainerEvent e) {
                System.out.println("添加了组件"+e.getContainer().getComponentCount());
            }

            @Override
            public void componentRemoved(ContainerEvent e) {
                System.out.println("删除了组件"+e.getContainer().getComponentCount());
            }
        });
        
        JButton but = new JButton("add");
        but.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                getContentPane().removeAll();
                getContentPane().add(new JButton("hihi"),BorderLayout.NORTH);
                getContentPane().revalidate();
            }
        });
        getContentPane().add(but);
    }

    public static void main(String[] args) {
        new ContainerListenerEventJFrame().setVisible(true);
    }
}
