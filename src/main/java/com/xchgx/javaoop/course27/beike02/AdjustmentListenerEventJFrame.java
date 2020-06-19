/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xchgx.javaoop.course27.beike02;

import java.awt.HeadlessException;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollBar;

/**
 *
 * @author 陈老师 现代管理学院
 */
public class AdjustmentListenerEventJFrame extends JFrame {

    public AdjustmentListenerEventJFrame() throws HeadlessException {
        initWindow();
        start();
    }

    private void initWindow() {
        setTitle("滚动发生变化时改变事件窗体");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 500);
        setLocationRelativeTo(null);
    }

    private void start() {
        JPanel p = new JPanel();
        for (int i = 0; i < 10; i++) {
            p.add(new JButton(""+i));
        }
        JScrollBar bar = new JScrollBar(JScrollBar.HORIZONTAL,0,1,0,1000);
        bar.addAdjustmentListener(new AdjustmentListener() {
            @Override
            public void adjustmentValueChanged(AdjustmentEvent e) {
                System.out.println("当前滚动条的位置:"+e.getValue());
            }
        });
        getContentPane().add(p);
        getContentPane().add(bar,"South");
    }

    public static void main(String[] args) {
        new AdjustmentListenerEventJFrame().setVisible(true);
    }
}
