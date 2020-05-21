/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xchgx.javaoop.course03.beike01;

/**
 *
 * @author 陈老师 现代管理学院
 */
public class Test {

    public static void main(String[] args) {
        Manager manager = new Manager("123456", "1001", "张三", "男", "15527182221", "市场部", "经理");
        if (manager.getName().equals("张三")) {
            System.out.println("name属性正常");
        } else {
            System.out.println("name属性出错");
        }

        if (manager.getKey().equals("123456")) {
            System.out.println("key属性正常");
        } else {
            System.out.println("key属性出错");
        }
        System.out.println(manager);
    }
}
