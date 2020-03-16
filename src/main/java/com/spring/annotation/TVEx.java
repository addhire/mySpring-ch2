package com.spring.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TVEx {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
		TV tv = (TV)ctx.getBean("lg");
		tv.turnOn();
		tv.soundUp();
		tv.soundDown();
		tv.turnOff();
		
	}

}
