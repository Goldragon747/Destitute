package edu.neumont.csc150.destitute.game.model.buildings;

public class Barracks extends Building {
	public Barracks(){
		super.setHealth(3);
		super.setMarkCost(50);
		super.setLumberCost(30);
		super.setStoneCost(30);
		super.setName("Barracks");
	}
}
