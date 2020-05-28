/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xchgx.javaoop.course14.beike02;

import java.util.ArrayList;

/**
 *
 * @author 陈老师 现代管理学院
 */
public class App {

    public static void main(String[] args) {
        ArrayList<Liuyan> list = new ArrayList<>();
        String log = "【老师】Java面向对象编程-陈老师 11:12:04\n"
                + "代码： https://github.com/xchgx/JavaOOP/tree/master/src/main/java/com/xchgx/javaoop/course13\n"
                + "\n"
                + "何砼洋 11:19:37\n"
                + "张佳豪  \n"
                + "\n"
                + "@张佳豪 。。。根本没看\n"
                + "\n"
                + "何砼洋 11:19:46\n"
                + "凭感觉来\n"
                + "\n"
                + "张佳豪 11:28:26\n"
                + "题目也说了啊 \n"
                + "    如何找到发言人名称。\n";
        //留言数据准备完毕
        Manager manager = new Manager(log);
        manager.start();
        System.out.println(manager.show());

    }
}
