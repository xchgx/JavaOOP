/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xchgx.javaoop.course06.beike05;

import com.xchgx.javaoop.course05.beike03.*;

/**
 *
 * @author 陈老师 <现代管理学院>
 */
public class Test {
    public static void main(String[] args) {
        //v1.0
//        System.out.println("我吃了一个苹果");
        
        //v2.0
//        String shuiguo = "苹果";
//        System.out.println("我吃了一个:"+shuiguo);
        
        //v3.0
//        String shuiguo = "苹果";
//        String name = "我";
//        System.out.println(name + "吃了一个:"+shuiguo);
        
//        //v4.0
//        String shuiguo = "苹果";
//        String name = "我";
//        int shuiguo_hp = 10;
//        System.out.println(name + "吃了一个:"+shuiguo+",回血:+"+shuiguo_hp);
  
        //v5.0
//        String shuiguo = "苹果";
//        String name = "我";
//        int shuiguo_hp = 10;
//        int my_hp = 5;
//        System.out.println(name + "吃了一个:"+shuiguo+",回血:+"+shuiguo_hp+",现有血量："+(my_hp+shuiguo_hp));
        
        Foodie fd = new Foodie();
        System.out.println(fd);
        
        Shuiguo shuiguo = new Shuiguo(10, "苹果");
        fd.eating(shuiguo);
        System.out.println(fd);
        
        Shushi shushi = new Shushi(20, "鸡爪");
        fd.eating(shushi);
        System.out.println(fd);
    }
    
}
