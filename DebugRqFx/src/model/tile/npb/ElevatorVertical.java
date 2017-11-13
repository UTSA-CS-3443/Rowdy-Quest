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
	/**
	 * private booleans for middle level floor elevators to determine they go up or down
	 */
	private boolean npb2to3 = true;
	private boolean npb3to4 = true;

	public ElevatorVertical(int id) {
		super(Texture.elevatorVertical, id, null);

	}

	@Override
	public boolean isPortal() {
		return true;
	}

	@Override
	public void jumpTo() {
		Map m = LocalViewController.map;

		if (this.id == 51) {
			m.loadMap("res/maps/NPBFloor2.txt");
			LocalViewController.sprite.placePlayer((float)8 * Tile.width, (float)15 * Tile.width);

		} else if (this.id == 52) {
			//if npb2to3 load floor 3, else load floor 1
			if(npb2to3) {
				m.loadMap("res/maps/NPBFloor3.txt");
				LocalViewController.sprite.placePlayer((float)8 * Tile.width, (float)15 * Tile.width);
				npb2to3 = false;
			}else {
				m.loadMap("res/maps/NPBFloor1.txt");
				LocalViewController.sprite.placePlayer((float)8 * Tile.width, (float)15 * Tile.width);
				npb2to3 = true;
			}

		}else if(this.id == 53) {
			//if npb3to4 load floor 4, else load floor 2
			if(npb3to4) {
				m.loadMap("res/maps/NPBFloor4.txt");
				LocalViewController.sprite.placePlayer((float)8 * Tile.width, (float)15 * Tile.width);
				npb3to4 = false;
			}else {
				m.loadMap("res/maps/NPBFloor2.txt");
				LocalViewController.sprite.placePlayer((float)8 * Tile.width, (float)15 * Tile.width);
				npb3to4 = true;
			}
		}else if(this.id== 54) {
			m.loadMap("res/maps/NPBFloor3.txt");
			LocalViewController.sprite.placePlayer((float)8 * Tile.width, (float)15 * Tile.width);
		}
	}
}
