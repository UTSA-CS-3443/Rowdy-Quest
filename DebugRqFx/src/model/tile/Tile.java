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
 * @author Brandon Black
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
	public static Tile doorRight = new DoorRightTile(5, "1");
	
	
	/**
	 * Handle on left side of Door Tile, index 6
	 */
	public static Tile doorLeft = new DoorLeftTile(6, "2");
	
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
	 * This will build the arrayList of classrooms for Floor 1 of NPB
	 * Static to have access everywhere.
	 * We will be able to access the classroom numbers in a for loop like
	 * f1.get(i).getRoomNumber()
	 */
	public static NPBFloor1 f1 = new NPBFloor1();
	

	/**
	 * Width and height of all tiles
	 */
	public static int width = 64, height = 64;
	
	/**
	 * if true, tile cannot be walked on
	 */
	private boolean isSolid = false;

	/**
	 * Image used for Tile
	 */
	protected Image texture;

	/**
	 * ID of tile (index in ArrayList)
	 */
	protected final int id;
	
	/**
	 * roomNumber for doors, null on all other tiles
	 */
	private String roomNumber;
	
	private boolean isDoor = false;

	/**
	 * Constructor
	 * 
	 * @param img
	 *            image used for Tile
	 * @param id
	 *            index in tiles ArrayList
	 */
	public Tile(Image img, int id, String roomNumber) {
		this.texture = img;
		this.id = id;
		this.roomNumber = roomNumber;

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
	
	public void setRightDoorImage(Image img) {
		this.texture = img;
	}
	
	public void setLeftDoorImage(Image img) {
		this.texture = img;
	}
	
	public String getRoomNumber() {
		return this.roomNumber;
	}
	
	public Image getImage() {
		return this.texture;
	}

	/**
	 * Is the Tile solid (used for collision detection)
	 * 
	 * @return false by default
	 */
	public boolean isSolid() {
		return isSolid;
	}
	
	public void setIsSolid(boolean isSolidOrNot) {
		this.isSolid = isSolidOrNot;
	}
	
	public boolean isDoor() {
		return isDoor;
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
