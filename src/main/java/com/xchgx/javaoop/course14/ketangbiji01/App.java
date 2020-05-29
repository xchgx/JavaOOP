/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xchgx.javaoop.course14.ketangbiji01;

/**
 * 留言统计程序
 *
 * @version 1.0 2020-5-29 10:25:44
 * @author 陈老师 现代管理学院
 */
public class App {//鼠标光标放在类名上，按Ctrl+R（重构-重命名）

    public static void main(String[] args) {
        //要想通过编程分析（解析）数据，就要思考输入，处理，输出，这三个部分。
        //输入内容是：原生的聊天记录
        //处理过程是：找到留言人并保存
        //输出内容是：留言人的留言次数
        String data = "何宇豪 9:59:38\n"
                + "好的\n"
                + "\n"
                + "李航 10:05:57\n"
                + "、\n"
                + "\n"
                + "江正 10:06:13\n"
                + "@Java面向对象编程-陈老师 老师我这边停电了，等一会来电了再把代码补上\n"
                + "\n"
                + "胡清溪 10:09:54\n"
                + "张家豪胡文 : :\n"
                + "";//原始数据
        String[] rows = data.split("\n");//将聊天记录分割成由行组成的数组
        for(String row : rows){//遍历每行留言记录
            if(row.contains(" ")){ //如果这一行有空格，那么就有可能包含留言人姓名
                //何宇豪 9:59:38
                //张家豪胡文 : :
                int startIndex = row.indexOf(" "); //查找第一次出现空格的位置（下标）
                String name = row.substring(0, startIndex);//截取姓名
                String time = row.substring(startIndex);//截取后半部分的时间
                String trim = time.replaceAll("\\d+:\\d\\d:\\d\\d", "").trim(); //删掉时间//何宇豪 
                if(trim.isEmpty()){//如果替换掉时间后，没有其它任何字符，就表示该留言行是起始行 
                    System.out.println(name);//输出留言人姓名
                }
            }
        }
    }
}
