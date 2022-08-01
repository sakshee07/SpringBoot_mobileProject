package com.mobile.bl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Airtel airtel = context.getBean("airtel", Airtel.class);
		airtel.activeService();
		
	}

}
