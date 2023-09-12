package com.zoo.keeper;

public class Mammal {
	private int Energy=100;
	
	public void displayEnergy() {
		System.out.println("Mammal Energy is : "+this.Energy);
	}
	
	public int getEnergy() {
		return this.Energy;
	}
	
	public void setEnergy(int Energy) {
		this.Energy = Energy;
	}
}
