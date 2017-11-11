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
	private String roomNumber;
	private int id;

	public DoorRightTile(int id, String roomNumber) {
		super(Texture.doorRight, id);
		this.roomNumber = roomNumber;
		// TODO Auto-generated constructor stub
	}
	
	public String getRoomNumber() {return roomNumber;}
	public int getId() {return id;}

}
