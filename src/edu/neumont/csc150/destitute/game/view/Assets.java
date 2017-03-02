package edu.neumont.csc150.destitute.game.view;

import javax.swing.ImageIcon;

public class Assets{
	private ImageIcon water;
	private ImageIcon grass;
	private ImageIcon stone;
	private ImageIcon lumber;
	private ImageIcon horse;
	
	private ImageIcon p1Archer;
	private ImageIcon p1Barracks;
	private ImageIcon p1Hunter;
	private ImageIcon p1Lumbermill;
	private ImageIcon p1Quarry;
	private ImageIcon p1Rider;
	private ImageIcon p1Settlement;
	private ImageIcon p1Stable;
	private ImageIcon p1Warrior;
	
	private ImageIcon p2Archer;
	private ImageIcon p2Barracks;
	private ImageIcon p2Hunter;
	private ImageIcon p2Lumbermill;
	private ImageIcon p2Quarry;
	private ImageIcon p2Rider;
	private ImageIcon p2Settlement;
	private ImageIcon p2Stable;
	private ImageIcon p2Warrior;
	
	private ImageIcon p1RoadAll;
	private ImageIcon p1RoadBottomRight;
	private ImageIcon p1RoadLeftBottom;
	private ImageIcon p1RoadLeftBottomRight;
	private ImageIcon p1RoadLeftRight;
	private ImageIcon p1RoadTopBottom;
	private ImageIcon p1RoadTopBottomRight;
	private ImageIcon p1RoadTopLeft;
	private ImageIcon p1RoadTopLeftBottom;
	private ImageIcon p1RoadTopLeftRight;
	private ImageIcon p1RoadTopRight;

	private ImageIcon p2RoadAll;
	private ImageIcon p2RoadBottomRight;
	private ImageIcon p2RoadLeftBottom;
	private ImageIcon p2RoadLeftBottomRight;
	private ImageIcon p2RoadLeftRight;
	private ImageIcon p2RoadTopBottom;
	private ImageIcon p2RoadTopBottomRight;
	private ImageIcon p2RoadTopLeft;
	private ImageIcon p2RoadTopLeftBottom;
	private ImageIcon p2RoadTopLeftRight;
	private ImageIcon p2RoadTopRight;	
	

