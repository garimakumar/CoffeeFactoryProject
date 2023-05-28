package com.example;

public class Cappucinoo implements Coffee{

public String cream;   //data field for setter injection


	public String getCream() {
	return cream;
}

public void setCream(String cream) {
	this.cream = cream;
}

	@Override
	public void TypeOfCoffee() {
		// TODO Auto-generated method stub
		System.out.println("Cap");
	}

	@Override
	public void CostOfCoffee() {
		// TODO Auto-generated method stub
		System.out.println("2$");
	}

	
}
