package controller.events;

import java.io.FileNotFoundException;
import java.util.ArrayList;

import controller.FileHelper;
import controller.StartViewController;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import model.Game;
import model.texture.Texture;
import model.tile.Tile;
import model.tile.Tiles;
import model.tile.npb.classrooms.NPBFloor1Rooms;
import model.tile.npb.classrooms.NPBFloor2Rooms;

public class LocalEvents {

	private static boolean isZoomed = false; // used with zoom button
	private static boolean isRunning = false; // used with walk/run button
	
	public static ArrayList<ArrayList<Tile>> NPBList = new ArrayList<>();

	public static void Save(Event event, float x, float y) {
		System.out.println("save");
		System.out.println(StartViewController.currentUser);
		try {
			FileHelper.savePosition("res/profiles.txt");

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static void Map(Event event) {
		if (!Game.overWorld.getIsOn()) {// if the Game.overWorld is not on
			openMap();
		} else {
			closeMap();
		}
	}

	public static void Zoom(Event event, Button button) {
		if (button.getText().equals("Zoom-out") && isZoomed) {
			Game.sprite.setHeight(26);
			Game.sprite.setWidth(56);
			Tile.width = 64;
			Tile.height = 64;
			Game.sprite.setX((float) (Game.sprite.getX() / 2));
			Game.sprite.setY((float) (Game.sprite.getY() / 2));
			if (isRunning) {
				Game.sprite.setSpeed(8);
			} else {
				Game.sprite.setSpeed(4);
			}
			button.setText("Zoom-in");
			isZoomed = false;
		} else if (button.getText().equals("Zoom-in") && !isZoomed) {
			Game.sprite.setHeight(52);
			Game.sprite.setWidth(112);
			Tile.width = 128;
			Tile.height = 128;
			Game.sprite.setX((float) (Game.sprite.getX() * 2));
			Game.sprite.setY((float) (Game.sprite.getY() * 2));
			if (isRunning) {
				Game.sprite.setSpeed(16);
			} else {
				Game.sprite.setSpeed(8);
			}
			button.setText("Zoom-out");
			isZoomed = true;
		}
		Game.sprite.setBounds(0, 0, Game.sprite.getWidth(), Game.sprite.getHeight());
	}

	public static void WalkOrRun(Event event, Button button) {
		if (button.getText().equals("Walk") && isRunning) {
			if (!isZoomed) {
				Game.sprite.setSpeed(4);
			} else {
				Game.sprite.setSpeed(8);
			}
			button.setText("Run");
			isRunning = false;
		} else if (button.getText().equals("Run") && !isRunning) {
			if (!isZoomed) {
				Game.sprite.setSpeed(8);
			} else {
				Game.sprite.setSpeed(16);
			}
			isRunning = true;
			button.setText("Walk");
		}
	}

	/**
	 * This method will be called when the search button is clicked. It will take
	 * the text from the rNumberTextField and search it against the roomNumbers of
	 * the arraylist full of classrooms.
	 */
	public static void Search(Event event, TextField textField) {
		String searchFor;
		searchFor = textField.getText();	
		
		//cycle through Building arrayList of classroom arraylists
		for (int i = 0; i < NPBList.size(); i++) {
			//cycle through the arrayLists inside the Building arrayList
			for (int j = 0; j < NPBList.get(i).size(); j++) {
				if(NPBList.get(i).get(j).getRoomNumber().equals(searchFor)){
					
				//Change door Color first, check for all 4 cases of door
					if(NPBList.get(i).get(j).getImage().equals(Texture.doorTop)){
						NPBList.get(i).get(j).setDoorImage(Texture.doorTopFound);
					}else if(NPBList.get(i).get(j).getImage().equals(Texture.doorBottom)){
						NPBList.get(i).get(j).setDoorImage(Texture.doorBottomFound);
					}else if(NPBList.get(i).get(j).getImage().equals(Texture.doorLeft)){
						NPBList.get(i).get(j).setDoorImage(Texture.doorLeftFound);
					}else if(NPBList.get(i).get(j).getImage().equals(Texture.doorRight)){
						NPBList.get(i).get(j).setDoorImage(Texture.doorRightFound);
					}
						
				}else {
					//Display error "Invalid Room Number"
				}
				
				
			}
		
		}

		textField.clear();
	}
	
	
	public static void openMap(){
		Game.overWorld.setIsOn(true);
		Game.animator.stop();
		FileHelper.loadOverWorld();
	}
	
	public static void closeMap(){
		Game.overWorld.setIsOn(false);
		Game.animator.start();
	}
	
	
	
}