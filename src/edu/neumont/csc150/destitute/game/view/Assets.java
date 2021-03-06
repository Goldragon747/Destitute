package edu.neumont.csc150.destitute.game.view;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.BooleanControl;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.ImageIcon;

public class Assets {
	private ImageIcon p1Win;
	private ImageIcon p2Win;
	
	private ImageIcon titleScreen;
	private ImageIcon mainBackground;
	private ImageIcon menuBackground;
	private ImageIcon creditsBackground;
	private ImageIcon rulesBackground;

	private ImageIcon water;
	private ImageIcon grass;
	private ImageIcon stone;
	private ImageIcon lumber;
	private ImageIcon horse;
	private ImageIcon fog;

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

	private ImageIcon p1RoadAll;
	private ImageIcon p1RoadBottomRight;
	private ImageIcon p1RoadLeftBottom;
	private ImageIcon p1RoadLeftBottomRight;
	private ImageIcon p1RoadLeftRight;
	private ImageIcon p1RoadTopBottom;
	private ImageIcon p1RoadTopBottomRight;
	private ImageIcon p1RoadTopLeft;
	private ImageIcon p1RoadTopLeftBottom;
	private ImageIcon p1RoadTopLeftRight;
	private ImageIcon p1RoadTopRight;

	private ImageIcon p2RoadAll;
	private ImageIcon p2RoadBottomRight;
	private ImageIcon p2RoadLeftBottom;
	private ImageIcon p2RoadLeftBottomRight;
	private ImageIcon p2RoadLeftRight;
	private ImageIcon p2RoadTopBottom;
	private ImageIcon p2RoadTopBottomRight;
	private ImageIcon p2RoadTopLeft;
	private ImageIcon p2RoadTopLeftBottom;
	private ImageIcon p2RoadTopLeftRight;
	private ImageIcon p2RoadTopRight;

	private ImageIcon markIcon;
	private ImageIcon lumberIcon;
	private ImageIcon stoneIcon;
	private ImageIcon horsesIcon;

	private ImageIcon buyIconP1Hunter;
	private ImageIcon buyIconP1Archer;
	private ImageIcon buyIconP1Warrior;
	private ImageIcon buyIconP1HorseRider;

	private ImageIcon buyIconP1Lumbermill;
	private ImageIcon buyIconP1Barracks;
	private ImageIcon buyIconP1Quarry;
	private ImageIcon buyIconP1Road;
	private ImageIcon buyIconP1Stable;

	private ImageIcon buyIconP2Hunter;
	private ImageIcon buyIconP2Archer;
	private ImageIcon buyIconP2Warrior;
	private ImageIcon buyIconP2HorseRider;

	private ImageIcon buyIconP2Lumbermill;
	private ImageIcon buyIconP2Barracks;
	private ImageIcon buyIconP2Quarry;
	private ImageIcon buyIconP2Road;
	private ImageIcon buyIconP2Stable;

	private String titleScreenMusic;
	private String warriorMusic;
	private String backgroundMusic;
	private String horseRiderMusic;
	private String archerCreationMusic;
	private String roadCreationMusic;
	private String barracksCreationMusic;
	private String lumberMillCreationMusic;
	private String quarryCreationMusic;
	private String movementMusic;
	private String hunterCreationMusic;
	private String stableCreationMusic;
	private String buildingDestroyedMusic;
	private String cheatsMusic;
	private String victoryMusic;

