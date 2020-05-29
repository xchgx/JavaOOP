/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xchgx.javaoop.course14.ketangbiji01;

/**
 * 测试字符串的包含功能 contains
 *
 * @author 陈老师 现代管理学院
 */
public class StringContainsTest {

    public static void main(String[] args) {
        String liuyan = "熊杨谨 9:20:15\n"
                + "裂开\n"  ;
        String[] rows = liuyan.split("\n"); //用换行符作为分隔符，得到每行的字符串数组
        for(String row : rows){//遍历留言记录
            if(row.contains(" ")){//如果包含空格，就返回true，不包含就返回false
                System.out.println("这行包含空格:"+row);
            }else{
                System.out.println("这行不包含空格:"+row);
            }
        }
    }
}