	public Assets(int mapsize) {
		water = new ImageIcon("Assets\\resource\\" + mapsize + "x" + mapsize + "\\water.png");
		grass = new ImageIcon("Assets\\resource\\" + mapsize + "x" + mapsize + "\\grass.png");
		lumber = new ImageIcon("Assets\\resource\\" + mapsize + "x" + mapsize + "\\lumber.png");
		stone = new ImageIcon("Assets\\resource\\" + mapsize + "x" + mapsize + "\\stone.png");
		horse = new ImageIcon("Assets\\resource\\" + mapsize + "x" + mapsize + "\\horse.png");
		
		p1Archer = new ImageIcon("Assets\\player1\\" + mapsize + "x" + mapsize + "\\p1_archer.png");
		p1Barracks = new ImageIcon("Assets\\player1\\" + mapsize + "x" + mapsize + "\\p1_barracks.png");
		p1Hunter = new ImageIcon("Assets\\player1\\" + mapsize + "x" + mapsize + "\\p1_hunter.png");
		p1Lumbermill = new ImageIcon("Assets\\player1\\" + mapsize + "x" + mapsize + "\\p1_lumbermill.png");
		p1Quarry = new ImageIcon("Assets\\player1\\" + mapsize + "x" + mapsize + "\\p1_quarry.png");
		p1Rider = new ImageIcon("Assets\\player1\\" + mapsize + "x" + mapsize + "\\p1_rider.png");
		p1Settlement = new ImageIcon("Assets\\player1\\" + mapsize + "x" + mapsize + "\\p1_settlement.png");
		p1Stable = new ImageIcon("Assets\\player1\\" + mapsize + "x" + mapsize + "\\p1_stable.png");
		p1Warrior = new ImageIcon("Assets\\player1\\" + mapsize + "x" + mapsize + "\\p1_warrior.png");
		
		p2Archer = new ImageIcon("Assets\\player2\\" + mapsize + "x" + mapsize + "\\p2_archer.png");
		p2Barracks = new ImageIcon("Assets\\player2\\" + mapsize + "x" + mapsize + "\\p2_barracks.png");
		p2Hunter = new ImageIcon("Assets\\player2\\" + mapsize + "x" + mapsize + "\\p2_hunter.png");
		p2Lumbermill = new ImageIcon("Assets\\player2\\" + mapsize + "x" + mapsize + "\\p2_lumbermill.png");
		p2Quarry = new ImageIcon("Assets\\player2\\" + mapsize + "x" + mapsize + "\\p2_quarry.png");
		p2Rider = new ImageIcon("Assets\\player2\\" + mapsize + "x" + mapsize + "\\p2_rider.png");
		p2Settlement = new ImageIcon("Assets\\player2\\" + mapsize + "x" + mapsize + "\\p2_settlement.png");
		p2Stable = new ImageIcon("Assets\\player2\\" + mapsize + "x" + mapsize + "\\p2_stable.png");
		p2Warrior = new ImageIcon("Assets\\player2\\" + mapsize + "x" + mapsize + "\\p2_warrior.png");
		
		p1RoadAll = new ImageIcon("Assets\\player1\\roads\\" + mapsize + "x" + mapsize + "\\p1_road_all.png");
		p1RoadBottomRight = new ImageIcon("Assets\\player1\\roads\\" + mapsize + "x" + mapsize + "\\p1_road_bottom_right.png");
		p1RoadLeftBottom = new ImageIcon("Assets\\player1\\roads\\" + mapsize + "x" + mapsize + "\\p1_road_left_bottom.png");
		p1RoadLeftBottomRight = new ImageIcon("Assets\\player1\\roads\\" + mapsize + "x" + mapsize + "\\p1_road_bottom_right.png");
		p1RoadLeftRight = new ImageIcon("Assets\\player1\\roads\\" + mapsize + "x" + mapsize + "\\p1_road_left_right.png");
		p1RoadTopBottom = new ImageIcon("Assets\\player1\\roads\\" + mapsize + "x" + mapsize + "\\p1_road_top_bottom.png");
		p1RoadTopBottomRight = new ImageIcon("Assets\\player1\\roads\\" + mapsize + "x" + mapsize + "\\p1_road_top_bottom_right.png");
		p1RoadTopLeft = new ImageIcon("Assets\\player1\\roads\\" + mapsize + "x" + mapsize + "\\p1_road_top_left.png");
		p1RoadTopLeftBottom = new ImageIcon("Assets\\player1\\roads\\" + mapsize + "x" + mapsize + "\\p1_road_top_left_bottom.png");
		p1RoadTopLeftRight = new ImageIcon("Assets\\player1\\roads\\" + mapsize + "x" + mapsize + "\\p1_road_top_left_right.png");
		p1RoadTopRight = new ImageIcon("Assets\\player1\\roads\\" + mapsize + "x" + mapsize + "\\p1_road_top_right.png");

		p2RoadAll = new ImageIcon("Assets\\player1\\roads\\" + mapsize + "x" + mapsize + "\\p2_road_all.png");
		p2RoadBottomRight = new ImageIcon("Assets\\player1\\roads\\" + mapsize + "x" + mapsize + "\\p2_road_bottom_right.png");
		p2RoadLeftBottom = new ImageIcon("Assets\\player1\\roads\\" + mapsize + "x" + mapsize + "\\p2_road_left_bottom.png");
		p2RoadLeftBottomRight = new ImageIcon("Assets\\player1\\roads\\" + mapsize + "x" + mapsize + "\\p2_road_bottom_right.png");
		p2RoadLeftRight = new ImageIcon("Assets\\player1\\roads\\" + mapsize + "x" + mapsize + "\\p2_road_left_right.png");
		p2RoadTopBottom = new ImageIcon("Assets\\player1\\roads\\" + mapsize + "x" + mapsize + "\\p2_road_top_bottom.png");
		p2RoadTopBottomRight = new ImageIcon("Assets\\player1\\roads\\" + mapsize + "x" + mapsize + "\\p2_road_bottom_right.png");
		p2RoadTopLeft = new ImageIcon("Assets\\player1\\roads\\" + mapsize + "x" + mapsize + "\\p2_road_top_left.png");
		p2RoadTopLeftBottom = new ImageIcon("Assets\\player1\\roads\\" + mapsize + "x" + mapsize + "\\p2_road_top_left_bottom.png");
		p2RoadTopLeftRight = new ImageIcon("Assets\\player1\\roads\\" + mapsize + "x" + mapsize + "\\p2_road_top_left_right.png");
		p2RoadTopRight = new ImageIcon("Assets\\player1\\roads\\" + mapsize + "x" + mapsize + "\\p2_road_top_right.png");
	} 

