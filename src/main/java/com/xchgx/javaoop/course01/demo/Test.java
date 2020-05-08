/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xchgx.javaoop.course01.demo;

/**
 *
 * @author 陈老师 <现代管理学院>
 */
public class Test {
    public static void main(String[] args) {
        Calc n = new Calc(1,2);
        int result1 = n.add();
        if(result1!=3){  System.out.println("add()错误");  }
        int result2 = n.sub();
        if(result2!=-1){  System.out.println("sub() 错误");   }
        double result3 = n.mul();
        if(result3!=2){  System.out.println("mul() 错误");   }
        double result4 = n.div();
        if(result4!=0.5){  System.out.println("div() 错误");   }
        
        System.out.println("测试结束");
    }
}
