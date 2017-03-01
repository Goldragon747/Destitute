package edu.neumont.csc150.destitute.game.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

import edu.neumont.csc150.destitute.game.controller.Game;
import edu.neumont.csc150.destitute.game.model.tiles.Grass;
import edu.neumont.csc150.destitute.game.model.tiles.Horse;
import edu.neumont.csc150.destitute.game.model.tiles.Lumber;
import edu.neumont.csc150.destitute.game.model.tiles.Stone;
import edu.neumont.csc150.destitute.game.model.tiles.Tile;
import edu.neumont.csc150.destitute.game.model.tiles.Water;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Gabe B
 */
public class GUI extends javax.swing.JFrame {
	private Game game;
	private Tile[][] map;
	private final int MAP_SIZE;
	private JButton tileSelection;
	private javax.swing.JButton lumberMillButton;
    private javax.swing.JButton endTurnButton;
    private javax.swing.JButton quarryButton;
    private javax.swing.JButton stableButton;
    private javax.swing.JButton barracksButton;
    private javax.swing.JButton roadButton;
    private javax.swing.JButton hunterButton;
    private javax.swing.JButton warriorButton;
    private javax.swing.JButton calvaryButton;
    private javax.swing.JButton archerButton;
    private javax.swing.JLabel playerTurnLabel;
    private javax.swing.JLabel unitsLabel;
    private javax.swing.JLabel marksLabel;
    private javax.swing.JLabel buildingsLabel;
    private javax.swing.JLabel stoneLabel;
    private javax.swing.JLabel turnEventsLabel;
    private javax.swing.JLabel lumberLabel;
    private javax.swing.JLabel consoleCommandsLabel;
    private javax.swing.JLabel horsesLabel;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JPanel playerMenuPanel;
    private javax.swing.JPanel boardPanel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea turnEventsTextArea;
    private javax.swing.JTextField consoleCommandsTextField;

    public GUI(Game game,Tile[][] map,int MAP_SIZE) {
    	this.game = game;
        this.map = map;
        this.MAP_SIZE = MAP_SIZE;
        initComponents();
        this.setVisible(true);
    }

