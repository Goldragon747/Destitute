package edu.neumont.csc150.destitute.game.controller;

import java.util.Random;

import javax.swing.Timer;

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
import edu.neumont.csc150.destitute.game.model.units.Hunter;
import edu.neumont.csc150.destitute.game.model.units.Unit;
import edu.neumont.csc150.destitute.game.view.Assets;
import edu.neumont.csc150.destitute.game.view.GUI;
import edu.neumont.csc150.destitute.game.view.UserInteractions;


public class Game {
	private GUI gui;
	private UserInteractions UI;
	private Player player1 = new Player("Player1");
	private Player player2 = new Player("Player2");
	private Player currentPlayer;

	private final int MAP_SIZE = 10;
	private Assets asset;
	private Tile[][] map = new Tile[MAP_SIZE][MAP_SIZE];

	private Random gen = new Random();

	private final int TOTAL_LUMBER_PER_SIDE = (MAP_SIZE / 2);
	private final int TOTAL_STONE_PER_SIDE = (MAP_SIZE / 3);
	private final int TOTAL_HORSE_PER_SIDE = (MAP_SIZE / 4);

	public void run() {
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
		for (int i = 0; i < MAP_SIZE; i++) {
			for (int j = 0; j < MAP_SIZE; j++) {
				if ((i == 0 && j >= MAP_SIZE - 4) || (i == 1 && j == MAP_SIZE - 1) || (i == 2 && j == MAP_SIZE - 1)
						|| (i == 3 && j == MAP_SIZE - 1)
						|| ((evenMapSize && i == MAP_SIZE / 2 - 1 & j == MAP_SIZE / 2 - 1))
						|| ((evenMapSize && i == MAP_SIZE / 2 - 1 & j == MAP_SIZE / 2))
						|| ((evenMapSize && i == MAP_SIZE / 2 & j == MAP_SIZE / 2 - 1))
						|| ((evenMapSize && i == MAP_SIZE / 2 & j == MAP_SIZE / 2))
						|| ((!evenMapSize && i == (MAP_SIZE - 1) / 2 & j == (MAP_SIZE - 1) / 2))
						|| (i == MAP_SIZE - 4 && j == 0) || (i == MAP_SIZE - 3 && j == 0)
						|| (i == MAP_SIZE - 2 && j == 0) || (i == MAP_SIZE - 1 && j <= 3)) {
					map[i][j] = new Water();
					map[i][j].setIcon(asset.getWater());
				} else if ((i == MAP_SIZE - (MAP_SIZE - 1) && j == MAP_SIZE - (MAP_SIZE - 1))) {
					map[i][j] = new Grass();
					map[i][j].setFog(false);
					map[i][j].setIcon(asset.getP1Settlement());
					map[i][j].setBuilding(new Settlement());
					map[i][j].getBuilding().setPlayer(player1);
				} else if ((i == MAP_SIZE - 2 && j == MAP_SIZE - 2)) {
					map[i][j] = new Grass();
					map[i][j].setFog(false);
					map[i][j].setIcon(asset.getP2Settlement());
					map[i][j].setBuilding(new Settlement());
					map[i][j].getBuilding().setPlayer(player2);
				} else {
					map[i][j] = new Grass();
					map[i][j].setIcon(asset.getGrass());
				}
			}
		}
		do {
			for (int k = 0; k < MAP_SIZE; k++) {
				for (int l = 0; l < MAP_SIZE; l++) {
					int randomTile = gen.nextInt(30);
					if (map[k][l] instanceof Grass && !(map[k][l].getBuilding() instanceof Settlement)) {
						if (randomTile == 1) {
							if (((evenMapSize && k <= topMap) || (!evenMapSize && k <= bottomMap))
									&& lumberInTopMap < TOTAL_LUMBER_PER_SIDE) {
								map[k][l] = new Lumber();
								map[k][l].setIcon(asset.getLumber());
								lumberInTopMap++;
							} else if (((evenMapSize && k >= topMap) || (!evenMapSize && k >= bottomMap))
									&& lumberInBottomMap < TOTAL_LUMBER_PER_SIDE) {
								map[k][l] = new Lumber();
								map[k][l].setIcon(asset.getLumber());
								lumberInBottomMap++;
							}
						} else if (randomTile == 2) {
							if (((evenMapSize && k <= topMap) || (!evenMapSize && k <= bottomMap))
									&& stoneInTopMap < TOTAL_STONE_PER_SIDE) {
								map[k][l] = new Stone();
								map[k][l].setIcon(asset.getStone());
								stoneInTopMap++;
							} else if (((evenMapSize && k >= topMap) || (!evenMapSize && k >= bottomMap))
									&& stoneInBottomMap < TOTAL_STONE_PER_SIDE) {
								map[k][l] = new Stone();
								map[k][l].setIcon(asset.getStone());
								stoneInBottomMap++;
							}
						} else if (randomTile == 3) {
							if (((evenMapSize && k <= topMap) || (!evenMapSize && k <= bottomMap))
									&& horseInTopMap < TOTAL_HORSE_PER_SIDE) {
								map[k][l] = new Horse();
								map[k][l].setIcon(asset.getHorse());
								horseInTopMap++;
							} else if (((evenMapSize && k >= topMap) || (!evenMapSize && k >= bottomMap))
									&& horseInBottomMap < TOTAL_HORSE_PER_SIDE) {
								map[k][l] = new Horse();
								map[k][l].setIcon(asset.getHorse());
								horseInBottomMap++;
							}
						}
					}
				}
			}
		} while (!(lumberInTopMap == TOTAL_LUMBER_PER_SIDE && lumberInBottomMap == TOTAL_LUMBER_PER_SIDE
				&& stoneInTopMap == TOTAL_STONE_PER_SIDE && stoneInBottomMap == TOTAL_STONE_PER_SIDE
				&& horseInTopMap == TOTAL_HORSE_PER_SIDE && horseInBottomMap == TOTAL_HORSE_PER_SIDE));
	}

