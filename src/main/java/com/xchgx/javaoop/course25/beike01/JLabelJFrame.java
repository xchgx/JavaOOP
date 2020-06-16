/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xchgx.javaoop.course25.beike01;

import java.awt.GridLayout;
import java.awt.HeadlessException;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author 陈老师 现代管理学院
 */
public class JLabelJFrame extends JFrame {
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JLabel label4;
    private JLabel label5;
    public JLabelJFrame() throws HeadlessException {
        initWindow();
    }

    private void initWindow() {
        setTitle("测试窗体");
        label1 = new JLabel("Text Label");
        label1.setVerticalAlignment(JLabel.TOP);

        label2 = new JLabel("Center Label", JLabel.CENTER);

        ImageIcon icon = new ImageIcon("D:\\kugou.png");
        label3 = new JLabel(icon);
        label3.setVerticalAlignment(JLabel.BOTTOM);
        
        label4 = new JLabel("Text and Image",icon,JLabel.RIGHT);
        label4.setVerticalAlignment(JLabel.BOTTOM);
        label4.setVerticalTextPosition(JLabel.BOTTOM); 
        label4.setHorizontalTextPosition(JLabel.CENTER);
        
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 1));
        panel.add(label1);
        panel.add(label2);
        panel.add(label3);
        panel.add(label4);
        setLayout(new GridLayout(1,1));
        getContentPane().add(panel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800,800);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        JLabelJFrame f = new JLabelJFrame();
        f.setVisible(true);
    }
}
