package model.tile;

import java.util.ArrayList;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import model.texture.Texture;

/**
 * 
 * @author Tyler Clarkson
 * @author Brandon Black
 *
 *         This class defines a tile object, the superclass for all tiles that
 *         are rendered on the canvas
 */
public class Tile {

	///////////////////////////////////////////////////////////////////////////
	//   FIELDS
	///////////////////////////////////////////////////////////////////////////
	
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
	
	/**
	 * True if this tile is a door
	 */
	private boolean isDoor = false;
	
	/**
	 * True if this tile is a portal
	 */
	private boolean isPortal = false;
		
	/**
	 * Static ArrayList of Tiles to be used anywhere
	 */
	public static ArrayList<Tile> tiles = new ArrayList<>();
	

	/*========================================================================
	 * CONSTRUCTOR
	 *========================================================================*/
	
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
	
	///////////////////////////////////////////////////////////////////////////
	//   RENDER
	///////////////////////////////////////////////////////////////////////////
	
	/**
	 * Render the Tile to the canvas
	 * 
	 * @param gc
	 *            GraphicsContext used to draw tile on canvas
	 * @param x
	 *            x position of tile
	 * @param y
	 *            y position of tile
	 */
	public void render(GraphicsContext gc, int x, int y) {
		gc.drawImage(this.texture, x, y, width, height);
	}

	///////////////////////////////////////////////////////////////////////////
	//   COLLISION
	///////////////////////////////////////////////////////////////////////////
	
	public boolean isSolid() {
		return isSolid;
	}
	
	public boolean isPortal() {
		return isPortal;
	}
	
	public void setIsSolid(boolean isSolidOrNot) {
		this.isSolid = isSolidOrNot;
	}
	
	public boolean isDoor() {
		return isDoor;
	}


	public boolean isSolidRight() {
		return false;
	}

	public boolean isSolidTop() {
		return false;
	}

	public boolean isSolidLeft() {
		return false;
	}

	public boolean isSolidBottom() {
		return false;
	}
	
	///////////////////////////////////////////////////////////////////////////
	//   GETTERS AND SETTERS
	///////////////////////////////////////////////////////////////////////////
	
	public int getId() {
		return this.id;
	}
	
	public void setDoorImage(Image img) {
		this.texture = img;
	}
		
	public String getRoomNumber() {
		return this.roomNumber;
	}
	
	public Image getImage() {
		return this.texture;
	}
	
	public float getTileWidth() {
		return width;
	}
	
	public float getTileHeight() {
		return height;
	}

}
