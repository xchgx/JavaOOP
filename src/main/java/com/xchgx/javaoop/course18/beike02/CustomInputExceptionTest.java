/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.xchgx.javaoop.course18.beike02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 陈老师 现代管理学院
 */
public class CustomInputExceptionTest {
    static String inputNum(String str) throws CustomInputException{
        int num = Integer.parseInt(str);
        System.out.println("输入的数据为："+num);
        if(num<0 || num > 100){
            //产生并抛出自定义异常 CustomInputException
            throw new CustomInputException("输入数据不在 0 到100之间");//我不处理这些异常情况，我只想往外抛出，谁调用谁负责处理。
        }else{
            System.out.println("输入的数据合法[0-100]");
        }
        return "xx";
    }
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //对自定义异常进行捕获处理
        try{
            System.out.println("请输入数据：");
            String str = br.readLine();
            System.out.println("inputNum(str) = " + inputNum(str));
        }catch(CustomInputException e){
            System.out.println(e.getMessage());
        } catch (IOException ex) {
            System.out.println("ex = " + ex); 
        }
    }
}
