package com.xchgx.javaoop.course01.example01;

/**
 *
 * @author 陈老师 <现代管理学院>
 */
public class Calculator{
    private int number1;
    private int number2;
     
    public Calculator(int a, int b) {
        this.number1 = a;
        this.number2 = b;
    }
    
    public int add(){ 
        return number1+number2;
    }
    public int subtract(){ 
        return number1-number2;
    }
    public long multiple(){ 
        return number1*number2;
    }
    public double divide(){ 
        return number1*1.0/number2;
    } 
}