	private void initComponents() {
        //Panels
		playerMenuPanel = new javax.swing.JPanel();
		boardPanel = new javax.swing.JPanel();
		//Labels
		playerTurnLabel = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        marksLabel = new javax.swing.JLabel();
        stoneLabel = new javax.swing.JLabel();
        lumberLabel = new javax.swing.JLabel();
        horsesLabel = new javax.swing.JLabel();
        unitsLabel = new javax.swing.JLabel();
        buildingsLabel = new javax.swing.JLabel();
        turnEventsLabel = new javax.swing.JLabel();
        consoleCommandsLabel = new javax.swing.JLabel();
        //Buttons
        lumberMillButton = new javax.swing.JButton();
        quarryButton = new javax.swing.JButton();
        stableButton = new javax.swing.JButton();
        barracksButton = new javax.swing.JButton();
        roadButton = new javax.swing.JButton();
        hunterButton = new javax.swing.JButton();
        warriorButton = new javax.swing.JButton();
        calvaryButton = new javax.swing.JButton();
        archerButton = new javax.swing.JButton();
        endTurnButton = new javax.swing.JButton();
        //Scroll Pane
        jScrollPane1 = new javax.swing.JScrollPane();
        //TextArea
        turnEventsTextArea = new javax.swing.JTextArea();
        //TextField
        consoleCommandsTextField = new javax.swing.JTextField();
       

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Destitute");
        setResizable(false);

        playerMenuPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        playerTurnLabel.setFont(new java.awt.Font("Tahoma", 0, 24));
        playerTurnLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        playerTurnLabel.setText("Player 1");
        playerTurnLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("Thing");

        marksLabel.setText("1000");
        marksLabel.setBorder(javax.swing.BorderFactory.createTitledBorder("Marks"));

        stoneLabel.setText("10");
        stoneLabel.setBorder(javax.swing.BorderFactory.createTitledBorder("Stone"));

        lumberLabel.setText("10");
        lumberLabel.setBorder(javax.swing.BorderFactory.createTitledBorder("Lumber"));

        horsesLabel.setText("10");
        horsesLabel.setBorder(javax.swing.BorderFactory.createTitledBorder("Horses"));

        unitsLabel.setText("Units");

        buildingsLabel.setText("Buildings");

        lumberMillButton.setText("Lumber Mill");
        lumberMillButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lumberMillButtonActionPerformed(evt);
            }
        });

        quarryButton.setText("Quarry");
        quarryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quarryButtonActionPerformed(evt);
            }
        });
        stableButton.setText("Stable");
        stableButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
               stableButtonActionPerformed(evt);
            }
        });
        barracksButton.setText("Barracks");
        barracksButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                barracksButtonActionPerformed(evt);
            }
        });

        roadButton.setText("Road");
        roadButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roadButtonActionPerformed(evt);
            }
        });

        hunterButton.setText("Hunter");
        hunterButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton6MouseEntered(evt);
            }
        });
        hunterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hunterButtonActionPerformed(evt);
            }
        });

        warriorButton.setText("Warrior");
        warriorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                warriorButtonActionPerformed(evt);
            }
        });
        calvaryButton.setText("Calvary");
        calvaryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calvaryButtonActionPerformed(evt);
            }
        });
        
        archerButton.setText("Archer");
        archerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        turnEventsLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        turnEventsLabel.setText("Turn Events");

        endTurnButton.setFont(new java.awt.Font("Tahoma", 0, 21));
        endTurnButton.setText("End Turn");
        endTurnButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        endTurnButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                endTurnKeyPressed(evt);
            }
        });

        turnEventsTextArea.setEditable(false);
        turnEventsTextArea.setColumns(20);
        turnEventsTextArea.setFont(new java.awt.Font("Tahoma", 0, 18));
        turnEventsTextArea.setLineWrap(true);
        turnEventsTextArea.setRows(5);
        turnEventsTextArea.setText("Welcome to Destitute");
        jScrollPane1.setViewportView(turnEventsTextArea);

        consoleCommandsLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        consoleCommandsLabel.setText("Console Commands");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(playerMenuPanel);
        playerMenuPanel.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(turnEventsLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(playerTurnLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(calvaryButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(archerButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(hunterButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(warriorButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(marksLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(stoneLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(unitsLabel))
                                .addGap(0, 15, Short.MAX_VALUE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lumberLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(horsesLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(buildingsLabel)
                                                .addGap(56, 56, 56))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(barracksButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(stableButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addContainerGap())))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lumberMillButton, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(quarryButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap())))
                    .addComponent(endTurnButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(consoleCommandsLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(consoleCommandsTextField)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(roadButton, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(playerTurnLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(marksLabel)
                    .addComponent(stoneLabel)
                    .addComponent(lumberLabel)
                    .addComponent(horsesLabel))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(unitsLabel)
                    .addComponent(buildingsLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lumberMillButton)
                    .addComponent(hunterButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(quarryButton)
                    .addComponent(warriorButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(stableButton)
                    .addComponent(calvaryButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(barracksButton)
                    .addComponent(archerButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(roadButton)
                .addGap(177, 177, 177)
                .addComponent(endTurnButton)
                .addGap(46, 46, 46)
                .addComponent(turnEventsLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(consoleCommandsLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(consoleCommandsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        boardPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        boardPanel.setLayout(new GridLayout(MAP_SIZE,MAP_SIZE));
        
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(boardPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(playerMenuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(playerMenuPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(boardPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        boardPanel.setBackground(Color.black);
        for (int i = 0; i < MAP_SIZE;i++) {
        	for (int j = 0; j < MAP_SIZE;j++) {
        		boardPanel.add(map[i][j]);
        		map[i][j].setPreferredSize(new Dimension(1196/MAP_SIZE,1196/ MAP_SIZE));
        		if (map[i][j] instanceof Grass) {
        			map[i][j].setBackground(Color.green);
        		} else if (map[i][j] instanceof Lumber) {
        			map[i][j].setBackground(new Color(205,133,63));
        		} else if(map[i][j] instanceof Stone) {
        			map[i][j].setBackground(Color.gray);
        		} else if (map[i][j] instanceof Water) {
        			map[i][j].setBackground(Color.blue);
        		} else if (map[i][j] instanceof Horse) {
        			map[i][j].setBackground(new Color(245,222,179));
        		}
        		
        	}
        }
        pack();
    }
	
	public void setTurnEventBox(String s){
		String source = turnEventsTextArea.getText();
		turnEventsTextArea.setText(source +  "\n" +s);

	}
	
    private void lumberMillButtonActionPerformed(java.awt.event.ActionEvent evt) {                                         
       
    }                                        
    private void barracksButtonActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    }    
    private void roadButtonActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    }
    private void calvaryButtonActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    }
    private void warriorButtonActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    }    
    private void quarryButtonActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    }             
    private void stableButtonActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    }             
    private void hunterButtonActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    }                                        

    private void jButton6MouseEntered(java.awt.event.MouseEvent evt) {                                      
        // TODO add your
    }                                     

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
    }                                         

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    }                                        

    private void endTurnKeyPressed(java.awt.event.KeyEvent evt) {                                     
        
    }                                         
}

