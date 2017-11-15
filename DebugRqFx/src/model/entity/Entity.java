package model.entity;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.shape.Rectangle;

/**
 * 
 * @author Tyler Clarkson
 * @author Brandon Black
 * 
 *         The Entity class defines everything in the app that is NOT a tile
 *
 */
public abstract class Entity {

	/**
	 * x and y position of Entity on the screen.
	 */
	protected float x, y;

	/**
	 * width and height of the Entity
	 */
	public static int width = 56, height = 26;
	
	/**
	 * bounds used for collision detection
	 */
	protected Rectangle bounds;

	/**
	 * Constructor
	 * 
	 * @param x
	 *            x position of Entity on the screen
	 * @param y
	 *            y position of Entity on the screen
	 */
	public Entity(float x, float y) {
		this.x = x;
		this.y = y;

		this.bounds = new Rectangle(0, 0, width, height);
	}

	/**
	 * Gets the width of the Entity
	 * 
	 * @return width
	 */
	public int getWidth() {
		return width;
	}

	/**
	 * Sets the width of the Entity
	 * 
	 * @param width
	 */
	public void setWidth(int width) {
		this.width = width;
	}

	/**
	 * Gets the height of the Entity
	 * 
	 * @return height
	 */
	public int getHeight() {
		return height;
	}

	/**
	 * Sets the height of the Entity
	 * 
	 * @param height
	 */
	public void setHeight(int height) {
		this.height = height;
	}

	/**
	 * Gets the x position of the Entity
	 * 
	 * @return x
	 */
	public float getX() {
		return x;
	}

	/**
	 * sets the x position of the Entity
	 * 
	 * @param x
	 */
	public void setX(float x) {
		this.x = x;
	}

	/**
	 * Gets the y position of the Entity
	 * 
	 * @return y
	 */
	public float getY() {
		return y;
	}

	/**
	 * sets the y position of the Entity
	 * 
	 * @param y
	 */
	public void setY(float y) {
		this.y = y;
	}
	


	// Classes that extend this class must implement the following methods
	public abstract void update();

	public abstract void render();

	public Rectangle getBounds() {
		return bounds;
	}

	public void setBounds(int x, int y, int widht, int height) {
		this.bounds.setX(x);
		this.bounds.setY(y);
		this.bounds.setWidth(width);
		this.bounds.setHeight(height);
	}
}

