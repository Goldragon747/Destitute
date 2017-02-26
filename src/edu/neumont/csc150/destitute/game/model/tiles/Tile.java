package edu.neumont.csc150.destitute.game.model.tiles;

import javax.swing.JButton;

import edu.neumont.csc150.destitute.game.model.Player;
import edu.neumont.csc150.destitute.game.model.buildings.Building;
import edu.neumont.csc150.destitute.game.model.units.Unit;

public abstract class Tile extends JButton{
	private Player player;
	private Unit unit;
	private Building building;
	private Resource type;
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
	public Resource getResourceName() {
		return type;
	}
	public void setResourceName(Resource type) {
		this.type = type;
	}
	public boolean isPassable() {
		return passable;
	}
	public void setPassable(boolean passable) {
		this.passable = passable;
	}
	public Resource getType() {
		return type;
	}
	public void setType(Resource type) {
		this.type = type;
	}
}
