/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xchgx.javaoop.course22.beike02;

import java.awt.HeadlessException;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;

/**
 *
 * @author 陈老师 现代管理学院
 */
public class WuqiJFrame extends JFrame {

    Manager manager = new Manager();

    public WuqiJFrame() throws HeadlessException {
        initWindow();
        initJLabel(); 
        manager.madeNwuqi(10);
    } 
    public void initWindow() {//窗体初始化设置
        setTitle("武器展示");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);
    }

    public void initJLabel() {
        ImageIcon icon = new ImageIcon("D:\\wuqi1.jpg");
        icon.setImage(icon.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
        JLabel label = new JLabel(icon, JLabel.CENTER);
        label.setBounds(0, 0, 100, 100);
        getContentPane().add(label);

        ImageIcon icon2 = new ImageIcon("D:\\wuqi2.jpg");
        icon2.setImage(icon2.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
        JLabel label2 = new JLabel(icon2, JLabel.CENTER);
        label2.setBounds(100, 0, 100, 100);
        getContentPane().add(label2);

        ImageIcon icon3 = new ImageIcon("D:\\wuqi3.jpg");
        icon3.setImage(icon3.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
        JLabel label3 = new JLabel(icon3, JLabel.CENTER);
        label3.setBounds(200, 0, 100, 100);
        getContentPane().add(label3);

        ImageIcon icon4 = new ImageIcon("D:\\wuqi4.jpg");
        icon4.setImage(icon4.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
        JLabel label4 = new JLabel(icon4, JLabel.CENTER);
        label4.setBounds(300, 0, 100, 100);
        getContentPane().add(label4);
        
    }

    public static void main(String[] args) {
        WuqiJFrame wq = new WuqiJFrame();
        wq.setVisible(true);
        
    }
}
