package model.tile.npb.classrooms;

import java.util.ArrayList;

import model.tile.Tile;
/**
 * 
 * @author Brandon Black
 * This class will build an arrayList of all the classrooms on NPB floor 1
 *
 */

public class NPBFloor1Rooms {

	/**
	 * Static ArrayList of Rooms to be used in Tile class to add them to 
	 * the ArrayList of Tiles
	 */
	public static ArrayList<Tile> npb1List = new ArrayList<>();
	
	
	/**
	 * Gonna create every new classroom here
	 * Order starts from top left of map, moves to the right, and 
	 * then goes back to the left and starts again from left to right
	 */
	/**
	 * Far left column of NPB Floor1
	 */
	public static Tile npb1c0 = new DoorTopTile(10,"NPB 1.202");
	public static Tile npb1c1 = new DoorTopTile(11,"NPB 1.202");
	public static Tile npb1c2 = new DoorTopTile(12,"NPB 1.238");
	public static Tile npb1c3 = new DoorTopTile(13,"NPB 1.238");
	public static Tile npb1c4 = new DoorTopTile(14,"NPB 1.226");
	public static Tile npb1c5 = new DoorTopTile(15,"NPB 1.226");
	public static Tile npb1c6 = new DoorTopTile(16,"NPB 1.250");
	public static Tile npb1c7 = new DoorTopTile(17,"NPB 1.250");
	
	/**
	 * 2nd column from left
	 */
	public static Tile npb1c8 = new DoorBottomTile(18,"NPB 1.204");
	public static Tile npb1c9 = new DoorBottomTile(19,"NPB 1.208");
	public static Tile npb1c10 = new DoorBottomTile(20,"NPB 1.S1");
	public static Tile npb1c11 = new DoorBottomTile(21,"NPB 1.214");
	public static Tile npb1c12 = new DoorBottomTile(22,"NPB 1.216");
	public static Tile npb1c13 = new DoorBottomTile(23,"NPB 1.218");
	public static Tile npb1c14 = new DoorBottomTile(24,"NPB 1.224");
	public static Tile npb1c15 = new DoorBottomTile(25,"NPB 1.234");
	public static Tile npb1c16 = new DoorBottomTile(26,"NPB 1.236");
	public static Tile npb1c17 = new DoorBottomTile(27,"NPB 1.252");
	
	/**
	 * Third row of NPB Floor1
	 */
	public static Tile npb1c18 = new DoorTopTile(28,"NPB 1.102");
	public static Tile npb1c19 = new DoorTopTile(29,"NPB 1.106");
	public static Tile npb1c20 = new DoorTopTile(30,"NPB 1.110");
	public static Tile npb1c21 = new DoorTopTile(31,"NPB 1.114");
	public static Tile npb1c22 = new DoorTopTile(32,"NPB 1.118");
	public static Tile npb1c23 = new DoorTopTile(33,"NPB 1.122");
	public static Tile npb1c24 = new DoorTopTile(34,"NPB 1.126");
	public static Tile npb1c25 = new DoorTopTile(35,"NPB 1.130");
	/**
	 * Adds all classrooms to the arrayList
	 */
	public NPBFloor1Rooms() {
		npb1List.add(npb1c0);
		npb1List.add(npb1c1);
		npb1List.add(npb1c2);
		npb1List.add(npb1c3);
		npb1List.add(npb1c4);
		npb1List.add(npb1c5);
		npb1List.add(npb1c6);
		npb1List.add(npb1c7);
		
		npb1List.add(npb1c18);
		npb1List.add(npb1c19);
		npb1List.add(npb1c20);
		npb1List.add(npb1c21);
		npb1List.add(npb1c22);
		npb1List.add(npb1c23);
		npb1List.add(npb1c24);
		npb1List.add(npb1c25);
		
		npb1List.add(npb1c8);
		npb1List.add(npb1c9);
		npb1List.add(npb1c10);
		npb1List.add(npb1c11);
		npb1List.add(npb1c12);
		npb1List.add(npb1c13);
		npb1List.add(npb1c14);
		npb1List.add(npb1c15);
		npb1List.add(npb1c16);
		npb1List.add(npb1c17);
	}
	
}
