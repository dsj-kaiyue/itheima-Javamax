package com.itehima.demo1file;

import java.io.File;

public class FileDemo1 {
    public static void main(String[] args) {
        String path="D:\\BaiduNetdiskDownload\\4-2025下半年翻译练习.pdf";

        File file=new File(path);
        System.out.println(file.length());
        System.out.println(file.getName());
        System.out.println(file.isFile());
        System.out.println(file.isDirectory());

        //相对路径
        String path2="day03-file-io/src/kaiyue.txt";
        File file1=new File(path);
        System.out.println(file1.length());
        System.out.println(file1.getName());
        System.out.println(file1.isFile());
        System.out.println(file1.isDirectory());



    }
}
