/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.xchgx.javaoop.course17.beike02;

/**
 *
 * @author 陈老师 现代管理学院
 */
public class CompileExceptionTest {
    public static void main(String[] args) {
        try {
            int a = 5 / 0;
        } catch (Exception e) {
            System.out.println("捕获到异常");
        }
    }
}
