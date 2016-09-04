package com.jinantech.controller;

import java.io.IOException;

import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;

import org.springframework.stereotype.Component;

import com.google.gson.Gson;
import com.jinantech.socketService.domain.ClientInfo;

@ServerEndpoint("/getLocation")
@Component
public class TransmissionLocationWebSocket {
	private static Session session;
	/*
     *链接成功后的回掉
     */
    @OnOpen
    public void onOpen(Session session) {
    	System.out.println("链接成功");
        this.session = session;
    }
    public static void sendUserLocal(String clientInfoJson){
    	try {
    		if(session!=null)
			session.getBasicRemote().sendText(clientInfoJson);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    
}
