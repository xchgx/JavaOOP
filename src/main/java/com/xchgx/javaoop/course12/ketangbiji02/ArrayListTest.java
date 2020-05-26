/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.xchgx.javaoop.course12.ketangbiji02;//声明包

import java.util.ArrayList;//导入包

/**
 * 数组集合
 * List,Set
 * @author 陈老师 现代管理学院
 */
public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();//默认泛型是 Object
        list.add("asdf");//Object
        list.add(1);//Object
        list.add(1.2);//Object
        
        //设定我们的数组集合中只用来存放数字
        ArrayList<Integer> ilist = new ArrayList<>();
        //数组集合的元素个数有几个？
        System.out.println("添加之前：ilist.size() = " + ilist.size());//显示集合长度
        ilist.add(1); //添加1个元素
        System.out.println("添加之后：ilist.size() = " + ilist.size());//显示集合长度
        //for<TAB>
        for (int i = 0; i < 10; i++) {//初始化
            ilist.add(i+10);//(1) 10,11,12,13,14,15,16,17,18,19
        }
        for (int i = 0; i < ilist.size(); i++) { //遍历输出集合中的元素
            Integer n = ilist.get(i);//i就是集合的下标
            System.out.print(n+" ");
        }
        ilist.remove(5);//删除下标为5的元素,删除14
        System.out.println("");//换行
        for (int i = 0; i < ilist.size(); i++) {
            System.out.print(ilist.get(i)+" ");
        }
        ilist.clear();//清空、清楚、删除、重置、格式化、刷机。
        System.out.println("\n清除之后，数组长度："+ilist.size());//显示数组集合的长度
    }
}
