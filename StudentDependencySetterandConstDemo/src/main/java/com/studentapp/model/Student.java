package com.studentapp.model;

public class Student {
	private int sId = 101;
	private String sName= "Suleman";
	
private Department deptConstructorObj;
public void dispStudentDetails() {
	System.out.println("Student ID "+ sId);
	System.out.println("Student Name: "+sName);
	deptConstructorObj.getDeptDetails();
}

public Student(Department deptConstructorObj) {
	super();
	this.deptConstructorObj = deptConstructorObj;
}


}
