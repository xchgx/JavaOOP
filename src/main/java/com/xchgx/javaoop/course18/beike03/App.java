/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xchgx.javaoop.course18.beike03;
  
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 * 主程序启动类
 *
 * @author 陈老师 现代管理学院
 */
public class App {

    public static void main(String[] args)   {
        System.out.println("Hello 语法检查");
        CheckGrammer cg = new CheckGrammer();
        try {
            cg.start();
        } catch (GrammarException ex) {
            System.out.println("语法检查不通过："+ex);
        }
    }
}
