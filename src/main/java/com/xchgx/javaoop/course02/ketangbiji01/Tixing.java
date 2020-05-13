/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xchgx.javaoop.course02.ketangbiji01;

/**
 *
 * @author 陈老师 <现代管理学院>
 */

    public class Tixing {
        private double a;
        private double b;
        private double h;

        public Tixing (double a,double b, double h){
        this.a=a;
        this.b=b;
        this.h=h;

                }
        public double jsMianji(){
            double s= jsMianji();
            double z =Math.sqrt((a+b)*h/2);
            return z;
        }
    }