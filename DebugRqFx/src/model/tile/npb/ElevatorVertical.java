package model.tile.npb;

import controller.LocalViewController;
import model.Map;
import model.texture.Texture;
import model.tile.Portal;
import model.tile.Tile;
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
