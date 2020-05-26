/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.xchgx.javaoop.course13.studentbaodao.beike05;

import java.util.ArrayList;

/**
 *
 * 学生报到统计 主程序启动类
 * @author 陈老师 现代管理学院
 * @version 3.0 2020-5-26 23:58:30
 */
public class App {
    public static void main(String[] args) {
        //我们用可变长度的数组对象ArrayList保存我们所有的学生。
        ArrayList<String> names = new ArrayList<>();
        //这里初始化一个示例数据，作为我们的全校学生
        names.add("刘一");
        names.add("陈二");
        names.add("张三");
        names.add("李四");
        names.add("王五");
        names.add("赵六");
        names.add("孙七");
        names.add("周八");
        names.add("吴九");
        names.add("郑十");
        //名单初始化完毕，接下来模拟报到。
        String[] baodaoname = {"张三","李四","王五"};
        //怎么报到呀？
        //这需要找，从集合中找到 张三、李四、王五，然后在后面打勾。
        for (int i = 0; i < baodaoname.length; i++) {
            String bdname = baodaoname[i];
            for(String name:names){
                if(name.equals(bdname)){
                    name+="√";
                    names.set(i, name);
                }
            }
        }
        
        for (int i = 0; i < names.size(); i++) {
            String name = names.get(i);
            System.out.println("name = " + name);
        }
        
    }
}
