package edu.neumont.csc150.destitute.game.model.units;

public class Hunter extends Unit {
	public Hunter(){
		super.setName("Hunter");
		super.setHealth(1);      
		super.setMarkCost(10);    
		super.setTotalMovement(1);
		super.setCurrentMovement(1);
		super.setAttackDamage(1);
	}
}
