package model.tile.npb;

import javafx.scene.image.Image;
import model.texture.Texture;
import model.tile.Portal;
import model.tile.Tile;

public class StairsCornerBottomLeft extends Tile implements Portal {

	public StairsCornerBottomLeft(int id) {
		super(Texture.stairsCornerBottomLeft, id, null);
		// TODO Auto-generated constructor stub
	}
	
	public boolean isPortal() {
		return true;
	}
	
	public boolean isSolidLeft() {
		return true;
	}
	
	public boolean isSolidBottom() {
		return true;
	}

	@Override
	public void jumpTo() {
		// TODO Auto-generated method stub
		
	}

}
