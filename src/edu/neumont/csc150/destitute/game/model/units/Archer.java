package edu.neumont.csc150.destitute.game.model.units;

public class Archer extends Unit {
	public Archer(){
		super.setName("Archer");
		super.setHealth(2); 
		super.setTotalMovement(1);
		super.setCurrentMovement(1);
		super.setMarkCost(40);   
		super.setLumberCost(40);
		super.setAttackDamage(1);
		super.setCurrentAttacks(1);
		super.setTotalAttacks(1);
	}
}
