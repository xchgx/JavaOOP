/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xchgx.javaoop.course07.beike02;

/**
 *
 * @author 陈老师 [现代管理学院]
 */  
public abstract class Food {//
    public static String app;//抽象类可以存在 静态属性
    private String name;//抽象类可以存在普通属性

    public String getName() { //抽象类可以存在普通方法
        return name;
    }

    public void setName(String name) {//抽象类可以存在普通方法
        this.name = name;
    } 
    public static void sayHi(String args[]){////抽象类可以存在静态方法
        
    }
    public Food() {//抽象类可以存在构造方法
    }

    public abstract void hello(); //这是抽象的方法
}
