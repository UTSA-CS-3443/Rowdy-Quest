package model;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
/**
 * 
 * @author Brandon Black
 *
 */

public class Profile {
	

	/**
	 * Strings to be stored per each user
	 */
	private String userName, password, firstName, lastName, currentMapPath;
	
	/**
	 * current x and y position of user. Will be updated when user is logged in, moves around, 
	 * and saves.
	 */
	private float x, y;
	
	/**
	 * Constructor
	 * @param userName
	 * @param password
	 * @param firstName
	 * @param lastName
	 * @param x
	 * @param y
	 */
	public Profile(String userName, String password, String firstName, String lastName, float x, float y, String mapPath) {
		this.userName = userName;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.currentMapPath = mapPath;
		this.x = x;
		this.y = y;
	}
	

	
	/**
	 * Getters
	 * @return
	 */
	public String getUserName() {return userName;}
	public String getPassword() {return password;}
	public String getFirstName() {return firstName;}
	public String getLastName() {return lastName;}
	public float getProfileX(){return x;}
	public float getProfileY() {return y;}
	public String getCurrentMapPath() {return currentMapPath;}
	
	/**
	 * setters
	 * @param fName
	 */
	public void setFirstName(String fName) {this.firstName = fName;}
	public void setX(float x) {this.x = x;}
	public void setY(float y) {this.y = y;}
	public void setCurrentMapPath(String path) {this.currentMapPath = path;}
	
	/**
	 * toString
	 */
	public String toString() {
		return userName + " " + password + " " + firstName + " " + lastName + " "
				+ x + " " + y + " " + currentMapPath + " ";
	}
	
	public float getX() {
		return x;
	}
	
	public float getY() {
		return y;
	}
}
