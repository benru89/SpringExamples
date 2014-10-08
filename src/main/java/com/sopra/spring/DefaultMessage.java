package com.sopra.spring;

public class DefaultMessage {
	private String message = "Spring is fun!!!";
	
	/** Gets message */
	public String getMessage(){
		return message;
	}
	
	/** Sets message */
	public void setMessage(final String message){
		this.message=message;
	}

}
