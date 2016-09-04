package com.jinantech.socketService;



import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Map;

import javax.annotation.Resource;

import com.google.gson.Gson;
import com.jinantech.controller.TransmissionLocationWebSocket;
import com.jinantech.socketService.domain.ClientInfo;


public class LocThread extends Thread {

	static Object lock = new Object();
	static volatile  boolean flag = true;

	Socket socket;
	InputStream inputStream;
	OutputStream outputStream;
	public LocThread(Socket socket) {
		this.socket = socket;
		start(); // 启动线程 
	}
	public void run() {
				byte[] buf = new byte[1024];
				try {
					// 初始化流
					outputStream = socket.getOutputStream();
					inputStream = socket.getInputStream();
					// 读取数据
			/*	int len = inputStream.read(buf);
				System.out.println(new String(buf,0,len));
				// 反馈数据
				outputStream.write("收到".getBytes());
				*/
					int len = 0;
					System.out.println("进入阻塞 ........准备read");
					while ((len = (inputStream.read(buf))) > 0) {
						String json = new String(buf, 0, len);
						System.out.println(json);
						Gson gson = new Gson();
						/*
						ClientInfo clientInfos = gson.fromJson(json, ClientInfo.class);
						double latitude = clientInfos.getLatitude();
						double longitude  = clientInfos.getLongitude();
						String numbers = clientInfos.getNumbers();
	                    */
	                    //操作，通过websocket发送给客户端
						TransmissionLocationWebSocket.sendUserLocal(json);
					
					}
					System.out.println("阻塞结束 .........read结束.");
				} catch (Exception e) {
					e.printStackTrace();
				} finally {
					close();
				}
			close();
		}
	/**
	 * 
	 * 关闭流和连接
	 * 
	 */
	private void close() {
		try {
			// 关闭流和连接
			outputStream.close();
			inputStream.close();
			socket.close();
		} catch (Exception e) {
		}
	}
}