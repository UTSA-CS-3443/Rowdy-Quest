package model;

import java.awt.Graphics;

import controller.FileHelper;
import controller.StartViewController;
import model.tile.Tile;

/**
 * 
 * @author Brandon Black
 *
 */
public class MiniMap extends Map {

	/**
	 * Tiles for miniMap
	 */
	private int[][] tiles;
	/**
	 * placeHolder1 and placeHolder2 for the 2nd row in map .txts
	 */
	private int ph1, ph2;
	
	private int height, width; // height and width of the map
	
	/**
	 * path of text file for given map
	 */
	private String path;
	
	public MiniMap(String path) {
		super(path);
		this.path = path;
	
	}
	

	/**
	 * Loads the map with smaller tiles to fit on screen
	 * 
	 */
	public void loadMiniMap() {
		String file = FileHelper.loadFileAsString(path);
		String[] tokens = file.split("\\s+");
		setWidth(Integer.parseInt(tokens[0]));
		setHeight(Integer.parseInt(tokens[1]));
		ph1 = Integer.parseInt(tokens[2]);
		ph2 = Integer.parseInt(tokens[3]);
		Tile.width = 48;
		Tile.height = 19;
//		Tile.width = 20;
//		Tile.height = 20;
		
		tiles = new int[getWidth()][getHeight()];

		for (int y = 0; y < getHeight(); y++) {
			for (int x = 0; x < getWidth(); x++) {
				tiles[x][y] = Integer.parseInt(tokens[(x + y * getWidth()) + 4]);
			}
		}
		
		Game.infoLabel.setText(getName());		
	}
	
	/**
	 * Draws a yellow dot on the miniMap for the current position of the users sprite
	 * @param g
	 */
	 public void drawDot(Graphics g){
	// g.fillOval(, arg1, arg2, arg3);
		 
		 //Not sure how to implement this. 
		 //What if you're not on the searched for floor or in the building ?
		 //Should we bring up 2 minimaps? 
		 //One current Location, and the other destination? 
	    
	    }
	
	/**
	 * Getters and Setters
	 */
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

}
