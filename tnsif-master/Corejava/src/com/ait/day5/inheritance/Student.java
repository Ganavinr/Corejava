package com.ait.day5.inheritance;

public class Student extends Citizen{
	
	public Student(String address, String name, String aadharNo, int phNo,int rollNo,String collegeName) {
		super(address, name, aadharNo, phNo);
		this.rollNo=rollNo;
		this.collegeName=collegeName;
		
	}
	private int rollNo;
	private String collegeName;
	
	
	
	
	
	
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", collegeName=" + collegeName + ", getAddress()=" + getAddress()
				+ ", getName()=" + getName() + ", getAadharNo()=" + getAadharNo() + ", getPhNo()=" + getPhNo() + "]";
	}
	
	

}
