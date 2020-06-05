/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.xchgx.javaoop.course18.ketangbiji04;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * 测试 检查语法功能类
 * @author 陈老师 现代管理学院
 */
public class CheckGrammarTest {
    public static void main(String[] args) {//已经是系统边界了
        CheckGrammar cg = new CheckGrammar();
        try {
            cg.start();
        } catch (IOException ex) {
            System.out.println("文件读写失败");
        } catch (GrammarException ex) {
            System.out.println("异常发生在：\n"
                    + "行:"+ex.row
                    +"\n列："+ex.column
                    +"\n错误单词："+ex.word
                    +"\n错误消息："+ex.getMessage() );
        }
    }
}
