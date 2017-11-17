package model;

import java.util.ArrayList;
import javafx.scene.image.Image;

public class OverWorld {

	///////////////////////////////////////////////////////////////////////////
	// FIELDS
	///////////////////////////////////////////////////////////////////////////

	private final Image map = new Image("/campus.jpg");
	private boolean isOn;
	private Location currentLocation;
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
				521.0, 162.0, 533.0, 156.0, 554.0, 192.0, 541.0, 199.0, 
		}));
		locations.add(new Location("Campus", "res/maps/campus.txt", new Double[] {
				561.0, 196.0, 528.0, 137.0, 585.0, 110.0, 623.0, 165.0, 	
		}));
		locations.add(new Location("Tobin Ave Garage", "res/maps/NPBFloor4.txt", new Double[] {
				458.0, 124.0, 503.0, 99.0, 526.0, 139.0, 482.0, 164.0, 
		}));
		
		currentLocation = locations.get(0);
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

	public Location getCurrentLocation() {
		return currentLocation;
	}

	public void setCurrentLocation(Location currentLocation) {
		this.currentLocation = currentLocation;
	}
}
