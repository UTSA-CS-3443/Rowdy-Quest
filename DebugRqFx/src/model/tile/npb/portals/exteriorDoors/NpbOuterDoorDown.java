package model.tile.npb.portals.exteriorDoors;

import model.Game;
import javafx.scene.image.Image;
import model.Map;
import model.texture.Texture;
import model.tile.Tile;
import model.tile.npb.portals.Portal;

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
		Map m = Game.map;
		if (this.id == 38) {
			m.loadMap(path);
			Game.sprite.setX((float)(3 * Tile.width));
			Game.sprite.setY((float)(38 * Tile.height));
			
		} 
	}

}
