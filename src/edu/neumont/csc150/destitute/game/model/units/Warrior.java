package edu.neumont.csc150.destitute.game.model.units;



public class Warrior extends Unit{
	public Warrior(){
		super.setName("Warrior");
		super.setHealth(4);      
		super.setMarkCost(30);   
		super.setStoneCost(30); 
		super.setTotalMovement(1);
		super.setCurrentMovement(1); 
		super.setAttackDamage(2);
	}
	
}