	/*
	 * Gives the file paths to the Strings and Image Icons
	 */
	public Assets(int mapsize) {
		titleScreenMusic = "Assets\\Music\\TitleScreen\\main.wav";
		warriorMusic = "Assets\\Music\\Warrior\\main.wav";
		backgroundMusic = "Assets\\Music\\Background\\main.wav";
		horseRiderMusic = "Assets\\Music\\HorseRider\\main.wav";
		archerCreationMusic = "Assets\\Music\\Archer\\main.wav";
		roadCreationMusic = "Assets\\Music\\Road\\main.wav";
		barracksCreationMusic = "Assets\\Music\\Barracks\\main.wav";
		lumberMillCreationMusic = "Assets\\Music\\LumberMill\\main.wav";
		quarryCreationMusic = "Assets\\Music\\Quarry\\main.wav";
		movementMusic = "Assets\\Music\\Movement\\main.wav";
		hunterCreationMusic = "Assets\\Music\\Hunter\\main.wav";
		stableCreationMusic = "Assets\\Music\\Stable\\main.wav";
		buildingDestroyedMusic = "Assets\\Music\\BuildingDestroyed\\main.wav";
		cheatsMusic = "Assets\\Music\\Cheats\\main.wav";
		victoryMusic = "Assets\\Music\\Victory\\main.wav";
		
		p1Win = new ImageIcon("Assets\\Backgrounds\\p1_win.png");
		p2Win = new ImageIcon("Assets\\Backgrounds\\p2_win.png");
		
		titleScreen = new ImageIcon("Assets\\Backgrounds\\titlescreen.png");
		mainBackground = new ImageIcon("Assets\\Backgrounds\\mainbackground.png");
		menuBackground = new ImageIcon("Assets\\Backgrounds\\menubackground.png");
		creditsBackground = new ImageIcon("Assets\\Backgrounds\\credits.png");
		rulesBackground = new ImageIcon("Assets\\Backgrounds\\rules.png");

		water = new ImageIcon("Assets\\resource\\" + mapsize + "x" + mapsize + "\\water.png");
		grass = new ImageIcon("Assets\\resource\\" + mapsize + "x" + mapsize + "\\grass.png");
		lumber = new ImageIcon("Assets\\resource\\" + mapsize + "x" + mapsize + "\\lumber.png");
		stone = new ImageIcon("Assets\\resource\\" + mapsize + "x" + mapsize + "\\stone.png");
		horse = new ImageIcon("Assets\\resource\\" + mapsize + "x" + mapsize + "\\horse.png");
		fog = new ImageIcon("Assets\\resource\\" + mapsize + "x" + mapsize + "\\fog.png");

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

		p1RoadAll = new ImageIcon("Assets\\player1\\roads\\" + mapsize + "x" + mapsize + "\\p1_road_all.png");
		p1RoadBottomRight = new ImageIcon(
				"Assets\\player1\\roads\\" + mapsize + "x" + mapsize + "\\p1_road_bottom_right.png");
		p1RoadLeftBottom = new ImageIcon(
				"Assets\\player1\\roads\\" + mapsize + "x" + mapsize + "\\p1_road_left_bottom.png");
		p1RoadLeftBottomRight = new ImageIcon(
				"Assets\\player1\\roads\\" + mapsize + "x" + mapsize + "\\p1_road_left_bottom_right.png");
		p1RoadLeftRight = new ImageIcon(
				"Assets\\player1\\roads\\" + mapsize + "x" + mapsize + "\\p1_road_left_right.png");
		p1RoadTopBottom = new ImageIcon(
				"Assets\\player1\\roads\\" + mapsize + "x" + mapsize + "\\p1_road_top_bottom.png");
		p1RoadTopBottomRight = new ImageIcon(
				"Assets\\player1\\roads\\" + mapsize + "x" + mapsize + "\\p1_road_top_bottom_right.png");
		p1RoadTopLeft = new ImageIcon("Assets\\player1\\roads\\" + mapsize + "x" + mapsize + "\\p1_road_top_left.png");
		p1RoadTopLeftBottom = new ImageIcon(
				"Assets\\player1\\roads\\" + mapsize + "x" + mapsize + "\\p1_road_top_left_bottom.png");
		p1RoadTopLeftRight = new ImageIcon(
				"Assets\\player1\\roads\\" + mapsize + "x" + mapsize + "\\p1_road_top_left_right.png");
		p1RoadTopRight = new ImageIcon(
				"Assets\\player1\\roads\\" + mapsize + "x" + mapsize + "\\p1_road_top_right.png");

		p2RoadAll = new ImageIcon("Assets\\player2\\roads\\" + mapsize + "x" + mapsize + "\\p2_road_all.png");
		p2RoadBottomRight = new ImageIcon(
				"Assets\\player2\\roads\\" + mapsize + "x" + mapsize + "\\p2_road_bottom_right.png");
		p2RoadLeftBottom = new ImageIcon(
				"Assets\\player2\\roads\\" + mapsize + "x" + mapsize + "\\p2_road_left_bottom.png");
		p2RoadLeftBottomRight = new ImageIcon(
				"Assets\\player2\\roads\\" + mapsize + "x" + mapsize + "\\p2_road_left_bottom_right.png");
		p2RoadLeftRight = new ImageIcon(
				"Assets\\player2\\roads\\" + mapsize + "x" + mapsize + "\\p2_road_left_right.png");
		p2RoadTopBottom = new ImageIcon(
				"Assets\\player2\\roads\\" + mapsize + "x" + mapsize + "\\p2_road_top_bottom.png");
		p2RoadTopBottomRight = new ImageIcon(
				"Assets\\player2\\roads\\" + mapsize + "x" + mapsize + "\\p2_road_top_bottom_right.png");
		p2RoadTopLeft = new ImageIcon("Assets\\player2\\roads\\" + mapsize + "x" + mapsize + "\\p2_road_top_left.png");
		p2RoadTopLeftBottom = new ImageIcon(
				"Assets\\player2\\roads\\" + mapsize + "x" + mapsize + "\\p2_road_top_left_bottom.png");
		p2RoadTopLeftRight = new ImageIcon(
				"Assets\\player2\\roads\\" + mapsize + "x" + mapsize + "\\p2_road_top_left_right.png");
		p2RoadTopRight = new ImageIcon(
				"Assets\\player2\\roads\\" + mapsize + "x" + mapsize + "\\p2_road_top_right.png");

		markIcon = new ImageIcon("Assets\\Icons\\mark_icon.png");
		lumberIcon = new ImageIcon("Assets\\Icons\\lumber_icon.png");
		stoneIcon = new ImageIcon("Assets\\Icons\\stone_icon.png");
		horsesIcon = new ImageIcon("Assets\\Icons\\horse_icon.png");

		buyIconP1Hunter = new ImageIcon("Assets\\Icons\\p1_hunter.png");
		buyIconP1Archer = new ImageIcon("Assets\\Icons\\p1_archer.png");
		buyIconP1Warrior = new ImageIcon("Assets\\Icons\\p1_warrior.png");
		buyIconP1HorseRider = new ImageIcon("Assets\\Icons\\p1_rider.png");

		buyIconP1Lumbermill = new ImageIcon("Assets\\Icons\\p1_lumbermill.png");
		buyIconP1Barracks = new ImageIcon("Assets\\Icons\\p1_barracks.png");
		buyIconP1Quarry = new ImageIcon("Assets\\Icons\\p1_quarry.png");
		buyIconP1Road = new ImageIcon("Assets\\Icons\\p1_road.png");
		buyIconP1Stable = new ImageIcon("Assets\\Icons\\p1_stable.png");

		buyIconP2Hunter = new ImageIcon("Assets\\Icons\\p2_hunter.png");
		buyIconP2Archer = new ImageIcon("Assets\\Icons\\p2_archer.png");
		buyIconP2Warrior = new ImageIcon("Assets\\Icons\\p2_warrior.png");
		buyIconP2HorseRider = new ImageIcon("Assets\\Icons\\p2_rider.png");

		buyIconP2Lumbermill = new ImageIcon("Assets\\Icons\\p2_lumbermill.png");
		buyIconP2Barracks = new ImageIcon("Assets\\Icons\\p2_barracks.png");
		buyIconP2Quarry = new ImageIcon("Assets\\Icons\\p2_quarry.png");
		buyIconP2Road = new ImageIcon("Assets\\Icons\\p2_road.png");
		buyIconP2Stable = new ImageIcon("Assets\\Icons\\p2_stable.png");
	}

