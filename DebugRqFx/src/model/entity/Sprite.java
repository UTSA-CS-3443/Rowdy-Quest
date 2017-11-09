package model.entity;

import controller.Camera;
import controller.CreateProfileViewController;
import controller.KeyPressedController;
import controller.LocalViewController;
import controller.StartViewController;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;

public class Sprite extends Entity {

	/**
	 * Defines Image that will display for Sprite
	 */
	public Image sprite;
	public Image rowdyRight, rowdyLeft;

	/**
	 * Spped sprite will move (in pixels per keypress)
	 */
	private final float SPEED = 3;

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
	public Sprite(Camera c, KeyPressedController kc, float x, float y) {
		super(x, y);
		rowdyRight = new Image("sprite/RowdyRight Transparent.png");
		rowdyLeft = new Image("sprite/RowdyLeft Transparent.png");
		sprite = rowdyRight;
		this.kc = kc;
		this.xMove = 0;
		this.yMove = 0;
		this.c = c;
	}

	/**
	 * Moves the Sprite by adding the <code>move</code> variables to the position
	 * variables
	 */
	private void move() {
		x += xMove;
		y += yMove;
		StartViewController.currentUser.setX(x);
		StartViewController.currentUser.setY(y);
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
		c.center(this, LocalViewController.canvasWidth, LocalViewController.canvasHeight);
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
			yMove = -SPEED;
		}
		if (kc.left) {
			xMove = -SPEED;
			setImage(rowdyLeft);
		}
		if (kc.down) {
			yMove = SPEED;
		}
		if (kc.right) {
			xMove = SPEED;
			setImage(rowdyRight);
		}
	}

	/**
	 * Draws the Sprite to the canvas
	 */
	@Override
	public void render(GraphicsContext gc) {
		gc.drawImage(sprite, (int) (x - c.getxOffset()), (int) (y - c.getyOffset()), width, height);
	}
}
