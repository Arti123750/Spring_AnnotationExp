package com.annotation.exp12;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main_Class123 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BeanFactory context=new ClassPathXmlApplicationContext("Beans3.xml");
		BankAccount b1=(BankAccount) context.getBean("binfo");
		
		b1.setCust_AccountId(2563);
		b1.setCust_Name("Arati Doifode");
		
		
		System.out.println("Customer Account No: "+b1.getCust_AccountId());
		System.out.println("Customer Name: "+b1.getCust_Name());
		System.out.print("Customer Deposit ");
		b1.depositInfo();

	}

}
