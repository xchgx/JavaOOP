/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xchgx.javaoop.course15.beike02;

/**
 * 留言统计程序v2.0，启动类 App.java
 * @author 陈老师 现代管理学院
 */
public class App {

    public static void main(String[] args) { 
        String txt = "张佳豪 11:53:09\n"
                + "血缘最难\n"
                + "\n"
                + "张佳豪 11:53:57\n"
                + "只可惜血缘没有在steam发售，不然我还想买了玩玩\n"
                + "\n"
                + "杨昆 15:05:19\n"
                + "\n"
                + "\n"
                + "张宏略 15:06:55\n"
                + "鬼泣尼禄刀刀三红的大佬有没有\n"
                + "";
        Manager manager = new Manager(txt);
        manager.start();
        System.out.println(manager.show());
    }
}
