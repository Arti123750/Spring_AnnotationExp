package com.demo.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//import com.howtodoinjava.core.beans.DemoManager;
//import com.howtodoinjava.core.config.ApplicationConfiguration;

public class Main_Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new AnnotationConfigApplicationContext(Cofiguration_Class.class);
		StudInformation s1 = (StudInformation) context.getBean("sinfo");
		
		System.out.println("Student id: "+s1.getId());
		System.out.println("Student Name: "+s1.getName());
		System.out.println("Student Address: "+s1.getAddress());
	    
	}

	}


