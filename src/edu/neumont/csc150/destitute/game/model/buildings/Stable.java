package edu.neumont.csc150.destitute.game.model.buildings;

public class Stable extends Building {
	public Stable(){
		super.setHealth(2);        
		super.setMarkCost(40);    
		super.setLumberCost(30); 
		super.setStoneCost(10);   
		super.setName("Stable");	     
	}
}
