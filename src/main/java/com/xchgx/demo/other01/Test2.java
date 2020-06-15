/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xchgx.demo.other01;

/**
 *
 * @author 陈老师 现代管理学院
 */
class Student{
    public  String name;//姓名
    public  int age;//年龄
}
public class Test2 {

    static void receive1(int xc) {
        xc = 10;
    }
    static void receive2(int[] xc){
        xc[0] = 10;
    }
    static void receive3(Student s){//测试类类型参数
        s.name = "张三";
    } 
    public static void main(String[] args) {
        Integer i = new Integer("110");
        System.out.println("i = " + i);
        receive1(i);
        System.out.println("i = " + i);

        
        Student stu = new Student();
        stu.name = "李四";
        System.out.println("stu.name = " + stu.name);
        receive3(stu);
        System.out.println("stu.name = " + stu.name);
        
        int[] a = {1,3,5};
        System.out.println("a[0] = " + a[0]);
        receive1(a[0]);
        System.out.println("a[0] = " + a[0]);
        
        System.out.println("a[0] = " + a[0]);
        receive2(a);
        System.out.println("a[0] = " + a[0]);
    }
}
