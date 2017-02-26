package edu.neumont.csc150.destitute.game.model.tiles;

public class Horse extends Tile{
	private static final long serialVersionUID = -5329289819809116634L;

	public Horse() {
		super.setResourceName(Resource.Horse);
		super.setPassable(true);
	}
}
