package model.tile.npb;

import controller.LocalViewController;
import javafx.scene.image.Image;
import model.Map;
import model.texture.Texture;
import model.tile.Portal;
import model.tile.Tile;

public class NpbOuterDoorDown extends Tile implements Portal{

	public NpbOuterDoorDown(int id) {
		super(Texture.npbOuterDoorDown, id, null);
		// TODO Auto-generated constructor stub
	}
	public boolean isPortal() {
		return true;
	}
	
	@Override
	public void jumpTo() {
		String path = "res/maps/campus.txt";
		Map m = LocalViewController.map;
		if (this.id == 38) {
			m.loadMap(path);
			LocalViewController.sprite.setX((float)(3 * Tile.width));
			LocalViewController.sprite.setY((float)(38 * Tile.height));
			
		} 
	}

}
