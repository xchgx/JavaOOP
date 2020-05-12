/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xchgx.javaoop.course03.beike06;
 

/**
 *
 * @author 陈老师 <现代管理学院>
 */
public class Employee {
    private String name;
    private String sex;
    private String eid;

    public Employee(String name, String sex, String eid) {
        this.name = name;
        this.sex = sex;
        this.eid = eid;
    } 

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getEid() {
        return eid;
    }

    public void setEid(String eid) {
        this.eid = eid;
    }

    @Override
    public String toString() {
        return "Employee{" + "name=" + name + ", sex=" + sex + ", eid=" + eid + '}';
    }
    
    
}
