package com.itheima.demo5tcp2;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class ClientDemo1 {
    public static void main(String[] args) throws IOException {
        //创建客户端
        Socket socket=new Socket("127.0.0.1",8080);
        System.out.println("=====客户端启动了=======");
        //获取输出流
        OutputStream os = socket.getOutputStream();

        //特殊数据流
        DataOutputStream dos = new DataOutputStream(os);

        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("请说");
            String msg= scanner.nextLine();
            if ("exit".equals(msg)){
                System.out.println("退出成功");
                dos.close();
                socket.close();
                break;
            }
            dos.writeUTF(msg);
            //刷新
            dos.flush();
        }
    }

}
