package edu.neumont.csc150.destitute.game.model.tiles;

public class Stone extends Tile{
	private static final long serialVersionUID = 1997364089615685461L;

	public Stone(){
		super.setResourceName(Resource.Stone);
		super.setPassable(true);
		super.setFog(true);
	}
}
