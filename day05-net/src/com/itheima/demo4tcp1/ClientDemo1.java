package com.itheima.demo4tcp1;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class ClientDemo1 {
    public static void main(String[] args) throws IOException {
        //创建客户端
        Socket socket=new Socket("127.0.0.1",8080);
        //获取输出流
        OutputStream os = socket.getOutputStream();

        //特殊数据流
        DataOutputStream dos = new DataOutputStream(os);
        dos.writeInt(1);
        dos.writeUTF("我想你啦");

        //关闭
        socket.close();




    }

}
