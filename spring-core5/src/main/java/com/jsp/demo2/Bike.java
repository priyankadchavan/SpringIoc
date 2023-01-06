package com.jsp.demo2;

public class Bike {
private String name;
private String brand;

public Bike(String name,String brand){
	this.brand=brand;
	this.name=name;
	
}
public void printDetails() {
	System.out.println("=============bike============");
	System.out.println(name);
	System.out.println(brand);
}

}
