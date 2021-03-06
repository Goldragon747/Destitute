package edu.neumont.csc150.destitute.game.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;

import edu.neumont.csc150.destitute.game.controller.Game;
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

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gabe B
 */
public class GUI extends javax.swing.JFrame implements ActionListener, KeyListener {
	private Game game;
	private Tile[][] map;
	private final int MAP_SIZE;
	private Tile tileSelection;
	private Unit unitSelection;
	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton10;
	private javax.swing.JButton jButton2;
	private javax.swing.JButton jButton3;
	private javax.swing.JButton jButton4;
	private javax.swing.JButton jButton5;
	private javax.swing.JButton jButton6;
	private javax.swing.JButton jButton7;
	private javax.swing.JButton jButton8;
	private javax.swing.JButton jButton9;
	private javax.swing.JLabel playerTurnLabel;
	private javax.swing.JLabel jLabel10;
	private javax.swing.JLabel jLabel11;
	private javax.swing.JLabel jLabel12;
	private javax.swing.JLabel jLabel13;
	private javax.swing.JLabel jLabel14;
	private javax.swing.JLabel jLabel15;
	private javax.swing.JLabel jLabel16;
	private javax.swing.JLabel jLabel17;
	private javax.swing.JLabel jLabel18;
	private javax.swing.JLabel marksLabel;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel lumberLabel;
	private javax.swing.JLabel stoneLabel;
	private javax.swing.JLabel horsesLabel;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JLabel jLabel7;
	private javax.swing.JLabel jLabel8;
	private javax.swing.JLabel jLabel9;
	private javax.swing.JLabel jPanel1;
	private javax.swing.JLabel credits;
	private javax.swing.JLabel win;
	private javax.swing.JLabel rules;
	private javax.swing.JPanel boardPanel;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JScrollPane jScrollPane2;
	private javax.swing.JTextArea turnEventsTextArea;
	private javax.swing.JTextField consoleCommand;
	private javax.swing.JButton titleJButton1;
	private javax.swing.JButton titleJButton4;
	private javax.swing.JButton titleJButton5;
	private javax.swing.JButton titleJButton6;
	private javax.swing.JLabel titleJLabel1;
	private javax.swing.JLabel titleJPanel2;

	/*
	 * private javax.swing.JButton lumberMillButton; private javax.swing.JButton
	 * endTurnButton; private javax.swing.JButton quarryButton; private
	 * javax.swing.JButton stableButton; private javax.swing.JButton
	 * barracksButton; private javax.swing.JButton roadButton; private
	 * javax.swing.JButton hunterButton; private javax.swing.JButton
	 * warriorButton; private javax.swing.JButton calvaryButton; private
	 * javax.swing.JButton archerButton; private javax.swing.JLabel
	 * playerTurnLabel; private javax.swing.JLabel unitsLabel; private
	 * javax.swing.JLabel marksLabel; private javax.swing.JLabel buildingsLabel;
	 * private javax.swing.JLabel stoneLabel; private javax.swing.JLabel
	 * turnEventsLabel; private javax.swing.JLabel lumberLabel; private
	 * javax.swing.JLabel consoleCommandsLabel; private javax.swing.JLabel
	 * horsesLabel; private javax.swing.JPanel playerMenuPanel; private
	 * javax.swing.JPanel boardPanel; private javax.swing.JScrollPane
	 * jScrollPane1; private javax.swing.JTextArea turnEventsTextArea; private
	 * javax.swing.JTextField consoleCommandsTextField;
	 */
	public GUI(Game game, Tile[][] map, int MAP_SIZE) {
		this.game = game;
		this.map = map;
		this.MAP_SIZE = MAP_SIZE;
		setContentPane(new JLabel(game.getAsset().getMainBackround()));
		setLayout(new FlowLayout());
		initComponents();
		initTitleScreen();
		initCredits();
		initRules();
		initWin();
		credits.setVisible(false);
		win.setVisible(false);
		rules.setVisible(false);
		jPanel1.addKeyListener(this);
		boardPanel.addKeyListener(this);
		rules.addKeyListener(this);
		credits.addKeyListener(this);
		this.setFocusable(true);
		this.setFocusTraversalKeysEnabled(false);
		this.addKeyListener(this);
		this.setVisible(true);
		this.setResizable(false);
		jPanel1.setVisible(false);
		boardPanel.setVisible(false);
		this.setExtendedState(this.getExtendedState() | this.MAXIMIZED_BOTH);
		game.getAsset().Song(game.getAsset().getTitleScreenMusic());
		game.getAsset().loop();
	}

