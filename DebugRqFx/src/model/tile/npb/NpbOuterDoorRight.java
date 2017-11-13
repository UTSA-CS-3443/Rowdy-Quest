package model.tile.npb;

import controller.LocalViewController;
import javafx.scene.image.Image;
import model.Map;
import model.texture.Texture;
import model.tile.Portal;
import model.tile.Tile;

public class NpbOuterDoorRight extends Tile implements Portal{

	public NpbOuterDoorRight(int id) {
		super(Texture.npbOuterDoorRight, id, null);
		// TODO Auto-generated constructor stub
	}
	
	public boolean isPortal() {
		return true;
	}

	@Override
	public void jumpTo() {
		Map m = LocalViewController.map;
		if (this.id == 40) {
			m.loadMap("res/maps/campus.txt");
			LocalViewController.sprite.setX((float)(14 * Tile.width));
			LocalViewController.sprite.setY((float)(22 * Tile.height) + 30);
		} else if (this.id == 46) {
			m.loadMap("res/maps/campus.txt");
			LocalViewController.sprite.setX((float)(14 * Tile.width));
			LocalViewController.sprite.setY((float)(36 * Tile.height));
		}
		
	}

	

}
