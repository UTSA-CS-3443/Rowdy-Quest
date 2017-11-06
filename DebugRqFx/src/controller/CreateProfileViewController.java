package controller;

import java.io.IOException;
import java.util.ArrayList;

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
import model.entity.Profile;

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
	
	@FXML
	private TextField userName, firstName, lastName;
	//private static String stringUserName, stringFirstName, stringLastName;
	
	@FXML
	private PasswordField pw1, pw2;
	//private static String stringPw1, stringPw2;
	
	private String user;
	
	public static ArrayList<Profile> profiles = new ArrayList<Profile>();
	
	@Override
	public void handle(ActionEvent event) {
		try {
//     		stringUserName = userName.getText();
//			stringPw1 = pw1.getText();
//			stringPw2 = pw2.getText();
//			stringFirstName = firstName.getText();
//			stringLastName = lastName.getText();
//			user = (stringUserName + "\n" 
//					+ stringPw1 + "\n"
//					+ stringFirstName + "\n"
//					+ stringLastName);
			Profile temp = new Profile(userName.getText(), pw1.getText(), firstName.getText(), lastName.getText(), 10, 10);
			profiles.add(temp);
			Parent localScene = FXMLLoader.load(getClass().getResource("/view/StartView.fxml")); // Local View
			Main.stage.getScene().setRoot(localScene);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
//	public static String getUsername() {return stringUserName;}
//	public static String getFirstName() {return stringFirstName;}
//	public static String getLastName() {return stringLastName;}
	
		
}


