/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.xchgx.javaoop.course13.ketangbiji03;

import java.util.ArrayList;

/**
 * 学生报到程序
 * @version 3.0 2020-5-28 10:02:15
 * @author 陈老师 现代管理学院
 */
public class App3 {
    public static void main(String[] args) {//主方法，程序入口
        ArrayList<String> nameList = new ArrayList<>();//创建数组集合对象并实例化。
        //初始化学生名单 start
        nameList.add("刘一");        nameList.add("陈二");
        nameList.add("张三");        nameList.add("李四");
        nameList.add("王五");        nameList.add("赵六");
        nameList.add("孙七");        nameList.add("周八");
        nameList.add("吴九");        nameList.add("郑十");
        //初始化学生名单 end
        //准备排队报到的学生名单
        ArrayList<String> paiduiList = new ArrayList<>();//报到的学生集合
        paiduiList.add("张三");
        paiduiList.add("李四");
        paiduiList.add("郑十");
        
        //执行报到的过程 start
        //循环从排队中拿出名字到 全班的名单中对比并打勾。
            //遍历排队的集合..使用for .. in 语句
            for(String pdname : paiduiList){
                //遍历全班的名单
                for(int i=0; i<nameList.size(); i++){ //for i循环
                    String name = nameList.get(i);//从全班名单中获得下标为 i 的姓名
                    if(pdname.equals(name)){//更新名单的姓名（√）
                        nameList.set(i, name+"√");//更新全班名单中下标为 i 的名称
                    }
                }
            }
        //执行报到的过程 end
        
        //最后输出报到的统计结果
        for(String name : nameList){
            System.out.println(name);
        }
    }
}
