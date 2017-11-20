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
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
//import javafx.scene.control.Alert;
//import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import main.Main;
import model.Profile;
import model.tile.Tile;

/**
 * 
 * @author Brandon Black This class will handle the functionality of
 *         CreateProfileView.fxml User will enter username, password, re-enter
 *         password, firstName, lastName All of this information will be stored
 *         in a file in the package "profiles" as "userName".txt once "Create
 *         Profile" button is clicked.
 *         
 * @author Maurice Velgis
 * 
 *
 */

public class CreateProfileViewController implements EventHandler<ActionEvent> {

	@FXML
	private TextField userName, firstName, lastName;
	// private static String stringUserName, stringFirstName, stringLastName;

	@FXML
	private PasswordField pw1, pw2;
	// private static String stringPw1, stringPw2;

	@FXML
	private Label un_label, pw_label, pw2_label, fn_label, ln_label;
	
	private String tempLabel;

	private boolean isReady = true;

	public static ArrayList<Profile> profiles = null;

	/**
	 * Method that checks the qualifications of what the fields can contain.
	 * Such as, the fields can't contain spaces, or it has to be a certain
	 * number of characters. If it satisfies the conditions, then it creates
	 * the profile desired.
	 * @param event
	 */
	@Override
	public void handle(ActionEvent event) {
		if(pw1.getText() != pw2.getText()) {
				pw_label.setTextFill(Color.RED);
				pw2_label.setTextFill(Color.RED);
				isReady = false;
		}else {
			isReady = true;
			pw_label.setText("Password");
			pw_label.setTextFill(Color.BLACK);
			pw2_label.setText("Re-enter Password");
			pw2_label.setTextFill(Color.BLACK);
		}
		if(pw1.getText().length() < 8) {
			pw_label.setTextFill(Color.RED);
			isReady = false;
			tempLabel = pw_label.getText();
			tempLabel += ": Has to be at least 8 characters.";
			pw_label.setText(tempLabel);
		}else {
			isReady = true;
			pw_label.setText("Password");
			pw_label.setTextFill(Color.BLACK);
		}
		if(userName.getText().contains(" ")) {
			isReady = false;
			un_label.setTextFill(Color.RED);
			un_label.setText("Username: No spaces allowed.");
		}else if(userName.getText().length() >= 15) {
			isReady = false;
			un_label.setTextFill(Color.RED);
			un_label.setText("Username: Can't be longer than 15 characters.");
		}else {
			isReady = true;
			un_label.setTextFill(Color.BLACK);
			un_label.setText("Username");
		}
		
		if(pw1.getText().contains(" ")) {
			isReady = false;
			pw_label.setTextFill(Color.RED);
			pw_label.setText("Password: No spaces allowed.");
		}else {
			isReady = true;
			pw_label.setTextFill(Color.BLACK);
			pw_label.setText("Password");
			pw2_label.setTextFill(Color.BLACK);
		}
		if(firstName.getText().contains(" ")) {
			isReady = false;
			fn_label.setTextFill(Color.RED);
			fn_label.setText("First Name: No spaces allowed.");
		}else {
			isReady = true;
			fn_label.setTextFill(Color.BLACK);
			fn_label.setText("First Name");
		}
		if(lastName.getText().contains(" ")) {
			isReady = false;
			ln_label.setTextFill(Color.RED);
			ln_label.setText("Last Name: No spaces allowed.");
		}else {
			isReady = true;
			ln_label.setTextFill(Color.BLACK);
			ln_label.setText("Last Name");
		}
		
		if(isReady) {
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
	}

	/**
	 * Saves the current ArrayList into a text file to keep track of users
	 * 
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
	 * 
	 * @param fileName
	 *            - file of profile information
	 * @throws FileNotFoundException
	 *             Static to be called at start of program
	 */
	public static void loadProfiles(String fileName) throws FileNotFoundException {
		Scanner s = new Scanner(new File(fileName));
		profiles = new ArrayList<Profile>();
		while (s.hasNextLine()) {
			String[] parts;
			String line = s.nextLine();
			parts = line.split(" ");
			Profile temp = new Profile(parts[0], parts[1], parts[2], parts[3], Float.valueOf(parts[4]),
					Float.valueOf(parts[5]), parts[6]);
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
