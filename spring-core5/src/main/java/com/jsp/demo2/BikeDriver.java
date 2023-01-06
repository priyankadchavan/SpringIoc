package com.jsp.demo2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
	public class BikeDriver {
	public static void main(String[] args) {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("myspring.xml");
		Bike b=(Bike)applicationContext.getBean("mybike");
		b.printDetails();
	}

}
