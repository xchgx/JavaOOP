/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.xchgx.demo.other02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author 陈老师 现代管理学院
 */
public class ServerSocketTest {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(12345);
        while(true){
            Socket socket = serverSocket.accept();
            //输入输出流
            BufferedReader is = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter pw = new PrintWriter(socket.getOutputStream());
            //读取数据
            String line;
            while((line=is.readLine()) != null ){
                //回复数据
                pw.println(line);//写阻塞
                pw.flush();
            }
        }
    }
}
