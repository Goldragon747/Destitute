package edu.neumont.csc150.destitute.game.model;

public class Player {
private String playerName;
private int marks, stone, lumber, horses;

public Player(String playerName){
	this.marks = 50;
	this.stone = 0;
	this.lumber = 20;
	this.horses = 0;
	this.playerName = playerName;
}
public int getMarks() {
	return marks;
}

public void setMarks(int marks) {
	this.marks = marks;
}

public int getStone() {
	return stone;
}

public void setStone(int stone) {
	this.stone = stone;
}

public int getLumber() {
	return lumber;
}

public void setLumber(int lumber) {
	this.lumber = lumber;
}

public int getHorses() {
	return horses;
}

public void setHorses(int horses) {
	this.horses = horses;
}

public String getPlayerName() {
	return playerName;
}

public void setPlayerName(String playerName) {
	this.playerName = playerName;
}
}
