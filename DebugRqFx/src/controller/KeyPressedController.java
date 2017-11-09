package controller;

import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.input.KeyEvent;
import main.Main;

/**
 * 
 * @author Tyler Clarkson
 * 
 *         This class handles the keyboard input from the user when not
 *         otherwise handled by implicit methods (such as in a TextField).
 */
public class KeyPressedController implements EventHandler<KeyEvent> {

	/**
	 * Get the current scene on the stage
	 */
	private Scene scene = Main.stage.getScene();

	/**
	 * Initialize an array to store boolean values that determine if a key is
	 * pressed. Initialized with 256 items, but can be adjusted if needed.
	 */
	private boolean[] keyPressed = new boolean[256];

	/**
	 * Assigns boolean values to keys that perform specific funtions
	 */
	public boolean up, left, down, right;

	/**
	 * Sets a boolean in keyPressed array at the index that corresponds to the
	 * ordinal of the string representation of the key in the KeyCode Enum
	 */
	public KeyPressedController() {
		// If key pressed, set boolean value to true
		scene.setOnKeyPressed(new EventHandler<KeyEvent>() {
			public void handle(KeyEvent ke) {
				// sets the value at index of keycode as int to true
				keyPressed[ke.getCode().ordinal()] = true;
			}
		});

		// When key released, set boolean value to false
		scene.setOnKeyReleased(new EventHandler<KeyEvent>() {
			public void handle(KeyEvent ke) {
				// sets the value at index of keycode as int to true
				keyPressed[ke.getCode().ordinal()] = false;
			}
		});
	}

	/**
	 * Required as class implements EventHandler<KeyEvent>
	 * 
	 * @param event
	 *            KeyEvent
	 */
	@Override
	public void handle(KeyEvent event) {
		// required for EventHandler
	}

	/**
	 * Updates the boolean values of keys used for specific functions
	 */
	public void update() {
		up = keyPressed[58];
		left = keyPressed[36];
		down = keyPressed[54];
		right = keyPressed[39];
	}

}
