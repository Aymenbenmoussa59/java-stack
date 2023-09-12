package com.zoo.keeper;

public class Gorilla extends Mammal {
	
	public void throwSomething() {
		System.out.println("the gorilla has thrown something");
		this.setEnergy(this.getEnergy()-5);
		
	}
	public void eatBananas() {
		System.out.println("the gorilla satisfaction");
		this.setEnergy(this.getEnergy()+10);
		
	}
	public void climb() {
		System.out.println("the gorilla has climbed a tree");
		this.setEnergy(this.getEnergy()-10);
		
	}
}
