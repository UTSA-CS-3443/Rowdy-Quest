package model.entity;

import controller.Camera;
import controller.KeyPressedController;
import model.Game;
import controller.StartViewController;
import javafx.scene.image.Image;
import model.tile.Tile;

public class Sprite extends Entity {

	///////////////////////////////////////////////////////////////////////////
	// FIELDS
	///////////////////////////////////////////////////////////////////////////

	/**
	 * Defines Image that will display for Sprite
	 */
	public Image sprite;
	public Image rowdyRight, rowdyLeft;

	/**
	 * speed sprite will move (in pixels per keypress
	 */
	private float speed = 4;

	/**
	 * Define how much to move the sprite on each axis
	 */
	private float xMove, yMove;

	/**
	 * Controller for handling movement via keyboard
	 */
	private KeyPressedController kc;

	/**
	 * Camera to center on Sprite
	 */
	private Camera c;

	/**
	 * For checking collision
	 */
	private Collision collision;

	///////////////////////////////////////////////////////////////////////////
	// CONSTRUCTOR
	///////////////////////////////////////////////////////////////////////////

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
		collision = new Collision(this);
		this.kc = Game.kc;
		this.xMove = 0;
		this.yMove = 0;
		this.c = Game.camera;
	}

	///////////////////////////////////////////////////////////////////////////
	// MOVEMENT
	///////////////////////////////////////////////////////////////////////////

	/**
	 * Moves the Sprite by adding the <code>move</code> variables to the position
	 * variables
	 */
	private void move() {
		StartViewController.currentUser.setX(x);
		StartViewController.currentUser.setY(y);
		moveX();
		moveY();
		collision.displayRoomNumber();
		collision.checkForPortals();
	}

	/**
	 * Move on the x axis checking for collisions
	 */
	public void moveX() {
		int xMovingRight = (int) ((x + bounds.getX() + bounds.getWidth() + xMove) / Tile.width);
		int xMovingLeft = (int) ((x + bounds.getX() + xMove) / Tile.width);
		int tileTop = (int) ((y + bounds.getY()) / Tile.height);
		int tileBottom = (int) ((y + bounds.getY() + bounds.getHeight()) / Tile.height);

		if (xMove > 0) {
			if (!collision.checkCollisionRight(xMovingRight, tileTop, tileBottom)) {
				x += xMove;
			} else {
				x = (float) (xMovingRight * Tile.width - bounds.getX() - bounds.getWidth() - 1);
			}
		} else if (xMove < 0) {
			if (!collision.checkCollisionLeft(xMovingLeft, tileTop, tileBottom) && x >= 0) {
				x += xMove;
			} else if (x > 0) {
				x = (float) (xMovingLeft * Tile.width + Tile.width - bounds.getX());
			} else {
				x = xMovingLeft - 3;
			}
		}
	}

	/**
	 * Move on the y axis checking for collisions
	 */
	public void moveY() {
		int yMovingUp = (int) ((y + yMove + bounds.getY()) / Tile.height);
		int yMovingDown = (int) ((y + yMove + bounds.getY() + bounds.getHeight()) / Tile.height);
		int tileLeft = (int) (x + bounds.getX()) / Tile.width;
		int tileRight = (int) (x + bounds.getX() + bounds.getWidth()) / Tile.width;

		if (yMove < 0) {
			if (!collision.checkCollisionUp(yMovingUp, tileLeft, tileRight) && y >= 0) {
				y += yMove;
			} else if (y > 0) {
				y = (float) (yMovingUp * Tile.height + Tile.height - bounds.getY());
			} else {
				y = yMovingUp - 3;
			}
		} else if (yMove > 0) {
			if (!collision.checkCollisionDown(yMovingDown, tileLeft, tileRight)) {
				y += yMove;
			} else {
				y = (float) (yMovingDown * Tile.height - bounds.getY() - bounds.getHeight() - 1);
			}
		}

	}

	///////////////////////////////////////////////////////////////////////////
	// PLACE PLAYER
	///////////////////////////////////////////////////////////////////////////

	/**
	 * Will place the player at designated points on the map. Will mostly be used
	 * for when we change scenes/floors/buildings.
	 * 
	 * @param x
	 *            x-coordinate to be placed
	 * @param y
	 *            y-coordinate to be place
	 */
	public void placePlayer(float x, float y) {
		this.setX(x);
		this.setY(y);
	}

	///////////////////////////////////////////////////////////////////////////
	// UPDATE AND RENDER
	///////////////////////////////////////////////////////////////////////////

	/**
	 * Updates variables relevant to the Sprite
	 */
	@Override
	public void update() {
		getInput();
		move();
		c.center(this, Game.canvasWidth, Game.canvasHeight);
	}

	/**
	 * Draws the Sprite to the canvas
	 */
	@Override
	public void render() {
		Game.gc.drawImage(sprite, (int) (x - c.getxOffset()), (int) (y - c.getyOffset()), width, height);
		// draws box over sprite to show collision detection bounds
		// gc.fillRect(x - c.getxOffset(), y - c.getyOffset(), bounds.getWidth(),
		// bounds.getHeight());
	}

	///////////////////////////////////////////////////////////////////////////
	// GETTERS AND SETTERS
	///////////////////////////////////////////////////////////////////////////

	/**
	 * changes the image to left or right depending on the direction it is going
	 * 
	 * @param i
	 *            - image to change to
	 */
	private void setImage(Image i) {
		sprite = i;
	}

	public float getX() {
		return x;
	}

	public float getY() {
		return y;
	}

	public void setX(float x) {
		this.x = x;
	}

	public void setY(float y) {
		this.y = y;
	}

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

}
