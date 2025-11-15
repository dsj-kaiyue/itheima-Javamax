package com.itehima.demo4fileinputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamDemo3 {
    public static void main(String[] args) {
//        InputStream inputStream = new FileInputStream(new File("day03-file-io/src/kaiyue.txt"));
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream("day03-file-io/src/kaiyue.txt");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }


        //读取文件中的字节
        //定义一个变量记住每次读取的一个字节
        byte[] buffer = null;
        try {
            buffer = fileInputStream.readAllBytes();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println(new String(buffer));
        char ch='人';
        System.out.println(ch);

    }
}
