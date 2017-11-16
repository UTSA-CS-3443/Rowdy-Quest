package model.tile.npb.classrooms;

import javafx.scene.image.Image;
import model.texture.Texture;
import model.tile.Tile;

public class DoorTopTile extends Tile {

	private static Image normalDoor = Texture.doorTop;
	private static Image currentImage = normalDoor;

	
	public DoorTopTile(int id, String roomNumber) {
		super(currentImage, id, roomNumber);
	}
	
	@Override
	public boolean isDoor() {
		return true;
	}
}
