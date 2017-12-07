package model.tile.npb.portals.stairs;

import model.Game;
import javafx.scene.image.Image;
import model.Map;
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
		Map m = Game.map;
		if (this.id == 45) {
			m.loadMap("res/maps/NPBFloor1.txt");
			Game.sprite.setX((float)(14 * Tile.width) + 10);
			Game.sprite.setY((float)(26 * Tile.height) + 30);
		}else if (this.id == 61) {
			m.loadMap("res/maps/NPBFloor2.txt");
			Game.sprite.setX((float)(12 * Tile.width));
			Game.sprite.setY((float)(15 * Tile.height));
		}else if (this.id == 229) {
			m.loadMap("res/maps/NPBFloor3.txt");
			Game.sprite.setX((float)(16 * Tile.width));
			Game.sprite.setY((float)(16 * Tile.height) + 30);
		
		}else if (this.id == 231) {
			m.loadMap("res/maps/NPBFloor4.txt");
			Game.sprite.setX((float)(15 * Tile.width));
			Game.sprite.setY((float)(12 * Tile.height) + 30);
		}
		
	}

}
