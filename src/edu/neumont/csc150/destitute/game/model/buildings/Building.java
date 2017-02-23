package edu.neumont.csc150.destitute.game.model.buildings;

public abstract class Building {
	
	private String name;
	private int health;
	private int markCost;
	private int lumberCost;
	private int stoneCost;
	
	public int getStoneCost() {
		return stoneCost;
	}
	public void setStoneCost(int stoneCost) {
		this.stoneCost = stoneCost;
	}
	public int getLumberCost() {
		return lumberCost;
	}
	public void setLumberCost(int lumberCost) {
		this.lumberCost = lumberCost;
	}
	public int getMarkCost() {
		return markCost;
	}
	public void setMarkCost(int markCost) {
		this.markCost = markCost;
	}
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
