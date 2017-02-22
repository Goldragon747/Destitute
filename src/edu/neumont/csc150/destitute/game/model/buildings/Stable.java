package edu.neumont.csc150.destitute.game.model.buildings;

public class Stable extends Building {
	public Stable(int health, int markCost, int lumberCost,int stoneCost){
		super.setHealth(health);
		super.setMarkCost(markCost);
		super.setLumberCost(lumberCost);
		super.setStoneCost(stoneCost);
		super.setName("Stable");
	}
}
