package model.tile.local;

import javafx.scene.image.Image;
import model.texture.Texture;
import model.tile.Tile;
/**
 * 
 * @author Brandon Black
 *
 */

public class Black extends Tile{

	public Black(int id) {
		super(Texture.black, id, null);
		// TODO Auto-generated constructor stub
	}

	/*@Override
	public boolean isSolid() {
		return true;
	}*/
	
	public boolean isSolidRight() {
		return true;
	}
	public boolean isSolidLeft() {
		return true;
	}
	public boolean isSolidTop() {
		return true;
	}
	public boolean isSolidBottom() {
		return true;
	}
}
