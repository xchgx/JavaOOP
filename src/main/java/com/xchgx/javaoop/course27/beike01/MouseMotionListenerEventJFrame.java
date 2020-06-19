/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xchgx.javaoop.course27.beike01;

import java.awt.Graphics2D;
import java.awt.HeadlessException;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.geom.Line2D;
import javax.swing.JFrame;

/**
 *
 * @author 陈老师 现代管理学院
 */
public class MouseMotionListenerEventJFrame extends JFrame {

    public MouseMotionListenerEventJFrame() throws HeadlessException {
        initWindow();
        start();
    }

    private void initWindow() {
        setTitle("鼠标运动事件窗体");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 500);
        setLocationRelativeTo(null);
    }
    private int x1, x2, y1, y2;

    private void start() {
        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                x1 = e.getX();
                y1 = e.getY();
            }

        });
        addMouseMotionListener(new MouseMotionListener() {
            @Override
            public void mouseDragged(MouseEvent e) {
                System.out.println("鼠标拖动到位置" + e.getX() + "," + e.getY());
                Graphics2D g = (Graphics2D) getGraphics();
                x2 = e.getX();
                y2 = e.getY();
                g.draw(new Line2D.Double(x1, y1, x2, y2));
                x1 = x2;
                y1 = y2;
                g.dispose();//释放资源
            }

            @Override
            public void mouseMoved(MouseEvent e) {
                System.out.println("鼠标移动");
            }
        });
    }

    public static void main(String[] args) {
        new MouseMotionListenerEventJFrame().setVisible(true);
    }

}
