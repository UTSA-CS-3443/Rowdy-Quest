package model.tile.npb;

import controller.LocalViewController;
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
		Map m = LocalViewController.map;
		if (this.id == 45) {
			m.loadMap("res/maps/NPBFloor1.txt");
			LocalViewController.sprite.setX((float)(14 * Tile.width) + 10);
			LocalViewController.sprite.setY((float)(26 * Tile.height) + 30);
		}
		
	}

}
