package edu.neumont.csc150.destitute.game.model.tiles;

public class Water extends Tile{
	private static final long serialVersionUID = -8244484186316346632L;

	public Water(){
		super.setResourceName(Resource.Water);
		super.setPassable(false);
		super.setFog(false);
	}
}