	/**
	 * @return the markIcon
	 */
	public ImageIcon getMarkIcon() {
		return markIcon;
	}

	/**
	 * @return the lumberIcon
	 */
	public ImageIcon getLumberIcon() {
		return lumberIcon;
	}

	/**
	 * @return the stoneIcon
	 */
	public ImageIcon getStoneIcon() {
		return stoneIcon;
	}

	/**
	 * @return the horsesIcon
	 */
	public ImageIcon getHorsesIcon() {
		return horsesIcon;
	}

	/**
	 * @return the buyIconP1Hunter
	 */
	public ImageIcon getBuyIconP1Hunter() {
		return buyIconP1Hunter;
	}

	/**
	 * @return the buyIconP1Archer
	 */
	public ImageIcon getBuyIconP1Archer() {
		return buyIconP1Archer;
	}

	/**
	 * @return the buyIconP1Warrior
	 */
	public ImageIcon getBuyIconP1Warrior() {
		return buyIconP1Warrior;
	}

	/**
	 * @return the buyIconP1HorseRider
	 */
	public ImageIcon getBuyIconP1HorseRider() {
		return buyIconP1HorseRider;
	}

	/**
	 * @return the buyIconP1Lumbermill
	 */
	public ImageIcon getBuyIconP1Lumbermill() {
		return buyIconP1Lumbermill;
	}

