package model.tile.npb.portals.elevators;

import controller.LocalViewController;
import javafx.scene.image.Image;
import model.Game;
import model.Map;
import model.texture.Texture;
import model.tile.Portal;
import model.tile.Tile;

/**
 * 
 * @author Brandon Black
 *
 */

public class NPBFloor3Elevator extends Tile implements Portal {
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

		if (npb3to4) {
			m.loadMap("res/maps/NPBFloor4.txt");
			Game.sprite.placePlayer((float) 8 * Tile.width, (float) 20 * Tile.width);
			npb3to4 = false;
		} else {
			m.loadMap("res/maps/NPBFloor2.txt");
			Game.sprite.placePlayer((float) 6 * Tile.width, (float) 16 * Tile.width);
			npb3to4 = true;
		}

	}
}
