package edu.neumont.csc150.destitute.game.model.tiles;

public class Lumber extends Tile{
	private static final long serialVersionUID = 5363184590779743861L;

	public Lumber() {
		super.setResourceName(Resource.Lumber);
		super.setPassable(true);
	}
}
