/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.xchgx.javaoop.course18.ketangbiji01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 测试外抛出异常
 * @author 陈老师 现代管理学院
 */
public class ThrowsExceptionTest {
    public static void main(String[] args) throws IOException{//主方法 声明异常
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();//读取一行
    }
}
