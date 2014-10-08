package com.sopra.spring;

public class HelloWorldImpl implements HelloWorld{

	private String message;
	
	public void init(){
		this.setMessage("hallo!!!");
	}
	
	public void cleanup(){
		this.setMessage(null);
	}
	
	@Override
	public String sayHello() {
		return message;
	}

	@Override
	public String saySomethingElse(String something) {
		this.setMessage(something);
		return message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
