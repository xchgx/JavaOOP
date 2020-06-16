/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.xchgx.javaoop.course24.ketangbiji01;

/**
 * 测试Manager类的findJinshanshan方法
 * @author 陈老师 现代管理学院
 */
public class ManagerTest {
    public static void main(String[] args) {
        Manager manager = new Manager();
        manager.madeNwuqi(20);//产生20把武器-王之财宝
        int[] qujian = manager.randomExtract(4);//随机抽取区间
        int[] qujian2 = {1,10,100,1000};
        int[] jss = manager.findJinshanshan(qujian);//意图编程（属于敏捷开发的TDD方法）
        //jss数组有两种结果，分别是：找打了三把武器，数组中有3个元素值； 
        //另一个结果是没有找到，jss是null值
        if(jss == null){
            System.out.println("没有找到可以召唤金闪闪的三把武器");
        }else{
            System.out.println("找到了召唤金闪闪的三把武器");
            System.out.println("jss[0] = " + jss[0]);
            System.out.println("jss[1] = " + jss[1]);
            System.out.println("jss[2] = " + jss[2]);
        }
    }
}
