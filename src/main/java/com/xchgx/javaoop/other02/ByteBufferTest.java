/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.xchgx.javaoop.other02;

import java.io.IOException;
import java.nio.ByteBuffer;

/**
 *
 * @author 陈老师 现代管理学院
 */
public class ByteBufferTest {
    public static void main(String[] args) throws IOException {
        ByteBuffer buf = ByteBuffer.allocate(256);
        while(true){
            //从标准输入流读入一个字符
            int c = System.in.read();
            //当读到输入流结束时推出循环
            if(c==-1){
                break;
            }
            //把读入的字符写入ByteBuffer中
            buf.put((byte)c);
            
            //当读完一行时，输出手机的字符
            if(c=='\n'){
                //调用flip使limit变为当前的position的值，position变为0
                //为接下来从ByteBuffer读取做准备
                buf.flip();
                //构件一个byte数组
                byte[] content = new byte[buf.limit()];
                //从ByteBuffer中读取数据到 byte 数组中
                buf.get(content);
                
                //把byte数组的内容写到标准输出
                System.out.println(new String(content));
                //调用 clear() 使 position 变为0 ，limit变为 capacity 的值
                //为接下来写入数据到 ByteBuffer 中做准备
                buf.clear();
            }
        }
    }
}
