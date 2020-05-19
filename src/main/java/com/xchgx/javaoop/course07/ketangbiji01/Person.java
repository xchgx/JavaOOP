/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xchgx.javaoop.course07.ketangbiji01;

/**
 *
 * @author Administrator
 */
public abstract class Person {//被逼成为抽象类
    private String name;//属性
    public void myFunc(){}//自己的方法
    public static String age;//静态的属性
    public static void staticFunc(){//静态的方法
        
    }
    public Person(){
        
    }
    
    public void hello(){//正常的方法
        System.out.println("Hello");
    }
//    public abstract void say();//这就是抽象方法
}
