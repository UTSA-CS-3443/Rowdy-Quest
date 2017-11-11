package model.tile.local;

import javafx.scene.image.Image;
import model.texture.Texture;
import model.tile.Tile;

/**
 * 
 * @author Brandon Black
 * this handles the doors that have the handle on the left side, 
 * so they will appear under the user. 
 *
 */
public class DoorLeftTile extends Tile{

	//private static String roomNumber;
	private int id;
	
	private static Image normalDoor = Texture.doorLeft;
	private static Image currentImage = normalDoor;
	
	public DoorLeftTile(int id, String roomNumber) {
		super(currentImage, id, roomNumber);
		this.id = id;
	//	this.roomNumber = roomNumber;
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * Getters
	 * @return
	 */
	//public String getRoomNumber() {return this.roomNumber;}
	
	/**
	 * Set Image - We will use this to change the image of the door if it found 
	 * after being search for by the user
	 */
	public static void setImage(Image img) {
		currentImage = img;
	}
	/**
	 * Sets the current Doors roomNumber
	 * @param roomNumber
	 */
	public void setRoomNumber(String roomNumber) {
	//	this.roomNumber = roomNumber;
	}
	

}
