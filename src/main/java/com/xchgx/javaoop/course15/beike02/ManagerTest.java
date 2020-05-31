/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.xchgx.javaoop.course15.beike02;

/**
 *
 * @author 陈老师 现代管理学院
 */
public class ManagerTest {
    public static void main(String[] args) {
        String txt = "张佳豪 11:53:09\n" +
"血缘最难\n" +
"\n" +
"张佳豪 11:53:57\n" +
"只可惜血缘没有在steam发售，不然我还想买了玩玩\n" +
"\n" +
"杨昆 15:05:19\n" +
"\n" +
"\n" +
"张宏略 15:06:55\n" +
"鬼泣尼禄刀刀三红的大佬有没有\n" +
"";
        Manager manager  = new Manager(txt);
        manager.start();
        System.out.println(manager.show());
        
        String fetchName = manager.fetchName("张三 李四 王五赵六 孙七周八");
        System.out.println("fetchName = " + fetchName);
        
        boolean liuyanRow = manager.isLiuyanRow("张三 :23:45");
        System.out.println("liuyanRow = " + liuyanRow);
        
        boolean liuyanRow1 = manager.isLiuyanRow("李四 09:01");
        System.out.println("liuyanRow = " + liuyanRow1);
        
        boolean liuyanRow2 = manager.isLiuyanRow("王五 12:01:5");
        System.out.println("liuyanRow = " + liuyanRow2);
        boolean liuyanRow3 = manager.isLiuyanRow("张三 1:23:45");
        System.out.println("liuyanRow = " + liuyanRow3);
        boolean liuyanRow4 = manager.isLiuyanRow("李三思 12:34:56");
        System.out.println("liuyanRow = " + liuyanRow4);
        boolean liuyanRow5 = manager.isLiuyanRow("12:33:54王五 123456:78:90");
        System.out.println("liuyanRow = " + liuyanRow5);
        String test = "abc123";
        boolean matches = test.matches("abc123");
        System.out.println("matches = " + matches);
        boolean matches1 = test.matches("abc\\d\\d\\d");
        System.out.println("matches1 = " + matches1);
        boolean matches2 = test.matches("abc\\d+");
        System.out.println("matches2 = " + matches2);
        boolean matches3 = test.matches(".*\\d*");
        System.out.println("matches3 = " + matches3);
        String[] split = test.split("1234");
        System.out.println("split.length = " + split.length);
        String[] split1 = test.split("c1"); 
        System.out.println("split1.length = " + split1.length);
        System.out.println("split1[0] = " + split1[0]);
        System.out.println("split1[1] = " + split1[1]);
        System.out.println("split2 = " + "abc123".split("c1")[0]);
        
        String str = "1a2b3c4";
        String[] arr = str.split("\\d");
        for(String s : arr){
            System.out.println("s = " + s);
        }
    }
}
