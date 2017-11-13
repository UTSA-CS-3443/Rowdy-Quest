package model.tile.npb;

import controller.LocalViewController;
import javafx.scene.image.Image;
import model.Map;
import model.texture.Texture;
import model.tile.Portal;
import model.tile.Tile;

public class StairsVertical extends Tile implements Portal {

	public StairsVertical(int id) {
		super(Texture.stairsVertical, id, null);
		// TODO Auto-generated constructor stub
	}
	
	public boolean isPortal() {
		return false;
	}


	
	@Override
	public void jumpTo() {
		
	}

}
