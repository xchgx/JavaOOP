/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xchgx.javaoop.course13.studentbaodao.beike03;

/**
 * 主程序启动类
 *
 * @author 陈老师 现代管理学院
 * @version 1.0 2020-5-26 23:55:06
 */
public class App {//学生报到统计

    public static void main(String[] args) {
        System.out.println("学生报到统计程序");
        //来一个报到的试试。
        //谁来报到？
        //要有个人名吧
        String name = "张三";//人名是字符串类型，所以创建一个字符串变量name
        //然后呢，开始报到呀，怎么报到呢？
        //报到是一个可以被记录的值，在纸上呈现的是一个红色的勾勾。在电脑里面就是一个标记。
        name += "√";//这样么？
        //输出该学生信息
        System.out.println("name = " + name);
        
        String name2 = "李四";
        name2+="×";
        System.out.println("name2 = " + name2);
        //总不能1000个学生，每个学生写三行报到代码，那岂不是要写3000行。。。
        //这么明显的规律一定要提炼出来。
    }
}
