/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xchgx.javaoop.course08.ketangbiji01;

/**
 * Ctrl+\ 提示
 * @author Administrator
 */
public class JiekouImpl implements Jiekou{

    @Override
    public void say() {//实现接口中的say方法，必须要实现。
        //systrace紧跟一个<TAB>键
        System.out.println("com.xchgx.javaoop.course08.ketangbiji01.JiekouImpl.say()"); 
    }
    @Override
    public void listen() {//实现接口中的listen方法，必须要实现。
        //systrace紧跟一个<TAB>键
        System.out.println("com.xchgx.javaoop.course08.ketangbiji01.JiekouImpl.listen()");
    } 
}
