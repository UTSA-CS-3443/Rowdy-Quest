package model.tile.npb;

import controller.LocalViewController;
import javafx.scene.image.Image;
import model.Map;
import model.texture.Texture;
import model.tile.Portal;
import model.tile.Tile;

public class StairsVertical extends Tile implements Portal {

	public StairsVertical(int id) {
		super(Texture.stairsVertical, id, null);
		// TODO Auto-generated constructor stub
	}
	
	public boolean isPortal() {
		return true;
	}


	@Override
	public void jumpTo() {
		Map m = LocalViewController.map;
		if (this.id == 48) {
			m.loadMap("res/maps/NPBFloor2.txt");
			LocalViewController.sprite.setX((float)(15 * Tile.width));
			LocalViewController.sprite.setY((float)(24 * Tile.height) + 30);
		} else if (this.id == 49) {
			m.loadMap("res/maps/NPBFloor1.txt");
			LocalViewController.sprite.setX((float)(15 * Tile.width));
			LocalViewController.sprite.setY((float)(28 * Tile.height));
		}
		
	}

}
