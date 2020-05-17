/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xchgx.javaoop.course06.beike04;

/**
 *
 * @author 陈老师 <现代管理学院>
 */
public class Person {
    private final String name = "张三"; //变量是终态的final，必须要初始化

    
    public Person() {
//        name = "李四";//name变量是final的，不能赋值
        final double  PI = 3.1415926;//圆周率PI，局部变量也可以是final的
        
        
        
//        PI = 3.14;//不能赋值
    }
    
}
