package model;

import controller.FileHelper;
import controller.StartViewController;
import model.tile.Tile;

public class MiniMap extends Map {

	
	private int[][] tiles;
	/**
	 * placeHolder1 and placeHolder2 for the 2nd row in map .txts
	 */
	private int ph1, ph2;
	
	private int height, width; // height and width of the map
	
	private String path;
	
	public MiniMap(String path) {
		super(path);
		this.path = path;
	
	}
	

	/**
	 * Loads the map with tiles of width and height 20
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
