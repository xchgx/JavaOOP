/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xchgx.javaoop.course29.ketangbiji01;

/**
 * 搜索算法，或 查找算法
 *
 * @author 陈老师 现代管理学院
 */
public class SearchFind {

    public static void main(String[] args) {
        String[] nameArr = {"张三四", "李四五", "王五六", "赵六七", "孙七八", "周八三"};
        String question = "周八三";//准备查找的人名
        boolean finded = false;//标记，找打了就是true，找不到就false，默认为false
        for (String name : nameArr) {//Ctrl+R
            if (name.equals(question)) {
                finded = true;//一旦找到了，还有必要继续循环查找下去吗？
                break;//退出循环，不用再继续寻找了
            }
        }
        if (finded) {
            System.out.println("找到了");
        }else{
            System.out.println("没找到");
        }
    }
}