	public void handleUILogic() {

	}

	public void PlayerTurns() {

	}

	public boolean handleBuildingBuildings(Resource tileName, int markCost, int lumberCost, int stoneCost,
			int horseCost) {
		try {
			Tile currentTile = (Tile) gui.getTileSelection();
			if (currentTile.getResourceName().equals(tileName)) {
				if (currentTile.isPassable()) {
					if (currentPlayer.getMarks() >= markCost && currentPlayer.getStone() >= stoneCost
							&& currentPlayer.getLumber() >= lumberCost && currentPlayer.getHorses() >= horseCost) {
						if (hasBuildingAdjacent()) {
							return true;
						}
					} else {
						gui.setTurnEventBox("Cannot afford. This costs: " + markCost + " Marks, " + lumberCost + " Lumber, "
								+ stoneCost + " Stone, and " + horseCost + " Horses.");
					}
				} else {
					gui.setTurnEventBox("Cannot build. A " + currentTile.getUnit().getName() + " is on that tile.");
				}
			} else {
				gui.setTurnEventBox("You can only build this on a " + tileName + " Tile");
			}
		} catch (Exception NullPointerException){}
			return false;
	}

	public void handlePurchaseOfBuilding(Buyable item, int markCost, int lumberCost, int stoneCost, int horseCost) {
		boolean valid = false;
		Tile currentTile = (Tile) gui.getTileSelection();
		for (int i = 0; i < MAP_SIZE; i++) {
			for (int j = 0; j < MAP_SIZE; j++) {
				if (map[i][j] == currentTile && currentTile.getBuilding() == null && !(item instanceof Unit)) {
					valid = true;
					currentPlayer.setMarks(currentPlayer.getMarks() - markCost);
					currentPlayer.setLumber(currentPlayer.getLumber() - lumberCost);
					currentPlayer.setStone(currentPlayer.getStone() - stoneCost);
					currentPlayer.setHorses(currentPlayer.getHorses() - horseCost);
					if (item instanceof Building) {
						map[i][j].setBuilding((Building) item);
						map[i][j].getBuilding().setPlayer(currentPlayer);
						;
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
							gui.getCorrectRoad();
						}
					}
				} 
			}
			gui.checkForExplored();
			gui.refreshMapTileIcons();
		}
		if (valid == false) {
			gui.setTurnEventBox(
					"You already have a " + ((Tile) gui.getTileSelection()).getBuilding().getName() + " there!");
		}
	}
	public void handlePurchaseOfUnit(Buyable item, int markCost, int lumberCost, int stoneCost, int horseCost) {
		boolean valid = false;
		Tile currentTile = (Tile) gui.getTileSelection();
		for (int i = 0; i < MAP_SIZE; i++) {
			for (int j = 0; j < MAP_SIZE; j++) {
				if (currentPlayer.getMarks() >= markCost && currentPlayer.getLumber() >= lumberCost &&
					currentPlayer.getStone() >= stoneCost && currentPlayer.getHorses() >= horseCost) {
					if (map[i][j] == currentTile && currentTile.getBuilding() instanceof Barracks && currentTile.getUnit() == null && currentTile.getBuilding().getPlayer() == currentPlayer) {
						map[i][j].setUnit((Unit) item);
						map[i][j].getUnit().setPlayer(currentPlayer);
						gui.refreshMapTileIcons();
						currentPlayer.setMarks(currentPlayer.getMarks() - markCost);
						currentPlayer.setLumber(currentPlayer.getLumber() - lumberCost);
						currentPlayer.setStone(currentPlayer.getStone() - stoneCost);
						currentPlayer.setHorses(currentPlayer.getHorses() - horseCost);
					} else if (map[i][j] == currentTile && currentTile.getBuilding() instanceof Settlement && item instanceof Hunter && currentTile.getBuilding().getPlayer() == currentPlayer) {
						map[i][j].setUnit((Unit)item);
						map[i][j].getUnit().setPlayer(currentPlayer);
						gui.refreshMapTileIcons();
						currentPlayer.setMarks(currentPlayer.getMarks() - markCost);
						currentPlayer.setLumber(currentPlayer.getLumber() - lumberCost);
						currentPlayer.setStone(currentPlayer.getStone() - stoneCost);
						currentPlayer.setHorses(currentPlayer.getHorses() - horseCost);
						//TODO GAAAABEEEE DO THIS. Also please erase this before we present otherwise that would be awkward...
					}
				}
			}
		}
	}
	public void tryHandleMovement() {
		for (int i = 0; i < MAP_SIZE; i++) {
			for (int j = 0; j < MAP_SIZE; j++) {
				if (map[i][j].getUnit() != null) {
					if (map[i][j].getUnit().getCurrentMovement() > 0) {
						if (gui.getUnitSelection() == map[i][j].getUnit()) {
							try{
								if (gui.getTileSelection() == map[i - 1][j]) {
									map[i][j].getUnit().setCurrentMovement(map[i][j].getUnit().getCurrentMovement() - 1);
									map[i - 1][j].setUnit(map[i][j].getUnit());
									map[i][j].setUnit(null);
									gui.setTileSelection(null);
									gui.setUnitSelection(null);
									gui.refreshMapTileIcons();
								} 
							} catch (Exception ArrayIndexOutOfBoundsException){}
							try{
								if (gui.getTileSelection() == map[i + 1][j]) {
									map[i][j].getUnit().setCurrentMovement(map[i][j].getUnit().getCurrentMovement() - 1);
									map[i + 1][j].setUnit(map[i][j].getUnit());
									map[i][j].setUnit(null);
									gui.setTileSelection(null);
									gui.setUnitSelection(null);
									gui.refreshMapTileIcons();
								}
							} catch (Exception ArrayIndexOutOfBoundsException){}
							try{
								if (gui.getTileSelection() == map[i][j - 1]) {
									map[i][j].getUnit().setCurrentMovement(map[i][j].getUnit().getCurrentMovement() - 1);
									map[i][j - 1].setUnit(map[i][j].getUnit());
									map[i][j].setUnit(null);
									gui.setTileSelection(null);
									gui.setUnitSelection(null);
									gui.refreshMapTileIcons();
								}
							} catch (Exception ArrayIndexOutOfBoundsException){}
							try{
								if (gui.getTileSelection() == map[i][j + 1]) {
									map[i][j].getUnit().setCurrentMovement(map[i][j].getUnit().getCurrentMovement() - 1);
									map[i][j + 1].setUnit(map[i][j].getUnit());
									map[i][j].setUnit(null);
									gui.setTileSelection(null);
									gui.setUnitSelection(null);
									gui.refreshMapTileIcons();
								}
							} catch (Exception ArrayIndexOutOfBoundsException){}
						}
					}
				}
			}
		}
		gui.checkForExplored();
		gui.refreshMapTileIcons();
	}

	public void tryHandleAttack() {
		boolean valid = false;
		boolean archer = false;
		Unit attacker = null;
		Unit defender = null;
		for (int i = 0; i < MAP_SIZE; i++) {
			for (int j = 0; j < MAP_SIZE; j++) {
				if (map[i][j] == gui.getTileSelection()) {
					System.out.println("made it to step 1");
					defender = map[i][j].getUnit();
				}
				if (map[i][j].getUnit() != null) {
					System.out.println("made it to step 2");
					if (map[i][j].getUnit() == gui.getUnitSelection()) {
						System.out.println("made it to step 3");
						if (map[i][j].getUnit() instanceof Archer) {
							System.out.println("made it to step 4");
							archer = true;
						}
						attacker = map[i][j].getUnit();
						System.out.println("made it to step 5");
					}
				}
			}
		}
		for (int i = 0; i < MAP_SIZE; i++) {
			for (int j = 0; j < MAP_SIZE; j++) {
				if (map[i][j].getUnit() != null) {
					System.out.println("made it to step 6");
					if (map[i][j].getUnit() == gui.getUnitSelection()) {
						try{
							if (map[i - 1][j].getUnit() != null && map[i - 1][j].getUnit() == defender &&
								map[i - 1][j].getUnit().getPlayer() != map[i][j].getUnit().getPlayer() ){
								System.out.println("made it to first if statement");
								valid = true;
							}
						} catch (Exception ArrayIndexOutOfBoundsException){}
						try{
							if (map[i + 1][j].getUnit() != null && map[i + 1][j].getUnit() == defender &&
								map[i + 1][j].getUnit().getPlayer() != map[i][j].getUnit().getPlayer()){
								System.out.println("made it to second if statement");
								valid = true;
							}
						} catch (Exception ArrayIndexOutOfBoundsException){}
						try{
							if (map[i][j - 1].getUnit() != null && map[i][j - 1].getUnit() == defender &&
								map[i][j - 1].getUnit().getPlayer() != map[i][j].getUnit().getPlayer()){
								System.out.println("made it to third if statement");
								valid = true;
							}
						} catch (Exception ArrayIndexOutOfBoundsException){}
						try{
							if (map[i][j + 1].getUnit() != null && map[i][j + 1].getUnit() == defender &&
								map[i][j + 1].getUnit().getPlayer() != map[i][j].getUnit().getPlayer()){
								System.out.println("made it to fourth if statement");
								valid = true;
							}
						} catch (Exception ArrayIndexOutOfBoundsException){}
						if (archer) {
							try{
								if (map[i - 1][j + 1].getUnit() != null && map[i - 1][j + 1].getUnit() == defender &&
									map[i - 1][j + 1].getUnit().getPlayer() != map[i][j].getUnit().getPlayer()){
									System.out.println("made it to fifth if statement");
									valid = true;
								}
							} catch (Exception ArrayIndexOutOfBoundsException){}
							try{
								if (map[i + 1][j + 1].getUnit() != null && map[i + 1][j + 1].getUnit() == defender &&
									map[i + 1][j + 1].getUnit().getPlayer() != map[i][j].getUnit().getPlayer()){
									System.out.println("made it to sixth if statement");
									valid = true;
								}
							} catch (Exception ArrayIndexOutOfBoundsException){}
							try{
								if (map[i][j + 2].getUnit() != null && map[i][j + 2].getUnit() == defender &&
									map[i][j + 2].getUnit().getPlayer() != map[i][j].getUnit().getPlayer()){
									System.out.println("made it to seventh if statement");
									valid = true;
								}
							} catch (Exception ArrayIndexOutOfBoundsException){}
							try{
								if (map[i][j - 2].getUnit() != null && map[i][j - 2].getUnit() == defender &&
									map[i][j - 2].getUnit().getPlayer() != map[i][j].getUnit().getPlayer()){
									System.out.println("made it to eighth if statement");
									valid = true;
								}
							} catch (Exception ArrayIndexOutOfBoundsException){}
							try{
								if (map[i][j + 1].getUnit() != null && map[i][j + 1].getUnit() == defender &&
									map[i][j + 1].getUnit().getPlayer() != map[i][j].getUnit().getPlayer()){
									System.out.println("made it to ninth if statement");
									valid = true;
								}
							} catch (Exception ArrayIndexOutOfBoundsException){}
							try{
								if (map[i - 1][j - 1].getUnit() != null && map[i - 1][j - 1].getUnit() == defender &&
									map[i - 1][j - 1].getUnit().getPlayer() != map[i][j].getUnit().getPlayer()){
									System.out.println("made it to tenth if statement");
									valid = true;
								}
							} catch (Exception ArrayIndexOutOfBoundsException){}
							try{
								if (map[i + 1][j - 1].getUnit() != null && map[i + 1][j - 1].getUnit() == defender &&
									map[i + 1][j - 1].getUnit().getPlayer() != map[i][j].getUnit().getPlayer()){
									System.out.println("made it to eleventh if statement");
									valid = true;
								}
							} catch (Exception ArrayIndexOutOfBoundsException){}
							try{
								if (map[i + 2][j].getUnit() != null && map[i + 2][j].getUnit() == defender &&
									map[i + 2][j].getUnit().getPlayer() != map[i][j].getUnit().getPlayer()){
									System.out.println("made it to twelth if statement");
									valid = true;
								}
							} catch (Exception ArrayIndexOutOfBoundsException){}
							try{
								if (map[i - 2][j].getUnit() != null && map[i - 2][j].getUnit() == defender &&
									map[i - 2][j].getUnit().getPlayer() != map[i][j].getUnit().getPlayer()){
									System.out.println("made it to thirteenth if statement");
									valid = true;
								}
							} catch (Exception ArrayIndexOutOfBoundsException){}
						}
					}
				}
			}
		}
		if (valid && attacker.getCurrentAttacks() >= 0) {
			System.out.println("made it to step 7 attacker health:" + attacker.getHealth() + " attacker attacks left: " + attacker.getCurrentAttacks());
			System.out.println("defender health : " + defender.getHealth());
			defender.setHealth(defender.getHealth() - attacker.getAttackDamage());
			attacker.setCurrentAttacks(attacker.getCurrentAttacks() - 1);
			System.out.println("made it to step 8 attacker health:" + attacker.getHealth() + " attacker attacks left: " + attacker.getCurrentAttacks());
			System.out.println("defender health : " + defender.getHealth());
			if (defender.getHealth() <= 0) {
				defender = null;
				System.out.println("made it to step 9");
			}
			for (int i = 0; i < MAP_SIZE; i++) {
				for (int j = 0; j < MAP_SIZE; j++) {
					if (map[i][j] == gui.getTileSelection()) {
						map[i][j].setUnit(defender);
						gui.refreshMapTileIcons();
						System.out.println("made it to step 10");
					}
					if (map[i][j].getUnit() == gui.getUnitSelection()) {
						map[i][j].setUnit(attacker);
						gui.refreshMapTileIcons();
						System.out.println("made it to step 11");
					}
				}
			}
		}
	}

	public boolean hasBuildingAdjacent() {
		for (int i = 0; i < MAP_SIZE; i++) {
			for (int j = 0; j < MAP_SIZE; j++) {
				if (gui.getTileSelection() == map[i][j]) {
					try {
						if (map[i - 1][j].getBuilding() != null
								&& map[i - 1][j].getBuilding().getPlayer() == currentPlayer) {
							return true;
						}
					} catch (Exception ArrayIndexOutOfBoundsException) {
					}
					try {
						if (map[i + 1][j].getBuilding() != null
								&& map[i + 1][j].getBuilding().getPlayer() == currentPlayer) {
							return true;
						}
					} catch (Exception ArrayIndexOutOfBoundsException) {
					}
					try {
						if (map[i][j - 1].getBuilding() != null
								&& map[i][j - 1].getBuilding().getPlayer() == currentPlayer) {
							return true;
						}
					} catch (Exception ArrayIndexOutOfBoundsException) {
					}
					try {
						if (map[i][j + 1].getBuilding() != null
								&& map[i][j + 1].getBuilding().getPlayer() == currentPlayer) {
							return true;
						}
					} catch (Exception ArrayIndexOutOfBoundsException) {
					}
				}
			}
		}
		return false;
	}
	public void doEndTurn() {
		int lumberCount = 0;
		int quarryCount = 0;
		int stableCount = 0;
		for (int i = 0; i < MAP_SIZE; i++) {
			for (int j = 0; j < MAP_SIZE; j++) {
				if (map[i][j].getBuilding() instanceof LumberMill
						&& map[i][j].getBuilding().getPlayer() == currentPlayer) {
					lumberCount++;
				} else if (map[i][j].getBuilding() instanceof Quarry
						&& map[i][j].getBuilding().getPlayer() == currentPlayer) {
					quarryCount++;
				} else if (map[i][j].getBuilding() instanceof Stable
						&& map[i][j].getBuilding().getPlayer() == currentPlayer) {
					stableCount++;
				}
				if(map[i][j].getUnit() != null) {
					map[i][j].getUnit().setCurrentMovement(map[i][j].getUnit().getTotalMovement());
				}
			}
		}
		currentPlayer.setMarks(currentPlayer.getMarks() + 20);
		currentPlayer.setLumber(currentPlayer.getLumber() + (10 * lumberCount));
		currentPlayer.setStone(currentPlayer.getStone() + (10 * quarryCount));
		currentPlayer.setHorses(currentPlayer.getHorses() + (10 * stableCount));
		for (int k = 0; k < MAP_SIZE; k++) {
			for (int l = 0; l < MAP_SIZE; l++) {
				if (map[k][l].getBuilding() != null & map[k][l].getUnit() != null) {
					if (map[k][l].getBuilding().getPlayer() != map[k][l].getUnit().getPlayer()) {
						map[k][l].getBuilding().setHealth(map[k][l].getBuilding().getHealth() - 1);
						if (map[k][l].getBuilding().getHealth() > 0) {
							gui.setTurnEventBox(map[k][l].getUnit().getPlayer().getPlayerName() + " is attacking " + 
							map[k][l].getBuilding().getPlayer().getPlayerName() + "'s " + map[k][l].getBuilding().getName() + "!");
						} else if (map[k][l].getBuilding() instanceof Settlement && map[k][l].getBuilding().getHealth() <= 0) {
							System.out.println("Someone won!?");
						} else if (map[k][l].getBuilding().getHealth() <= 0) {
							map[k][l].setBuilding(null);
							gui.updateResources();
						}
					}
				}
			}
		}
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
	public int getRandomNum(int max) {
		return gen.nextInt(max);
	}

	public void setCurrentPlayer(Player currentPlayer) {
		this.currentPlayer = currentPlayer;
	}
	

}
