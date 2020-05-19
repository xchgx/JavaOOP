/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xchgx.javaoop.course08.beike07;

/**
 *
 * @author Administrator
 */
public class Test {
    public static void main(String[] args) {
        主板 zb = new 华硕主板();
        Memery m = new 威刚内存();
        Cpu cpu  = new InterCpu();
        zb.cpu(cpu); 
        zb.memery(m);
        zb.start();
    }
}
