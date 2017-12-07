package model.tile.npb.portals.stairs;

import model.Game;
import javafx.scene.image.Image;
import model.Map;
import model.texture.Texture;
import model.tile.Portal;
import model.tile.Tile;

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
		}else if (this.id == 60) {
			m.loadMap("res/maps/NPBFloor3.txt");
			Game.sprite.setX((float)(16 * Tile.width));
			Game.sprite.setY((float)(25 * Tile.height) + 30);
		
		}else if (this.id == 228) {
			m.loadMap("res/maps/NPBFloor4.txt");
			Game.sprite.setX((float)(15 * Tile.width));
			Game.sprite.setY((float)(19 * Tile.height) + 30);
		}else if (this.id == 230) {
			m.loadMap("res/maps/NPBFloor5.txt");
			Game.sprite.setX((float)(15 * Tile.width));
			Game.sprite.setY((float)(11 * Tile.height) + 30);
		}
	}

}
