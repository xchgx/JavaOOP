/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xchgx.javaoop.course03.beike02;

/**
 *
 * @author 陈老师 现代管理学院
 */
public class Person {

    private String name;
    private int age;
    private String sex;

    public void show() {
        System.out.println("name = " + name);
        System.out.println("age = " + age);
        System.out.println("sex = " + sex);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
