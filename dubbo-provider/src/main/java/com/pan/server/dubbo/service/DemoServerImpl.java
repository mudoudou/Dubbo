package com.pan.server.dubbo.service;

/***
 * 
 * @author PANFEI
 *
 */
public class DemoServerImpl implements DemoServer {

	
	public String sayHello(String str) {
		str="你好,Dubbo-Consumer："+str;
		System.out.println(str);
		return str;
	}

}
