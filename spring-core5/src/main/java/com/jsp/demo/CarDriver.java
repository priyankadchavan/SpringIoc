package com.jsp.demo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class CarDriver {
public static void main(String[] args) {
	ClassPathResource classPathResource=new ClassPathResource("myspring.xml");
	BeanFactory beanFactory = new XmlBeanFactory(classPathResource);
	Car c=(Car)beanFactory.getBean("mycar");
	c.printcarDetails();
}
}
