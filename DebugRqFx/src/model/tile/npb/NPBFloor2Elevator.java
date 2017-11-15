package model.tile.npb;

import controller.LocalViewController;
import javafx.scene.image.Image;
import model.Map;
import model.texture.Texture;
import model.tile.Portal;
import model.tile.Tile;

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
	Map m = LocalViewController.map;
	
	if(npb2to3) {
		m.loadMap("res/maps/NPBFloor3.txt");
		LocalViewController.sprite.placePlayer((float)10 * Tile.width, (float)20 * Tile.width);
		npb2to3 = false;
	}else {
		m.loadMap("res/maps/NPBFloor1.txt");
		LocalViewController.sprite.placePlayer((float)8 * Tile.width, (float)16 * Tile.width);
		npb2to3 = true;
	}

	
}
}
