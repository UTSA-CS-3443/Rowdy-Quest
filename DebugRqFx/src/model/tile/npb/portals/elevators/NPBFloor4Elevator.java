package model.tile.npb.portals.elevators;

import model.Game;
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

public class NPBFloor4Elevator extends Tile implements Portal {
	
	private boolean npb4to5 = true;

	public NPBFloor4Elevator(int id) {
		super(Texture.elevatorVertical, id, null);
	}

	@Override
	public boolean isPortal() {
		return true;
	}

	@Override
	public void jumpTo() {
		 
				Map m = Game.map;

				if (npb4to5) {
					m.loadMap("res/maps/NPBFloor5.txt");
					Game.sprite.placePlayer((float) 8 * Tile.width, (float) 24 * Tile.width);
					npb4to5 = false;
				} else {
					m.loadMap("res/maps/NPBFloor3.txt");
					Game.sprite.placePlayer((float)10 * Tile.width, (float)20 * Tile.width);
					npb4to5 = true;
				}

			}
}
