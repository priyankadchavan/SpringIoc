package com.jsp.demo;

public class Car {
private String brand;
private String name;
public String getBrand() {
	return brand;
}
public void setBrand(String brand) {
	this.brand = brand;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
 public void printcarDetails() {
	 System.out.println("========Car==========");
	 System.out.println(brand);
	 System.out.println(name);
 }
}
