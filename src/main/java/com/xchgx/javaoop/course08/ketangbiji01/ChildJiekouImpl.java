/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.xchgx.javaoop.course08.ketangbiji01;

/**
 *
 * @author 陈老师 现代管理学院
 */
public class ChildJiekouImpl implements ChildJiekou{
    @Override//一定要实现该方法
    public void look()      {       System.out.println("look()...");    }
        //Ctrl+E //删除整行
    @Override//一定要实现该方法
    public void say()       {       System.out.println("say()..");      }
    @Override//一定要实现该方法
    public void listen()    {      System.out.println("listen()...");   }
}
