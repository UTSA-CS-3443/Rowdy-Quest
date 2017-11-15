package model.tile.npb.portals.stairs;

import controller.LocalViewController;
import model.Map;
import model.texture.Texture;
import model.tile.Tile;
import model.tile.npb.portals.Portal;

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
