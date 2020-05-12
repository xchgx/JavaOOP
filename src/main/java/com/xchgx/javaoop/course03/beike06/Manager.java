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
public class Manager extends Employee {

    private String key;

    public Manager(String name, String sex, String eid) {
        super(name, sex, eid); 
    } 

    public void setKey(String key) {
        this.key = key;
    } 
}
