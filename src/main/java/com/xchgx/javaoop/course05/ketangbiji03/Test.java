/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xchgx.javaoop.course05.ketangbiji03;

/**
 *
 * @author 陈老师 现代管理学院
 */
public class Test {
    public static void main(String[] args) {
        My my1 = new My();
        Shuiguo shuiguo = new Shuiguo();//水果
        Shushi shushi = new Shushi();//熟食 鸡腿
        Meat meat = new Meat();//肉类 牛肉
        System.out.println("当前血量 "+my1.getHp());
        my1.eatting(shuiguo);
        System.out.println("吃完后的血量 "+my1.getHp());
        
        System.out.println("当前血量 "+my1.getHp());
        my1.eatting(shushi);
        System.out.println("吃完后的血量 "+my1.getHp());
        
        System.out.println("当前血量 "+my1.getHp());
        my1.eatting(meat);
        System.out.println("吃完后的血量 "+my1.getHp());  
    }
}
