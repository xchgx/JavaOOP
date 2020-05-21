/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xchgx.javaoop.course03.beike06;

/**
 *
 * @author 陈老师 现代管理学院
 */
public class Test {
    public static void main(String[] args) {
        String name = "张三";
        String sex = "男";
        String eid = "20102011021";
        
        Manager manager = new Manager(name, sex, eid);
        System.out.println("manager.getName() = " + manager.getName());
        System.out.println("manager.getSex() = " + manager.getSex());
        System.out.println("manager.getEid() = " + manager.getEid());
        
    }
}
