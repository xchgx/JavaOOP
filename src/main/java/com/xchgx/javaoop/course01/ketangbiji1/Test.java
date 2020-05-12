/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xchgx.javaoop.course01.ketangbiji1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author 陈老师 <现代管理学院>
 */
public class Test {
    public static void main(String[] args) throws IOException {
        System.out.println("Hello World");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("请输入第1个数字:");
        String readLine1 = br.readLine();
        System.out.print("请输入第2个数字:");
        String readLine2 = br.readLine();
        System.out.println("开始计算:");
        int number1 = Integer.parseInt(readLine1);
        int number2 = Integer.parseInt(readLine2);
        Calc c = new Calc(number1,number2);//创建计算器对象
        int add = c.add(); 
        if(add != (number1+number2)){System.out.println("add出错");}
        else{System.out.println("add="+add);}
        int sub = c.sub();
        if(sub != (number1-number2)){System.out.println("sub出错");}
        else{System.out.println("sub = " + sub);}
        long mul = c.mul();
        if(mul != (number1*number2)){System.out.println("mul出错");}
        else{System.out.println("mul = " + mul);}
        double div = c.div();
        if(div != (number1*1.0/number2)){System.out.println("div出错");}
        else{System.out.println("div = " + div);}
    }
}









