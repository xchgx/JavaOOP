/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xchgx.javaoop.course19.beike01;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;

/**
 *
 * @author 陈老师 现代管理学院
 */
public class JFrameTest {

    public static void main(String[] args) {
        JFrame frame = new JFrame("学籍管理系统");
        frame.setLayout(new BorderLayout());
        JLabel title = new JLabel("欢迎来到学籍管理系统", JLabel.CENTER);
        title.setSize(400, 20);
        title.setFont(new Font("微软雅黑", Font.ITALIC, 20));
        frame.getContentPane().add(title, BorderLayout.NORTH);
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JMenuBar jMenuBar = new JMenuBar();
        JMenu menu = new JMenu("文件");
        JMenuItem item = new JMenuItem("打开");
        item.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "打开文件");
            }
        });
        menu.add(item);
        JCheckBoxMenuItem boxMenuItem = new JCheckBoxMenuItem("显示隐藏文件");
        menu.add(boxMenuItem);

        jMenuBar.add(menu);
        frame.setJMenuBar(jMenuBar);

        JPopupMenu jPopupMenu = new JPopupMenu();
        jPopupMenu.add(item);
        jPopupMenu.add(boxMenuItem);

        frame.addMouseListener(new MouseAdapter() {

            @Override
            public void mousePressed(MouseEvent e) {
                System.out.println("e.getButton() = " + e.getButton());
                if (e.getButton() == 3) {
//                    jPopupMenu.setLocation(e.getX(), e.getY());
                    jPopupMenu.show(frame, e.getX(), e.getY());
//                    jPopupMenu.setVisible(true);
                }
            }

        });
        frame.setVisible(true);

    }
}
