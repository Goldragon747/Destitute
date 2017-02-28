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
			gui.setTurnEventBox("If only there were a GodMode");
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
			gui.setTurnEventBox("Two brothers: Ping and Pong");
		}
	}
	public void DeathArcher(){
		
	}
	public void DeathWarrior(){
		
	}
	public void DeathHunter(){
		
	}
	public void DeathHorseRider(){
		
	}
	public void Player1EndTurn(){
		
	}
	public void Player2EndTurn(){
		
	}
	public void Player1StartTurn(){
		
	}
	public void Player2StartTurn(){
		
	}
	public void Player1Win(){
		
	}
	public void Player2Win(){
		
	}
	
}
