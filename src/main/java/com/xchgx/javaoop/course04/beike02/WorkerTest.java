/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xchgx.javaoop.course04.beike02;

/**
 *
 * @author 陈老师 现代管理学院
 */
public class WorkerTest { //这个测试类是做什么的？为什么要测试
    public static void main(String[] args) {
        Worker worker1 = new Xiaoshou();
        worker1.setName("张大帅");
        Worker worker2 = new Programer();
        worker2.setName("李小璐");
        Worker worker3 = new Caigou();
        worker3.setName("陈帅");
        System.out.println("来开会的人有：");
        System.out.println(worker1.getName());
        System.out.println(worker2.getName());
        System.out.println(worker3.getName());
        System.out.println("开会结束，公司所有人都开始动起来，干活了。");
        worker1.zuoshi();
        worker2.zuoshi();
        worker3.zuoshi();
        
    }
}
