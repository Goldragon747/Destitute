package edu.neumont.csc150.destitute.game.controller;

import java.util.Random;

import edu.neumont.csc150.destitute.game.model.Buyable;
import edu.neumont.csc150.destitute.game.model.Player;
import edu.neumont.csc150.destitute.game.model.buildings.Barracks;
import edu.neumont.csc150.destitute.game.model.buildings.Building;
import edu.neumont.csc150.destitute.game.model.buildings.LumberMill;
import edu.neumont.csc150.destitute.game.model.buildings.Quarry;
import edu.neumont.csc150.destitute.game.model.buildings.Road;
import edu.neumont.csc150.destitute.game.model.buildings.Settlement;
import edu.neumont.csc150.destitute.game.model.buildings.Stable;
import edu.neumont.csc150.destitute.game.model.tiles.Grass;
import edu.neumont.csc150.destitute.game.model.tiles.Horse;
import edu.neumont.csc150.destitute.game.model.tiles.Lumber;
import edu.neumont.csc150.destitute.game.model.tiles.Resource;
import edu.neumont.csc150.destitute.game.model.tiles.Stone;
import edu.neumont.csc150.destitute.game.model.tiles.Tile;
import edu.neumont.csc150.destitute.game.model.tiles.Water;
import edu.neumont.csc150.destitute.game.model.units.Archer;
import edu.neumont.csc150.destitute.game.model.units.HorseRider;
import edu.neumont.csc150.destitute.game.model.units.Hunter;
import edu.neumont.csc150.destitute.game.model.units.Unit;
import edu.neumont.csc150.destitute.game.model.units.Warrior;
import edu.neumont.csc150.destitute.game.view.Assets;
import edu.neumont.csc150.destitute.game.view.GUI;
import edu.neumont.csc150.destitute.game.view.UserInteractions;
import javafx.scene.paint.Color;

public class Game {
	private GUI gui;
	private UserInteractions UI;
	private Player player1 = new Player();
	private Player player2 = new Player();
	private Player currentPlayer = new Player();
	
	private final int MAP_SIZE = 10;
	private Assets asset;
	private Tile[][] map = new Tile[MAP_SIZE][MAP_SIZE];
	
	private Random gen = new Random();
	
	private final int TOTAL_LUMBER_PER_SIDE = (MAP_SIZE / 2);
	private final int TOTAL_STONE_PER_SIDE = (MAP_SIZE / 3);
	private final int TOTAL_HORSE_PER_SIDE = (MAP_SIZE / 4);
	
