package model.tile.npb.portals.stairs;

import model.Game;
import javafx.scene.image.Image;
import model.Map;
import model.texture.Texture;
import model.tile.Tile;
import model.tile.npb.portals.Portal;

public class StairsCornerTopLeft extends Tile implements Portal {

	public StairsCornerTopLeft(int id) {
		super(Texture.stairsCornerTopLeft, id, null);
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
		Map m = Game.map;
		if (this.id == 37) {
			m.loadMap("res/maps/NPBFloor2.txt");
			Game.sprite.setX((float)(14 * Tile.width) + 10);
			Game.sprite.setY((float)(25 * Tile.height) + 30);
		}
		
	}

}
