package com.xchgx.javaoop.course01.example01;

/**
 *
 * @author 陈老师 <现代管理学院>
 */
public class Test {
    public static void main(String[] args) {
        System.out.println("Java,我来了");
        Calculator c = new Calculator(1,2);
        int add = c.add();
        if(add!=3){System.out.println("add出错,1+2竟然不等于3");}
        int sub = c.subtract();
        if(sub!=-1){System.out.println("sub出错,1-2竟然不等于-1");}
        long mul = c.multiple();
        if(mul!=2){System.out.println("mul出错,1*2竟然不等于2");}
        double div = c.divide();
        if(div!=0.5){System.out.println("div出错,1/2竟然不等于0.5");}
    }
}
