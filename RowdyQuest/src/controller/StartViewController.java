package controller;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
//import javafx.scene.control.Alert;
//import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.TextField;
import main.Main;

/**
 * 
 * @author Tyler Clarkson
 * @author Brandon Black
 * 
 *         This class controls what happens when the start button on the start
 *         screen is pressed. If the user does not enter a name, an Alert dialog
 *         will pop-up prompting the user to enter their name.
 *
 */
public class StartViewController implements EventHandler<ActionEvent> {

	/**
	 * Textfield containing the user's name
	 */
	@FXML
	private TextField name;

	/**
	 * Static variable for user's name; ensures it is accessible from
	 * LocalViewController class
	 */
	private static String stringName;

	/**
	 * Handles ActionEvents generated by the StartView
	 * 
	 * @param event
	 *            ActionEvent
	 */
	@Override
	public void handle(ActionEvent event) {

		// makes sure the name TextField is not empty
		//if (name.getText().isEmpty()) {
			//Alert alert = new Alert(AlertType.INFORMATION);
			//alert.setTitle("Invalid Input");
			//alert.setHeaderText("You have not entered your name.");
			//alert.setContentText("Please click 'OK' and enter your name to continue.");
			//alert.showAndWait();
		//} else {

			// set stringName and switch to LocalView
			try {
				stringName = name.getText();
				Parent localScene = FXMLLoader.load(getClass().getResource("/view/LocalView.fxml")); // Local View
				Main.stage.getScene().setRoot(localScene);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	//}
	
	/**
	 * This is called when the "Create Profile" button is clicked from the start screen.
	 * @param event
	 */
	public void CreateProfile(ActionEvent event) {
		try {
			Parent createProfileScene = FXMLLoader.load(getClass().getResource("/view/CreateProfileView.fxml"));
			Main.stage.getScene().setRoot(createProfileScene);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * Static method to return name typed in by user
	 * 
	 * @return
	 */
	public static String getName() {
		return stringName;
	}
}
