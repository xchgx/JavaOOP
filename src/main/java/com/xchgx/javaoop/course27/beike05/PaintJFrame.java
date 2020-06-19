/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xchgx.javaoop.course27.beike05;

import java.awt.Graphics2D;
import java.awt.HeadlessException;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseMotionListener;
import java.awt.geom.Line2D;
import javax.swing.JFrame;

/**
 * 画画窗体
 *
 * @author 陈老师 现代管理学院
 */
public class PaintJFrame extends JFrame {

    private int x1, x2, y1, y2;

    public PaintJFrame() throws HeadlessException {
        initWindow();//初始化窗体设置
        start();//开始添加组件和布局
    }

    private void initWindow() {//初始化窗体设置
        setTitle("画画窗体");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 500);
        setLocationRelativeTo(null);
    }

    private void start() {
        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                x1 = e.getX();
                y1 = e.getY();
            }

        });
        addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
//                System.out.println("鼠标拖动到位置" + e.getX() + "," + e.getY());
                Graphics2D g = (Graphics2D) getGraphics();
                x2 = e.getX();
                y2 = e.getY();
                g.draw(new Line2D.Double(x1, y1, x2, y2));
                x1 = x2;
                y1 = y2;
                g.dispose();//释放资源
            } 
        });
    }

    public static void main(String[] args) {
        new PaintJFrame().setVisible(true);
    }
}
