package model.tile.npb;

import model.texture.Texture;
import model.tile.Portal;
import model.tile.Tile;

public class StairsCornerBottomRight extends Tile implements Portal{

	public StairsCornerBottomRight(int id) {
		super(Texture.stairsCornerBottomRight, id, null);
		// TODO Auto-generated constructor stub
	}
	
	public boolean isPortal() {
		return true;
	}
	
	public boolean isSolidRight() {
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
