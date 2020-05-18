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
public class FoodTest {
    public static void main(String[] args) {
 
        
        
//        Food food = new Food();//抽象类不能用new创建对象，抽象类不能被实例化 
        Food food ; //这是食物（抽象类）的引用，该引用是null的。
        Shuiguo sg  = new Shuiguo();//这是水果对象
        food = sg;//让food 指向 水果对象sg。
    }
    
}
