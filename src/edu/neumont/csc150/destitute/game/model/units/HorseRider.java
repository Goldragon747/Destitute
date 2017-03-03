package edu.neumont.csc150.destitute.game.model.units;

public class HorseRider extends Unit {
	public HorseRider(){
		super.setName("Horse Rider");
		super.setHealth(3); 
		super.setTotalMovement(2);
		super.setCurrentMovement(2);
		super.setMarkCost(40);   
		super.setHorseCost(15);
		super.setAttackDamage(1);
	}
}
