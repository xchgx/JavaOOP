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
public class 华硕主板 implements 主板{
    private Cpu cpu;
    private Memery memery;

    @Override
    public void cpu(Cpu cpu) {
        this.cpu = cpu;
    }

    @Override
    public void memery(Memery memery) {
        this.memery = memery;
    }

    @Override
    public void start() {
        System.out.println("开机自检");
        System.out.println("内存条大小："+memery.size()+"G");
        System.out.println("中央处理器："+cpu.pinpai());
        System.out.println("开机完成，进入系统");
    }
    
}
