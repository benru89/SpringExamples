package com.sopra.spring;

import org.springframework.beans.factory.annotation.Autowired;

public class HelloWorldImpl implements HelloWorld{

	@Autowired
	private Messagei18n resource;
	
	public void init(){

	}
	
	public void cleanup(){

	}
	
	@Override
	public String sayHello() {
		return resource.getMessage(Messagei18n.MAIN_GUI_HELLOWORLD);
	}

	@Override
	public String sayWelcome(Object[] args) {
		return resource.getMessage(Messagei18n.MAIN_GUI_WELLCOMEMESSAGE,args);
	}



}
