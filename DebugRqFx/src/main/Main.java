package main;

import controller.CreateProfileViewController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * 
 * @author Tyler Clarkson
 *
 *         The Main class is the entry point for the application. It sets the
 *         StartScene and initializes a class variable for the stage
 */

public class Main extends Application {

	/**
	 * Static variable for accessing the stage from other classes
	 */
	public static Stage stage;

	/**
	 * Initialized the Stage for FX application
	 */
	@Override
	public void start(Stage primaryStage) throws Exception {
		try {
			stage = primaryStage;
			Parent startScene = FXMLLoader.load(getClass().getResource("/view/StartViewTest.fxml")); // StartView
			stage.setTitle("RowdyQuest");
			// stage.setMaximized(true); // set Stage to maximized window
			stage.setScene(new Scene(startScene, 800, 600));
			stage.setMinWidth(600);
			stage.setMinHeight(500);
			stage.show();
			CreateProfileViewController.loadProfiles("res/profiles.txt");
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	/**
	 * Point of entry for program; main thread of execution.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		launch(args);
	}

}
