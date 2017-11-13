package model.tile.npb;

import controller.LocalViewController;
import model.Map;
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
	
	public boolean isSolidRight() {
		return true;
	}
	
	public boolean isSolidTop() {
		return true;
	}

	@Override
	public void jumpTo() {
		Map m = LocalViewController.map;
		if (this.id == 57) {
			m.loadMap("res/maps/NPBFloor2.txt");
			LocalViewController.sprite.setX((float)(15 * Tile.width));
			LocalViewController.sprite.setY((float)(25 * Tile.height) + 30);
			}
		
	}
}
