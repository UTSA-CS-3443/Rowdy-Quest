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
import model.Profile;

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
		Game.gc.setFill(Color.BLUE);
		//Game.gc.fillOval(Game.overWorld.getCurrentLocation().getPointList()[0], Game.overWorld.getCurrentLocation().getPointList()[1], 5, 5);
		
		ArrayList<Location> list = Game.overWorld.getLocations();
		
		/*for(Location loc : list) {
			
		
			int nPoints = loc.getPointList().length/2;
			System.out.println(nPoints + " Points");
			double[] x = new double[nPoints];
			double[] y = new double[nPoints];
			int counter = 0;
			for(int i = 0; i < loc.getPointList().length; i++) {
				if(i % 2 == 0) {
					System.out.print(loc.getPointList()[i] + " X -");
					x[counter] = loc.getPointList()[i];
				}
				else {
					System.out.println(loc.getPointList()[i] + " Y");
					y[counter] = loc.getPointList()[i];
					counter++;
				}
				
			}
			
			Game.gc.fillPolygon(x, y, nPoints);
			
			Game.gc.setFill(Color.RED);
			Game.gc.setFont(Font.font ("Verdana", 11));
			//gc.fillText(loc.getName() , loc.getX(), loc.getY());
			
		}*/
	}
}