	public void run(){
		currentPlayer = player1;
		asset = new Assets(MAP_SIZE);
		initializeMapArray();
		gui = new GUI(this, map, MAP_SIZE);
		UI = new UserInteractions(this.gui);
	}
	public void initializeMapArray() {
		int lumberInTopMap = 0;
		int stoneInTopMap = 0;
		int horseInTopMap = 0;
		
		int lumberInBottomMap = 0;
		int stoneInBottomMap = 0;
		int horseInBottomMap = 0;
		
		int topMap = (MAP_SIZE - 2) / 2;
		int bottomMap = (MAP_SIZE - 1) / 2;
		boolean evenMapSize = MAP_SIZE % 2 == 0;
		for (int i = 0; i < MAP_SIZE; i++){
			for (int j = 0; j < MAP_SIZE; j++) {
				if ((i == 0 && j >= MAP_SIZE - 4) || 
					(i == 1 && j == MAP_SIZE - 1) ||
					(i == 2 && j == MAP_SIZE - 1) ||
					(i == 3 && j == MAP_SIZE - 1) ||
					((evenMapSize && i == MAP_SIZE/2 - 1 & j == MAP_SIZE/2 - 1)) ||
					((evenMapSize && i == MAP_SIZE/2 - 1 & j == MAP_SIZE/2)) ||
					((evenMapSize && i == MAP_SIZE/2 & j == MAP_SIZE/2 - 1)) ||
					((evenMapSize && i == MAP_SIZE/2 & j == MAP_SIZE/2)) ||
					((!evenMapSize && i == (MAP_SIZE - 1)/2 & j == (MAP_SIZE - 1)/2)) ||
					(i == MAP_SIZE - 4 && j == 0) ||
					(i == MAP_SIZE - 3 && j == 0) ||
					(i == MAP_SIZE - 2 && j == 0) ||
					(i == MAP_SIZE - 1 && j <= 3)){
					map[i][j] = new Water();
					map[i][j].setIcon(asset.getWater());
				} else if ((i == MAP_SIZE - (MAP_SIZE - 1) && j == MAP_SIZE - (MAP_SIZE - 1))) {
					map[i][j] = new Grass();
					map[i][j].setIcon(asset.getGrass());
					map[i][j].setBuilding(new Settlement());
					map[i][j].getBuilding().setPlayer(player1);
				} else if ((i == MAP_SIZE - 2 && j == MAP_SIZE - 2)) {
					map[i][j] = new Grass();
					map[i][j].setIcon(asset.getGrass());
					map[i][j].setBuilding(new Settlement());
					map[i][j].getBuilding().setPlayer(player2);
				} else {
					map[i][j] = new Grass();
					map[i][j].setIcon(asset.getGrass());
				}
				System.out.println("i: " + i + " J: " + j + "   " + map[i][j].getResourceName());
				System.out.println("-------------------------------------------------");
			}
		}
		do {
			for (int k = 0; k < MAP_SIZE; k++){
				for (int l = 0; l < MAP_SIZE; l++) {
					int randomTile = gen.nextInt(30);
					if (map[k][l] instanceof Grass && !(map[k][l].getBuilding() instanceof Settlement)) {
						if (randomTile == 1) {
							if (((evenMapSize && k <= topMap) || (!evenMapSize && k <= bottomMap)) &&
								lumberInTopMap < TOTAL_LUMBER_PER_SIDE) {
								map[k][l] = new Lumber();
								map[k][l].setIcon(asset.getLumber());
								lumberInTopMap++;
							} else if (((evenMapSize && k >= topMap) || (!evenMapSize && k >= bottomMap)) &&
								lumberInBottomMap < TOTAL_LUMBER_PER_SIDE) {
								map[k][l] = new Lumber();
								map[k][l].setIcon(asset.getLumber());
								lumberInBottomMap++;
							}
						} else if (randomTile == 2) {
							if (((evenMapSize && k <= topMap) || (!evenMapSize && k <= bottomMap)) &&
									   stoneInTopMap < TOTAL_STONE_PER_SIDE) {
								map[k][l] = new Stone();
								map[k][l].setIcon(asset.getStone());
								stoneInTopMap++;
							} else if (((evenMapSize && k >= topMap) || (!evenMapSize && k >= bottomMap)) &&
									   stoneInBottomMap < TOTAL_STONE_PER_SIDE) {
								map[k][l] = new Stone();
								map[k][l].setIcon(asset.getStone());
								stoneInBottomMap++;
							}
						} else if (randomTile == 3) {
							if (((evenMapSize && k <= topMap) || (!evenMapSize && k <= bottomMap)) &&
									   horseInTopMap < TOTAL_HORSE_PER_SIDE) {
								map[k][l] = new Horse();
								map[k][l].setIcon(asset.getHorse());
								horseInTopMap++;
							} else if (((evenMapSize && k >= topMap) || (!evenMapSize && k >= bottomMap)) &&
									   horseInBottomMap < TOTAL_HORSE_PER_SIDE) {
								map[k][l] = new Horse();
								map[k][l].setIcon(asset.getHorse());
								horseInBottomMap++;
							} 
						}
					}
				}
			}
		} while(!(lumberInTopMap == TOTAL_LUMBER_PER_SIDE && lumberInBottomMap == TOTAL_LUMBER_PER_SIDE && 
				stoneInTopMap == TOTAL_STONE_PER_SIDE && stoneInBottomMap == TOTAL_STONE_PER_SIDE &&
				horseInTopMap == TOTAL_HORSE_PER_SIDE && horseInBottomMap == TOTAL_HORSE_PER_SIDE));
		for (int m = 0; m < MAP_SIZE; m++){
			for (int n = 0; n < MAP_SIZE; n++) {
				map[m][n].setActionCommand(m + " " + n);
				System.out.println("k: " + m + " L: " + n + "   " + map[m][n].getResourceName());
			}
		}
	}
	public void handleUILogic() {
		
	}
	public void PlayerTurns() {
		
	}
	public boolean handleBuildingBuildings(Resource tileName,int markCost, int lumberCost, int stoneCost, int horseCost) {
		Tile currentTile = (Tile)gui.getTileSelection();
		if (currentTile.getResourceName().equals(tileName)) {
			if (currentTile.isPassable()) {
				if (currentPlayer.getMarks() >= markCost &&
					currentPlayer.getStone() >= stoneCost &&
					currentPlayer.getLumber() >= lumberCost &&
					currentPlayer.getHorses() >= horseCost) {
					if (hasBuildingAdjacent()) {
						return true;
					}
				} else {
					gui.setTurnEventBox("Cannot afford. This costs: " + markCost + " Marks, " + lumberCost + " Lumber, " + stoneCost + " Stone, and " + horseCost + " Horses.");
				}
			} else {
				gui.setTurnEventBox("Cannot build. A " + currentTile.getUnit().getName() + " is on that tile.");
			}
		} else {
			gui.setTurnEventBox("You can only build this on a " + tileName + " Tile");
		}
		return false;
	}
	public void handlePurchase(Buyable item, int markCost, int lumberCost, int stoneCost, int horseCost) {
		for (int i = 0; i < MAP_SIZE; i++) {
			for (int j = 0; j < MAP_SIZE; j++) {
				if (map[i][j] == gui.getTileSelection()) {
					currentPlayer.setMarks(currentPlayer.getMarks() - markCost);
					currentPlayer.setLumber(currentPlayer.getLumber() - lumberCost);
					currentPlayer.setStone(currentPlayer.getStone() - stoneCost);
					currentPlayer.setHorses(currentPlayer.getHorses() - horseCost);
					if (item instanceof Building) {
						map[i][j].setBuilding((Building)item);
						if (map[i][j].getBuilding() instanceof Barracks) {
							if (currentPlayer == player1) {
								map[i][j].setIcon(asset.getP1Barracks());
							} else {
								map[i][j].setIcon(asset.getP2Barracks());
							}
						} else if (map[i][j].getBuilding() instanceof LumberMill) {
							if (currentPlayer == player1) {
								map[i][j].setIcon(asset.getP1Lumbermill());
							} else {
								map[i][j].setIcon(asset.getP2Lumbermill());
							}
						} else if (map[i][j].getBuilding() instanceof Quarry) {
							if (currentPlayer == player1) {
								map[i][j].setIcon(asset.getP1Quarry());
							} else {
								map[i][j].setIcon(asset.getP2Quarry());
							}
						} else if (map[i][j].getBuilding() instanceof Stable) {
							if (currentPlayer == player1) {
								map[i][j].setIcon(asset.getP1Stable());
							} else {
								map[i][j].setIcon(asset.getP2Stable());
							}
						} else if (map[i][j].getBuilding() instanceof Road) {
							if (currentPlayer == player1) {
								map[i][j].setIcon(asset.getP1RoadAll());
							} else {
								map[i][j].setIcon(asset.getP2RoadAll());
							}
						}
					} else if (item instanceof Unit) {
						map[i][j].setUnit((Unit)item);
						if (map[i][j].getUnit() instanceof Archer) {
							if (currentPlayer == player1) {
								map[i][j].setIcon(asset.getP1Archer());
							} else {
								map[i][j].setIcon(asset.getP2Archer());
							}
						} else if (map[i][j].getUnit() instanceof Warrior) {
							if (currentPlayer == player1) {
								map[i][j].setIcon(asset.getP1Warrior());
							} else {
								map[i][j].setIcon(asset.getP2Warrior());
							}
						} else if (map[i][j].getUnit() instanceof HorseRider) {
							if (currentPlayer == player1) {
								map[i][j].setIcon(asset.getP1Rider());
							} else {
								map[i][j].setIcon(asset.getP2Rider());
							}
						} else if (map[i][j].getUnit() instanceof Hunter) {
							if (currentPlayer == player1) {
								map[i][j].setIcon(asset.getP1Hunter());
							} else {
								map[i][j].setIcon(asset.getP2Hunter());
							}
						}
					}
					
					
				}
			}
		}
	}
	public void handleMovement() {
		Tile lastSelected = (Tile)gui.getTileSelection();
		for (int i = 0; i < MAP_SIZE; i++) {
			for (int j = 0; j < MAP_SIZE; j++) {
				if (gui.getTileSelection() == map[i][j]) {
					//map[i][j]
				}
			}
		}
	}
	public void handleAttacking() {
		
	}
	public boolean hasBuildingAdjacent() {
		for (int i = 0; i < MAP_SIZE; i++) {
			for (int j = 0; j < MAP_SIZE; j++) {
				if (gui.getTileSelection() == map[i][j]) {
					try {
						if (map[i - 1][j].getBuilding() != null) {
								return true;
							}
					} catch (Exception ArrayIndexOutOfBoundsException) {}
					try {
						if (map[i + 1][j].getBuilding() != null) {
								return true;
							}
					} catch (Exception ArrayIndexOutOfBoundsException) {}
					try {
						if (map[i][j - 1].getBuilding() != null) {
								return true;
							}
					} catch (Exception ArrayIndexOutOfBoundsException) {}
					try {
						if (map[i][j + 1].getBuilding() != null) {
								return true;
							}
					} catch (Exception ArrayIndexOutOfBoundsException) {}
				} 
			}
		}
		return false;
	}
	public boolean handleWin() {
		if (map[MAP_SIZE - (MAP_SIZE - 1)][MAP_SIZE - (MAP_SIZE - 1)].getBuilding().getHealth() == 0 ||
			map[MAP_SIZE - 2][MAP_SIZE - 2].getBuilding().getHealth() == 0) {
			return true;
		}
		return false;
	}
	public GUI getGui() {
		return gui;
	}
	public UserInteractions getUI() {
		return UI;
	}
	public Assets getAsset() {
		return asset;
	}
	public Player getPlayer1() {
		return player1;
	}
	public Player getPlayer2() {
		return player2;
	}
	public Player getCurrentPlayer() {
		return currentPlayer;
	}
	public void setCurrentPlayer(Player currentPlayer) {
		this.currentPlayer = currentPlayer;
	}
}
