/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xchgx.javaoop.course05.ketangbiji02;

/**
 *
 * @author 陈老师 现代管理学院
 */
public class Test {
    public static void main(String[] args) {
        User user = new User();
        user.setName("张三");
        user.setUsername("zhangsan");
        System.out.println(user.getName());
        System.out.println(user.getUsername());
        
        User user2 = new User("lisi","123456");
        System.out.println("第二种");
        System.out.println(user2.getUsername());
        System.out.println(user2.getPassword());
    } 
}
