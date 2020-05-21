/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xchgx.javaoop.course03.beike01;

/**
 *
 * @author 陈老师 现代管理学院
 */
public class Employee { //员工
    private String eid;//员工号
    private String name;//姓名
    private String sex; //性别
    private String phone;//手机号
    private String department;//部门
    private String position;//职位

    public Employee(String eid, String name, String sex, String phone, String department, String position) {
        this.eid = eid;
        this.name = name;
        this.sex = sex;
        this.phone = phone;
        this.department = department;
        this.position = position;
    }

    @Override
    public String toString() {
        return "Employee{" + "eid=" + eid + ", name=" + name + ", sex=" + sex + ", phone=" + phone + ", department=" + department + ", position=" + position + '}';
    }

    public String getEid() {
        return eid;
    }

    public void setEid(String eid) {
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
    
}
