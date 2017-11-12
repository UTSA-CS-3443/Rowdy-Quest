package model.tile.npb;

import javafx.scene.image.Image;
import model.texture.Texture;
import model.tile.Tile;

public class StairsCornerTopRight extends Tile{

	public StairsCornerTopRight(int id) {
		super(Texture.stairsCornerTopRight, id, null);
		// TODO Auto-generated constructor stub
	}
	
	public boolean isPortal() {
		return true;
	}
	
	public boolean isSolidRight() {
		return true;
	}
	
	public boolean isSolidTop() {
		return true;
	}

}
