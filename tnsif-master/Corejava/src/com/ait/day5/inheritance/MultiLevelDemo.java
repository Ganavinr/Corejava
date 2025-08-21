package com.ait.day5.inheritance;

public class MultiLevelDemo {

	public static void main(String[] args) {
		City obj=new City();
		obj.setArea(200);
		obj.setCapital("Delhi");
		obj.setCityName("Bangalore");
		obj.setCountryName("India");
		obj.setLanguage("Kannada");
		obj.setStateName("Karnataka");
		
		System.out.println(obj);

	}

}
