package model.entity;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Profile {
	

	/**
	 * Strings to be stored per each user
	 */
	private String userName, password, firstName, lastName;
	
	/**
	 * current x and y position of user. Will be updated when user is logged in, moves around, 
	 * and saves.
	 */
	private int x, y;
	
	/**
	 * Constructor
	 * @param userName
	 * @param password
	 * @param firstName
	 * @param lastName
	 * @param x
	 * @param y
	 */
	public Profile(String userName, String password, String firstName, String lastName, int x, int y) {
		this.userName = userName;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.x = 10;
		this.y = 10;
	}
	

	
	/**
	 * Getters
	 * @return
	 */
	public String getUserName() {return userName;}
	public String getPassword() {return password;}
	public String getFirstName() {return firstName;}
	public String getLastName() {return lastName;}
	public int getProfileX(){return x;}
	public int getProfileY() {return y;}
	
	/**
	 * toString
	 */
	public String toString() {
		return userName + " " + password + " " + firstName + " " + lastName + " "
				+ x + " " + y;
	}

}