	/**
	 * @return the buyIconP1Barracks
	 */
	public ImageIcon getBuyIconP1Barracks() {
		return buyIconP1Barracks;
	}

	/**
	 * @return the buyIconP1Quarry
	 */
	public ImageIcon getBuyIconP1Quarry() {
		return buyIconP1Quarry;
	}

	/**
	 * @return the buyIconP1Road
	 */
	public ImageIcon getBuyIconP1Road() {
		return buyIconP1Road;
	}

	/**
	 * @return the buyIconP1Stable
	 */
	public ImageIcon getBuyIconP1Stable() {
		return buyIconP1Stable;
	}

	/**
	 * @return the buyIconP2Hunter
	 */
	public ImageIcon getBuyIconP2Hunter() {
		return buyIconP2Hunter;
	}

	/**
	 * @return the buyIconP2Archer
	 */
	public ImageIcon getBuyIconP2Archer() {
		return buyIconP2Archer;
	}

	/**
	 * @return the buyIconP2Warrior
	 */
	public ImageIcon getBuyIconP2Warrior() {
		return buyIconP2Warrior;
	}

	/**
	 * @return the buyIconP2HorseRider
	 */
	public ImageIcon getBuyIconP2HorseRider() {
		return buyIconP2HorseRider;
	}

	/**
	 * @return the buyIconP2Lumbermill
	 */
	public ImageIcon getBuyIconP2Lumbermill() {
		return buyIconP2Lumbermill;
	}

	/**
	 * @return the buyIconP2Barracks
	 */
	public ImageIcon getBuyIconP2Barracks() {
		return buyIconP2Barracks;
	}

	/**
	 * @return the buyIconP2Quarry
	 */
	public ImageIcon getBuyIconP2Quarry() {
		return buyIconP2Quarry;
	}

	/**
	 * @return the buyIconP2Road
	 */
	public ImageIcon getBuyIconP2Road() {
		return buyIconP2Road;
	}

