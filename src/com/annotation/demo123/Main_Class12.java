package com.annotation.demo123;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main_Class12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context=new ClassPathXmlApplicationContext("Beans2.xml");
		Cars c1=(Cars) context.getBean("cinfo");
		//SpotrsCar s1= (SpotrsCar) context.getBean("sinfo");
		
		c1.setCar_Id(10101);
		c1.setCar_Name("BMW");
		 
		System.out.println("Car Id: "+c1.getCar_Id());
		System.out.println("Car Name: "+c1.getCar_Name());
		
		
		 System.out.println("Sport car Speed: ");
		 c1.checkSpeed();
		 

	}

}
