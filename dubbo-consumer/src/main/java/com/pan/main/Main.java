package com.pan.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pan.server.dubbo.service.DemoServer;
/***
 * 
 * @author PANFEI
 *
 */
public class Main {

	public static void main(String[] args) throws InterruptedException {
		int i = 0;
		while (i++ < 10) {
			SayHello();
			Thread.sleep(5000);
		}

	}

	/**
	 * 客户端方法中调用服务端的service
	 */
	public static void SayHello() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] { "applicationConsumer.xml" });
		context.start();
		DemoServer demoServer = (DemoServer) context.getBean("demoService");
		System.out.println(demoServer.sayHello("你好，Dubbo-Provider"));
	}

}