	/**
	 * @return the water
	 */
	public ImageIcon getWater() {
		return water;
	}

	/**
	 * @return the grass
	 */
	public ImageIcon getGrass() {
		return grass;
	}

	/**
	 * @return the stone
	 */
	public ImageIcon getStone() {
		return stone;
	}

	/**
	 * @return the lumber
	 */
	public ImageIcon getLumber() {
		return lumber;
	}

	/**
	 * @return the horse
	 */
	public ImageIcon getHorse() {
		return horse;
	}

	/**
	 * @return the p1Archer
	 */
	public ImageIcon getP1Archer() {
		return p1Archer;
	}

	/**
	 * @return the p1Barracks
	 */
	public ImageIcon getP1Barracks() {
		return p1Barracks;
	}

	/**
	 * @return the p1Hunter
	 */
	public ImageIcon getP1Hunter() {
		return p1Hunter;
	}

	/**
	 * @return the p1Lumbermill
	 */
	public ImageIcon getP1Lumbermill() {
		return p1Lumbermill;
	}

	/**
	 * @return the p1Quarry
	 */
	public ImageIcon getP1Quarry() {
		return p1Quarry;
	}

	/**
	 * @return the p1Rider
	 */
	public ImageIcon getP1Rider() {
		return p1Rider;
	}

	/**
	 * @return the p1Settlement
	 */
	public ImageIcon getP1Settlement() {
		return p1Settlement;
	}

	/**
	 * @return the p1Stable
	 */
	public ImageIcon getP1Stable() {
		return p1Stable;
	}

	/**
	 * @return the p1Warrior
	 */
	public ImageIcon getP1Warrior() {
		return p1Warrior;
	}

	/**
	 * @return the p2Archer
	 */
	public ImageIcon getP2Archer() {
		return p2Archer;
	}

	/**
	 * @return the p2Barracks
	 */
	public ImageIcon getP2Barracks() {
		return p2Barracks;
	}

	/**
	 * @return the p2Hunter
	 */
	public ImageIcon getP2Hunter() {
		return p2Hunter;
	}

	/**
	 * @return the p2Lumbermill
	 */
	public ImageIcon getP2Lumbermill() {
		return p2Lumbermill;
	}

	/**
	 * @return the p2Quarry
	 */
	public ImageIcon getP2Quarry() {
		return p2Quarry;
	}

	/**
	 * @return the p2Rider
	 */
	public ImageIcon getP2Rider() {
		return p2Rider;
	}

	/**
	 * @return the p2Settlement
	 */
	public ImageIcon getP2Settlement() {
		return p2Settlement;
	}

