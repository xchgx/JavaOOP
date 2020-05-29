/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.xchgx.javaoop.course14.ketangbiji01;

/**
 * 测试字符串的 查找功能 indexOf()
 * @author 陈老师 现代管理学院
 */
public class StringIndexOfTest {
    public static void main(String[] args) {
        String str = "张三、李四、王五、赵六";
        int indexOf = str.indexOf("王五赵六");//寻找王五字符串
        if(indexOf>=0){//找到了王五
            System.out.println("找到了王五，在第"+indexOf+"个位置");
        }else{// -1 
            System.out.println("没有找到 王五  "+indexOf);
        }
    }
}
