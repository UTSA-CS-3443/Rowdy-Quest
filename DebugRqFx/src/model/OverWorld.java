package model;

import java.util.ArrayList;

import javafx.scene.control.Label;
import javafx.scene.image.Image;

public class OverWorld {

	private final Image map = new Image("/overworld.png");
	private boolean isOn;
	private ArrayList<Location> locations;
	
	public OverWorld() {
		isOn = false;
		locations = new ArrayList<Location>();
		loadLocations();
	}
	
	public Image getMap() {
		return map;
	}
	
	public boolean getIsOn() {
		return isOn;
	}
	
	public ArrayList<Location> getLocations(){
		return locations;
	}
	
	public void setIsOn(boolean on) {
		isOn = on;
	}
	
	private void loadLocations() {
		locations.add(new Location("North Peseo", 460, 100, 50, 50));
		locations.add(new Location("Campus", 510, 100, 50, 50));
	}
}
