/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xchgx.javaoop.course22.beike03;

import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author 陈老师 现代管理学院
 */
public class WuqiJFrame extends JFrame {

    Manager manager = new Manager();

    public WuqiJFrame() throws HeadlessException {
        initWindow();
        manager.madeNwuqi(20);
        showWuqi();
    }

    private void initWindow() {
        setTitle("武器展示v2");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    private void showWuqi() {
        JPanel jPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        for (int i = 0; i < manager.nwuqis.length; i++) {
            int nwuqi = manager.nwuqis[i];
            JLabel jLabel = new JLabel("(" + (i + 1) + ")武器" + nwuqi + "号  ");
            jLabel.setHorizontalAlignment(JLabel.CENTER);
            jPanel.add(jLabel);
        }
        JButton btn = new JButton("随机抽");
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int[] randomExtract = manager.randomExtract();

                for (int i = 0; i < randomExtract.length; i++) {
                    int nwuqi = randomExtract[i];
                    JLabel jLabel = new JLabel("抽到：武器" + nwuqi + "号  ");
                    jLabel.setHorizontalAlignment(JLabel.CENTER);
                    jPanel.add(jLabel);
                    jPanel.revalidate();
                }
            }
        });
        jPanel.add(btn);
        getContentPane().add(jPanel);
    }

    public static void main(String[] args) {
        WuqiJFrame wq = new WuqiJFrame();
        wq.setVisible(true);
    }
 
}
