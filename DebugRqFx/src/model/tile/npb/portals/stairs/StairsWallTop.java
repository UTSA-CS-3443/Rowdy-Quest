package model.tile.npb.portals.stairs;

import javafx.scene.image.Image;
import model.texture.Texture;
import model.tile.Tile;
import model.tile.npb.portals.Portal;

public class StairsWallTop extends Tile implements Portal {

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

	@Override
	public void jumpTo() {
		// TODO Auto-generated method stub
		
	}

}
