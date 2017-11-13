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
	
	public boolean isSolidRight() {
		return true;
	}

	@Override
	public void jumpTo() {
//		Map m = LocalViewController.map;
//		if (this.id == 36) {
//			m.loadMap("res/maps/NPBFloor2.txt");
//			LocalViewController.sprite.setX((float)(15 * Tile.width));
//			LocalViewController.sprite.setY((float)(24 * Tile.height) + 30);
//		} else if (this.id == 44) {
//			m.loadMap("res/maps/NPBFloor1.txt");
//			LocalViewController.sprite.setX((float)(15 * Tile.width));
//			LocalViewController.sprite.setY((float)(28 * Tile.height));
//		}
		
	}

}
