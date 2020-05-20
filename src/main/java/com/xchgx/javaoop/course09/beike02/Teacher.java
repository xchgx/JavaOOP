/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.xchgx.javaoop.course09.beike02;

import com.xchgx.javaoop.course09.beike01.Student;//这里一定要导入Student类，不然无法使用

/**
 *
 * @author 陈老师 现代管理学院
 */
public class Teacher {//教师类在beike2包中，现在要调用beike01中的学生类

    public static void main(String[] args) {
        System.out.println("Hello Teacher");
        Student.main(args);
        int[] arr = new int[9];
        int index = 0;
        int a = arr[index];
    }
}
