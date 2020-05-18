/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xchgx.javaoop.course07.beike03;

/**
 *
 * @author 陈老师 [现代管理学院]
 */
public class Shuiguo extends Food{//作为普通的子类继承抽象父类，就要实现父类中的所有抽象方法

    @Override
    public void hello() {
        System.out.println("I'm a apple.");
    }
    
}
