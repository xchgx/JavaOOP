/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.xchgx.javaoop.course17.ketangbiji02;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 选择数字相除-例子
 * @author 陈老师 现代管理学院
 */
public class ArraySelectDivExceptionTest {
    public static void main(String[] args) {
        try {
            int[] arr = {1, 3, 5, 7, 11, 0};//准备一个数组
            Scanner s = new Scanner(System.in);//从控制台中输入
            for (int i = 0; i < arr.length; i++) {
                System.out.println("("+(i+1)+") "+arr[i]);
            }
            System.out.print("请第1个数字的输入序号(1-6): ");
            int i = s.nextInt(); //获得用户输入，保存在i变量中
            int x = arr[i-1];//为什么i-1？要把用户输入的自然数转换为数组的下标。
            System.out.print("请第2个数字的输入序号(1-6): ");
            int j = s.nextInt(); //获得用户输入，保存在i变量中
            int y = arr[j-1];//为什么j-1？要把用户输入的自然数转换为数组的下标。
            int z = x/y;//开始相除
            System.out.println(x+"÷"+y+"="+z);//输出相除的公式
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("请输入[1-6]的数字，不要输入其它数字.");
        } catch (InputMismatchException e) {//Ctrl+Shift+down↓下
            System.out.println("请输入数字，不要输入其它符号");
        } catch (ArithmeticException e) {//Ctrl+Shift+down↓下
            System.out.println("除数不能为 0 ，请重试");
        } catch (Exception e) {//Ctrl+Shift+down↓下
            System.err.println("捕获到异常："+e);
//            e.printStackTrace();
        }
        
    }
}
