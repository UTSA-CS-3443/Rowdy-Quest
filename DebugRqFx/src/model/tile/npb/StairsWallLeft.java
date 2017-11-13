package model.tile.npb;

import controller.LocalViewController;
import javafx.scene.image.Image;
import model.Map;
import model.texture.Texture;
import model.tile.Portal;
import model.tile.Tile;

public class StairsWallLeft extends Tile implements Portal {

	public StairsWallLeft(int id) {
		super(Texture.stairsWallTop, id, null);
		// TODO Auto-generated constructor stub
	}
	
	public boolean isPortal() {
		return true;
	}
	
	public boolean isSolidLeft() {
		return true;
	}

	@Override
	public void jumpTo() {
		String path = "res/maps/NPBFloor2.txt";
		Map m = LocalViewController.map;
		if (this.id == 36) {
			m.loadMap(path);
			LocalViewController.sprite.setX((float)(15 * Tile.width));
			LocalViewController.sprite.setY((float)(15 * Tile.height));
		}
		
	}

}