	/**
	 * @return the buyIconP2Stable
	 */
	public ImageIcon getBuyIconP2Stable() {
		return buyIconP2Stable;
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

	/**
	 * @return the p1RoadAll
	 */
	public ImageIcon getP1RoadAll() {
		return p1RoadAll;
	}

	/**
	 * @return the p1RoadBottomRight
	 */
	public ImageIcon getP1RoadBottomRight() {
		return p1RoadBottomRight;
	}

	/**
	 * @return the p1RoadLeftBottom
	 */
	public ImageIcon getP1RoadLeftBottom() {
		return p1RoadLeftBottom;
	}

	/**
	 * @return the p1RoadLeftBottomRight
	 */
	public ImageIcon getP1RoadLeftBottomRight() {
		return p1RoadLeftBottomRight;
	}

	/**
	 * @return the p1RoadLeftRight
	 */
	public ImageIcon getP1RoadLeftRight() {
		return p1RoadLeftRight;
	}

	/**
	 * @return the p1RoadTopBottom
	 */
	public ImageIcon getP1RoadTopBottom() {
		return p1RoadTopBottom;
	}

	/**
	 * @return the p1RoadTopBottomRight
	 */
	public ImageIcon getP1RoadTopBottomRight() {
		return p1RoadTopBottomRight;
	}

	/**
	 * @return the p1RoadTopLeft
	 */
	public ImageIcon getP1RoadTopLeft() {
		return p1RoadTopLeft;
	}

	/**
	 * @return the p1RoadTopLeftBottom
	 */
	public ImageIcon getP1RoadTopLeftBottom() {
		return p1RoadTopLeftBottom;
	}

	/**
	 * @return the p1RoadTopLeftRight
	 */
	public ImageIcon getP1RoadTopLeftRight() {
		return p1RoadTopLeftRight;
	}

	/**
	 * @return the p1RoadTopRight
	 */
	public ImageIcon getP1RoadTopRight() {
		return p1RoadTopRight;
	}

	/**
	 * @return the p2RoadAll
	 */
	public ImageIcon getP2RoadAll() {
		return p2RoadAll;
	}

	/**
	 * @return the p2RoadBottomRight
	 */
	public ImageIcon getP2RoadBottomRight() {
		return p2RoadBottomRight;
	}

	/**
	 * @return the p2RoadLeftBottom
	 */
	public ImageIcon getP2RoadLeftBottom() {
		return p2RoadLeftBottom;
	}

	/**
	 * @return the p2RoadLeftBottomRight
	 */
	public ImageIcon getP2RoadLeftBottomRight() {
		return p2RoadLeftBottomRight;
	}

	/**
	 * @return the p2RoadLeftRight
	 */
	public ImageIcon getP2RoadLeftRight() {
		return p2RoadLeftRight;
	}

	/**
	 * @return the p2RoadTopBottom
	 */
	public ImageIcon getP2RoadTopBottom() {
		return p2RoadTopBottom;
	}

	/**
	 * @return the p2RoadTopBottomRight
	 */
	public ImageIcon getP2RoadTopBottomRight() {
		return p2RoadTopBottomRight;
	}

	/**
	 * @return the p2RoadTopLeft
	 */
	public ImageIcon getP2RoadTopLeft() {
		return p2RoadTopLeft;
	}

	/**
	 * @return the p2RoadTopLeftBottom
	 */
	public ImageIcon getP2RoadTopLeftBottom() {
		return p2RoadTopLeftBottom;
	}

	/**
	 * @return the p2RoadTopLeftRight
	 */
	public ImageIcon getP2RoadTopLeftRight() {
		return p2RoadTopLeftRight;
	}

	/**
	 * @return the p2RoadTopRight
	 */
	public ImageIcon getP2RoadTopRight() {
		return p2RoadTopRight;
	}

	public ImageIcon getFog() {
		return fog;
	}

	private Clip clip;
	private Clip clip2;

	public void Song(String fileName) {
		try {
			File file = new File(fileName);
			if (file.exists()) {
				AudioInputStream sound = AudioSystem.getAudioInputStream(file);

				clip = AudioSystem.getClip();
				clip.open(sound);
			} else {
				throw new RuntimeException("Sound: file not found: " + fileName);
			}
		} catch (MalformedURLException e) {
			e.printStackTrace();
			throw new RuntimeException("Sound: Malformed URL: " + e);
		} catch (UnsupportedAudioFileException e) {
			e.printStackTrace();
			throw new RuntimeException("Sound: Unsupported Audio File: " + e);
		} catch (IOException e) {
			e.printStackTrace();
			throw new RuntimeException("Sound: Input/Output Error: " + e);
		} catch (LineUnavailableException e) {
			e.printStackTrace();
			throw new RuntimeException("Sound: Line Unavailable Exception Error: " + e);
		}
	}
	
	public void SongBackground(String fileName) {
		try {
			File file = new File(fileName);
			if (file.exists()) {
				AudioInputStream sound = AudioSystem.getAudioInputStream(file);

				clip2 = AudioSystem.getClip();
				clip2.open(sound);
			} else {
				throw new RuntimeException("Sound: file not found: " + fileName);
			}
		} catch (MalformedURLException e) {
			e.printStackTrace();
			throw new RuntimeException("Sound: Malformed URL: " + e);
		} catch (UnsupportedAudioFileException e) {
			e.printStackTrace();
			throw new RuntimeException("Sound: Unsupported Audio File: " + e);
		} catch (IOException e) {
			e.printStackTrace();
			throw new RuntimeException("Sound: Input/Output Error: " + e);
		} catch (LineUnavailableException e) {
			e.printStackTrace();
			throw new RuntimeException("Sound: Line Unavailable Exception Error: " + e);
		}
	}

	public void play() {
		clip.start();
		clip.setFramePosition(0);
	}

	public void loop() {
		clip.loop(Clip.LOOP_CONTINUOUSLY);
	}
	public void stop() {
		clip.setFramePosition(clip.getFrameLength() - 1);
		BooleanControl mute = (BooleanControl) clip.getControl(BooleanControl.Type.MUTE);
		mute.setValue(true);
		clip.loop(0);
		clip.flush();
	}

	public void stopBG() {
		try{
		clip2.setFramePosition(clip2.getFrameLength() - 1);
		BooleanControl mute = (BooleanControl) clip2.getControl(BooleanControl.Type.MUTE);
		mute.setValue(true);
		clip2.loop(0);
		clip2.flush();
		}
		catch(NullPointerException e){
			System.out.println("There was no BG music playing silly");
		}
	}
	public void playBG() {
		clip2.start();
		clip2.setFramePosition(0);
	}

	public void loopBG() {
		clip2.loop(Clip.LOOP_CONTINUOUSLY);
	}

	public ImageIcon getTitleScreen() {
		return titleScreen;
	}

	public ImageIcon getMainBackround() {
		return mainBackground;
	}

	public ImageIcon getMenuBackground() {
		return menuBackground;
	}

	public String getTitleScreenMusic() {
		return titleScreenMusic;
	}

	public String getWarriorMusic() {
		return warriorMusic;
	}

	public String getBackgroundMusic() {
		return backgroundMusic;
	}

	public String getHorseRiderMusic() {
		return horseRiderMusic;
	}

	public String getArcherCreationMusic() {
		return archerCreationMusic;
	}

	public String getRoadCreationMusic() {
		return roadCreationMusic;
	}

	public String getBarracksCreationMusic() {
		return barracksCreationMusic;
	}

	public String getLumberMillCreationMusic() {
		return lumberMillCreationMusic;
	}

	public String getQuarryCreationMusic() {
		return quarryCreationMusic;
	}

	public String getMovementMusic() {
		return movementMusic;
	}

	public String getHunterCreationMusic() {
		return hunterCreationMusic;
	}

	public String getStableCreationMusic() {
		return stableCreationMusic;
	}

	public String getBuildingDestroyedMusic() {
		return buildingDestroyedMusic;
	}
	public String getCheatsMusic() {
		return cheatsMusic;
	}

	public ImageIcon getCreditsBackground() {
		return creditsBackground;
	}

	public ImageIcon getRulesBackground() {
		return rulesBackground;
	}
	public String getVictoryMusic() {
		return victoryMusic;
	}

	/**
	 * @return the p1Win
	 */
	public ImageIcon getP1Win() {
		return p1Win;
	}

	/**
	 * @return the p2Win
	 */
	public ImageIcon getP2Win() {
		return p2Win;
	}


}
