/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xchgx.javaoop.course14.beike01;

/**
 *
 * @author 陈老师 现代管理学院
 */
public class StringReplaceAllTest {

    public static void main(String[] args) {
        String str = "www.baidu.com/17902055";

        System.out.print("匹配成功返回值 :");
        System.out.println(str.replaceAll("(.*)baidu(.*)", "hbou"));//点(.)表示匹配任意符号，*号表示匹配次数为无限次。
        System.out.print("匹配失败返回值 :");
        System.out.println(str.replaceAll("(.*)taobao(.*)", "hbou"));//点(.)表示匹配任意符号，*号表示匹配次数为无限次。
        System.out.print("匹配成功返回值 :");
        System.out.println(str.replaceAll("com", "cn"));
        System.out.print("匹配成功返回值 :");
        System.out.println(str.replaceAll("\\.", "#"));//转移字符，因为点（.）是特殊字符需要转成普通符号
        System.out.print("匹配成功返回值 :");
        System.out.println(str.replaceAll("\\d", ""));//找出所有数字替换为空： 意思就是删掉数字。
        
        
        String str2 = "我喜欢小丽，小丽也喜欢我。";
        String str3 = str2.replaceAll("小丽", "丽丽");
    }
}
