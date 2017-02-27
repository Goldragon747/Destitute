package edu.neumont.csc150.destitute.game.view;

import java.util.Random;

public class UserInteractions {
	private Random gen = new Random();
	private GUI gui;
	public UserInteractions(GUI gui) {
		this.gui = gui;
		
	}
	public void CreationArcher(){
		gui.setTurnEventBox("");
	}
}
