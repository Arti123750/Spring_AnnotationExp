package com.annotation.exp12;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class BankAccount {
	
	private int cust_AccountId;
	private String cust_Name;
	 
	 @Autowired 
	 @Qualifier("sinfo") 
	SavingAccount s_Acc;
	 
	 

	public int getCust_AccountId() {
		return cust_AccountId;
	}

	public void setCust_AccountId(int cust_AccountId) {
		this.cust_AccountId = cust_AccountId;
	}

	public String getCust_Name() {
		return cust_Name;
	}

	public void setCust_Name(String cust_Name) {
		this.cust_Name = cust_Name;
	}

	public SavingAccount getS_Acc() {
		return s_Acc;
	}

	public void setS_Acc(SavingAccount s_Acc) {
		this.s_Acc = s_Acc;
	}
	public void depositInfo()
	{
		s_Acc.depositInfo();
	}

	@Override
	public String toString() {
		return "BankAccount [s_Acc=" + s_Acc + "]";
	}
	
	
	
}
