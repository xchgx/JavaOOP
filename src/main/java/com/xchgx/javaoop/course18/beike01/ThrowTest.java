/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.xchgx.javaoop.course18.beike01;

/**
 *
 * @author 陈老师 现代管理学院
 */
public class ThrowTest {
    public static void main(String[] args) {
        Teacher t = new Teacher();
        try {
            t.setId("200886800");
        } catch (Exception e) {
            System.out.println("e = " + e);
        }
    }
}
class Teacher{
    private String id;//
    public void setId(String pid) throws IllegalAccessException{
        //判断教师职工号的长度是否为9 
        if(pid.length() == 9){
            id = pid;
        }else{//一旦发现传递进来的字符串长度不是9位，就立刻抛出异常。
            throw new IllegalAccessException("参数长度应为 9!");//非法访问异常
        }
        
        
        try {
            throw new IllegalAccessException("自己抛出自己接");
        } catch (IllegalAccessException illegalAccessException) {
            System.out.println("illegalAccessException = " + illegalAccessException);
            
        }finally{
            System.out.println("over");
        }
        
        
    }
}