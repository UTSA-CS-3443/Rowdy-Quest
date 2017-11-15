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

public class NPBFloor2Elevator extends Tile implements Portal{
	
	/**
	 * Boolean to decide if elevator goes up or down
	 */
	private boolean npb2to3 = true;
	
	public NPBFloor2Elevator(int id) {
		super(Texture.elevatorVertical, id, null);
	}

@Override
public boolean isPortal() {
	return true;
}

@Override
public void jumpTo() {
	Map m = Game.map;
	
	if(npb2to3) {
		m.loadMap("res/maps/NPBFloor3.txt");
		Game.sprite.placePlayer((float)8 * Tile.width, (float)15 * Tile.width);
		npb2to3 = false;
	}else {
		m.loadMap("res/maps/NPBFloor1.txt");
		Game.sprite.placePlayer((float)8 * Tile.width, (float)15 * Tile.width);
		npb2to3 = true;
	}

	
}
}
