package controller;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import model.Game;
import model.Location;
import model.entity.Profile;

/**
 * 
 * @author Tyler Clarkson
 *
 *         The FileHelper class is used to assist with file related operations
 */
public class FileHelper {

	/**
	 * Static method to build a string from the contents of a file. Used to
	 * 
	 * @param path
	 *            The path of the file as a String
	 * @return A String representation of the file
	 */
	public static String loadFileAsString(String path) {
		StringBuilder sb = new StringBuilder();

		try {
			BufferedReader br = new BufferedReader(new FileReader(path));
			String line;
			while ((line = br.readLine()) != null) {
				sb.append(line + "\n");
			}
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return sb.toString();
	}

	/**
	 * 
	 * @param fileName
	 * @throws FileNotFoundException
	 *             This method is called when the Save button is clicked It will
	 *             write the arrayList of profiles again with updated x and y values
	 *             for the currentuser;
	 */
	public static void savePosition(String fileName) throws FileNotFoundException {
		PrintWriter pw = new PrintWriter(new FileOutputStream(fileName));
		for (Profile profile : CreateProfileViewController.profiles)
			pw.println(profile.toString());
		pw.close();
	}

	public static void loadOverWorld() {

		Game.gc.drawImage(Game.overWorld.getMap(), 0, 0);

		ArrayList<Location> list = Game.overWorld.getLocations();

		for (Location loc : list) {
			Game.gc.fillRect(loc.getX(), loc.getY() - loc.getHeigth(), loc.getWidth(), loc.getHeigth());

			Game.gc.setFill(Color.RED);
			Game.gc.setFont(Font.font("Verdana", 11));
			Game.gc.fillText(loc.getName(), loc.getX(), loc.getY());

		}
	}
}
