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
}
