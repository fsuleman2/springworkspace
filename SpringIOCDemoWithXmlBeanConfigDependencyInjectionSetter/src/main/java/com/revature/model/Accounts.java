package com.revature.model;

public class Accounts {
private int accountId=101;
private String accountName="Suleman";
private Sales salesSetterObject;

public void showAccounts() {
	salesSetterObject.getSales();
	System.out.println("Sales Details");
	
}










public int getAccountId() {
	return accountId;
}
public void setAccountId(int accountId) {
	this.accountId = accountId;
}
public String getAccountName() {
	return accountName;
}
public void setAccountName(String accountName) {
	this.accountName = accountName;
}
public Sales getSalesSetterObject() {
	return salesSetterObject;
}
public void setSalesSetterObject(Sales salesSetterObject) {
	this.salesSetterObject = salesSetterObject;
}

}
