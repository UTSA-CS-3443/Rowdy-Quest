package model;

import java.util.ArrayList;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class OverWorld {

	private final Image map = new Image("/overworld.png");
	private boolean isOn;
	//private ArrayList<String> locations;
	
	public OverWorld() {
		isOn = false;
		
	}
	
	public Image getMap() {
		return map;
	}
	
	public boolean getIsOn() {
		return isOn;
	}
	
	public void setIsOn(boolean on) {
		isOn = on;
	}
}
