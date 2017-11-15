package model;

import javafx.scene.shape.Polygon;
public class Location {

	private Double[] points;
	private Polygon bounds;
	private String name;
	
	public Location(String name, Double[] points) {
		this.points = points;
		bounds = new Polygon();
		bounds.getPoints().addAll(points);
		this.name = name;
	}

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
}
