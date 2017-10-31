package controller;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.PasswordField;
//import javafx.scene.control.Alert;
//import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.TextField;
import main.Main;

/**
 * 
 * @author Brandon Black 
 * This class will handle the functionality of CreateProfileView.fxml
 * User will enter username, password, re-enter password, firstName, lastName
 * All of this information will be stored in a file in the package "profiles"
 * as "userName".txt once "Create Profile" button is clicked.
 *  
 *
 */

public class CreateProfileViewController implements EventHandler<ActionEvent>{
	
	private TextField userName, firstName, lastName;
	private static String stringUserName, stringFirstName, stringLastName;
	
	private PasswordField pw1, pw2;
	private static String stringPw1, stringPw2;
	
	

	@Override
	public void handle(ActionEvent arg0) {
		try {
			stringUserName = userName.getText();
			stringPw1 = pw1.getText();
			stringPw2 = pw2.getText();
			stringFirstName = firstName.getText();
			stringLastName = lastName.getText();
			Parent localScene = FXMLLoader.load(getClass().getResource("/view/LocalView.fxml")); // Local View
			Main.stage.getScene().setRoot(localScene);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
		
}


