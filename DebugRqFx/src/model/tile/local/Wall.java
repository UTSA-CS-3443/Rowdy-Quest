package model.tile.local;

import model.texture.Texture;
import model.tile.Tile;
/**
 * 
 * @author Brandon Black
 *
 */

public class Wall extends Tile{

	public Wall(int id) {
		super(Texture.wall, id, null);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public boolean isSolid() {
		return true;
	}

}
