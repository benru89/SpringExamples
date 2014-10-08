package com.sopra.spring;

public class ConstructorMessage {
	private String message = "Spring !!!";
	
	public ConstructorMessage(String message1,String message2){
		this.message= message1.concat(message2);
	}
	
	/** Gets message */
	public String getMessage(){
		return message;
	}
	
	/** Sets message */
	public void setMessage(final String message){
		this.message=message;
	}

}
