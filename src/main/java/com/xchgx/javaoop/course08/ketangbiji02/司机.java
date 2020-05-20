/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.xchgx.javaoop.course08.ketangbiji02;

/**
 * 驾驶员是接口类，司机是驾驶员的实现类
 * @author 陈老师 现代管理学院
 */
public class 司机 implements 驾驶员{

    @Override
    public void 开车() {
        System.out.println("司机 正在驾驶小汽车");
    }
    
}
