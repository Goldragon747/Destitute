package edu.neumont.csc150.destitute.game.model.tiles;

public class Grass extends Tile{
	private static final long serialVersionUID = -6623692767927182116L;

	public Grass() {
		super.setResourceName(Resource.Grass);
		super.setPassable(true);
	}
}
