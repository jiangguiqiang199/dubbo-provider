package com.creditease.service.impl;
import com.creditease.service.IDubboService;


public class DubboServiceImpl implements IDubboService {

	public void sayHello(String username) {
		System.out.println("hello "+username+"======================");
	}

}
