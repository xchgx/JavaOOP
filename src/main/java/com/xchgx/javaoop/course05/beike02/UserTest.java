/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xchgx.javaoop.course05.beike02;

/**
 *
 * @author 陈老师 现代管理学院
 */
public class UserTest {
    public static void main(String[] args) {
        //第一种初始化，可以自己选择初始化哪些属性。灵活性很高，但是复杂度也升高而来
        User user = new User();
        user.setName("张三");
        user.setUsername("zhangsan");
        user.setPassword("123456");
        System.out.println("user = " + user);
        //第二种初始化必须的属性，这种适合用于开发阶段用来调试，尽可能少的输入
        User user2 = new User("admin", "ADMIN");
        System.out.println("user2 = " + user2);
        
        //第三种生产环境下的构造器
        User user3 = new User("李四", "lisi", "LS123456");
        System.out.println("user3 = " + user3);
        
        //第四种，适合数据导入型
        User user4 = new User("王五", "wangwu", "123456", "男", "130000000000", "17902055@qq.com", "2000-02-13");
        System.out.println("user4 = " + user4);
        
    }
}
