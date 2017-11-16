package controller.events;

import java.io.FileNotFoundException;

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
			Game.overWorld.setIsOn(true);
			Game.animator.stop();
			FileHelper.loadOverWorld();
		} else {
			Game.overWorld.setIsOn(false);
			Game.animator.start();
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
		System.out.println(Game.map.getName());

		if (Game.map.getName().equals("NPBFloor1")) {
			for (int i = 0; i < NPBFloor1Rooms.npb1List.size(); i++) {
				if (NPBFloor1Rooms.npb1List.get(i).getRoomNumber() != null) {
					// if searchFor is equal to any room number in npb1List ArrayList
					if (NPBFloor1Rooms.npb1List.get(i).getRoomNumber().equals(searchFor)) {
						// checks if its a Bottom door
						if (NPBFloor1Rooms.npb1List.get(i).getImage().equals(Texture.doorBottom)) {
							// changes the door on the map to a yellow door
							NPBFloor1Rooms.npb1List.get(i).setDoorImage(Texture.doorBottomFound);
							// checks if its a right door
						} else if (NPBFloor1Rooms.npb1List.get(i).getImage().equals(Texture.doorRight)) {
							// changes the door on the map to a yellow door
							NPBFloor1Rooms.npb1List.get(i).setDoorImage(Texture.doorRightFound);
							// checks if its a Top door
						} else if (NPBFloor1Rooms.npb1List.get(i).getImage().equals(Texture.doorTop)) {
							// changes the door on the map to a yellow door
							NPBFloor1Rooms.npb1List.get(i).setDoorImage(Texture.doorTopFound);
							// checks if its a left door
						} else if (NPBFloor1Rooms.npb1List.get(i).getImage().equals(Texture.doorLeft)) {
							// changes the door on the map to a yellow door
							NPBFloor1Rooms.npb1List.get(i).setDoorImage(Texture.doorLeftFound);
						}
						// if the room number does not match one from the arraylist
					} else if (!NPBFloor1Rooms.npb1List.get(i).getRoomNumber().equals(searchFor)) {
						// if the door is yellow and it doesnt match the current searched one
						if (NPBFloor1Rooms.npb1List.get(i).getImage().equals(Texture.doorLeftFound)) {
							// changes is back to a normal door
							NPBFloor1Rooms.npb1List.get(i).setDoorImage(Texture.doorLeft);
						} else if (NPBFloor1Rooms.npb1List.get(i).getImage().equals(Texture.doorRightFound)) {
							NPBFloor1Rooms.npb1List.get(i).setDoorImage(Texture.doorRight);
						} else if (NPBFloor1Rooms.npb1List.get(i).getImage().equals(Texture.doorTopFound)) {
							NPBFloor1Rooms.npb1List.get(i).setDoorImage(Texture.doorTop);
						} else if (NPBFloor1Rooms.npb1List.get(i).getImage().equals(Texture.doorBottomFound)) {
							NPBFloor1Rooms.npb1List.get(i).setDoorImage(Texture.doorBottom);
						}

					}
				}
			}
		} else if (Game.map.getName().equals("NPBFloor2")) {
			for (int i = 0; i < NPBFloor2Rooms.npb2List.size(); i++) {
				if (NPBFloor2Rooms.npb2List.get(i).getRoomNumber() != null) {
					// if searchFor is equal to any room number in npb1List ArrayList
					if (NPBFloor2Rooms.npb2List.get(i).getRoomNumber().equals(searchFor)) {
						// checks if its a Bottom door
						if (NPBFloor2Rooms.npb2List.get(i).getImage().equals(Texture.doorBottom)) {
							// changes the door on the map to a yellow door
							NPBFloor2Rooms.npb2List.get(i).setDoorImage(Texture.doorBottomFound);
							// checks if its a right door
						} else if (NPBFloor2Rooms.npb2List.get(i).getImage().equals(Texture.doorRight)) {
							// changes the door on the map to a yellow door
							NPBFloor2Rooms.npb2List.get(i).setDoorImage(Texture.doorRightFound);
							// checks if its a Top door
						} else if (NPBFloor2Rooms.npb2List.get(i).getImage().equals(Texture.doorTop)) {
							// changes the door on the map to a yellow door
							NPBFloor2Rooms.npb2List.get(i).setDoorImage(Texture.doorTopFound);
							// checks if its a left door
						} else if (NPBFloor2Rooms.npb2List.get(i).getImage().equals(Texture.doorLeft)) {
							// changes the door on the map to a yellow door
							NPBFloor2Rooms.npb2List.get(i).setDoorImage(Texture.doorLeftFound);
						}
						// if the room number does not match one from the arraylist
					} else if (!NPBFloor2Rooms.npb2List.get(i).getRoomNumber().equals(searchFor)) {
						// if the door is yellow and it doesnt match the current searched one
						if (NPBFloor2Rooms.npb2List.get(i).getImage().equals(Texture.doorLeftFound)) {
							// changes is back to a normal door
							NPBFloor2Rooms.npb2List.get(i).setDoorImage(Texture.doorLeft);
						} else if (NPBFloor2Rooms.npb2List.get(i).getImage().equals(Texture.doorRightFound)) {
							NPBFloor2Rooms.npb2List.get(i).setDoorImage(Texture.doorRight);
						} else if (NPBFloor2Rooms.npb2List.get(i).getImage().equals(Texture.doorTopFound)) {
							NPBFloor2Rooms.npb2List.get(i).setDoorImage(Texture.doorTop);
						} else if (NPBFloor2Rooms.npb2List.get(i).getImage().equals(Texture.doorBottomFound)) {
							NPBFloor2Rooms.npb2List.get(i).setDoorImage(Texture.doorBottom);
						}
					}
				}
			}
		}

		textField.clear();
	}
}