/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xchgx.javaoop.course18.beike03;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 *
 * @author 陈老师 现代管理学院
 */
public class CheckGrammer {

    public CheckGrammer() {
    }

    public void checkClassName(int row, String firstRow) throws GrammarException {
        StringTokenizer st = new StringTokenizer(firstRow);
        String nextToken = st.nextToken();//读取第1个单词
        if (!nextToken.equals("public")) {
            throw new GrammarException(row, 1, nextToken, "第一个必须是公共访问权限");
        }
        nextToken = st.nextToken();//读取第2个单词
        if (!nextToken.equals("class")) {
            throw new GrammarException(row, 2, nextToken, "类声明一定要使用class关键字");
        }
        nextToken = st.nextToken();//读取第3个单词
        if (!nextToken.equals("Test")) {
            throw new GrammarException(row, 3, nextToken, "类名要和文件名相同");
        }
        nextToken = st.nextToken();//读取第4个单词
        if (!nextToken.equals("{")) {
            throw new GrammarException(row, 4, nextToken, "类体一定由大括号包裹");
        }
        if (st.hasMoreTokens()) {
            nextToken = st.nextToken();//读取第5个单词
            if (!nextToken.equals("{")) {
                throw new GrammarException(row, 2, nextToken, "类体一定由大括号包裹");
            }
        }
    }

    public void checkMain(int row, String secondRow) throws GrammarException {
        StringTokenizer st = new StringTokenizer(secondRow, " ()");
        String nextToken = st.nextToken();//读取第1个单词
        if (!nextToken.equals("public")) {
            throw new GrammarException(row, 1, nextToken, "第一个必须是公共访问权限");
        }
        nextToken = st.nextToken();//读取第2个单词
        if (!nextToken.equals("static")) {
            throw new GrammarException(row, 2, nextToken, "主方法一定是静态的");
        }
        nextToken = st.nextToken();//读取第3个单词
        if (!nextToken.equals("void")) {
            throw new GrammarException(row, 3, nextToken, "主方法一定是无返回值类型的");
        }
        nextToken = st.nextToken();//读取第4个单词
        if (!nextToken.equals("main")) {
            throw new GrammarException(row, 4, nextToken, "类体一定由大括号包裹");
        }
        nextToken = st.nextToken();//读取第5个单词
        if (!nextToken.equals("String[]")) {
            throw new GrammarException(row, 5, nextToken, "主方法参数一定是字符串数组类型的");
        }
        nextToken = st.nextToken();//读取第6个单词
        if (nextToken.length() <= 0) {
            throw new GrammarException(row, 6, nextToken, "主方法的参数字符长度一定是大于0的");
        }
        nextToken = st.nextToken();//读取第7个单词
        if (!nextToken.equals("{")) {
            throw new GrammarException(row, 7, nextToken, "类体一定由大括号包裹");
        }
    }

    public void start() throws GrammarException {
        BufferedReader br = null;
        try {
//            br.readLine();
            br = new BufferedReader(new InputStreamReader(new FileInputStream("D:\\Test.java")));
            String line = br.readLine();//读取第1行
            checkClassName(1, line);//检查第1行类声明代码
            line = br.readLine();//读取第2行
            checkMain(2, line);;//检查第2行主方法声明代码
        } catch (NullPointerException ex) {
            System.out.println("对象使用前，一定要实例化。");
        } catch (FileNotFoundException ex) {
            System.out.println("文件不存在，请检查后重试");
        } catch (IOException ex) {
            System.out.println("读取文件时捕获异常：" + ex);
        } finally {
            try {
                br.close();//这个关闭文件要放在finally语句块中。
            } catch (IOException ex) {
                System.out.println("关闭文件时捕获到异常：" + ex);
            }
        }
        System.out.println("检查完毕，没有发现错误。");
    }
}
