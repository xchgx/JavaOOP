/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.xchgx.javaoop.course17.ketangbiji01;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 多个异常测试
 * @author 陈老师 现代管理学院
 */
public class MultiExceptionTest {
    public static void main(String[] args) {//主方法
        //IPO,从键盘获得输入数字，输入两次数字，然后相除。
        
        try {
            Scanner s = new Scanner(System.in);//创建扫描器，设置获得输入的位置是控制台
            System.out.print("请输入第1个数字：");
            int x = s.nextInt();//等待用户输入一个数字，保存在变量x中
            System.out.print("请输入第2个数字：");
            int y = s.nextInt();//等待用户输入一个数字，保存在变量y中
            int z = x / y;//将两个数相除
            System.out.println(x + "÷" + y + "=" + z);//输出公式，显示运算结果
        } catch(InputMismatchException e){//捕获数字转换异常
            System.out.println("请输入纯数字，不要输入其它字符。请重试");
        } catch(ArithmeticException e){//捕获除数为0的异常
            System.out.println("除数不能为0，请重试");
        } catch (Exception e) {//捕获所有异常，这一行必须放在最后面，否则它会捕获所有异常
            System.out.println("您的输入有误 = " + e);
        } finally{//无论是否发生异常，该语句块一定会执行
            System.out.println("回收内存资源，清理内存垃圾，释放占用连接。");
        }
        System.out.println("程序运行正常结束");
    }
}
