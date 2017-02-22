package edu.neumont.csc150.destitute.game.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class GUI implements ActionListener, KeyListener{
	private JFrame window;
	private JPanel mainPanel;
	public void initGUI() throws IOException {
		window = new JFrame("Destitute");
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setLocationRelativeTo(null);
		loadGUI();
		window.addKeyListener(this);
		window.setExtendedState(JFrame.MAXIMIZED_BOTH);
		window.getContentPane().add(mainPanel);
		window.setVisible(true);
		
		System.out.println("width: " + window.getWidth());
		System.out.println("height: " + window.getHeight());
		
	}
	/**
	 * loads the GUI
	 * @throws IOException
	 */
	private void loadGUI() throws IOException {
		
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
