package model;

import javafx.scene.shape.Rectangle;

public class Location {
	
	///////////////////////////////////////////////////////////////////////////
	//   FIELDS
	///////////////////////////////////////////////////////////////////////////

	private int x, y, width, heigth;
	private String name;
	
	///////////////////////////////////////////////////////////////////////////
	//   CONSTRUCTOR
	///////////////////////////////////////////////////////////////////////////
	
	public Location(String name, int x, int y, int width, int heigth) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.heigth = heigth;
		this.name = name;
	}

	///////////////////////////////////////////////////////////////////////////
	//   GETTERS AND SETTERS
	///////////////////////////////////////////////////////////////////////////
	
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeigth() {
		return heigth;
	}

	public void setHeigth(int heigth) {
		this.heigth = heigth;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Rectangle getBounds(){
		return new Rectangle(x,y,width,heigth);
	}
}
