/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xchgx.javaoop.course03.beike04;

/**
 *
 * @author 陈老师 <现代管理学院>
 */
public class Test {
    public static void main(String[] args) {
        Shape shape = new Shape();
        Shape shape1 = new Pentagon();
        Shape shape2 = new Triangle();
        Shape shape3 = new Rectangle();
        shape.draw();
        shape1.draw();
        shape2.draw();
        shape3.draw(); 
    }
}
