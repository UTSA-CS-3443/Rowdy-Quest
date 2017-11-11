package model.tile.local;

import model.texture.Texture;
import model.tile.Tile;

/**
 * 
 * @author Tyler Clarkson
 *
 *         This class defines the Grass Tile
 */
public class Grass extends Tile {

	/**
	 * Constructor
	 * 
	 * @param id
	 */
	public Grass(int id) {
		super(Texture.grass, id, null);
	}
}
