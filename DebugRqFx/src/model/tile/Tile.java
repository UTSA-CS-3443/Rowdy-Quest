package model.tile;

import java.util.ArrayList;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import model.tile.local.Black;
import model.tile.local.Dirt;
import model.tile.local.Grass;
import model.tile.local.Road;
import model.tile.local.Sidewalk;
import model.tile.npb.Carpet;
import model.tile.npb.DoorLeftTile;
import model.tile.npb.DoorRightTile;
import model.tile.npb.ElevatorHorizontal;
import model.tile.npb.ElevatorVertical;
import model.tile.npb.Floor;
import model.tile.npb.NPBFloor1;
import model.tile.npb.NPBFloor1Elevator;
import model.tile.npb.NPBFloor2Elevator;
import model.tile.npb.NPBFloor3Elevator;
import model.tile.npb.NPBFloor4Elevator;
import model.tile.npb.NpbExteriorDoorDown;
import model.tile.npb.NpbExteriorDoorRight;
import model.tile.npb.NpbOuterDoorDown;
import model.tile.npb.NpbOuterDoorLeft;
import model.tile.npb.NpbOuterDoorRight;
import model.tile.npb.NpbOuterDoorUp;
import model.tile.npb.StairsCornerBottomLeft;
import model.tile.npb.StairsCornerBottomRight;
import model.tile.npb.StairsCornerTopLeft;
import model.tile.npb.StairsCornerTopRight;
import model.tile.npb.StairsVertical;
import model.tile.npb.StairsWallLeft;
import model.tile.npb.StairsWallRight;
import model.tile.npb.StairsWallTop;
import model.tile.npb.Wall;

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
	 * Next id number is 36 after NPBFloor1 is created
	 */
	public static NPBFloor1 f1 = new NPBFloor1();
	
	public static Tile npbFloor1toFloor2StairsWall = new StairsWallLeft(36);
	
	public static Tile npbFloor1StairsCorner = new StairsCornerTopLeft(37);
	
	public static Tile npbOuterDoorDown = new NpbOuterDoorDown(38);

	public static Tile npbOuterDoorleft = new NpbOuterDoorLeft(39);
	
	public static Tile npbOuterDoorRightMiddle = new NpbOuterDoorRight(40);
	
	public static Tile elevatorHorizontal = new ElevatorHorizontal(41);
	
	public static Tile npbExteriorDoorRightMiddle = new NpbExteriorDoorRight(42);
	
	public static Tile npbOuterDoorUp = new NpbOuterDoorUp(43);
	
	public static Tile npbFloor2toFloor1StairsWall = new StairsWallLeft(44);
	
	public static Tile npbFloor2toFloor1StairsCorner = new StairsCornerBottomLeft(45);

	public static Tile npbOuterDoorRightBottom = new NpbOuterDoorRight(46);
	
	public static Tile npbExteriorDoorRightBottom = new NpbExteriorDoorRight(47);
	
	public static Tile npbFloor1toFloor2Stairs = new StairsVertical(48);
	
	public static Tile npbFloor2toFloor1Stairs = new StairsVertical(49);
	
	public static Tile stairsWallTop = new StairsWallTop(50);
	
	public static Tile npbFloor1toFloor2Elevator = new NPBFloor1Elevator(51);
	
	public static Tile npbFloor2Elevator = new NPBFloor2Elevator(52);
	
	public static Tile npbFloor3Elevator = new NPBFloor3Elevator(53);
	
	public static Tile npbFloor4Elevator = new NPBFloor4Elevator(54);
	
	public static Tile stairsWallRight = new StairsWallRight(55);
	
	public static Tile npbFloor2toFloor1StairsRightCorner = new StairsCornerBottomRight(56);
	
	public static Tile npbFloor1toFloor2StairsRightCorner = new StairsCornerTopRight(57);
	
	public static Tile npbExteriorDoorDown = new NpbExteriorDoorDown(58);
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
	
	private boolean isRightWallStair = false;

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
	
	public boolean isPortal() {
		return isPortal;
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
}
