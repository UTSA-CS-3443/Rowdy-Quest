package model;

import java.util.ArrayList;

import javafx.scene.image.Image;

public class OverWorld {

	///////////////////////////////////////////////////////////////////////////
	// FIELDS
	///////////////////////////////////////////////////////////////////////////

	private final Image map = new Image("/overworld.png");
	private boolean isOn;
	private ArrayList<Location> locations;

	///////////////////////////////////////////////////////////////////////////
	// CONSTRUCTOR
	///////////////////////////////////////////////////////////////////////////

	public OverWorld() {
		isOn = false;
		locations = new ArrayList<Location>();
		loadLocations();
	}

	///////////////////////////////////////////////////////////////////////////
	// LOAD LOCATIONS
	///////////////////////////////////////////////////////////////////////////

	private void loadLocations() {
		locations.add(new Location("North Peseo", "res/maps/NPBFloor1.txt", new Double[] {
				514.0, 167.0, 538.0, 207.0, 554.0, 198.0, 531.0, 156.0
		}));
		locations.add(new Location("Campus", "res/maps/campus.txt", new Double[] {
				528.0, 137.0 , 564.0, 198.0, 603.0, 168.0, 571.0, 123.0	
		}));
		locations.add(new Location("Garage", "res/maps/NPBFloor4.txt", new Double[] {
				453.0, 134.0, 494.0, 110.0, 475.0, 175.0, 519.0, 149.0
		}));
	}

	///////////////////////////////////////////////////////////////////////////
	// GETTERS AND SETTERS
	///////////////////////////////////////////////////////////////////////////

	public Image getMap() {
		return map;
	}

	public boolean getIsOn() {
		return isOn;
	}

	public ArrayList<Location> getLocations() {
		return locations;
	}

	public void setIsOn(boolean on) {
		isOn = on;
	}
}
