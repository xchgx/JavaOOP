/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xchgx.demo.other01;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dialog;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 *
 * @author 陈老师 现代管理学院
 */
public class FrameTest extends Frame {

    public FrameTest(String str) throws HeadlessException {
        super(str);
    }

    public static void main(String[] args) {
        FrameTest fr = new FrameTest("测试Frame");
        fr.setSize(200, 200);
        fr.setBackground(Color.red);
        fr.setLayout(null);
        Panel panel = new Panel();
        panel.setSize(100, 100);
        panel.setBackground(Color.yellow);
        fr.add(panel);
        fr.setVisible(true);
    }
}

