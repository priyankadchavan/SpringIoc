package com.jsp.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class CarDriverApp {
	public static void main(String[] args) {
		//ClassPathResource classPathResource=new ClassPathResource("myspring.xml");
		ApplicationContext applicationContext= new ClassPathXmlApplicationContext("myspring.xml");
		Car c=(Car)applicationContext.getBean("mycar");
		c.printcarDetails();
	}

}
