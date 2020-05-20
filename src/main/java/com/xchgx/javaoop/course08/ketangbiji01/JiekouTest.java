/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xchgx.javaoop.course08.ketangbiji01;

/**
 *
 * @author Administrator
 */
public class JiekouTest {
    public static void main(String[] args) {
        Jiekou jk;//可以创建引用，但是不能实例化
        //jk指向接口实现类JiekouImpl的实例化对象
        jk = new JiekouImpl();
        jk.say();//实际调用的是实现类中的say方法
        jk.listen();
//        Jiekou jk2 = new Man();
//不能赋值给jk2，因为Man类没有实现Jiekou
    } 
}
