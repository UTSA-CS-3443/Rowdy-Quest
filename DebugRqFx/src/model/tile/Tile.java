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
	 * Gonna create every new classroom here
	 * Order starts from top left of map, moves to the right, and 
	 * then goes back to the left and starts again from left to right
	 */
	/**
	 * Top row of doors with handle on Right side
	 */
	public static Tile npb1c0 = new DoorRightTile(10,"3");
	public static Tile npb1c1 = new DoorRightTile(11,"4");
	public static Tile npb1c2 = new DoorRightTile(12,"5");
	public static Tile npb1c3 = new DoorRightTile(13,"6");
	public static Tile npb1c4 = new DoorRightTile(14,"7");
	public static Tile npb1c5 = new DoorRightTile(15,"8");
	public static Tile npb1c6 = new DoorRightTile(16,"9");
	public static Tile npb1c7 = new DoorRightTile(17,"10");
	
	/**
	 * 2nd row Left side handle
	 */
	public static Tile nbp1c8 = new DoorLeftTile(18,"11");
	public static Tile nbp1c9 = new DoorLeftTile(19,"12");
	public static Tile nbp1c10 = new DoorLeftTile(20,"13");
	public static Tile nbp1c11 = new DoorLeftTile(21,"14");
	public static Tile nbp1c12 = new DoorLeftTile(22,"15");
	public static Tile nbp1c13 = new DoorLeftTile(23,"16");
	public static Tile nbp1c14 = new DoorLeftTile(24,"17");
	public static Tile nbp1c15 = new DoorLeftTile(25,"18");
	public static Tile nbp1c16 = new DoorLeftTile(26,"19");
	public static Tile nbp1c17 = new DoorLeftTile(27,"20");
	
	/**
	 * Third row 
	 */
	
	public static Tile npb1c18 = new DoorRightTile(28,"21");
	public static Tile npb1c19 = new DoorRightTile(29,"22");
	public static Tile npb1c20 = new DoorRightTile(30,"23");
	public static Tile npb1c21 = new DoorRightTile(31,"24");
	public static Tile npb1c22 = new DoorRightTile(32,"25");
	public static Tile npb1c23 = new DoorRightTile(33,"26");
	public static Tile npb1c24 = new DoorRightTile(34,"27");
	public static Tile npb1c25 = new DoorRightTile(35,"28");
	
	

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
