package edu.neumont.csc150.destitute.game.view;

import java.util.Random;

public class UserInteractions {
	private Random gen = new Random();
	private GUI gui;
	public UserInteractions(GUI gui) {
		this.gui = gui;
		
	}
	public void CreationArcher(){
		int ran = gen.nextInt(4);
		if(ran == 0){
			gui.setTurnEventBox("My aim is steady");
		}
		else if(ran == 1){
			gui.setTurnEventBox("My arrows fly true");
		}
		else if(ran == 2){
			gui.setTurnEventBox("The Gods will save me!");
		}
		else if(ran == 3){
			gui.setTurnEventBox("No one escapes my aim");
		}
	}
	public void CreationWarrior(){
		int ran = gen.nextInt(4);
		if(ran == 0){
			gui.setTurnEventBox("First you need to show me the money");
		}
		else if(ran == 1){
			gui.setTurnEventBox("Death by my hand");
		}
		else if(ran == 2){
			gui.setTurnEventBox("Today is a good day to die");
		}
		else if(ran == 3){
			gui.setTurnEventBox("That's all our enemies? Don't make me laugh");
		}
	}
	public void CreationHunter(){
		int ran = gen.nextInt(4);
		if(ran == 0){
			gui.setTurnEventBox("Caught in my trap are ya?");
		}
		else if(ran == 1){
			gui.setTurnEventBox("None are safe from the hunters");
		}
		else if(ran == 2){
			gui.setTurnEventBox("No Really! There is no cow level");
		}
		else if(ran == 3){
			gui.setTurnEventBox("That's all our enemies? Don't make me laugh");
		}
		
	}
	public void CreationHorseRider(){
		int ran = gen.nextInt(4);
		if(ran == 0){
			gui.setTurnEventBox("My steed knows no equal");
		}
		else if(ran == 1){
			gui.setTurnEventBox("Give them no quarter");
		}
		else if(ran == 2){
			gui.setTurnEventBox("Break their ranks");
		}
		else if(ran == 3){
			gui.setTurnEventBox("You interrupted my other game");
		}
	}
	public void Death(){
		//TODO finish death sayings
		int ran = gen.nextInt(4);
		if(ran == 0){
			gui.setTurnEventBox("Caught in my trap are ya?");
		}
		else if(ran == 1){
			gui.setTurnEventBox("None are safe from the hunters");
		}
		else if(ran == 2){
			gui.setTurnEventBox("There is no cow level");
		}
		else if(ran == 3){
			gui.setTurnEventBox("That's all our enemies? Don't make me laugh");
		}
	}
	public void Player1EndTurn(){
		int ran = gen.nextInt(2);
		if(ran == 0){
			gui.setTurnEventBox("Player 1 has ended their turn, prepare yourselves for battle!");
		}
		else if(ran == 1){
			gui.setTurnEventBox("Player 1 has sealed their fate, give them no quarter!");
		}
		
	}
	public void Player2EndTurn(){
		int ran = gen.nextInt(2);
		if(ran == 0){
			gui.setTurnEventBox("Player 2 has ended their turn, show them no mercy!");
		}
		else if(ran == 1){
			gui.setTurnEventBox("Player 2 has sealed their fate, fight on!");
		}
	}
	public void Player1StartTurn(){
		//Probably not going to implement, two lines at every end turn is probably too much
	}
	public void Player2StartTurn(){
		//ditto
	}
	public void Player1Win(){
		int ran = gen.nextInt(2);
		if(ran == 0){
			gui.setTurnEventBox("Player 1 is victorious!");
		}
		else if(ran == 1){
			gui.setTurnEventBox("Player 1 has crushed their opponent!");
		}
	}
	public void Player2Win(){
		int ran = gen.nextInt(2);
		if(ran == 0){
			gui.setTurnEventBox("Player 2 is victorious!");
		}
		else if(ran == 1){
			gui.setTurnEventBox("Player 2 has crushed their opponent!");
		}
	}
	
}
