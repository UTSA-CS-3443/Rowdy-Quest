package model.tile.local;

import javafx.scene.image.Image;
import model.Map;
import model.texture.Texture;
import model.tile.Tile;

public class StairsPortal extends Tile{

	public StairsPortal(int id) {
		super(Texture.stairs, id, null);
	}
	
	
	@Override
	public boolean isPortal() {
		return true;
	}
}
