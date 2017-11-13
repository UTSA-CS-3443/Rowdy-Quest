package model.tile.npb;

import javafx.scene.image.Image;
import model.texture.Texture;
import model.tile.Portal;
import model.tile.Tile;

public class StairsCornerTopLeft extends Tile implements Portal {

	public StairsCornerTopLeft(int id) {
		super(Texture.stairsCornerTopRight, id, null);
		// TODO Auto-generated constructor stub
	}
	
	public boolean isPortal() {
		return true;
	}
	
	public boolean isSolidLeft() {
		return true;
	}
	
	public boolean isSolidTop() {
		return true;
	}

	@Override
	public void jumpTo() {
		// TODO Auto-generated method stub
		
	}

}