package com.jinantech;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.socket.server.standard.ServerEndpointExporter;

import com.jinantech.socketService.SocketService;

@ComponentScan("com.jinantech")
@SpringBootApplication
public class Application extends WebMvcConfigurerAdapter{
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		SocketService.startTCPService();
	}
	
	//增加拦截器
	@Override
	public void addInterceptors(InterceptorRegistry registry){
		registry.addInterceptor(new RequestLog());
	}
	 @Bean  
	 public ServerEndpointExporter serverEndpointExporter (){  
	    return new ServerEndpointExporter();  
	 }  
	
}
