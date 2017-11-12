package controller;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

import javafx.animation.AnimationTimer;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import model.Map;
import model.OverWorld;
import model.entity.Profile;
import model.entity.Sprite;
import model.texture.Texture;
import model.tile.NPBFloor1;
import model.tile.Tile;

/**
 * 
 * @author Tyler Clarkson
 * 
 *         The LocalViewController class initializes the local view and handles
 *         events generated within the local view
 *
 */
public class LocalViewController implements EventHandler<ActionEvent> {

	public static Map map; // the map
	public static OverWorld overWorld;
	public static Sprite sprite; // player
	public static Camera camera; // game camera
	private KeyPressedController kc; // handles the key events
	private GraphicsContext gc; // used to draw on the canvas
	public static double canvasWidth, canvasHeight; // height and width of the canvas
	private AnimationTimer animator;

	@FXML
	public Label displayName; // label that displays user's name

	@FXML
	private Canvas mapCanvas; // canvas for map

	/**
	 * Initializes the Local View
	 */
	@FXML
	private void initialize() {
		System.out.println("Initialize"); //help debug
		kc = new KeyPressedController(); // to handle keyboard input

		canvasWidth = mapCanvas.getWidth();
		canvasHeight = mapCanvas.getHeight();

		// sets the welcome message to the name entered on the StartView
		displayName.setText("Welcome, " + StartViewController.currentUser.getFirstName());
		
		
		

		// initializes all texture images
		Texture.init();

		// set up map, camera, and sprite
		map = new Map("res/maps/NPBfloor1.txt");
		camera = new Camera(0, 0);
		sprite = new Sprite(camera, kc, map.getSpawnX(), map.getSpawnY());
		
		//overworld setup
		overWorld = new OverWorld();
		

		// set GraphicsContext to draw on current canvas in 2D
		gc = mapCanvas.getGraphicsContext2D();

		/**
		 * Inner class for animation loop for LocalView. This is effectively the game
		 * loop since the LocalView is mainly where the user interacts with the app
		 */
		 animator = new AnimationTimer() {
			@Override
			public void handle(long arg0) {
				update(); // update game state
				render(); // render to canvas
				
			}
		};

		animator.start(); // start the game loop
	}

	/**
	 * Needed because class implements EventHandler<ActionEvent>
	 * 
	 * @param event
	 *            ActionEvent to be handled
	 */
	@Override
	public void handle(ActionEvent event) {
		if(event.getSource().toString().contains("Save")) {
			System.out.println("save");
		try {
			savePosition("res/profiles.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
		}
		else if(event.getSource().toString().contains("Map")) {
			loadOverWorld();
		}
		else if(event.getSource().toString().contains("Search")) {
			
		}
		
	}
	
	/**
	 * 
	 * @param fileName
	 * @throws FileNotFoundException
	 * This method is called when the Save button is clicked
	 * It will write the arrayList of profiles again with updated 
	 * x and y values for the currentuser;
	 */
	public void savePosition(String fileName) throws FileNotFoundException {
		    PrintWriter pw = new PrintWriter(new FileOutputStream(fileName));
		    for (Profile profile : CreateProfileViewController.profiles)
		        pw.println(profile.toString());
		    pw.close();
		}
	
	
	/**
	 * TextField the user will enter the room number they are searching for
	 * PromptText will be current room
	 */
	@FXML
	private TextField rNumberTextField;
	/**
	 * The text entered in the rNumberTextField will be saved into searchFor
	 */
	private String searchFor;
	
	/**
	 * This method will be called when the search button is clicked.
	 * It will take the text from the rNumberTextField and search it against
	 * the roomNumbers of the arraylist full of classrooms.
	 */
	public void roomSearch(ActionEvent e) {
		searchFor = rNumberTextField.getText();
		
		for (int i = 0; i < NPBFloor1.npb1List.size(); i++) {
			if(Tile.f1.npb1List.get(i).getRoomNumber() != null) {
				//if searchFor is equal to any room number in npb1List ArrayList
				if (Tile.f1.npb1List.get(i).getRoomNumber().equals(searchFor)){
					//checks if its a left door
					if(Tile.f1.npb1List.get(i).getImage().equals(Texture.doorLeft)) {
						//changes the door on the map to a yellow door
						Tile.f1.npb1List.get(i).setLeftDoorImage(Texture.doorLeftFound);
						//checks if its a right door
					}else if(Tile.f1.npb1List.get(i).getImage().equals(Texture.doorRight)) {
						//changes the door on the map to a yellow door
						Tile.f1.npb1List.get(i).setRightDoorImage(Texture.doorRightFound);	
					}
					//if the room number does not match one from the arraylist
				}else if (!Tile.f1.npb1List.get(i).getRoomNumber().equals(searchFor)) {
					//if the door is yellow and it doesnt match the current searched one
					if(Tile.f1.npb1List.get(i).getImage().equals(Texture.doorLeftFound)) {
						//changes is back to a normal door
						Tile.f1.npb1List.get(i).setLeftDoorImage(Texture.doorLeft);
					}else if(Tile.f1.npb1List.get(i).getImage().equals(Texture.doorRightFound)) {
						Tile.f1.npb1List.get(i).setRightDoorImage(Texture.doorRight);
		
					}
					
					
				}
			}
		}	rNumberTextField.clear();
	}
	

	/**
	 * Updates information relative to the Localview. Called by AnimationTimer at a
	 * rate of 60fps
	 */
	private void update() {
		kc.update();
		sprite.update();
		rNumberTextField.setPromptText(sprite.displayRoomNumber());
	}

	/**
	 * Draws information on the canvas in the LocalView. Called by AnimationTimer at
	 * a rate of 60fps
	 */
	private void render() {
		gc.clearRect(0, 0, 600, 500);
		map.render(gc, camera);
		sprite.render(gc);
	}

	private void loadOverWorld() {
		System.out.print("Load overview");
		animator.stop();
		gc.drawImage(overWorld.getMap(), 0, 0);
		
	}
	
}
