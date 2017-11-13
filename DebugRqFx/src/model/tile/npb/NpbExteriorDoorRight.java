package model.tile.npb;


import controller.LocalViewController;
import javafx.scene.image.Image;
import model.Map;
import model.texture.Texture;
import model.tile.Portal;
import model.tile.Tile;

public class NpbExteriorDoorRight extends Tile implements Portal {

	public NpbExteriorDoorRight(int id) {
		super(Texture.npbExteriorDoorRight, id, null);
		// TODO Auto-generated constructor stub
	}

	public boolean isPortal() {
		return true;
	}
	
	@Override
	public void jumpTo() {
		String path = "res/maps/NPBFloor1.txt";
		Map m = LocalViewController.map;
		if (this.id == 42) {
			m.loadMap(path);
			LocalViewController.sprite.setX((float)(15 * Tile.width));
			LocalViewController.sprite.setY((float)(16 * Tile.height));
			
		} else if (this.id == 47) {
			m.loadMap(path);
			LocalViewController.sprite.setX((float)(15 * Tile.width));
			LocalViewController.sprite.setY((float)(30 * Tile.height));
		}
		
	}

}
