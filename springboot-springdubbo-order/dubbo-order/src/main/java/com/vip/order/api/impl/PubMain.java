package com.vip.order.api.impl;

import com.alibaba.dubbo.container.Main;

public class PubMain {
	public static void main(String[] args) {
		
		//在不适用tomcat服务器的情况下，向dubbo发布服务，
		Main.main(args);
	
	}

}
