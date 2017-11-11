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

	private Map testMap; // the map
	public static Sprite sprite; // player
	private Camera camera; // game camera
	private KeyPressedController kc; // handles the key events
	private GraphicsContext gc; // used to draw on the canvas
	public static double canvasWidth, canvasHeight; // height and width of the canvas

	@FXML
	private Label displayName; // label that displays user's name

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
		testMap = new Map("res/maps/NPBfloor1.txt");
		camera = new Camera(0, 0);
		sprite = new Sprite(camera, kc, 32, 32);
		
		//sprite.placePlayer(100,800);   //good-ish spawn point for floor 2

		// set GraphicsContext to draw on current canvas in 2D
		gc = mapCanvas.getGraphicsContext2D();

		/**
		 * Inner class for animation loop for LocalView. This is effectively the game
		 * loop since the LocalView is mainly where the user interacts with the app
		 */
		AnimationTimer animator = new AnimationTimer() {
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
		try {
			savePosition("res/profiles.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
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
	 * This method will be called when the search button is clicked.
	 * It will take the text from the rNumberTextField and search it against
	 * the roomNumbers of the arraylist full of classrooms.
	 */
	private TextField rNumberTextField;
	private String searchFor;
	public void roomSearch(ActionEvent e) {
		searchFor = rNumberTextField.getText();
//		for (int i = 0; i < NPBFloor1.classRoom.size(); i++) {
//			if (Tile.f1.classRoom.get(i).getRoomNumber().equals(searchFor)){
//				if(Tile.f1.classRoom.get(i).getImage().equals(Texture.doorLeft)) {
//					Tile.f1.classRoom.get(i).setImage(Texture.doorLeftFound);
//				}else if(Tile.f1.classRoom.get(i).getImage().equals(Texture.doorRight)) {
//					Tile.f1.classRoom.get(i).setImage(Texture.doorRightFound);
//				}
//			}
//		}
	}
	

	/**
	 * Updates information relative to the Localview. Called by AnimationTimer at a
	 * rate of 60fps
	 */
	private void update() {
		kc.update();
		sprite.update();
	}

	/**
	 * Draws information on the canvas in the LocalView. Called by AnimationTimer at
	 * a rate of 60fps
	 */
	private void render() {
		gc.clearRect(0, 0, 600, 500);
		testMap.render(gc, camera);
		sprite.render(gc);
	}

}
