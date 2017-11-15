package model.tile.npb.portals.elevators;

import controller.LocalViewController;
import model.Map;
import model.texture.Texture;
import model.tile.Tile;
import model.tile.npb.portals.Portal;
/**
 * 
 * @author Brandon Black
 *
 */

public class ElevatorVertical extends Tile implements Portal{


	public ElevatorVertical(int id) {
		super(Texture.elevatorVertical, id, null);

	}

	@Override
	public boolean isPortal() {
		return true;
	}

	@Override
	public void jumpTo() {

	}
}
