package controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

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
import model.Profile;
import model.tile.Tile;

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
	

	
	public static ArrayList<Profile> profiles = null;
	
	@Override
	public void handle(ActionEvent event) {
		try {
			if(profiles != null) {
				Profile temp = new Profile(userName.getText(), pw1.getText(), firstName.getText(), lastName.getText(), 35, 60, "res/maps/campus.txt");
				profiles.add(temp);
			}			
			saveProfile("res/profiles.txt");
			
			Parent localScene = FXMLLoader.load(getClass().getResource("/view/StartView.fxml")); // Local View
			Main.stage.getScene().setRoot(localScene);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	/**
	 * Saves the current ArrayList into a text file to keep track of users
	 * @param fileName
	 * @throws FileNotFoundException
	 */
	public void saveProfile(String fileName) throws FileNotFoundException {
	    PrintWriter pw = new PrintWriter(new FileOutputStream(fileName));
	    for (Profile profile : profiles)
	        pw.println(profile.toString());
	    pw.close();
	}
	
	/**
	 * Reads file of Profiles and re-instatiates the arrayList of profiles. 
	 * @param fileName - file of profile information
	 * @throws FileNotFoundException
	 * Static to be called at start of program
	 */
	public static void loadProfiles(String fileName) throws FileNotFoundException {
		Scanner s = new Scanner(new File(fileName));
		profiles = new ArrayList<Profile>();
		while (s.hasNextLine()){
			String[] parts;
			String line = s.nextLine();
			parts = line.split(" ");
			Profile temp = new Profile(parts[0], parts[1], parts[2], parts[3], Float.valueOf(parts[4]), Float.valueOf(parts[5]), parts[6]);
		    profiles.add(temp);
		}
		s.close();
	}
	
	
	public void cancelCreate(ActionEvent e) {
		Parent localScene;
		try {
			localScene = FXMLLoader.load(getClass().getResource("/view/StartView.fxml"));
			Main.stage.getScene().setRoot(localScene);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} // Local View
		
	}
		
}


