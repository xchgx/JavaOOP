/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.xchgx.javaoop.course14.ketangbiji01;

/**
 * 测试字符串的功能(方法)
 * @author 陈老师 现代管理学院
 */
public class StringSplitTest {
    public static void main(String[] args) {//主方法
        String liuyan = "留言人甲： xxxx;留言人乙：yyyy;留言人丙：zzz";
        System.out.println(liuyan);
        String[] liuyanxinxi = liuyan.split(";"); //分割字符串，得到数组
        for(String ly : liuyanxinxi){//遍历数组
            System.out.print(ly+"\t\t");//每次输出数组元素后加一个制表符
        }
//Ctrl+A  , Ctrl+C 

    }
}
