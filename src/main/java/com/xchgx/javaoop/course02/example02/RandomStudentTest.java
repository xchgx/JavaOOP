/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xchgx.javaoop.course02.example02;

/**
 *
 * @author 陈老师 <现代管理学院>
 */
public class RandomStudentTest {
    public static void main(String[] args) {
        int r = (int)(Math.random()*67);
        r++;
        System.out.println("r = " + r);
    }
}
