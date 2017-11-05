package controller;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

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
}
