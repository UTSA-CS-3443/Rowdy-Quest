package model.tile.npb;

import model.texture.Texture;
import model.tile.Portal;
import model.tile.Tile;

public class StairsCornerTopRight extends Tile implements Portal{

	public StairsCornerTopRight(int id) {
		super(Texture.stairsCornerTopRight, id, null);
		// TODO Auto-generated constructor stub
	}
	
	public boolean isPortal() {
		return true;
	}
	
	public boolean isSolidLeft() {
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
