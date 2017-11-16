package model.entity;

import controller.Camera;
import controller.CreateProfileViewController;
import controller.KeyPressedController;
import model.Game;
import controller.StartViewController;
import javafx.geometry.Bounds;
import javafx.scene.Node;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Label;
import javafx.scene.control.Tooltip;
import javafx.scene.image.Image;
import main.Main;
import model.Map;
import model.tile.Portal;
import model.tile.Tile;
import model.tile.npb.classrooms.NPBFloor1Rooms;

public class Sprite extends Entity {

	/**
	 * Defines Image that will display for Sprite
	 */
	public Image sprite;
	public Image rowdyRight, rowdyLeft;

	/**
	 * speed sprite will move (in pixels per keypress
	 */
	private  float speed = 4;

	/**
	 * Define how much to move the sprite on each axis
	 */
	private float xMove, yMove;

	/**
	 * Controller for handling movement via keyboard
	 */
	private KeyPressedController kc;
	
	private Label infoLabel;

	/**
	 * Camera to center on Sprite
	 */
	private Camera c;

	/**
	 * Constructor
	 * 
	 * @param c
	 *            Camera to center on Sprite
	 * @param kc
	 *            Controller for handling movement via keyboard
	 * @param x
	 *            x position of Sprite
	 * @param y
	 *            y position of Sprite
	 */
	public Sprite(float x, float y) {
		super(x * Tile.width, y * Tile.height);
		rowdyRight = new Image("sprite/RowdyRight Transparent.png");
		rowdyLeft = new Image("sprite/RowdyLeft Transparent.png");
		sprite = rowdyRight;
		this.kc = Game.kc;
		this.xMove = 0;
		this.yMove = 0;
		this.c = Game.camera;
		this.infoLabel = Game.infoLabel;
	}

	/**
	 * Moves the Sprite by adding the <code>move</code> variables to the position
	 * variables
	 */
	private void move() {
		StartViewController.currentUser.setX(x);
		StartViewController.currentUser.setY(y);
		moveX();
		moveY();
		displayRoomNumber();
		checkForPortals();
	}
	
	// move on the x axis checking for collisions
	public void moveX() {
		// if moving right
		if (xMove > 0) { 
			int tx = (int)((x + xMove + bounds.getX() + bounds.getWidth()) / Tile.width); // position of tile to right of sprite
			// if not collision with solid tile on upper right corner or lower right corner
			
			// System.out.println(LocalViewController.map.getTile(tx, (int)(y + bounds.getY() + bounds.getHeight()) / Tile.height));
			
			if (!collisionWithSolidTile(tx, (int)(y + bounds.getY()) / Tile.height) &&
					!collisionWithSolidTile(tx, (int)(y + bounds.getY() + bounds.getHeight()) / Tile.height) &&
					!collisionWithSolidLeftTile(tx, (int)(y + bounds.getY()) / Tile.height) &&
					!collisionWithSolidLeftTile(tx, (int)(y + bounds.getY() + bounds.getHeight()) / Tile.height)) {
				x += xMove;
			} else {
				x = (float)(tx * Tile.width - bounds.getX() - bounds.getWidth() - 1);
			}
		} 
		// if moving left
		else if (xMove < 0) {
			int tx = (int)((x + xMove + bounds.getX()) / Tile.width);

			//System.out.println(LocalViewController.map.getTile(tx1, (int)(y + bounds.getY() + bounds.getHeight()) / Tile.height));

			// if not collision with solid tile on upper left corner or lower left corner
			if (!collisionWithSolidTile(tx, (int)(y + bounds.getY()) / Tile.height) &&
					!collisionWithSolidTile(tx, (int)(y + bounds.getY() + bounds.getHeight()) / Tile.height) &&
					!collisionWithSolidRightTile(tx, (int)(y + bounds.getY() + bounds.getHeight()) / Tile.height) &&
					!collisionWithSolidRightTile(tx, (int)(y + bounds.getY()) / Tile.height) && x >= 0) {
				x += xMove;
			} else if (x > 0) {
				x = (float)(tx * Tile.width + Tile.width - bounds.getX());
			} else {
				x = tx - 3;
			}
		}
	}
	
	

	public void moveY() {
		// if moving up
				if (yMove < 0) { 
					int ty = (int)((y + yMove + bounds.getY()) / Tile.height); // position of tile above sprite
					
					//System.out.println(LocalViewController.map.getTile((int)(x + bounds.getX() + bounds.getWidth()) / Tile.width, ty));

					// if not collision with solid tile on upper left corner or upper right corner
					if (!collisionWithSolidTile((int)(x + bounds.getX()) / Tile.width, ty) &&
							!collisionWithSolidTile((int)(x + bounds.getX() + bounds.getWidth()) / Tile.width, ty) &&
							y >= 0) {
						y += yMove;
					} else if (y > 0){
						y = (float)(ty * Tile.height + Tile.height - bounds.getY());
					} else {
						y = ty - 3;
					}
				} 
				// if moving down
				else if (yMove > 0) {
					int ty = (int)((y + yMove + bounds.getY() + bounds.getHeight()) / Tile.height); // position of tile below sprite
					// if not collision with solid tile on lower left corner or lower right corner
					if (!collisionWithSolidTile((int)(x + bounds.getX()) / Tile.width, ty) &&
							!collisionWithSolidTile((int)(x + bounds.getX() + bounds.getWidth()) / Tile.width, ty) &&
							!collisionWithSolidTopTile((int)(x + bounds.getX()) / Tile.width, ty) &&
							!collisionWithSolidTopTile((int)(x + bounds.getX() + bounds.getWidth()) / Tile.width, ty)) {
						y += yMove;
					} else {
						y = (float)(ty * Tile.height - bounds.getY() - bounds.getHeight() - 1);
					}
				}
	}
	
	

