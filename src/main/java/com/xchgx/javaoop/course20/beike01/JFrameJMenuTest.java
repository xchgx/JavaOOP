/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.xchgx.javaoop.course20.beike01;
 

/**
 *
 * @author 陈老师 现代管理学院
 */
public class JFrameJMenuTest {
    public static void main(String[] args) {
        JFrameJMenu frameJMenu = new JFrameJMenu();
        frameJMenu.init();
        frameJMenu.initJLabel();
        frameJMenu.initJMenuBar();
        frameJMenu.setVisible(true);
 
    }
}
