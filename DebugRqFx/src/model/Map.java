package model;

import controller.Camera;
import controller.FileHelper;
import controller.StartViewController;
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

	///////////////////////////////////////////////////////////////////////////
	//   FIELDS
	///////////////////////////////////////////////////////////////////////////
	
	private int height, width; // width and height of the map
	private int spawnX, spawnY;
	private int[][] tiles; // array of tiles for the map
	private Camera c = Game.camera;

	/**
	 * Used for signing in and saving current map path to the user to spawn in the
	 * same map they left off of
	 */
	private String pathString;
	
	///////////////////////////////////////////////////////////////////////////
	//   CONSTRUCTOR
	///////////////////////////////////////////////////////////////////////////
	
	/**
	 * Constructor loads the file
	 * 
	 * @param path
	 *            of the file
	 */
	public Map(String path) {
		loadMap(path);
	}
	
	///////////////////////////////////////////////////////////////////////////
	//   RENDER
	///////////////////////////////////////////////////////////////////////////

	/**
	 * Render the map to the canvas
	 * 
	 * @param gc
	 *            Graphics Context
	 */
	public void render() {
		// variables that define what tiles the user can see and what tiles to render
		int xStart = (int)Math.max(0, c.getxOffset() / Tile.width);
		int xEnd = (int)Math.min(getWidth(), (c.getxOffset() + Game.canvasWidth) / Tile.width + 1);
		int yStart = (int)Math.max(0, c.getyOffset() / Tile.height);
		int yEnd = (int)Math.min(getHeight(), (c.getyOffset() + Game.canvasHeight) / Tile.height + 1);
		
		
		
		for (int y = yStart; y < yEnd; y++) {
			for (int x = xStart; x < xEnd; x++) {
				getTile(x, y).render(Game.gc, (int) (x * Tile.width - c.getxOffset()), (int) (y * Tile.height - c.getyOffset()));
			}
		}
	}

	///////////////////////////////////////////////////////////////////////////
	//   LOAD MAP           
	///////////////////////////////////////////////////////////////////////////
	public void loadMap(String path) {
		this.pathString = path;
		String file = FileHelper.loadFileAsString(path);
		String[] tokens = file.split("\\s+");
		setWidth(Integer.parseInt(tokens[0]));
		setHeight(Integer.parseInt(tokens[1]));
		spawnX = Integer.parseInt(tokens[2]);
		spawnY = Integer.parseInt(tokens[3]);
		StartViewController.currentUser.setCurrentMapPath(path);
		
		tiles = new int[getWidth()][getHeight()];

		for (int y = 0; y < getHeight(); y++) {
			for (int x = 0; x < getWidth(); x++) {
				tiles[x][y] = Integer.parseInt(tokens[(x + y * getWidth()) + 4]);
			}
		}
		
		Game.infoLabel.setText(getName());		
	}
	
	///////////////////////////////////////////////////////////////////////////
	//   GETTERS AND SETTERS
	///////////////////////////////////////////////////////////////////////////
	
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
		if (x < 0 || y < 0 || x >= getWidth() || y >= getHeight()) {
			return Tile.tiles.get(9);
		}
		
		Tile t = Tile.tiles.get(tiles[x][y]);
		if (t == null) { // if invalid index return grass tile
			return Tile.tiles.get(9);
		}
		return t;
	}
	
	public String getName() {
		String path = getPathString();
		int start = path.lastIndexOf("/");
		String s = path.substring(start + 1, path.indexOf("."));
		return s.substring(0, 1).toUpperCase() + s.substring(1);
	}
	
	public int getSpawnX() {
		return spawnX;
	}
	
	public int getSpawnY() {
		return spawnY;
	}

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

	public void setSpawnX(int x) {
		spawnX = x;
	}

	public void setSpawnY(int y) {
		spawnY = y;
	}
	
	public String getPathString() {
		return pathString;
	}
	
	
}
