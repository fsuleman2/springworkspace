package com.revature.model;

public class Accounts {
private Sales salesConstructorObj;

public void showAccounts() {
	salesConstructorObj.getSales();
	System.out.println("Sales Details");
	
}

public Accounts(Sales salesConstructorObj) {
	super();
	this.salesConstructorObj = salesConstructorObj;
}




}
