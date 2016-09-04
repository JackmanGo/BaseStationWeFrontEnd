package com.jinantech.socketService;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SocketService {
	public static void startTCPService() {
		 //定义一个集合来保持所以上线的客户端
	   Socket socket = null;
	   ServerSocket serviceSocket =null;
		try {
			//服务器端接收消息的类。定制端口号为8888
			 serviceSocket = new ServerSocket(10000);
			 System.out.println("服务器已经启动");
			 while(true){
					//获取socket。这个方法是阻塞式的
				    System.out.println("进入阻塞......");
					socket = serviceSocket.accept();
					 System.out.println("阻塞结束......");
					//一但获取连接后就开子线程来处理
				  new LocThread(socket);
			 }
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			 //释放资源
		      try {
		        serviceSocket.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
