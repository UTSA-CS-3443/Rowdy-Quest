package model.tile.npb;

import controller.LocalViewController;
import model.Map;
import model.texture.Texture;
import model.tile.Portal;
import model.tile.Tile;

/**
 * 
 * @author Brandon Black
 *
 */

public class StairsWallRight extends Tile implements Portal{

	public StairsWallRight(int id) {
		super(Texture.stairsWallRight, id, null);
		// TODO Auto-generated constructor stub
	}
	
	public boolean isPortal() {
		return false;
	}
	
//	public boolean isSolidRight() {
//		return true;
//	}

	@Override
	public void jumpTo() {
		
	}

}