	private void initComponents() {
		jScrollPane2 = new javax.swing.JScrollPane();
		jPanel1 = new javax.swing.JLabel();
		playerTurnLabel = new javax.swing.JLabel();
		jLabel2 = new javax.swing.JLabel();
		jLabel4 = new javax.swing.JLabel();
		jButton1 = new javax.swing.JButton();
		jButton2 = new javax.swing.JButton();
		jButton3 = new javax.swing.JButton();
		jButton4 = new javax.swing.JButton();
		jButton5 = new javax.swing.JButton();
		jButton6 = new javax.swing.JButton();
		jButton7 = new javax.swing.JButton();
		jButton8 = new javax.swing.JButton();
		jButton9 = new javax.swing.JButton();
		jLabel6 = new javax.swing.JLabel();
		jButton10 = new javax.swing.JButton();
		jScrollPane1 = new javax.swing.JScrollPane();
		turnEventsTextArea = new javax.swing.JTextArea();
		jLabel8 = new javax.swing.JLabel();
		consoleCommand = new javax.swing.JTextField();
		jLabel10 = new javax.swing.JLabel();
		jLabel11 = new javax.swing.JLabel();
		jLabel12 = new javax.swing.JLabel();
		jLabel13 = new javax.swing.JLabel();
		jLabel14 = new javax.swing.JLabel();
		jLabel15 = new javax.swing.JLabel();
		jLabel16 = new javax.swing.JLabel();
		jLabel17 = new javax.swing.JLabel();
		jLabel18 = new javax.swing.JLabel();
		marksLabel = new javax.swing.JLabel();
		lumberLabel = new javax.swing.JLabel();
		stoneLabel = new javax.swing.JLabel();
		horsesLabel = new javax.swing.JLabel();
		jLabel3 = new javax.swing.JLabel();
		jLabel5 = new javax.swing.JLabel();
		jLabel7 = new javax.swing.JLabel();
		jLabel9 = new javax.swing.JLabel();
		boardPanel = new javax.swing.JPanel();

		consoleCommand.addActionListener(this);

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setTitle("Destitute");
		setPreferredSize(new java.awt.Dimension(2596, 1320));
		jPanel1.setIcon(game.getAsset().getMenuBackground());
		jPanel1.setPreferredSize(new java.awt.Dimension(605, 1300));

		playerTurnLabel.setFont(new java.awt.Font("Tahoma", 0, 48));
		playerTurnLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		playerTurnLabel.setText("Player 1");

		jLabel2.setFont(new java.awt.Font("Tahoma", 0, 30));
		jLabel2.setText("Units");

		jLabel4.setFont(new java.awt.Font("Tahoma", 0, 30));
		jLabel4.setText("Buildings");
		player1BuyIcons();
		jButton1.setMaximumSize(new java.awt.Dimension(119, 119));
		jButton1.setMinimumSize(new java.awt.Dimension(119, 119));
		jButton1.setPreferredSize(new java.awt.Dimension(119, 119));
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				lumberMillButtonActionPerformed(evt);
			}
		});

		jButton2.setActionCommand("Quarry");
		jButton2.setMaximumSize(new java.awt.Dimension(119, 119));
		jButton2.setMinimumSize(new java.awt.Dimension(119, 119));
		jButton2.setPreferredSize(new java.awt.Dimension(119, 119));
		jButton2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				quarryButtonActionPerformed(evt);
			}
		});

		jButton3.setMaximumSize(new java.awt.Dimension(119, 119));
		jButton3.setMinimumSize(new java.awt.Dimension(119, 119));
		jButton3.setPreferredSize(new java.awt.Dimension(119, 119));
		jButton3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				stableButtonActionPerformed(evt);
			}
		});

		jButton4.setToolTipText("");
		jButton4.setMaximumSize(new java.awt.Dimension(119, 119));
		jButton4.setMinimumSize(new java.awt.Dimension(119, 119));
		jButton4.setPreferredSize(new java.awt.Dimension(119, 119));
		jButton4.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				barracksButtonActionPerformed(evt);
			}
		});

		jButton5.setActionCommand("jButton5actionCommand");
		jButton5.setMaximumSize(new java.awt.Dimension(119, 119));
		jButton5.setMinimumSize(new java.awt.Dimension(119, 119));
		jButton5.setPreferredSize(new java.awt.Dimension(119, 119));
		jButton5.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				roadButtonActionPerformed(evt);
			}
		});

		jButton6.setMaximumSize(new java.awt.Dimension(119, 119));
		jButton6.setMinimumSize(new java.awt.Dimension(119, 119));
		jButton6.setPreferredSize(new java.awt.Dimension(119, 119));
		jButton6.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				hunterButtonActionPerformed(evt);
			}
		});

		jButton7.setMaximumSize(new java.awt.Dimension(119, 119));
		jButton7.setMinimumSize(new java.awt.Dimension(119, 119));
		jButton7.setPreferredSize(new java.awt.Dimension(119, 119));
		jButton7.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				warriorButtonActionPerformed(evt);
			}
		});
		jButton8.setMaximumSize(new java.awt.Dimension(119, 119));
		jButton8.setMinimumSize(new java.awt.Dimension(119, 119));
		jButton8.setPreferredSize(new java.awt.Dimension(119, 119));
		jButton8.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				horseRiderButtonActionPerformed(evt);
			}
		});

		jButton9.setMaximumSize(new java.awt.Dimension(119, 119));
		jButton9.setMinimumSize(new java.awt.Dimension(119, 119));
		jButton9.setPreferredSize(new java.awt.Dimension(119, 119));
		jButton9.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				archerActionPerformed(evt);
			}
		});

		jLabel6.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
		jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel6.setText("Turn Events");

		jButton10.setFont(new java.awt.Font("Tahoma", 0, 30));
		jButton10.setText("End Turn");
		jButton10.setFocusable(false);
		jButton10.setForeground(Color.white);
		jButton10.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				endTurnActionPerformed(evt);
			}
		});
		jButton10.addKeyListener(new java.awt.event.KeyAdapter() {
			public void keyPressed(java.awt.event.KeyEvent evt) {
			}
		});

		turnEventsTextArea.setEditable(false);
		turnEventsTextArea.setColumns(20);
		turnEventsTextArea.setFont(new java.awt.Font("Monospaced", 0, 18));
		turnEventsTextArea.setLineWrap(true);
		turnEventsTextArea.setRows(5);
		turnEventsTextArea.setText("Welcome to Destitute");
		jScrollPane1.setViewportView(turnEventsTextArea);

		jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel8.setText("Console");

		jLabel10.setFont(new java.awt.Font("Tahoma", 0, 25));
		jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel10.setText("Warrior");

		jLabel11.setFont(new java.awt.Font("Tahoma", 0, 22));
		jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel11.setText("Lumber Mill");

		jLabel12.setFont(new java.awt.Font("Tahoma", 0, 25));
		jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel12.setText("Hunter");

		jLabel13.setFont(new java.awt.Font("Tahoma", 0, 25));
		jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel13.setText("Stable");

		jLabel14.setFont(new java.awt.Font("Tahoma", 0, 25));
		jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel14.setText("Road");

		jLabel15.setFont(new java.awt.Font("Tahoma", 0, 25));
		jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel15.setText("Quarry");

		jLabel16.setFont(new java.awt.Font("Tahoma", 0, 22));
		jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel16.setText("Horse Rider");

		jLabel17.setFont(new java.awt.Font("Tahoma", 0, 25));
		jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel17.setText("Barracks");

		jLabel18.setFont(new java.awt.Font("Tahoma", 0, 25));
		jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel18.setText("Archer");

		marksLabel.setFont(new java.awt.Font("Tahoma", 0, 25));
		marksLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		marksLabel.setText("0");

		lumberLabel.setFont(new java.awt.Font("Tahoma", 0, 25));
		lumberLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		lumberLabel.setText("0");

		stoneLabel.setFont(new java.awt.Font("Tahoma", 0, 25));
		stoneLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		stoneLabel.setText("0");

		horsesLabel.setFont(new java.awt.Font("Tahoma", 0, 25));
		horsesLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		horsesLabel.setText("0");
		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addGroup(jPanel1Layout
						.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addComponent(playerTurnLabel, javax.swing.GroupLayout.DEFAULT_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(jScrollPane1).addComponent(consoleCommand)
						.addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
								Short.MAX_VALUE)
						.addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
								Short.MAX_VALUE)
						.addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout
								.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(jPanel1Layout.createSequentialGroup().addGap(100, 100, 100)
										.addComponent(jLabel2))
								.addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 119,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout
										.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addGroup(jPanel1Layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
												.addComponent(jButton6, javax.swing.GroupLayout.Alignment.LEADING,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
										.addGroup(jPanel1Layout.createSequentialGroup().addGap(29, 29, 29)
												.addGroup(jPanel1Layout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
														.addComponent(marksLabel,
																javax.swing.GroupLayout.PREFERRED_SIZE, 60,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE,
																60, javax.swing.GroupLayout.PREFERRED_SIZE))))
										.addGroup(jPanel1Layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addGroup(jPanel1Layout.createSequentialGroup().addGap(55, 55, 55)
														.addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
												.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
														jPanel1Layout.createSequentialGroup()
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addComponent(jLabel18,
																		javax.swing.GroupLayout.PREFERRED_SIZE, 119,
																		javax.swing.GroupLayout.PREFERRED_SIZE))
												.addGroup(jPanel1Layout.createSequentialGroup().addGap(83, 83, 83)
														.addGroup(jPanel1Layout
																.createParallelGroup(
																		javax.swing.GroupLayout.Alignment.LEADING)
																.addComponent(lumberLabel,
																		javax.swing.GroupLayout.PREFERRED_SIZE, 60,
																		javax.swing.GroupLayout.PREFERRED_SIZE)
																.addComponent(jLabel5,
																		javax.swing.GroupLayout.PREFERRED_SIZE, 60,
																		javax.swing.GroupLayout.PREFERRED_SIZE)))))
								.addGroup(jPanel1Layout
										.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
										.addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(jLabel16, javax.swing.GroupLayout.Alignment.LEADING,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(jButton8, javax.swing.GroupLayout.Alignment.LEADING,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 96,
										Short.MAX_VALUE)
								.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
												jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING,
																false)
														.addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
														.addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
														.addComponent(jLabel15,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
														.addGap(55, 55, 55).addGroup(jPanel1Layout
																.createParallelGroup(
																		javax.swing.GroupLayout.Alignment.LEADING,
																		false)
																.addComponent(jLabel17,
																		javax.swing.GroupLayout.DEFAULT_SIZE,
																		javax.swing.GroupLayout.DEFAULT_SIZE,
																		Short.MAX_VALUE)
																.addComponent(jButton5,
																		javax.swing.GroupLayout.DEFAULT_SIZE,
																		javax.swing.GroupLayout.DEFAULT_SIZE,
																		Short.MAX_VALUE)
																.addComponent(jLabel14,
																		javax.swing.GroupLayout.DEFAULT_SIZE,
																		javax.swing.GroupLayout.DEFAULT_SIZE,
																		Short.MAX_VALUE)))
										.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout
												.createSequentialGroup()
												.addGroup(jPanel1Layout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE,
																60, javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(stoneLabel,
																javax.swing.GroupLayout.PREFERRED_SIZE, 60,
																javax.swing.GroupLayout.PREFERRED_SIZE))
												.addGap(114, 114, 114)
												.addGroup(jPanel1Layout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING,
																false)
														.addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE,
																60, javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(horsesLabel,
																javax.swing.GroupLayout.PREFERRED_SIZE, 60,
																javax.swing.GroupLayout.PREFERRED_SIZE))
												.addGap(30, 30, 30))
										.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
												jPanel1Layout.createSequentialGroup().addComponent(jLabel4).addGap(80,
														80, 80))
										.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
												.addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
										.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
												jPanel1Layout.createSequentialGroup()
														.addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE,
																119, javax.swing.GroupLayout.PREFERRED_SIZE)
														.addGap(55, 55, 55).addComponent(jButton4,
																javax.swing.GroupLayout.PREFERRED_SIZE, 119,
																javax.swing.GroupLayout.PREFERRED_SIZE))))))
				.addGroup(jPanel1Layout
						.createSequentialGroup().addGap(267, 267, 267).addComponent(jButton10,
								javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(21, 21, Short.MAX_VALUE)));
		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addComponent(playerTurnLabel)
						.addGap(50, 50, 50)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
								.addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 60,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 60,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 60,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 60,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(18, 18, 18)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(marksLabel).addComponent(lumberLabel).addComponent(stoneLabel)
								.addComponent(horsesLabel))
						.addGap(50, 50, 50)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
										jPanel1Layout.createSequentialGroup().addComponent(jLabel2).addGap(20, 20, 20)
												.addGroup(jPanel1Layout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
														.addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)))
								.addGroup(jPanel1Layout.createSequentialGroup().addComponent(jLabel4).addGap(30, 30, 30)
										.addGroup(jPanel1Layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
												.addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 118,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 0,
														Short.MAX_VALUE))))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(jLabel12).addComponent(jLabel18))
								.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
										jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jLabel17).addComponent(jLabel11)))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
								.addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 119,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 119,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 119,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(jPanel1Layout.createSequentialGroup().addComponent(jLabel10)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 119,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGroup(jPanel1Layout.createSequentialGroup()
										.addGroup(jPanel1Layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jLabel14).addComponent(jLabel15))
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 119,
												javax.swing.GroupLayout.PREFERRED_SIZE)))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(jLabel13).addComponent(jLabel16))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
								javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(jButton10).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 56,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 170,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jLabel8)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(consoleCommand, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

		boardPanel.setBackground(new java.awt.Color(0, 0, 240));
		boardPanel.setMaximumSize(new java.awt.Dimension(1300, 1300));
		boardPanel.setMinimumSize(new java.awt.Dimension(1300, 1300));
		boardPanel.setName("");
		boardPanel.setPreferredSize(new java.awt.Dimension(1300, 1300));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				javax.swing.GroupLayout.Alignment.TRAILING,
				layout.createSequentialGroup().addGap(176, 176, 176)
						.addComponent(boardPanel, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 219, Short.MAX_VALUE)
						.addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 703,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(148, 148, 148)));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup().addGroup(layout
						.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
						.addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING,
								javax.swing.GroupLayout.DEFAULT_SIZE, 1371, Short.MAX_VALUE)
						.addGroup(layout.createSequentialGroup()
								.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addComponent(
										boardPanel, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
						.addGap(50, 50, 50)));
		boardPanel.setBackground(Color.black);
		boardPanel.setLayout(new GridLayout(MAP_SIZE, MAP_SIZE));
		for (int i = 0; i < MAP_SIZE; i++) {
			for (int j = 0; j < MAP_SIZE; j++) {
				boardPanel.add(map[i][j]);
				map[i][j].setPreferredSize(new Dimension(1300 / MAP_SIZE, 1300 / MAP_SIZE));
				map[i][j].setBorder(new LineBorder(Color.GRAY));
				map[i][j].addActionListener(this);
				if (map[i][j].isFog()) {
					map[i][j].setIcon(game.getAsset().getFog());
				}
				if (map[i][j] instanceof Grass) {
					map[i][j].setBackground(Color.green);
				} else if (map[i][j] instanceof Lumber) {
					map[i][j].setBackground(new Color(205, 133, 63));
				} else if (map[i][j] instanceof Stone) {
					map[i][j].setBackground(Color.gray);
				} else if (map[i][j] instanceof Water) {
					map[i][j].setBackground(Color.blue);
				} else if (map[i][j] instanceof Horse) {
					map[i][j].setBackground(new Color(245, 222, 179));
				}

			}
			checkForExplored();
		}
		pack();
	}

	public void initTitleScreen() {
		titleJPanel2 = new javax.swing.JLabel();
		titleJLabel1 = new javax.swing.JLabel();
		titleJButton1 = new javax.swing.JButton();
		titleJButton4 = new javax.swing.JButton();
		titleJButton5 = new javax.swing.JButton();
		titleJButton6 = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setPreferredSize(new java.awt.Dimension(2596, 1320));
		titleJPanel2.setIcon(game.getAsset().getTitleScreen());
		titleJLabel1.setFont(new java.awt.Font("Tahoma", 0, 200));
		titleJLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		titleJLabel1.setText("");

		titleJButton1.setFont(new java.awt.Font("Tahoma", 0, 36));
		titleJButton1.setText("Play");
		titleJButton1.setFocusable(false);
		titleJButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				playTitleJButtonActionPerformed(evt);
			}
		});

		titleJButton4.setFont(new java.awt.Font("Tahoma", 0, 36));
		titleJButton4.setText("Credits");
		titleJButton4.setFocusable(false);
		titleJButton4.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				titleJButton4ActionPerformed(evt);
			}
		});

		titleJButton5.setFont(new java.awt.Font("Tahoma", 0, 36));
		titleJButton5.setText("Rules");
		titleJButton5.setFocusable(false);
		titleJButton5.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				titleJButton5ActionPerformed(evt);
			}
		});

		titleJButton6.setFont(new java.awt.Font("Tahoma", 0, 36));
		titleJButton6.setText("Exit");
		titleJButton6.setFocusable(false);
		titleJButton6.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				titleJButton6ActionPerformed(evt);
			}
		});
		javax.swing.GroupLayout titleJPanel2Layout = new javax.swing.GroupLayout(titleJPanel2);
		titleJPanel2.setLayout(titleJPanel2Layout);
		titleJPanel2Layout
				.setHorizontalGroup(titleJPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
								titleJPanel2Layout.createSequentialGroup().addContainerGap(1076, Short.MAX_VALUE)
										.addGroup(titleJPanel2Layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
												.addComponent(titleJButton1, javax.swing.GroupLayout.PREFERRED_SIZE,
														500, Short.MAX_VALUE)
												.addComponent(titleJButton4, javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE, Short.MAX_VALUE)
												.addComponent(titleJButton5, javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE, Short.MAX_VALUE)
												.addComponent(titleJButton6, javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE, Short.MAX_VALUE))
										.addGap(1034, 1034, 1034))
						.addComponent(titleJLabel1, javax.swing.GroupLayout.DEFAULT_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
		titleJPanel2Layout
				.setVerticalGroup(
						titleJPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(titleJPanel2Layout.createSequentialGroup()
										.addComponent(titleJLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 575,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(143, 143, 143)
										.addComponent(titleJButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(43, 43, 43)
										.addComponent(titleJButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 50,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(38, 38, 38)
										.addComponent(titleJButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 50,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(29, 29, 29)
										.addComponent(titleJButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 50,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(0, 51, Short.MAX_VALUE)));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(
				layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(titleJPanel2,
						javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
		layout.setVerticalGroup(
				layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(titleJPanel2,
						javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
		int randomColor = game.getRandomNum(2);
		if (randomColor == 0) {
			titleJButton1.setBackground(new Color(205, 42, 21));
			titleJButton4.setBackground(new Color(205, 42, 21));
			titleJButton5.setBackground(new Color(205, 42, 21));
			titleJButton6.setBackground(new Color(205, 42, 21));
		} else {
			titleJButton1.setBackground(new Color(81, 97, 251));
			titleJButton4.setBackground(new Color(81, 97, 251));
			titleJButton5.setBackground(new Color(81, 97, 251));
			titleJButton6.setBackground(new Color(81, 97, 251));
		}
		titleJButton1.setForeground(Color.white);
		titleJButton4.setForeground(Color.white);
		titleJButton5.setForeground(Color.white);
		titleJButton6.setForeground(Color.white);

		pack();
	}

	public void initCredits() {
		credits = new javax.swing.JLabel();
		credits.setPreferredSize(new Dimension(2596, 1320));
		credits.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		credits.setIcon(game.getAsset().getCreditsBackground());
		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				credits, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				credits, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
		pack();
	}
	
	public void initWin() {
		win = new javax.swing.JLabel();
		win.setPreferredSize(new Dimension(2596, 1320));
		win.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		win.setIcon(game.getAsset().getCreditsBackground());
		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				win, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				win, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
		pack();
	}
	public void setWinScreen1() {
		win.setIcon(game.getAsset().getP1Win());
	}
	
	public void setWinScreen2() {
		win.setIcon(game.getAsset().getP2Win());
	}

	public void initRules() {
		rules = new javax.swing.JLabel();
		rules.setPreferredSize(new Dimension(2596, 1320));
		rules.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		rules.setIcon(game.getAsset().getRulesBackground());
		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				rules, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				rules, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
		pack();
		// this.add(rules);
	}

	public void player1BuyIcons() {
		jButton10.setBackground(new Color(81, 97, 251));
		jLabel3.setIcon(game.getAsset().getMarkIcon());
		jLabel5.setIcon(game.getAsset().getLumberIcon());
		jLabel7.setIcon(game.getAsset().getStoneIcon());
		jLabel9.setIcon(game.getAsset().getHorsesIcon());
		jButton9.setIcon(game.getAsset().getBuyIconP1Archer());
		jButton8.setIcon(game.getAsset().getBuyIconP1HorseRider());
		jButton7.setIcon(game.getAsset().getBuyIconP1Warrior());
		jButton6.setIcon(game.getAsset().getBuyIconP1Hunter());
		jButton5.setIcon(game.getAsset().getBuyIconP1Road());
		jButton4.setIcon(game.getAsset().getBuyIconP1Barracks());
		jButton3.setIcon(game.getAsset().getBuyIconP1Stable());
		jButton2.setIcon(game.getAsset().getBuyIconP1Quarry());
		jButton1.setIcon(game.getAsset().getBuyIconP1Lumbermill());
	}

	public void player2BuyIcons() {
		jButton10.setBackground(new Color(205, 42, 21));
		jLabel3.setIcon(game.getAsset().getMarkIcon());
		jLabel5.setIcon(game.getAsset().getLumberIcon());
		jLabel7.setIcon(game.getAsset().getStoneIcon());
		jLabel9.setIcon(game.getAsset().getHorsesIcon());
		jButton9.setIcon(game.getAsset().getBuyIconP2Archer());
		jButton8.setIcon(game.getAsset().getBuyIconP2HorseRider());
		jButton7.setIcon(game.getAsset().getBuyIconP2Warrior());
		jButton6.setIcon(game.getAsset().getBuyIconP2Hunter());
		jButton5.setIcon(game.getAsset().getBuyIconP2Road());
		jButton4.setIcon(game.getAsset().getBuyIconP2Barracks());
		jButton3.setIcon(game.getAsset().getBuyIconP2Stable());
		jButton2.setIcon(game.getAsset().getBuyIconP2Quarry());
		jButton1.setIcon(game.getAsset().getBuyIconP2Lumbermill());
	}

	public void checkForExplored() {
		for (int i = 0; i < MAP_SIZE; i++) {
			for (int j = 0; j < MAP_SIZE; j++) {
				boolean explored = ((map[i][j].getBuilding() != null) || (map[i][j].getUnit() != null));
				if (explored) {
					try {
						map[i - 1][j].setFog(false);
					} catch (Exception ArrayIndexOutOfBoundsException) {
					}
					try {
						map[i + 1][j].setFog(false);
					} catch (Exception ArrayIndexOutOfBoundsException) {
					}
					try {
						map[i][j - 1].setFog(false);
					} catch (Exception ArrayIndexOutOfBoundsException) {
					}
					try {
						map[i][j + 1].setFog(false);
					} catch (Exception ArrayIndexOutOfBoundsException) {
					}
					try {
						map[i][j + 1].setFog(false);
					} catch (Exception ArrayIndexOutOfBoundsException) {
					}
				}
			}
		}
		refreshMapTileIcons();
	}

	public void setTurnEventBox(String s) {
		String source = turnEventsTextArea.getText();
		turnEventsTextArea.setText(source + "\n" + s);

	}

	private void endTurn() {
		
		tileSelection = null;
		unitSelection = null;
		for (int i = 0; i < MAP_SIZE; i++) {
			for (int j = 0; j < MAP_SIZE; j++) {
				map[i][j].setBorder(new LineBorder(Color.GRAY));
			}
		}
		game.doEndTurn();
		if (game.getCurrentPlayer() == game.getPlayer1()) {
			game.setCurrentPlayer(game.getPlayer2());
			playerTurnLabel.setText("Player 2");
			player2BuyIcons();
		} else {
			game.setCurrentPlayer(game.getPlayer1());
			playerTurnLabel.setText("Player 1");
			player1BuyIcons();
		}
		for (int i = 0; i < MAP_SIZE; i++) {
			for (int j = 0; j < MAP_SIZE; j++) {
				if (map[i][j].getUnit() != null) {
					map[i][j].getUnit().setCurrentAttacks(map[i][j].getUnit().getTotalAttacks());
				}
			}
		}
		refreshMapTileIcons();
		updateResources();
	}

	// ---------------------------------------------------\\ BUILDINGS
	// //---------------------------------------------------\\
	private void lumberMillButtonActionPerformed(java.awt.event.ActionEvent evt) {
		int pMoney = game.getCurrentPlayer().getMarks();
		LumberMill lumberMill = new LumberMill();
		if (game.handleBuildingBuildings(Resource.Lumber, lumberMill.getMarkCost(), lumberMill.getLumberCost(),
				lumberMill.getStoneCost(), lumberMill.getHorseCost())) {
			game.handlePurchaseOfBuilding(lumberMill, lumberMill.getMarkCost(), lumberMill.getLumberCost(),
					lumberMill.getStoneCost(), lumberMill.getHorseCost());
			if (pMoney > game.getCurrentPlayer().getMarks()) {
				game.getAsset().Song(game.getAsset().getLumberMillCreationMusic());
				game.getAsset().play();
			}
		}
		refreshMapTileIcons();
		updateResources();
	}

	/*
	 * Determines what happens when you press the Quarry Jbutton
	 */
	private void quarryButtonActionPerformed(java.awt.event.ActionEvent evt) {
		int pMoney = game.getCurrentPlayer().getMarks();
		Quarry quarry = new Quarry();
		if (game.handleBuildingBuildings(Resource.Stone, quarry.getMarkCost(), quarry.getLumberCost(),
				quarry.getStoneCost(), quarry.getHorseCost())) {
			game.handlePurchaseOfBuilding(quarry, quarry.getMarkCost(), quarry.getLumberCost(), quarry.getStoneCost(),
					quarry.getHorseCost());
			if (pMoney > game.getCurrentPlayer().getMarks()) {
				game.getAsset().Song(game.getAsset().getQuarryCreationMusic());
				game.getAsset().play();
			}
		}
		refreshMapTileIcons();
		updateResources();
	}

	/*
	 * Determines what happens when you press the Stable Jbutton
	 */
	private void stableButtonActionPerformed(java.awt.event.ActionEvent evt) {
		int pMoney = game.getCurrentPlayer().getMarks();
		Stable stable = new Stable();
		if (game.handleBuildingBuildings(Resource.Horse, stable.getMarkCost(), stable.getLumberCost(),
				stable.getStoneCost(), stable.getHorseCost())) {
			game.handlePurchaseOfBuilding(stable, stable.getMarkCost(), stable.getLumberCost(), stable.getStoneCost(),
					stable.getHorseCost());
			if (pMoney > game.getCurrentPlayer().getMarks()) {
				game.getAsset().Song(game.getAsset().getStableCreationMusic());
				game.getAsset().play();
			}
		}
		refreshMapTileIcons();
		updateResources();
	}

	/*
	 * Determines what happens when you press the Barracks Jbutton
	 */
	private void barracksButtonActionPerformed(java.awt.event.ActionEvent evt) {
		int pMoney = game.getCurrentPlayer().getMarks();
		Barracks barrack = new Barracks();
		if (game.handleBuildingBuildings(Resource.Grass, barrack.getMarkCost(), barrack.getLumberCost(),
				barrack.getStoneCost(), barrack.getHorseCost())) {
			game.handlePurchaseOfBuilding(barrack, barrack.getMarkCost(), barrack.getLumberCost(),
					barrack.getStoneCost(), barrack.getHorseCost());
			if (pMoney > game.getCurrentPlayer().getMarks()) {
				game.getAsset().Song(game.getAsset().getBarracksCreationMusic());
				game.getAsset().play();
			}
		}
		refreshMapTileIcons();
		updateResources();
	}

	/*
	 * Determines what happens when you press the Road Jbutton
	 */
	private void roadButtonActionPerformed(java.awt.event.ActionEvent evt) {
		Road road = new Road();
		int pMoney = game.getCurrentPlayer().getMarks();
		if (game.handleBuildingBuildings(Resource.Grass, road.getMarkCost(), road.getLumberCost(), road.getStoneCost(),
				road.getHorseCost())) {
			game.handlePurchaseOfBuilding(road, road.getMarkCost(), road.getLumberCost(), road.getStoneCost(),
					road.getHorseCost());
			if (pMoney > game.getCurrentPlayer().getMarks()) {
				game.getAsset().Song(game.getAsset().getRoadCreationMusic());
				game.getAsset().play();
			}
		}
		refreshMapTileIcons();
		updateResources();
	}
	// ---------------------------------------------------\\ ---------
	// //---------------------------------------------------\\

	// ---------------------------------------------------\\ UNITS
	// //---------------------------------------------------\\
	/*
	 * Determines what happens when you press the Hunter Jbutton
	 */
	private void hunterButtonActionPerformed(java.awt.event.ActionEvent evt) {
		int pMoney = game.getCurrentPlayer().getMarks();
		Hunter hunter = new Hunter();
		game.handlePurchaseOfUnit(hunter, hunter.getMarkCost(), hunter.getLumberCost(), hunter.getStoneCost(),
				hunter.getHorseCost());
		if (pMoney > game.getCurrentPlayer().getMarks()) {
			game.getAsset().Song(game.getAsset().getHunterCreationMusic());
			game.getAsset().play();

		}
		updateResources();
	}

	/*
	 * Determines what happens when you press the Archer Jbutton
	 */
	private void archerActionPerformed(java.awt.event.ActionEvent evt) {
		int pMoney = game.getCurrentPlayer().getMarks();
		Archer archer = new Archer();
		game.handlePurchaseOfUnit(archer, archer.getMarkCost(), archer.getLumberCost(), archer.getStoneCost(),
				archer.getHorseCost());
		if (pMoney > game.getCurrentPlayer().getMarks()) {
			game.getAsset().Song(game.getAsset().getArcherCreationMusic());
			game.getAsset().play();

		}
		updateResources();
	}

	/*
	 * Determines what happens when you press the HorseRider Jbutton
	 */
	private void horseRiderButtonActionPerformed(java.awt.event.ActionEvent evt) {
		int pMoney = game.getCurrentPlayer().getMarks();
		HorseRider horseRider = new HorseRider();
		game.handlePurchaseOfUnit(horseRider, horseRider.getMarkCost(), horseRider.getLumberCost(),
				horseRider.getStoneCost(), horseRider.getHorseCost());
		if (pMoney > game.getCurrentPlayer().getMarks()) {
			game.getAsset().Song(game.getAsset().getHorseRiderMusic());
			game.getAsset().play();

		}
		updateResources();
	}

	/*
	 * Determines what happens when you press the Warrior Jbutton
	 */
	private void warriorButtonActionPerformed(java.awt.event.ActionEvent evt) {
		int pMoney = game.getCurrentPlayer().getMarks();
		Warrior warrior = new Warrior();
		game.handlePurchaseOfUnit(warrior, warrior.getMarkCost(), warrior.getLumberCost(), warrior.getStoneCost(),
				warrior.getHorseCost());
		if (pMoney > game.getCurrentPlayer().getMarks()) {
			game.getAsset().Song(game.getAsset().getWarriorMusic());
			game.getAsset().play();

		}
		updateResources();
	}

	// ---------------------------------------------------\\ -----
	// //---------------------------------------------------\\
	/*
	 * Determines what happens when you press the Play Jbutton
	 */
	private void playTitleJButtonActionPerformed(java.awt.event.ActionEvent evt) {
		titleJPanel2.setVisible(false);
		credits.setVisible(false);
		rules.setVisible(false);
		jPanel1.setVisible(true);
		boardPanel.setVisible(true);
		game.getAsset().stop();
		game.getAsset().SongBackground(game.getAsset().getBackgroundMusic());
		game.getAsset().loopBG();
		updateResources();
	}

	/*
	 * Determines what happens when you press the Credits Jbutton
	 */
	private void titleJButton4ActionPerformed(java.awt.event.ActionEvent evt) {
		titleJPanel2.setVisible(false);
		jPanel1.setVisible(false);
		boardPanel.setVisible(false);
		rules.setVisible(false);
		credits.setVisible(true);
	}

	/*
	 * Determines what happens when you press the Rules Jbutton
	 */
	private void titleJButton5ActionPerformed(java.awt.event.ActionEvent evt) {
		titleJPanel2.setVisible(false);
		jPanel1.setVisible(false);
		boardPanel.setVisible(false);
		credits.setVisible(false);
		rules.setVisible(true);
	}

	/*
	 * Determines what happens when you press the Exit Jbutton
	 */
	private void titleJButton6ActionPerformed(java.awt.event.ActionEvent evt) {
		System.exit(0);
	}

	/*
	 * Determines what happens when you press the End Turn Jbutton
	 */
	private void endTurnActionPerformed(java.awt.event.ActionEvent evt) {
		endTurn();
	}

	/*
	 * Plays the victory music
	 */
	public void victoryMusic() {
		game.getAsset().stop();
		game.getAsset().Song(game.getAsset().getVictoryMusic());
		game.getAsset().loop();
	}

	/*
	 * Action Performed method, helps with cheat codes by taking what is in the
	 * console, also helps with unit selection
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		String cheatCode = consoleCommand.getText();
		if (cheatCode.equalsIgnoreCase("show me the money")) {
			int currentMarks = game.getCurrentPlayer().getMarks();
			int currentLumber = game.getCurrentPlayer().getLumber();
			int currentStone = game.getCurrentPlayer().getStone();
			int currentHorses = game.getCurrentPlayer().getHorses();

			game.getCurrentPlayer().setMarks(currentMarks + 100);
			game.getCurrentPlayer().setLumber(currentLumber + 100);
			game.getCurrentPlayer().setStone(currentStone + 100);
			game.getCurrentPlayer().setHorses(currentHorses + 100);
			consoleCommand.setText("");
			game.getAsset().Song(game.getAsset().getCheatsMusic());
			game.getAsset().play();
			updateResources();
		}
		if (cheatCode.equalsIgnoreCase("there is no cow level")) {
			// TODO
		}
		if (cheatCode.equalsIgnoreCase("godmode")) {
			// TODO
		}
		if (cheatCode.equalsIgnoreCase("my other game")) {

		}
		if (cheatCode.equalsIgnoreCase("all seeing eye")) {

		}
		// if(cheatCode.equals())
		else {
			consoleCommand.setText("");
		}
		for (int i = 0; i < MAP_SIZE; i++) {
			for (int j = 0; j < MAP_SIZE; j++) {
				map[i][j].setBorder(new LineBorder(Color.GRAY));
				if (e.getSource() == map[i][j] && unitSelection != null && map[i][j].getUnit() != null
						&& map[i][j].getUnit().getPlayer() != game.getCurrentPlayer()) {
					tileSelection = map[i][j];
					map[i][j].setBorder(BorderFactory.createLineBorder(Color.RED, 4));
					game.tryHandleAttack();
				} else if (e.getSource() == map[i][j] && map[i][j].getUnit() != null) {
					unitSelection = map[i][j].getUnit();
					tileSelection = null;
					map[i][j].setBorder(BorderFactory.createLineBorder(Color.ORANGE, 4));
				} else if (e.getSource() == map[i][j] && !(map[i][j] instanceof Water)
						&& (map[i][j].getUnit() == null)) {
					tileSelection = map[i][j];
					map[i][j].setBorder(BorderFactory.createLineBorder(Color.RED, 4));
					if (unitSelection != null) {
						if (unitSelection.getPlayer() == game.getCurrentPlayer()) {
							refreshMapTileIcons();
							game.tryHandleMovement();
							unitSelection = null;
							refreshMapTileIcons();
						}
					}
				}
			}
		}
		refreshMapTileIcons();
	}

	/*
	 * Updates the resources JLabel by checking the current players resources
	 */
	public void updateResources() {
		marksLabel.setText(game.getCurrentPlayer().getMarks() + "");
		lumberLabel.setText(game.getCurrentPlayer().getLumber() + "");
		stoneLabel.setText(game.getCurrentPlayer().getStone() + "");
		horsesLabel.setText(game.getCurrentPlayer().getHorses() + "");
	}

	/*
	 * Refreshes the map Icons by checking every tile and what is currently held
	 * inside it
	 */
	public void refreshMapTileIcons() {
		getCorrectRoad();
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map.length; j++) {
				if (!map[i][j].isFog()) {
					if (map[i][j].getUnit() != null) {
						if (map[i][j].getUnit().getPlayer() == game.getPlayer1()) {
							if (map[i][j].getUnit() instanceof Hunter) {
								map[i][j].setIcon(game.getAsset().getP1Hunter());
							} else if (map[i][j].getUnit() instanceof Archer) {
								map[i][j].setIcon(game.getAsset().getP1Archer());
							} else if (map[i][j].getUnit() instanceof HorseRider) {
								map[i][j].setIcon(game.getAsset().getP1Rider());
							} else if (map[i][j].getUnit() instanceof Warrior) {
								map[i][j].setIcon(game.getAsset().getP1Warrior());
							}
						} else {
							if (map[i][j].getUnit() instanceof Hunter) {
								map[i][j].setIcon(game.getAsset().getP2Hunter());
							} else if (map[i][j].getUnit() instanceof Archer) {
								map[i][j].setIcon(game.getAsset().getP2Archer());
							} else if (map[i][j].getUnit() instanceof HorseRider) {
								map[i][j].setIcon(game.getAsset().getP2Rider());
							} else if (map[i][j].getUnit() instanceof Warrior) {
								map[i][j].setIcon(game.getAsset().getP2Warrior());
							} else if (map[i][j] instanceof Lumber) {
								map[i][j].setIcon(game.getAsset().getLumber());
							} else if (map[i][j] instanceof Stone) {
								map[i][j].setIcon(game.getAsset().getStone());
							} else if (map[i][j] instanceof Horse) {
								map[i][j].setIcon(game.getAsset().getHorse());
							} else if (map[i][j] instanceof Grass) {
								map[i][j].setIcon(game.getAsset().getGrass());
							}
						}
					} else if (map[i][j].getBuilding() != null) {
						if (map[i][j].getBuilding().getPlayer() == game.getPlayer1()) {
							if (map[i][j].getBuilding() instanceof Settlement) {
								map[i][j].setIcon(game.getAsset().getP1Settlement());
							} else if (map[i][j].getBuilding() instanceof Barracks) {
								map[i][j].setIcon(game.getAsset().getP1Barracks());
							} else if (map[i][j].getBuilding() instanceof LumberMill) {
								map[i][j].setIcon(game.getAsset().getP1Lumbermill());
							} else if (map[i][j].getBuilding() instanceof Quarry) {
								map[i][j].setIcon(game.getAsset().getP1Quarry());
							} else if (map[i][j].getBuilding() instanceof Stable) {
								map[i][j].setIcon(game.getAsset().getP1Stable());
							}
						} else {
							if (map[i][j].getBuilding() instanceof Settlement) {
								map[i][j].setIcon(game.getAsset().getP2Settlement());
							} else if (map[i][j].getBuilding() instanceof Barracks) {
								map[i][j].setIcon(game.getAsset().getP2Barracks());
							} else if (map[i][j].getBuilding() instanceof LumberMill) {
								map[i][j].setIcon(game.getAsset().getP2Lumbermill());
							} else if (map[i][j].getBuilding() instanceof Quarry) {
								map[i][j].setIcon(game.getAsset().getP2Quarry());
							} else if (map[i][j].getBuilding() instanceof Stable) {
								map[i][j].setIcon(game.getAsset().getP2Stable());
							}
						}
					} else {
						if (map[i][j] instanceof Lumber) {
							map[i][j].setIcon(game.getAsset().getLumber());
						} else if (map[i][j] instanceof Stone) {
							map[i][j].setIcon(game.getAsset().getStone());
						} else if (map[i][j] instanceof Horse) {
							map[i][j].setIcon(game.getAsset().getHorse());
						} else if (map[i][j] instanceof Grass) {
							map[i][j].setIcon(game.getAsset().getGrass());
						}
					}
				}
			}
		}

	}

	/*
	 * Places the correct road image by checking the surrounding tiles for
	 * buildings
	 */
	public void getCorrectRoad() {
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map.length; j++) {
				boolean isPlayersRoad = map[i][j].getBuilding() instanceof Building
						&& map[i][j].getBuilding().getPlayer() == game.getPlayer1();
				boolean isPlayerRoadNorth = false;
				boolean isPlayerRoadSouth = false;
				boolean isPlayerRoadEast = false;
				boolean isPlayerRoadWest = false;
				try {
					isPlayerRoadNorth = map[i - 1][j].getBuilding() instanceof Building
							&& map[i - 1][j].getBuilding().getPlayer() == game.getPlayer1();
				} catch (Exception ArrayIndexOutOfBoundsException) {
				}
				;
				try {
					isPlayerRoadSouth = map[i + 1][j].getBuilding() instanceof Building
							&& map[i + 1][j].getBuilding().getPlayer() == game.getPlayer1();
				} catch (Exception ArrayIndexOutOfBoundsException) {
				}
				;
				try {
					isPlayerRoadEast = map[i][j + 1].getBuilding() instanceof Building
							&& map[i][j + 1].getBuilding().getPlayer() == game.getPlayer1();
				} catch (Exception ArrayIndexOutOfBoundsException) {
				}
				;
				try {
					isPlayerRoadWest = map[i][j - 1].getBuilding() instanceof Building
							&& map[i][j - 1].getBuilding().getPlayer() == game.getPlayer1();
				} catch (Exception ArrayIndexOutOfBoundsException) {
				}
				;
				if (isPlayersRoad && map[i][j].getBuilding() instanceof Road) {
					if (isPlayerRoadNorth && isPlayerRoadSouth && isPlayerRoadEast && isPlayerRoadWest) {
						map[i][j].setIcon(game.getAsset().getP1RoadAll());
					} else if (isPlayerRoadNorth && isPlayerRoadSouth && isPlayerRoadEast) {
						map[i][j].setIcon(game.getAsset().getP1RoadTopBottomRight());
					} else if (isPlayerRoadNorth && isPlayerRoadSouth && isPlayerRoadWest) {
						map[i][j].setIcon(game.getAsset().getP1RoadTopLeftBottom());
					} else if (isPlayerRoadNorth && isPlayerRoadWest && isPlayerRoadEast) {
						map[i][j].setIcon(game.getAsset().getP1RoadTopLeftRight());
					} else if (isPlayerRoadWest && isPlayerRoadSouth && isPlayerRoadEast) {
						map[i][j].setIcon(game.getAsset().getP1RoadLeftBottomRight());
					} else if (isPlayerRoadNorth && isPlayerRoadSouth) {
						map[i][j].setIcon(game.getAsset().getP1RoadTopBottom());
					} else if (isPlayerRoadNorth && isPlayerRoadEast) {
						map[i][j].setIcon(game.getAsset().getP1RoadTopRight());
					} else if (isPlayerRoadNorth && isPlayerRoadWest) {
						map[i][j].setIcon(game.getAsset().getP1RoadTopLeft());
					} else if (isPlayerRoadSouth && isPlayerRoadEast) {
						map[i][j].setIcon(game.getAsset().getP1RoadBottomRight());
					} else if (isPlayerRoadSouth && isPlayerRoadWest) {
						map[i][j].setIcon(game.getAsset().getP1RoadLeftBottom());
					} else if (isPlayerRoadEast && isPlayerRoadWest) {
						map[i][j].setIcon(game.getAsset().getP1RoadLeftRight());
					} else if (isPlayerRoadNorth) {
						map[i][j].setIcon(game.getAsset().getP1RoadTopBottom());
					} else if (isPlayerRoadSouth) {
						map[i][j].setIcon(game.getAsset().getP1RoadTopBottom());
					} else if (isPlayerRoadWest) {
						map[i][j].setIcon(game.getAsset().getP1RoadLeftRight());
					} else if (isPlayerRoadEast) {
						map[i][j].setIcon(game.getAsset().getP1RoadLeftRight());
					} else {
						map[i][j].setIcon(game.getAsset().getP1RoadAll());
					}

				}
			}
		}
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map.length; j++) {
				boolean isPlayersRoad = map[i][j].getBuilding() instanceof Building
						&& map[i][j].getBuilding().getPlayer() == game.getPlayer2();
				boolean isPlayerRoadNorth = false;
				boolean isPlayerRoadSouth = false;
				boolean isPlayerRoadEast = false;
				boolean isPlayerRoadWest = false;
				try {
					isPlayerRoadNorth = map[i - 1][j].getBuilding() instanceof Building
							&& map[i - 1][j].getBuilding().getPlayer() == game.getPlayer2();
				} catch (Exception ArrayIndexOutOfBoundsException) {
				}
				;
				try {
					isPlayerRoadSouth = map[i + 1][j].getBuilding() instanceof Building
							&& map[i + 1][j].getBuilding().getPlayer() == game.getPlayer2();
				} catch (Exception ArrayIndexOutOfBoundsException) {
				}
				;
				try {
					isPlayerRoadEast = map[i][j + 1].getBuilding() instanceof Building
							&& map[i][j + 1].getBuilding().getPlayer() == game.getPlayer2();
				} catch (Exception ArrayIndexOutOfBoundsException) {
				}
				;
				try {
					isPlayerRoadWest = map[i][j - 1].getBuilding() instanceof Building
							&& map[i][j - 1].getBuilding().getPlayer() == game.getPlayer2();
				} catch (Exception ArrayIndexOutOfBoundsException) {
				}
				;
				if (isPlayersRoad && map[i][j].getBuilding() instanceof Road) {
					if (isPlayerRoadNorth && isPlayerRoadSouth && isPlayerRoadEast && isPlayerRoadWest) {
						map[i][j].setIcon(game.getAsset().getP2RoadAll());
					} else if (isPlayerRoadNorth && isPlayerRoadSouth && isPlayerRoadEast) {
						map[i][j].setIcon(game.getAsset().getP2RoadTopBottomRight());
					} else if (isPlayerRoadNorth && isPlayerRoadSouth && isPlayerRoadWest) {
						map[i][j].setIcon(game.getAsset().getP2RoadTopLeftBottom());
					} else if (isPlayerRoadNorth && isPlayerRoadWest && isPlayerRoadEast) {
						map[i][j].setIcon(game.getAsset().getP2RoadTopLeftRight());
					} else if (isPlayerRoadWest && isPlayerRoadSouth && isPlayerRoadEast) {
						map[i][j].setIcon(game.getAsset().getP2RoadLeftBottomRight());
					} else if (isPlayerRoadNorth && isPlayerRoadSouth) {
						map[i][j].setIcon(game.getAsset().getP2RoadTopBottom());
					} else if (isPlayerRoadNorth && isPlayerRoadEast) {
						map[i][j].setIcon(game.getAsset().getP2RoadTopRight());
					} else if (isPlayerRoadNorth && isPlayerRoadWest) {
						map[i][j].setIcon(game.getAsset().getP2RoadTopLeft());
					} else if (isPlayerRoadSouth && isPlayerRoadEast) {
						map[i][j].setIcon(game.getAsset().getP2RoadBottomRight());
					} else if (isPlayerRoadSouth && isPlayerRoadWest) {
						map[i][j].setIcon(game.getAsset().getP2RoadLeftBottom());
					} else if (isPlayerRoadEast && isPlayerRoadWest) {
						map[i][j].setIcon(game.getAsset().getP2RoadLeftRight());
					} else if (isPlayerRoadNorth) {
						map[i][j].setIcon(game.getAsset().getP2RoadTopBottom());
					} else if (isPlayerRoadSouth) {
						map[i][j].setIcon(game.getAsset().getP2RoadTopBottom());
					} else if (isPlayerRoadWest) {
						map[i][j].setIcon(game.getAsset().getP2RoadLeftRight());
					} else if (isPlayerRoadEast) {
						map[i][j].setIcon(game.getAsset().getP2RoadLeftRight());
					} else {
						map[i][j].setIcon(game.getAsset().getP2RoadAll());
					}
				}

			}
		}
	}

	/*
	 * Key pressed event currently brings the user to the title screen by
	 * pressing the escape key using KeyEvent Also switches songs to the title
	 * screen music
	 */
	@Override
	public void keyPressed(java.awt.event.KeyEvent e) {
		int location = e.getKeyCode();
		if (location == KeyEvent.VK_ESCAPE && !titleJPanel2.isVisible()) {
			jPanel1.setVisible(false);
			boardPanel.setVisible(false);
			credits.setVisible(false);
			rules.setVisible(false);
			titleJPanel2.setVisible(true);
			game.getAsset().stop();
			game.getAsset().stopBG();
			game.getAsset().Song(game.getAsset().getTitleScreenMusic());
			game.getAsset().loop();
		}
	}

	@Override
	public void keyReleased(java.awt.event.KeyEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyTyped(java.awt.event.KeyEvent arg0) {
		// TODO Auto-generated method stub

	}

	public JButton getTileSelection() {
		return tileSelection;
	}

	public void setTileSelection(Tile tile) {
		this.tileSelection = tile;
	}

	public Unit getUnitSelection() {
		return unitSelection;
	}

	public void setUnitSelection(Unit unit) {
		this.unitSelection = unit;
	}

	public void winScreen() {
		jPanel1.setVisible(false);
		boardPanel.setVisible(false);
		win.setVisible(true);
	}

}
