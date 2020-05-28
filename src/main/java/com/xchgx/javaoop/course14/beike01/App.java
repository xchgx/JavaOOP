/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xchgx.javaoop.course14.beike01;

/**
 * String案例-群留言统计
 *
 * @version 1.0 2020-5-28 14:04:40
 * @author 陈老师 现代管理学院
 */
public class App {

    public static void main(String[] args) { 
        String log = "【老师】Java面向对象编程-陈老师 11:12:04\n"
                + "代码： https://github.com/xchgx/JavaOOP/tree/master/src/main/java/com/xchgx/javaoop/course13\n"
                + "何砼洋 11:19:37\n"
                + "张佳豪  \n"
                + "@张佳豪 。。。根本没看\n"
                + "何砼洋 11:19:46\n"
                + "凭感觉来\n"
                + "张佳豪 11:28:26\n"
                + "题目也说了啊 \n"
                + "    如何找到发言人名称。\n";
        String[] logs = log.split("\n");
        System.out.println("共有行数：" + logs.length);
        for (String row : logs) {
            if (row.matches(".*\\d+:\\d+:\\d+.*")) {
                int start = row.indexOf(" ");//如：何砼洋 11:19:37 返回3 
                String name = row.substring(0, start); //从0开始，不包含空格（3），正好是姓名 何砼洋
                String time = row.substring(start); //从空格开始到字符串的末尾，正好是时间： 11:19:37
                //判断是不是时间
                String trim = time.replaceAll("\\d+:\\d+:\\d+", "").trim();//删除所有数字，删除冒号（：），去掉两边空格。
                if (trim.isEmpty() && time.contains(":")) {//如果去掉时间字符之后是空的了，没有任何其他符号，就说明这个位置只有时间。正好符合留言人的特征
                    System.out.println(name);
                }
            }
        }
    }
}
