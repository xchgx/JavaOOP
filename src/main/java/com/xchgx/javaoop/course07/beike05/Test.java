/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xchgx.javaoop.course07.beike05;

/**
 *
 * @author 陈老师 [现代管理学院]
 */
public class Test {
    public static void main(String[] args) {
        Parent pc = new Child();
        pc.show();
        
        Child child = new Child();
        child.show();
        
        Parent parent = new Parent();
        parent.show();
    }
}
