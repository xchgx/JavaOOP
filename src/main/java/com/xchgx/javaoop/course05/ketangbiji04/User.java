/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xchgx.javaoop.course05.ketangbiji04;

/**
 *
 * @author 陈老师 <现代管理学院>
 */
public class User {

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    private String name;//姓名
    private int age;//年龄
    private String sex;//性别
    //因为属性是私有的，只能在这里访问。
    //所以要提供公共方法，间接访问属性

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
 
    public String getName(){
        return this.name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
}
