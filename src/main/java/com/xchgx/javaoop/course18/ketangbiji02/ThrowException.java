/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.xchgx.javaoop.course18.ketangbiji02;

/**
 * 产生异常向外抛出
 * @author 陈老师 现代管理学院
 */
public class ThrowException {
    public void madeException() throws Exception{
        throw new Exception("这里产生了异常，并向外抛出。");
    }
    public void madeInException() throws Exception{
        Exception e = new Exception("创建异常对象");
        throw e;
    }
}
