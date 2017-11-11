package model.tile;

import java.util.ArrayList;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import model.tile.local.Black;
import model.tile.local.Carpet;
import model.tile.local.Dirt;
import model.tile.local.DoorLeftTile;
import model.tile.local.DoorRightTile;
import model.tile.local.Floor;
import model.tile.local.Grass;
import model.tile.local.Road;
import model.tile.local.Sidewalk;
import model.tile.local.Wall;

/**
 * 
 * @author Tyler Clarkson
 *
 *         This class defines a tile object, the superclass for all tiles that
 *         are rendered on the canvas
 */
public class Tile {

	/**
	 * Static ArrayList of Tiles to be used anywhere
	 */
	public static ArrayList<Tile> tiles = new ArrayList<>();

	/**
	 * Grass Tile; index 0
	 */
	public static Tile grass = new Grass(0);

	/**
	 * Dirt Tile, index 1
	 */
	public static Tile dirt = new Dirt(1);

	/**
	 * road Tile, index 2
	 */
	public static Tile road = new Road(2);
	
	/**
	 * Sidewalk Tile, index 3
	 */
	public static Tile sidewalk = new Sidewalk(3);
	/**
	 * Carpet Tile, index 4
	 */
	public static Tile carpet = new Carpet(4);
	/**
	 * Handle on right side of Door Tile, index 5
	 */
	public static Tile doorRight = new DoorRightTile(5);
	
	/**
	 * Handle on left side of Door Tile, index 6
	 */
	public static Tile doorLeft = new DoorLeftTile(6);
	
	/**
	 * Wall tile, index 7
	 */
	public static Tile wall = new Wall(7);
	
	/**
	 * Floor Tile, index 8
	 */
	public static Tile floor = new Floor(8);
	
	/**
	 * All Black tile, for void areas of map. Index 9
	 */
	public static Tile black = new Black(9);

	/**
	 * Width and height of all tiles
	 */
	private int width = 64, height = 64;

	/**
	 * Image used for Tile
	 */
	protected Image texture;

	/**
	 * ID of tile (index in ArrayList)
	 */
	protected final int id;

	/**
	 * Constructor
	 * 
	 * @param img
	 *            image used for Tile
	 * @param id
	 *            index in tiles ArrayList
	 */
	public Tile(Image img, int id) {
		this.texture = img;
		this.id = id;

		// add the tile to the static ArrayList for use anywhere
		tiles.add(id, this);
	}

	/**
	 * Gets the ID of the Tile
	 * 
	 * @return id
	 */
	public int getId() {
		return this.id;
	}

	/**
	 * Is the Tile solid (used for collision detection)
	 * 
	 * @return false by default
	 */
	public boolean isSolid() {
		return false;
	}

	/**
	 * Update Tile info
	 */
	public void update() {

	}

	/**
	 * Render the Tile to the canvas
	 * 
	 * @param gc
	 *            GraphicsContext used to draw tile on cavas
	 * @param x
	 *            x position of tile
	 * @param y
	 *            y position of tile
	 */
	public void render(GraphicsContext gc, int x, int y) {
		gc.drawImage(this.texture, x, y, width, height);
	}
}
