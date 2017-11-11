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

	private String roomNumber;
	
	public DoorLeftTile(int id, String roomNumber) {
		super(Texture.doorLeft, id);
		this.roomNumber = roomNumber;
		// TODO Auto-generated constructor stub
	}

}
