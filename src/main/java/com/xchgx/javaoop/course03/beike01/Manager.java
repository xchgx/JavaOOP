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
public class Manager  extends Employee{
    private String key;//通行密钥

    public Manager(String key, String eid, String name, String sex, String phone, String department, String position) {
        super(eid, name, sex, phone, department, position);
        this.key = key;
    }  

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
    
    
}
