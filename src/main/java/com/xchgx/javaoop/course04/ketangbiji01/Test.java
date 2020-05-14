/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xchgx.javaoop.course04.ketangbiji01;

/**
 *
 * @author 陈老师 <现代管理学院>
 */
public class Test {
    public static void main(String[] args) {
        Dongwu dw1 = new Shu();//给动物对象创建一个鼠的实例
        Dongwu dw2 = new Niu();//给动物对象创建一个牛的实例
        System.out.println("多态性");
        dw1.jiao();//动物1发出叫声
        dw2.jiao();//动物2发出叫声
    }
}
