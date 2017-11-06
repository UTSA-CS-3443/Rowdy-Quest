package model.entity;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Profile {
	

	
	private String userName, password, firstName, lastName;
	
	private int x, y;
	
	public Profile(String userName, String password, String firstName, String lastName, int x, int y) {
		this.userName = userName;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.x = 10;
		this.y = 10;
	}
	
	public void save(String fileName) throws FileNotFoundException {
	    PrintWriter pw = new PrintWriter(new FileOutputStream(fileName));
	 //   for (Profile profile : profiles)
	 //       pw.println(profile.toString());
	    pw.close();
	}
	
	public String getUserName() {return userName;}
	public String getPassword() {return password;}
	public String getFirstName() {return firstName;}
	public String getLastName() {return lastName;}
	public int getProfileX(){return x;}
	public int getProfileY() {return y;}
	
	public String toString() {
		return userName + " " + password + " " + firstName + " " + lastName + " "
				+ x + " " + y;
	}

}
