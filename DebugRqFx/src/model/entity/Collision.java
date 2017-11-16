package model.entity;

import model.Game;
import model.tile.Portal;
import model.tile.Tile;

public class Collision {
	private Sprite sprite;
	float x, y;
	
	public Collision(Sprite sprite) {
		this.sprite = sprite;
		this.x = sprite.getX();
		this.y = sprite.getY();
	}
	
	/*public boolean collisionWithSolidTile(int x, int y) {
		return Game.map.getTile(x, y).isSolid();
	}*/
	
	public boolean collisionWithSolidRightTile(int x, int y) {
		return Game.map.getTile(x, y).isSolidRight();
	}
	
	public boolean collisionWithSolidLeftTile(int x, int y) {
		return Game.map.getTile(x, y).isSolidLeft();
	}
	
	public boolean collisionWithSolidBottomTile(int x, int y) {
		return Game.map.getTile(x, y).isSolidBottom();
	}
	
	public boolean collisionWithSolidTopTile(int x, int y) {
		return Game.map.getTile(x, y).isSolidTop();
	}
	
	public boolean insideADoor(int x, int y) {
		return Game.map.getTile(x, y).isDoor();
	}
	
	public boolean onAPortal(int x, int y) {
		return Game.map.getTile(x, y).isPortal();
	}
	
	/**
	 * This will check if the sprite is even slightly touching a door
	 * If so it will set the prompt Text of the Room Search TextField to the room
	 * number the user is in
	 * @return - rn is the current room number, or "Room Number" by default
	 */
	public String displayRoomNumber() {
		int ty = (int)((y + sprite.getBounds().getY() + sprite.getBounds().getHeight()) / Tile.height); // position of tile below sprite
		int ty2 = (int)((y + sprite.getBounds().getY()) / Tile.height); // position of tile above sprite
	
		String rn = "Room Number";
		if (insideADoor((int)(x + sprite.getBounds().getX() + sprite.getBounds().getWidth()) / Tile.width, ty)) {
			rn = Game.map.getTile((int)(x + sprite.getBounds().getX() + sprite.getBounds().getWidth()) / Tile.width, ty).getRoomNumber();
			Game.infoLabel.setText(rn);
		}
		else if(insideADoor((int)(x + sprite.getBounds().getX()) / Tile.width, ty2)) {
			rn = Game.map.getTile((int)(x + sprite.getBounds().getX()) / Tile.width, ty2).getRoomNumber();
			Game.infoLabel.setText(rn);
		} else {
			Game.infoLabel.setText(Game.map.getName());
		}
		return rn;
	};
	
	public void checkForPortals() {
		this.x = sprite.getX();
		this.y = sprite.getY();
		int ty = (int)((y + sprite.getBounds().getY() + sprite.getBounds().getHeight()) / Tile.height); // position of tile below sprite
		int ty2 = (int)((y + sprite.getBounds().getY()) / Tile.height); // position of tile above sprite
		
		if (onAPortal((int)(x + sprite.getBounds().getX()) / Tile.width, ty)) {
			Portal t = (Portal)Game.map.getTile((int)(x + sprite.getBounds().getX()) / Tile.width, ty);
			t.jumpTo();
		} 

	}

	public boolean checkCollisionRight(int x, int tileTop, int tileBottom) {
		if (collisionWithSolidLeftTile(x, tileTop) || collisionWithSolidLeftTile(x, tileBottom)) {
			return true;
		} else {
			return false;
		}
	}

	public boolean checkCollisionLeft(int x, int tileTop, int tileBottom) {
		if (collisionWithSolidRightTile(x, tileTop) || collisionWithSolidRightTile(x, tileBottom)) {
			return true;
		} else {
			return false;
		}
	}

	public boolean checkCollisionUp(int y, int tileLeft, int tileRight) {
		if (collisionWithSolidBottomTile(tileLeft, y) || collisionWithSolidBottomTile(tileRight, y)) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean checkCollisionDown(int y, int tileLeft, int tileRight) {
		if (collisionWithSolidTopTile(tileLeft, y) || collisionWithSolidTopTile(tileRight, y)) {
			return true;
		} else {
			return false;
		}
	}
}
