package model.tile.npb.portals.stairs;

import model.Game;
import model.Map;
import model.texture.Texture;
import model.tile.Tile;
import model.tile.npb.portals.Portal;

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
		Map m = Game.map;
		if (this.id == 56) {
			m.loadMap("res/maps/NPBFloor1.txt");
			Game.sprite.setX((float)(15 * Tile.width));
			Game.sprite.setY((float)(26 * Tile.height));
		}
	}
}
