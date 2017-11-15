package controller;

import model.Game;
import model.entity.Entity;
import model.tile.Tile;

/**
 * 
 * @author Tyler Clarkson
 * 
 *         The Camera class defines a camera that can be adjusted to define a
 *         view for the application
 *
 */
public class Camera {

	/**
	 * xOffset and yOffset define how much to offset the map based on the movement
	 * of the Sprite
	 */
	private float xOffset, yOffset;

	/**
	 * Constructor for new Camera
	 * 
	 * @param xOffset
	 *            initial x position of Camera
	 * @param yOffset
	 *            initial y position of Camera
	 */
	public Camera(float xOffset, float yOffset) {
		this.xOffset = xOffset;
		this.yOffset = yOffset;
	}

	/**
	 * Centers the camera on an Entity, in our case, the sprite
	 * 
	 * @param e
	 *            an Entity
	 * @param viewWidth
	 *            the width of the canvas
	 * @param viewHeight
	 *            the height of the canvas
	 */
	public void center(Entity e, double viewWidth, double viewHeight) {

		/*
		 * subtracting the center point of the canvas and the center point of the sprite
		 * sets the offsets for the camera
		 */
		xOffset = e.getX() - (float) (viewWidth / 2 - e.getWidth() / 2);
		yOffset = e.getY() - (float) (viewHeight / 2 - e.getHeight() / 2);
		checkEdgeOfMap();
	}

	public void checkEdgeOfMap() {
		if (xOffset < 0) {
			xOffset = 0;
		} else if (xOffset > Game.map.getWidth() * Tile.width - Game.canvasWidth) {
			xOffset = (float) (Game.map.getWidth() * Tile.width - Game.canvasWidth);
		}
		if (yOffset < 0) {
			yOffset = 0;
		} else if (yOffset > Game.map.getHeight() * Tile.height - Game.canvasHeight) {
			yOffset = (float) (Game.map.getHeight() * Tile.height - Game.canvasHeight);
		}

	}

	/**
	 * moves the camera based on positions passed in
	 * 
	 * @param xAmt
	 *            x value to add to xOffset
	 * @param yAmt
	 *            y value to add to yOffset
	 */
	public void move(float xAmt, float yAmt) {
		xOffset += xAmt;
		yOffset += yAmt;

		checkEdgeOfMap();
	}

	/**
	 * Get the current xOffset of the Camera
	 * 
	 * @return xOffset
	 */
	public float getxOffset() {
		return xOffset;
	}

	/**
	 * Set the xOffset of the camera
	 * 
	 * @param xOffset
	 */
	public void setxOffset(float xOffset) {
		this.xOffset = xOffset;
	}

	/**
	 * Get the current yOffset of the Camera
	 * 
	 * @return yOffset
	 */
	public float getyOffset() {
		return yOffset;
	}

	/**
	 * Set the yOffset of the camera
	 * 
	 * @param xOffset
	 */
	public void setyOffset(float yOffset) {
		this.yOffset = yOffset;
	}
}
