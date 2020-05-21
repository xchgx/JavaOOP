/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xchgx.javaoop.course03.ketangbiji01;

/**
 *
 * @author 陈老师 现代管理学院
 */
public class Employee { //员工类
    private String name;//姓名
    private String sex;//性别
    private String eid;//员工号

    //带参构造器
    public Employee(String name, String sex, String eid) {
        this.name = name;
        this.sex = sex;
        this.eid = eid;
    }
    
    public void work(){}//工作
    public void clock(){}//打卡
    public void rest(){}//休息
    
    public String getName(){            return this.name; }
    public void setName(String name){   this.name = name; }
    public String getSex() {            return sex;    }
    public void setSex(String sex) {    this.sex = sex;    }
    public String getEid() {        return eid;    }
    public void setEid(String eid) {    this.eid = eid;    }
    
}
