package model.tile.npb.portals.elevators;

import model.Game;
import javafx.scene.image.Image;
import model.Map;
import model.texture.Texture;
import model.tile.Tile;
import model.tile.npb.portals.Portal;

/**
 * 
 * @author Brandon Black
 *
 */

public class NPBFloor3Elevator extends Tile implements Portal{
	/**
	 * Boolean to decide if elevator goes up or down
	 */
	private boolean npb3to4 = true;
	
	public NPBFloor3Elevator(int id) {
		super(Texture.elevatorVertical, id, null);
	}

@Override
public boolean isPortal() {
	return true;
}

@Override
public void jumpTo() {
	Map m = Game.map;
	
	if(npb3to4) {
		m.loadMap("res/maps/NPBFloor4.txt");
		Game.sprite.placePlayer((float)8 * Tile.width, (float)15 * Tile.width);
		npb3to4 = false;
	}else {
		m.loadMap("res/maps/NPBFloor2.txt");
		Game.sprite.placePlayer((float)8 * Tile.width, (float)15 * Tile.width);
		npb3to4 = true;
	}

	
}
}
