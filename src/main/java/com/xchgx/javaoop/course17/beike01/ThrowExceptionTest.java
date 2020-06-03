/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.xchgx.javaoop.course17.beike01;

import java.lang.invoke.MethodHandles;

/**
 *
 * @author 陈老师 现代管理学院
 */
public class ThrowExceptionTest {
    public static void throwException(int i) throws /*总是出现在方法的声明中，用来表明该方法可能抛出的各种异常*/ Exception{
        if(i==1){
            throw new Exception();//总是出现在方法体重，用来抛出一个异常
        }
    }
    public static void main(String[] args) {
        try{//当这段代码运行时可能发生异常时，应该把这段代码放到try语句块中
             throwException(1);
        }catch(Exception e){//在catch语句块中捕获异常。catch语句块的参数类似于方法的声明，包含一个异常类型和一个异常对象。异常类型一般是Exception类或它的子类
            System.out.println("捕获到异常！");
        }finally{//无论是否产生异常，finally 所指定的代码都要被执行。通常在finally 语句块中可以进行资源的清除工作，如关闭数据库的链接、关闭打开的文件等。
            System.out.println("finally 中的代码一定会被执行");
        }
    }
}
