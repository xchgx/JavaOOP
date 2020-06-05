/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.xchgx.javaoop.course18.ketangbiji04;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 检查语法类
 * @author 陈老师 现代管理学院
 */
public class CheckGrammar {//检查语法类
    public void checkFirstRow(String firstRow) throws GrammarException{//检查第1行
         StringTokenizer st = new StringTokenizer(firstRow);//把firstRow以空格作为分隔符分割成多个单词
        String word1 = st.nextToken(); //从里面拿出第1个单词 public / pubiic
        if(!word1.equals("public")){//如果不等于public的话
            throw new GrammarException(1, 1, word1, "声明类时必须有一个公共访问权限public");
        }
        word1 = st.nextToken(); //再次调用nextToken()时 从里面拿出第2个单词 class
        if(!word1.equals("class")){//如果不等于class的话
            throw new GrammarException(1, 2, word1, "声明类时必须存在关键字 class");
        } 
        word1 = st.nextToken(); //再次调用nextToken()时 从里面拿出第3个单词 Test
        if(!word1.equals("Test")){//如果不等于文件名的话
            throw new GrammarException(1, 3, word1, "类名和文件名要相同 Test");
        }
    }
    public void checkSecondRow(String secondRow) throws GrammarException{
         StringTokenizer st = new StringTokenizer(secondRow," ()");//把firstRow以空格作为分隔符分割成多个单词
        String word1 = st.nextToken(); //从里面拿出第1个单词 public / pubiic
        if(!word1.equals("public")){//如果不等于public的话
            throw new GrammarException(2, 1, word1, "声明主方法时必须有一个公共访问权限public");
        }
        word1 = st.nextToken(); //再次调用nextToken()时 从里面拿出第2个单词 class
        if(!word1.equals("static")){//如果不等于class的话
            throw new GrammarException(2, 2, word1, "声明主方法时必须存在静态关键字 static");
        } 
        word1 = st.nextToken(); //再次调用nextToken()时 从里面拿出第3个单词 Test
        if(!word1.equals("void")){//如果不等于文件名的话
            throw new GrammarException(2, 3, word1, "主方法应该是无返回值的 void");
        }
        word1 = st.nextToken(); //再次调用nextToken()时 从里面拿出第3个单词 Test
        if(!word1.equals("main")){//如果不等于文件名的话
            throw new GrammarException(2,4 , word1, "主方法的名称一定是 main");
        }
        word1 = st.nextToken(); //再次调用nextToken()时 从里面拿出第3个单词 Test
        if(!word1.equals("String[]")){//如果不等于文件名的话
            throw new GrammarException(2, 5, word1, "主方法的参数一定是字符串数组 String[]");
        }
    }
    public void start() throws FileNotFoundException, IOException,GrammarException{//开始执行检查工作
        BufferedReader br = new BufferedReader(new InputStreamReader( new FileInputStream("D:\\Test.java")));
        String firstRow = br.readLine(); //读取第1行代码
        checkFirstRow(firstRow);//检查第1行代码
        String secondRow = br.readLine();//读取第2行代码 
        checkSecondRow(secondRow);//检查第2行代码
        System.out.println("检查通过，没有发现语法错误");
    }
}
