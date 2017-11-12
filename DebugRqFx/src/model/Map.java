package model;

import controller.Camera;
import controller.FileHelper;
import controller.LocalViewController;
import javafx.scene.canvas.GraphicsContext;
import model.tile.Tile;

/**
 * 
 * @author Tyler Clarkson
 * 
 *         The Map class creates a multi-dimensional ArrayList from an input
 *         file, assigns a Tile that is defined by an integer in the file, and
 *         provides a method to return the Image for rendering
 *
 */
public class Map {

	private int height, width; // width and height of the map
	private int spawnX, spawnY;
	private int[][] tiles; // array of tiles for the map
	private Camera c = LocalViewController.camera;
	

	/**
	 * Constructor loads the file
	 * 
	 * @param path
	 *            of the file
	 */
	public Map(String path) {
		loadMap(path);
	}

	public void update() {

	}

	/**
	 * Render the map to the canvas
	 * 
	 * @param gc
	 *            Graphics Context
	 */
	public void render(GraphicsContext gc, Camera c) {
		// variables that define what tiles the user can see and what tiles to render
		int xStart = (int)Math.max(0, c.getxOffset() / Tile.width);
		int xEnd = (int)Math.min(width, (c.getxOffset() + LocalViewController.canvasWidth) / Tile.width + 1);
		int yStart = (int)Math.max(0, c.getyOffset() / Tile.height);
		int yEnd = (int)Math.min(height, (c.getyOffset() + LocalViewController.canvasHeight) / Tile.height + 1);
		
		for (int y = yStart; y < yEnd; y++) {
			for (int x = xStart; x < xEnd; x++) {
				getTile(x, y).render(gc, (int) (x * 64 - c.getxOffset()), (int) (y * 64 - c.getyOffset()));
			}
		}
	}

	/**
	 * Get the tile by index in Tile.tiles ArrayList that corresponds to the value
	 * at tiles[x][y]
	 * 
	 * @param x
	 * @param y
	 * @return
	 */
	public Tile getTile(int x, int y) {
		// if somehow player gets outside of map, he will be on a grass tile
		if (x < 0 || y < 0 || x >= width || y >= height) {
			return Tile.grass;
		}
		
		Tile t = Tile.tiles.get(tiles[x][y]);
		if (t == null) { // if invalid index return grass tile
			return Tile.tiles.get(0);
		}
		return t;
	}


	private void loadMap(String path) {
		String file = FileHelper.loadFileAsString(path);
		String[] tokens = file.split("\\s+");
		width = Integer.parseInt(tokens[0]);
		height = Integer.parseInt(tokens[1]);
		spawnX = Integer.parseInt(tokens[2]);
		spawnY = Integer.parseInt(tokens[3]);
		


		tiles = new int[width][height];

		for (int y = 0; y < height; y++) {
			for (int x = 0; x < width; x++) {
				tiles[x][y] = Integer.parseInt(tokens[(x + y * width) + 4]);
			}
		}
	}
	
	public int getSpawnX() {
		return spawnX;
	}
	
	public int getSpawnY() {
		return spawnY;
	}
}
