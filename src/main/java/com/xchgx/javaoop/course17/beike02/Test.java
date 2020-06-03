/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xchgx.javaoop.course17.beike02;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author 陈老师 现代管理学院
 */
public class Test {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = {1, 3, 5, 7, 11, 13, 17, 23, 27};
        System.out.println("已知有质数数组如下：");
        int i = 1;
        for (int j : arr) {
            System.out.println("("+i + ") " + j);
            i++;
        }
        try {
            System.out.print("请输入第一个数字的序号[1,9]：");
            int index1 = scanner.nextInt();
            int a = arr[index1-1];
            System.out.print("请输入第一个数字的序号[1,9]：");
            int index2 = scanner.nextInt();
            int b = arr[index2-1];
            int c = a / b;
            System.out.println(a + "/" + b + "=" + c);
        }catch(ArithmeticException e){
            System.out.println("除数不能为0 ");
        }catch(InputMismatchException e){
            System.out.println("输入的内容必须是数字");
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("输入的数字要在[1,9]之内");
        }catch(Exception e){
            System.out.println("还有未处理的异常"+e);
        }finally{
            System.out.println("程序结束，准备闪人。");
        }
    }
}
