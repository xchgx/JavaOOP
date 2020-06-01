/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xchgx.javaoop.course15.ketangbiji01;

/**
 * 测试功能的
 *
 * @author Administrator
 */
public class Test {

    public static void main(String[] args) {
        String str = "a";
        boolean matches = str.matches("."); //匹配任意字符 str变量中是否只有1个符号
        System.out.println(str + " = " + matches);

        str = "ab";
        matches = str.matches("."); //匹配任意字符 str变量中是否只有1个符号
        System.out.println(str + " = " + matches);

        str = "abc";
        matches = str.matches("..."); //正则（+）至少有1个匹配
        System.out.println(str + " = " + matches);

        str = "hello";
        matches = str.matches(".+"); //正则（+）至少有1个匹配
        System.out.println(str + " = " + matches);

        str = "";
        matches = str.matches(".+"); //正则（+）至少有1个匹配
        System.out.println(str + " = " + matches);

        str = "";
        matches = str.matches(".*"); //正则（*）匹配0个或多个
        System.out.println(str + " = " + matches);

        String str1 = "I,m 18 years";
        String str2 = "I,m 20 years";
        boolean matches1 = str1.matches("I,m [0-9]{1,3} years"); //正则[0-9]匹配数字0~9，至少要有1个数字，最多3个连续数字
        boolean matches2 = str2.matches("I,m \\d{1,3} years"); //正则 \\d匹配数字0~9，至少要有1个数字，最多3个连续数字
        System.out.println(str1 + " = " + matches1);
        System.out.println(str2 + " = " + matches2);
        //"I'm [0-9]{1,3} years"
        //I'm 1 years
        //I'm 11 years
        //I'm 1000 years

        //判断输入的是不是QQ号 
        String qq = "1234567890123456789"; //被检查的字符串
        boolean isQQNumber = qq.matches("[0-9]{5,11}");//正则匹配的模式
        if (isQQNumber) {
            System.out.println("符合QQ号规则：" + qq);
        } else {
            System.out.println("不符合QQ号规则 " + qq);
        }

        String liuyanStr = "胡彬 10:09:01\n"
                + "还有11位的？\n"
                + "胡彬 10:09:41\n"
                + "我的手机号并没有这个qq\n"
                + "张佳豪 10:10:29\n"
                + "我是10位的qq\n"
                + "吴浩浩 10:11:11\n"
                + "我看到过12位的\n";
        String[] liuyans = liuyanStr.split("\n");
        for(String ly : liuyans){
            if(ly.matches(".* \\d{1,2}:[0-9]{2}:[0-9][0-9]")){
                System.out.println(ly);
            }
        }

    }
}
