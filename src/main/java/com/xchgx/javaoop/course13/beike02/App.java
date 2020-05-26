/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.xchgx.javaoop.course13.beike02;

import java.io.IOException;

/**
 *
 * @author 陈老师 现代管理学院
 */
public class App {
    public static void main(String[] args) throws IOException {
        Manager manager = new Manager("D:\\ltjl.txt");
        manager.startReadLogFile();
        String show = manager.show();
        System.out.println("show = " + show);
    }
}
