/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xchgx.javaoop.course03.ketangbiji02;

/**
 *
 * @author 陈老师 <现代管理学院>
 */
public class Person {//人员
    private String name;//姓名
    private String sex;//性别
    private int age;//年龄

    public String getName() {                  return name;    }
    public void setName(String name) {         this.name = name;    }
    public String getSex() {                   return sex;    }
    public void setSex(String sex) {           this.sex = sex;    }
    public int getAge() {                      return age;    }
    public void setAge(int age) {              this.age = age;    }
    
    //显示信息
    public void show(){//显示属性的信息
        System.out.println("来自于 Person");
        System.out.println("name = " + name);//显示姓名
        System.out.println("sex = " + sex);//显示性别
        System.out.println("age = " + age); //显示年龄
    }

}