	/**
	 * @return the p2Stable
	 */
	public ImageIcon getP2Stable() {
		return p2Stable;
	}

	/**
	 * @return the p2Warrior
	 */
	public ImageIcon getP2Warrior() {
		return p2Warrior;
	}
	

	/**
	 * @return the p1RoadAll
	 */
	public ImageIcon getP1RoadAll() {
		return p1RoadAll;
	}

	/**
	 * @return the p1RoadBottomRight
	 */
	public ImageIcon getP1RoadBottomRight() {
		return p1RoadBottomRight;
	}

	/**
	 * @return the p1RoadLeftBottom
	 */
	public ImageIcon getP1RoadLeftBottom() {
		return p1RoadLeftBottom;
	}

	/**
	 * @return the p1RoadLeftBottomRight
	 */
	public ImageIcon getP1RoadLeftBottomRight() {
		return p1RoadLeftBottomRight;
	}

	/**
	 * @return the p1RoadLeftRight
	 */
	public ImageIcon getP1RoadLeftRight() {
		return p1RoadLeftRight;
	}

	/**
	 * @return the p1RoadTopBottom
	 */
	public ImageIcon getP1RoadTopBottom() {
		return p1RoadTopBottom;
	}

	/**
	 * @return the p1RoadTopBottomRight
	 */
	public ImageIcon getP1RoadTopBottomRight() {
		return p1RoadTopBottomRight;
	}

	/**
	 * @return the p1RoadTopLeft
	 */
	public ImageIcon getP1RoadTopLeft() {
		return p1RoadTopLeft;
	}

	/**
	 * @return the p1RoadTopLeftBottom
	 */
	public ImageIcon getP1RoadTopLeftBottom() {
		return p1RoadTopLeftBottom;
	}

	/**
	 * @return the p1RoadTopLeftRight
	 */
	public ImageIcon getP1RoadTopLeftRight() {
		return p1RoadTopLeftRight;
	}

	/**
	 * @return the p1RoadTopRight
	 */
	public ImageIcon getP1RoadTopRight() {
		return p1RoadTopRight;
	}

	/**
	 * @return the p2RoadAll
	 */
	public ImageIcon getP2RoadAll() {
		return p2RoadAll;
	}

	/**
	 * @return the p2RoadBottomRight
	 */
	public ImageIcon getP2RoadBottomRight() {
		return p2RoadBottomRight;
	}

	/**
	 * @return the p2RoadLeftBottom
	 */
	public ImageIcon getP2RoadLeftBottom() {
		return p2RoadLeftBottom;
	}

	/**
	 * @return the p2RoadLeftBottomRight
	 */
	public ImageIcon getP2RoadLeftBottomRight() {
		return p2RoadLeftBottomRight;
	}

	/**
	 * @return the p2RoadLeftRight
	 */
	public ImageIcon getP2RoadLeftRight() {
		return p2RoadLeftRight;
	}

	/**
	 * @return the p2RoadTopBottom
	 */
	public ImageIcon getP2RoadTopBottom() {
		return p2RoadTopBottom;
	}

	/**
	 * @return the p2RoadTopBottomRight
	 */
	public ImageIcon getP2RoadTopBottomRight() {
		return p2RoadTopBottomRight;
	}

	/**
	 * @return the p2RoadTopLeft
	 */
	public ImageIcon getP2RoadTopLeft() {
		return p2RoadTopLeft;
	}

	/**
	 * @return the p2RoadTopLeftBottom
	 */
	public ImageIcon getP2RoadTopLeftBottom() {
		return p2RoadTopLeftBottom;
	}

	/**
	 * @return the p2RoadTopLeftRight
	 */
	public ImageIcon getP2RoadTopLeftRight() {
		return p2RoadTopLeftRight;
	}

	/**
	 * @return the p2RoadTopRight
	 */
	public ImageIcon getP2RoadTopRight() {
		return p2RoadTopRight;
	}
}
