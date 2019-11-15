package com.annotation.demo123;

import org.springframework.beans.factory.annotation.Autowired;

public class Cars {
	
	private int car_Id;
	private String car_Name;
	
	SpotrsCar scar;
	
	
	
	@Autowired 
	public Cars(SpotrsCar scar) {
		super();
		this.scar = scar;
	}
	
	public int getCar_Id() {
		return car_Id;
	}
	public void setCar_Id(int car_Id) {
		this.car_Id = car_Id;
	}
	public String getCar_Name() {
		return car_Name;
	}
	public void setCar_Name(String car_Name) {
		this.car_Name = car_Name;
	}
	public SpotrsCar getScar() {
		return scar;
	}
	public void setScar(SpotrsCar scar) {
		this.scar = scar;
	}
	public void checkSpeed() {
		scar.checkSpeed();
		
	}
	
}
