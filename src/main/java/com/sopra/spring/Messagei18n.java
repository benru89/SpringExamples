package com.sopra.spring;

public interface Messagei18n {
	
	public static String MAIN_GUI_HELLOWORLD = "main.gui.helloWorld";
	
	public static String MAIN_GUI_WELLCOMEMESSAGE = "main.gui.welcomeMessage";
	
	public String getMessage(String key);
	
	public String getMessage(String key,Object[] args);

}
