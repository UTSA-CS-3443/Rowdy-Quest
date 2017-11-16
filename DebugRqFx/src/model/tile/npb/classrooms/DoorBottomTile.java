package model.tile.npb.classrooms;

import javafx.scene.image.Image;
import model.texture.Texture;
import model.tile.Tile;

public class DoorBottomTile extends Tile {

	private static Image normalDoor = Texture.doorBottom;
	private static Image currentImage = normalDoor;

	
	public DoorBottomTile(int id, String roomNumber) {
		super(currentImage, id, roomNumber);
	}
	
	@Override
	public boolean isDoor() {
		return true;
	}
}
