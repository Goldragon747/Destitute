package edu.neumont.csc150.destitute.game.model.tiles;

import edu.neumont.csc150.destitute.game.model.Player;
import edu.neumont.csc150.destitute.game.model.buildings.Building;
import edu.neumont.csc150.destitute.game.model.units.Unit;

public class Tile {
	private Player player;
	private Unit unit;
	private Building building;
	private String resourceName;
	private boolean passable;
	//TODO ICON
	public Player getPlayer() {
		return player;
	}
	public void setPlayer(Player player) {
		this.player = player;
	}
	public Unit getUnit() {
		return unit;
	}
	public void setUnit(Unit unit) {
		this.unit = unit;
	}
	public Building getBuilding() {
		return building;
	}
	public void setBuilding(Building building) {
		this.building = building;
	}
	public String getResourceName() {
		return resourceName;
	}
	public void setResourceName(String resourceName) {
		this.resourceName = resourceName;
	}
	public boolean isPassable() {
		return passable;
	}
	public void setPassable(boolean passable) {
		this.passable = passable;
	}
}
