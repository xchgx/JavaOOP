/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xchgx.javaoop.course03.ketangbiji01;

/**
 *
 * @author 陈老师 <现代管理学院>
 */
public class Manager2 extends Employee {//管理员 经理
    private String key;//密钥

    public Manager2(String name, String sex, String eid) {
        super(name, sex, eid);//调用父类的构造器
    }

    public Manager2(String name, String sex, String eid, String key) {
        super(name, sex, eid);// Employee(name,sex,eid); 
        this.key = key;
    }

    public void security() {
    }//安全保障的工作
}
