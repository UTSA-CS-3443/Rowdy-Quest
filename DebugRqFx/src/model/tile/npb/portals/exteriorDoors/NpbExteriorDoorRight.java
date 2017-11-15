package model.tile.npb.portals.exteriorDoors;


import model.Game;
import javafx.scene.image.Image;
import model.Map;
import model.texture.Texture;
import model.tile.Tile;
import model.tile.npb.portals.Portal;

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
		Map m = Game.map;
		if (this.id == 42) {
			m.loadMap(path);
			Game.sprite.setX((float)(15 * Tile.width));
			Game.sprite.setY((float)(16 * Tile.height));
			
		} else if (this.id == 47) {
			m.loadMap(path);
			Game.sprite.setX((float)(15 * Tile.width));
			Game.sprite.setY((float)(30 * Tile.height));
		}
		
	}

}
