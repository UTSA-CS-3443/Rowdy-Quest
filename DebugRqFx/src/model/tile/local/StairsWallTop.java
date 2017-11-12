package model.tile.local;

import javafx.scene.image.Image;
import model.texture.Texture;
import model.tile.Tile;

public class StairsWallTop extends Tile{

	public StairsWallTop(int id) {
		super(Texture.stairsWallTop, id, null);
		// TODO Auto-generated constructor stub
	}
	
	public boolean isPortal() {
		return true;
	}
	
	public boolean isSolidTop() {
		return true;
	}

}
