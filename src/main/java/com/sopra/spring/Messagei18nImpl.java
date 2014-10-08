package com.sopra.spring;

import java.util.Locale;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Messagei18nImpl implements Messagei18n{
	
	private AbstractApplicationContext context;
	private Locale locale = Locale.getDefault();
	
	public void init(){
		context = new ClassPathXmlApplicationContext("applicationContext.xml");
	}
	
	public void cleanup(){
		if (context != null){
			context.close();
		}
	}
	
	@Override
	public String getMessage(String key) {
		locale = Locale.getDefault();
		return context.getMessage(key, null, locale);
	}

	@Override
	public String getMessage(String key, Object[] args) {
		locale = Locale.getDefault();
		return context.getMessage(key, args, locale);
	}

}
