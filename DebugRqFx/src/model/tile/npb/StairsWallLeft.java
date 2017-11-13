package model.tile.npb;

import controller.LocalViewController;
import javafx.scene.image.Image;
import model.Map;
import model.texture.Texture;
import model.tile.Portal;
import model.tile.Tile;

public class StairsWallLeft extends Tile implements Portal {

	public StairsWallLeft(int id) {
		super(Texture.stairsWallLeft, id, null);
		// TODO Auto-generated constructor stub
	}
	
	public boolean isPortal() {
		return false;
	}
	
	public boolean isSolidLeft() {
		return true;
	}

	@Override
	public void jumpTo() {
		
	}

}
