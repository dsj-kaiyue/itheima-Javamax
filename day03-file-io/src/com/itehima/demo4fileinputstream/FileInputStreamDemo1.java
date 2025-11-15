package com.itehima.demo4fileinputstream;

import java.io.*;

public class FileInputStreamDemo1 {
    public static void main(String[] args) throws IOException {
//        InputStream inputStream = new FileInputStream(new File("day03-file-io/src/kaiyue.txt"));
        FileInputStream fileInputStream = new FileInputStream("day03-file-io/src/kaiyue.txt");


        //读取文件中的字节
        //定义一个变量记住每次读取的一个字节
        byte[] buffer =new byte[3];

        int len;
        while((len = fileInputStream.read(buffer)) != -1){
            String str=new String(buffer,0,len);
            System.out.println(str);

        }





    }
}
