package model.tile.npb.portals.elevators;

import model.Game;
import model.Map;
import model.texture.Texture;
import model.tile.Portal;
import model.tile.Tile;

public class NPBFloor5Elevator extends Tile implements Portal {

	public NPBFloor5Elevator(int id) {
		super(Texture.elevatorVertical, id, null);
	}

	@Override
	public boolean isPortal() {
		return true;
	}

	@Override
	public void jumpTo() {
		 
			Map m = Game.map;
			
			m.loadMap("res/maps/NPBFloor4.txt");
			Game.sprite.placePlayer((float) 8 * Tile.width, (float) 22 * Tile.width);		
	}
}