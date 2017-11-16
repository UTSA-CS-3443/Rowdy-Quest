package model;

import javafx.scene.shape.Polygon;

public class Location {
	
	///////////////////////////////////////////////////////////////////////////
	//   FIELDS
	///////////////////////////////////////////////////////////////////////////

	private Double[] points;
	private Polygon bounds;
	private String name;
	private String path;
	
	///////////////////////////////////////////////////////////////////////////
	//   CONSTRUCTOR
	///////////////////////////////////////////////////////////////////////////

	public Location(String name, String path, Double[] points) {
		this.points = points;
		bounds = new Polygon();
		bounds.getPoints().addAll(points);
		this.name = name;
		this.path = path;
	}

	///////////////////////////////////////////////////////////////////////////
	//   GETTERS AND SETTERS
	///////////////////////////////////////////////////////////////////////////
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Polygon getBounds(){
		return bounds;
	}

	public Double[] getPointList() {
		return points;
	}
	
	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}
}