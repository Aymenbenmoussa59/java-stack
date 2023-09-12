package com.zoo.keeper;

public class Bat extends Mammal {
	
	public void BatEnergy() {
		this.setEnergy(300);
	}
	
	
	public void fly() {
		System.out.println("sound fly of bat");
		this.setEnergy(this.getEnergy()-50);
		
	}
	
	public void EatHumain() {
		this.setEnergy(this.getEnergy()+25);
	}
	
	public void attackTown() {
		System.out.println("sound of fire");
		this.setEnergy(this.getEnergy()-100);
	}
	
	
}
