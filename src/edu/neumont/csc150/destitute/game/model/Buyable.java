package edu.neumont.csc150.destitute.game.model;

public abstract class Buyable {
	private String name;
	private Player player;
	private int health;
	private int markCost;
	private int lumberCost;
	private int stoneCost;
	private int horseCost;
	private int moveSpeed;
	
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
	public int getHorseCost() {
		return horseCost;
	}
	public void setHorseCost(int horseCost) {
		this.horseCost = horseCost;
	}
	public int getMoveSpeed() {
		return moveSpeed;
	}
	public void setMoveSpeed(int moveSpeed) {
		this.moveSpeed = moveSpeed;
	}
	public Player getPlayer() {
		return player;
	}
	public void setPlayer(Player player) {
		this.player = player;
	}
}
