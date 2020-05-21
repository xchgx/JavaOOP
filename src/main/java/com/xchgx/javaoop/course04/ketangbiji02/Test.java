/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xchgx.javaoop.course04.ketangbiji02;

/**
 *
 * @author 陈老师 现代管理学院
 */
public class Test {
    public static void main(String[] args) {
        Employee e1 = new Caigou();//用Ctrl+Shift+Down（下）
        Employee e2 = new Programer();//用Ctrl+Shift+Down（下）
        Employee e3 = new Xiaoshou();//用Ctrl+Shift+Down（下）
        e1.working();//员工1开始工作
        e2.working();//员工2开始工作
        e3.working();//员工3开始工作
    }
}
