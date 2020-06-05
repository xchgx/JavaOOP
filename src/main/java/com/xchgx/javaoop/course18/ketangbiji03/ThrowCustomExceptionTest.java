/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.xchgx.javaoop.course18.ketangbiji03;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 陈老师 现代管理学院
 */
public class ThrowCustomExceptionTest {
    public static void main(String[] args) {//这是系统边界了，小心异常出没
        ThrowCustomException tce = new ThrowCustomException();
        try {
            tce.setScore(50);//正常分数,不会抛出异常
            tce.setScore(101);//非正常分数，会抛出异常
            tce.throwCustom();//测试，肯定会抛出异常
        } catch (CustomException ex) {
            System.out.println("异常信息："+ex.getMessage());
        }
    }
}
