package model.tile.npb.portals.exteriorDoors;

import model.Game;
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
		Map m = Game.map;
		if (this.id == 40) {
			m.loadMap("res/maps/campus.txt");
			Game.sprite.setX((float)(14 * Tile.width));
			Game.sprite.setY((float)(22 * Tile.height) + 30);
		} else if (this.id == 46) {
			m.loadMap("res/maps/campus.txt");
			Game.sprite.setX((float)(14 * Tile.width));
			Game.sprite.setY((float)(36 * Tile.height));
		}
		
	}

	

}
