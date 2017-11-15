package model;

import controller.Camera;
import controller.KeyPressedController;
import controller.MouseClickedController;
import controller.StartViewController;
import javafx.animation.AnimationTimer;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Label;
import model.entity.Sprite;
import model.texture.Texture;
import model.tile.Tiles;

public class Game {

	///////////////////////////////////////////////////////////////////////////
	//   FIELDS
	///////////////////////////////////////////////////////////////////////////
	
	public static Map map; // the map
	public static OverWorld overWorld;
	public static Sprite sprite; // player
	public static Camera camera; // game camera
	public static KeyPressedController kc; // handles the key events
	public static GraphicsContext gc; // used to draw on the canvas
	public static double canvasWidth, canvasHeight; // height and width of the canvas
	public static AnimationTimer animator;
	public static MouseClickedController mc;
	public static Label infoLabel;
	
	///////////////////////////////////////////////////////////////////////////
	//   CONSTRUCTOR
	///////////////////////////////////////////////////////////////////////////
	public Game(Canvas c, Label l) {
		// initializes all texture images
		Texture.init();
		Tiles.init();		
		this.kc = new KeyPressedController(); // to handle keyboard input
		this.camera = new Camera(0, 0);
		this.canvasWidth = c.getWidth();
		this.canvasHeight = c.getHeight();
		this.infoLabel = l;
		this.map = new Map(StartViewController.currentUser.getCurrentMapPath());
		this.sprite = new Sprite(map.getSpawnX(), map.getSpawnY());
		this.overWorld = new OverWorld();
		this.mc = new MouseClickedController(overWorld);
		this.canvasWidth = c.getWidth();
		this.canvasHeight = c.getHeight();
		this.gc = c.getGraphicsContext2D();
		
		/*
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
	}
	
	///////////////////////////////////////////////////////////////////////////
	//   UPDATE AND RENDER
	///////////////////////////////////////////////////////////////////////////
	
	/**
	 * Updates information relative to the Localview. Called by AnimationTimer at a
	 * rate of 60fps
	 */
	private void update() {
		kc.update();
		sprite.update();
		//TODO
		//rNumberTextField.setPromptText(Game.sprite.displayRoomNumber());
	}

	/**
	 * Draws information on the canvas in the LocalView. Called by AnimationTimer at
	 * a rate of 60fps
	 */
	private void render() {
		gc.clearRect(0, 0, 800, 600);
		map.render();
		sprite.render();
	}
	
}
