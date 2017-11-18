package controller.events;

import java.io.IOException;

import controller.CreateProfileViewController;
import controller.StartViewController;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
//import javafx.scene.control.Alert;
//import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.TextField;
import main.Main;
import model.Game;
import model.Profile;



public class StartEvents {
	private TextField signInUs, signInPw;
		
	public StartEvents(TextField us, TextField pw) {
		this.signInUs = us;
		this.signInPw = pw;
	}
	
	/**
	 * We'll need to change this to a try catch when we start error checking. This
	 * will sign in the user and we will store their profile in "currentUser" until
	 * another user signs in.
	 * 
	 * @param event
	 */
	public void SignIn() {
		System.out.println(CreateProfileViewController.profiles);
		
		for (int i = 0; i < CreateProfileViewController.profiles.size(); i++) {
			System.out.println(CreateProfileViewController.profiles.get(i).getUserName());
			System.out.println(CreateProfileViewController.profiles.get(i).getPassword());
			if (signInUs.getText().equals(CreateProfileViewController.profiles.get(i).getUserName())
					&& signInPw.getText().equals(CreateProfileViewController.profiles.get(i).getPassword())) {
				StartViewController.currentUser = CreateProfileViewController.profiles.get(i);
				try {
					Parent localScene = FXMLLoader.load(getClass().getResource("/view/LocalView.fxml")); // Local View
					Main.stage.getScene().setRoot(localScene);
					Game.sprite.placePlayer(StartViewController.currentUser.getProfileX(), StartViewController.currentUser.getProfileY());
					return;
				} catch (IOException e) {
					e.printStackTrace();
				}
			} 
		}
//		Alert alert = new Alert(AlertType.INFORMATION);
//		alert.setTitle("Invalid Input");
//		alert.setHeaderText("You have not entered a valid username and/or password.");
//		alert.setContentText("Please click 'OK' to try again or sign in as a guest.");
//		alert.showAndWait();
	}

	/**
	 * This is called when the "Create Profile" button is clicked from the start
	 * screen.
	 * 
	 * @param event
	 */
	public void CreateProfile() {
		try {
			Parent createProfileScene = FXMLLoader.load(getClass().getResource("/view/CreateProfileView.fxml"));
			Main.stage.getScene().setRoot(createProfileScene);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void Guest() {
				// set stringName and switch to LocalView
				try {
					StartViewController.currentUser = new Profile("admin", "admin", "admin", "admin", 10, 10, "res/maps/campus.txt");
					StartViewController.currentUser.setFirstName("Guest");
					Parent localScene = FXMLLoader.load(getClass().getResource("/view/LocalView.fxml")); // Local View
					Main.stage.getScene().setRoot(localScene);
				} catch (IOException e) {
					e.printStackTrace();
				}
	}

}
