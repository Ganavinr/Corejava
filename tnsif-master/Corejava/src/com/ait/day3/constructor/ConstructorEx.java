package com.ait.day3.constructor;

public class ConstructorEx {
	private String customerName;
	private int customerId;
	private String customerCity;
	
	public ConstructorEx(){
		System.out.println("I am a Constructor");
		String customerName;
		int customerId;
		String customerCity;
	}
//	public ConstructorEx(String customerName, int customerId, String customerCity) {
//		super();
//		this.customerName = customerName;
//		this.customerId = customerId;
//		this.customerCity = customerCity;
//	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerCity() {
		return customerCity;
	}
	public void setCustomerCity(String customerCity) {
		this.customerCity = customerCity;
	}
	@Override
	public String toString() {
		return "ConstructorEx [customerName=" + customerName + ", customerId=" + customerId + ", customerCity="
				+ customerCity + "]";
	}
	
	
	
}
