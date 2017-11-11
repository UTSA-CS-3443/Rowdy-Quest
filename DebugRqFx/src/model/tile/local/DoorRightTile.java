package model.tile.local;

import javafx.scene.image.Image;

import model.texture.Texture;
import model.tile.Tile;

/**
 * 
 * @author Brandon Black
 * These are the doors with handles on the right side, so 
 * they will appear above the user
 *
 */

public class DoorRightTile extends Tile{
	//private String roomNumber;
	private int id;
	/**
	 * default door image
	 */
	private static Image normalDoor = Texture.doorRight;
	private static Image currentImage = normalDoor;

	
	public DoorRightTile(int id, String roomNumber) {
		super(currentImage, id, roomNumber);
		//this.roomNumber = roomNumber;
		// TODO Auto-generated constructor stub
	}
	
	//public String getRoomNumber() {return roomNumber;}
	public int getId() {return id;}
	
	public static void setImage(Image img) {
		currentImage = img;
	}

}
