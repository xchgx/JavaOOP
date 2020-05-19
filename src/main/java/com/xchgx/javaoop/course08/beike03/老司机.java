/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xchgx.javaoop.course08.beike03;

/**
 *
 * @author Administrator
 */
public class 老司机 implements Driver{//老司机是司机接口的实现类

    @Override
    public void kaiche() {//实现了接口中的方法
        System.out.println("我是老司机，我在开车");
    }
    
}