	/**
	 * This will check if the sprite is even slightly touching a door
	 * If so it will set the prompt Text of the Room Search TextField to the room
	 * number the user is in
	 * @return - rn is the current room number, or "Room Number" by default
	 */
	public String displayRoomNumber() {
		int ty = (int)((y + bounds.getY() + bounds.getHeight()) / Tile.height); // position of tile below sprite
		int ty2 = (int)((y + bounds.getY()) / Tile.height); // position of tile above sprite
	
		String rn = "Room Number";
		if (insideADoor((int)(x + bounds.getX() + bounds.getWidth()) / Tile.width, ty)) {
			rn = Game.map.getTile((int)(x + bounds.getX() + bounds.getWidth()) / Tile.width, ty).getRoomNumber();
			infoLabel.setText(rn);
		}
		else if(insideADoor((int)(x + bounds.getX()) / Tile.width, ty2)) {
			rn = Game.map.getTile((int)(x + bounds.getX()) / Tile.width, ty2).getRoomNumber();
			infoLabel.setText(rn);
		} else {
			infoLabel.setText(Game.map.getName());
		}
		return rn;
	};
	
	public void checkForPortals() {
		int ty = (int)((y + bounds.getY() + bounds.getHeight()) / Tile.height); // position of tile below sprite
		int ty2 = (int)((y + bounds.getY()) / Tile.height); // position of tile above sprite
		
		if (onAPortal((int)(x + bounds.getX()) / Tile.width, ty)/*&&
				LocalViewController.map.getTile((int)(x + bounds.getX()) / Tile.width, ty2).getId() == 37*/) {
			//LocalViewController.map = new Map("res/maps/NPBfloor2.txt");
			Portal t = (Portal)Game.map.getTile((int)(x + bounds.getX()) / Tile.width, ty);
			t.jumpTo();
		}
	}
	
	
	
	public boolean collisionWithSolidTile(int x, int y) {
		return Game.map.getTile(x, y).isSolid();
	}
	
	private boolean collisionWithSolidRightTile(int x, int y) {
		return Game.map.getTile(x, y).isSolidRight();
	}
	
	private boolean collisionWithSolidLeftTile(int x, int y) {
		return Game.map.getTile(x, y).isSolidLeft();
	}
	
	private boolean collisionWithSolidBottomTile(int x, int y) {
		return Game.map.getTile(x, y).isSolidBottom();
	}
	
	private boolean collisionWithSolidTopTile(int x, int y) {
		return Game.map.getTile(x, y).isSolidTop();
	}
	
	public boolean insideADoor(int x, int y) {
		return Game.map.getTile(x, y).isDoor();
	}
	
	public boolean onAPortal(int x, int y) {
		return Game.map.getTile(x, y).isPortal();
	}
	
	
	/**
	 * Will place the player at designated points on the map.
	 * Will mostly be used for when we change scenes/floors/buildings. 
	 * @param x x-coordinate to be placed
	 * @param y y-coordinate to be place
	 */
	public void placePlayer(float x, float y) {
		this.setX(x);
		this.setY(y);
	}
	
	/**
	 * changes the image to left or right depending on the direction 
	 * it is going
	 * @param i - image to change to
	 */
	private void setImage(Image i) {
		sprite = i;
	}

	/**
	 * Updates variables relevant to the Sprite
	 */
	@Override
	public void update() {
		getInput();
		move();
		c.center(this, Game.canvasWidth, Game.canvasHeight);
	}
	
	public float getX(){return x;}
	public float getY() {return y;}
	
	public void setX(float x) {this.x = x;}
	public void setY(float y) {this.y = y;}

	/**
	 * Gets the input from the keyboard and sets <code>move</code> variables based
	 * on input
	 */
	private void getInput() {
		xMove = 0;
		yMove = 0;

		if (kc.up) {
			yMove = -speed;
		}
		if (kc.left) {
			xMove = -speed;
			setImage(rowdyLeft);
		}
		if (kc.down) {
			yMove = speed;
		}
		if (kc.right) {
			xMove = speed;
			setImage(rowdyRight);
		}
	}

	public float getSpeed() {
		return speed;
	}

	public void setSpeed(float speed) {
		this.speed = speed;
	}

	/**
	 * Draws the Sprite to the canvas
	 */
	@Override
	public void render() {
		Game.gc.drawImage(sprite, (int) (x - c.getxOffset()), (int) (y - c.getyOffset()), width, height);
		//draws box over sprite to show collision detection bounds
		//gc.fillRect(x - c.getxOffset(), y - c.getyOffset(), bounds.getWidth(), bounds.getHeight());
	}
	
}
