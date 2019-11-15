package com.spring.annotation_demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main_Class12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context=new ClassPathXmlApplicationContext("Beans1.xml");
		TeacherInfo t1=(TeacherInfo) context.getBean("tinfo");
		
		System.out.println("ID: "+t1.getT_Id());
		System.out.println("Name: "+t1.getT_Name());
		
	}

}
