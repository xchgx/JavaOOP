/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xchgx.javaoop.course15.ketangbiji01;

/**
 * 留言统计的启动类
 *
 * @author Administrator
 */
public class App {

    public static void main(String[] args) {
        String str = "金科 9:57:16\n"
                + "没网\n"
                + "\n"
                + "李博文 9:57:30\n"
                + "没网\n"
                + "\n"
                + "张佳豪 9:57:39\n"
                + "\n"
                + "\n"
                + "李博文 9:57:42\n"
                + "我电脑主板坏了\n"
                + "\n"
                + "张佳豪 9:57:47\n"
                + "？？？\n"
                + "\n"
                + "江正 9:57:59\n"
                + "str\n"
                + "\n"
                + "李博文 9:58:02\n"
                + "开得了机上不了网\n"
                + "\n"
                + "江正 9:58:05\n"
                + "\n"
                + "\n"
                + "金科 9:58:39\n"
                + "好了\n"
                + "\n"
                + "饶佳成 9:58:43\n"
                + "\n"
                + "\n"
                + "胡彬 9:58:46\n"
                + "\n"
                + "\n"
                + "金科 9:58:49\n"
                + "就是这个\n"
                + "\n"
                + "张佳豪 9:58:50\n"
                + "李博文  \n"
                + "开得了机上不了网\n"
                + "@李博文 玩的什么游戏这么彪悍\n"
                + "\n"
                + "王文豪 9:58:52\n"
                + "\n"
                + "\n"
                + "金科 9:58:56\n"
                + "str1\n"
                + "\n"
                + "江正 9:59:03\n"
                + "str改就行\n"
                + "\n"
                + "金科 9:59:07\n"
                + "str2\n"
                + "\n"
                + "张佳豪 10:00:15\n"
                + "？？？？\n"
                + "\n"
                + "张佳豪 10:00:16\n"
                + "我们\n"
                + "\n"
                + "张佳豪 10:00:21\n"
                + "下课了吗\n"
                + "\n"
                + "何砼洋 10:00:38\n"
                + "是的\n"
                + "\n"
                + "何砼洋 10:00:40\n"
                + "下课了\n"
                + "\n"
                + "何砼洋 10:00:47\n"
                + "\n"
                + "\n"
                + "张佳豪 10:00:50\n"
                + "\n"
                + "\n"
                + "李博文 10:01:04\n"
                + "张佳豪  \n"
                + "@李博文 玩的什么游戏这么彪悍\n"
                + "@张佳豪 不，睡了一觉他主板就又坏了。\n"
                + "\n"
                + "张佳豪 10:01:13\n"
                + "？？？？\n"
                + "\n"
                + "李博文 10:01:18\n"
                + "电脑玩不了游戏\n"
                + "\n"
                + "张佳豪 10:01:28\n"
                + "你家在哪啊，室温这么高\n"
                + "\n"
                + "李博文 10:01:28\n"
                + "莫名其妙就坏了\n"
                + "\n"
                + "李博文 10:01:44\n"
                + "我哪知啊\n"
                + "\n"
                + "李博文 10:01:50\n"
                + "头都是大的\n"
                + "\n"
                + "胡彬 10:05:03\n"
                + "9-10\n"
                + "\n"
                + "杨昆 10:07:14\n"
                + "有了加号\n"
                + "\n"
                + "胡彬 10:08:28\n"
                + "5-10\n"
                + "\n"
                + "饶佳成 10:08:45\n"
                + "{1,3}是什么意思\n"
                + "\n"
                + "胡彬 10:09:01\n"
                + "还有11位的？\n"
                + "\n"
                + "胡彬 10:09:41\n"
                + "我的手机号并没有这个qq\n"
                + "\n"
                + "张佳豪 10:10:29\n"
                + "我是10位的qq\n"
                + "\n"
                + "吴浩浩 10:11:11\n"
                + "我看到过12位的\n"
                + "\n"
                + "李博文 10:13:26\n"
                + "\n"
                + "\n"
                + "李博文 10:13:26\n"
                + "\n"
                + "\n"
                + "李博文 10:13:47\n"
                + "黄色的光连不上光信号\n"
                + "\n"
                + "李博文 10:14:17\n"
                + "就是没网\n"
                + "\n"
                + "张佳豪 10:33:35\n"
                + "老师manager代码发一下，没码全\n"
                + "";
        Manager manager = new Manager(str);
        manager.start();
        String show = manager.show();
        System.out.println("show = " + show);
    }
}