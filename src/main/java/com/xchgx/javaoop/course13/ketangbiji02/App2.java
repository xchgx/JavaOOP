/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.xchgx.javaoop.course13.ketangbiji02;

/**
 * 学生报到程序
 * @version 2.0 2020-5-28 09:33:16
 * @author 陈老师 现代管理学院
 */
public class App2 {
    public static void main(String[] args) {//程序入口，主方法
        String[] names = {"张三","李四","王五","赵六","孙七","周八"};//初始化一个学生名单
        String[] paidui = {"张三","王五","周八"};//排队报到的人
        //要处理报到的学生 start
//        for(String name : names){//遍历名单
        for(int i=0; i<names.length;i++){//遍历名单
            String name = names[i];
            if(name.equals(paidui[0])){//从名单中查找 张三 
                name+="√";
                names[i] = name;//更新数组中的元素值
            }
        }
        //要处理报到的学生 end
        System.out.println("学生名单");
        for(String name : names){//把名单输出来
            System.out.print(name+"\t");
        }
    }
}
