package com.spring.annotation_demo;

import org.springframework.beans.factory.annotation.Required;

public class TeacherInfo {
	
	private int t_Id;
	private String t_Name;
	
	public int getT_Id() {
		return t_Id;
	}
	@Required
	public void setT_Id(int t_Id) {
		this.t_Id = t_Id;
	}
	public String getT_Name() {
		return t_Name;
	}
	@Required
	public void setT_Name(String t_Name) {
		this.t_Name = t_Name;
	}
	
	
	

}
