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
	}
	
	

}
