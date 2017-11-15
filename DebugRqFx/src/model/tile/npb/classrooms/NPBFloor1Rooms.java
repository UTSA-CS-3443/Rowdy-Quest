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
	 * Top row of NPB Floor1
	 */
	public static Tile npb1c0 = new DoorRightTile(10,"NPB 1.202");
	public static Tile npb1c1 = new DoorRightTile(11,"NPB 1.1");
	public static Tile npb1c2 = new DoorRightTile(12,"NPB 1.2");
	public static Tile npb1c3 = new DoorRightTile(13,"NPB 1.3");
	public static Tile npb1c4 = new DoorRightTile(14,"NPB 1.4");
	public static Tile npb1c5 = new DoorRightTile(15,"NPB 1.5");
	public static Tile npb1c6 = new DoorRightTile(16,"NPB 1.6");
	public static Tile npb1c7 = new DoorRightTile(17,"NPB 1.250");
	
	/**
	 * 2nd row of NPB Floor1 Left side handle
	 */
	public static Tile npb1c8 = new DoorLeftTile(18,"NPB 1.8");
	public static Tile npb1c9 = new DoorLeftTile(19,"NPB 1.9");
	public static Tile npb1c10 = new DoorLeftTile(20,"NPB 1.10");
	public static Tile npb1c11 = new DoorLeftTile(21,"NPB 1.11");
	public static Tile npb1c12 = new DoorLeftTile(22,"NPB 1.12");
	public static Tile npb1c13 = new DoorLeftTile(23,"NPB 1.13");
	public static Tile npb1c14 = new DoorLeftTile(24,"NPB 1.14");
	public static Tile npb1c15 = new DoorLeftTile(25,"NPB 1.15");
	public static Tile npb1c16 = new DoorLeftTile(26,"NPB 1.16");
	public static Tile npb1c17 = new DoorLeftTile(27,"NPB 1.17");
	
	/**
	 * Third row of NPB Floor1
	 */
	public static Tile npb1c18 = new DoorRightTile(28,"NPB 1.18");
	public static Tile npb1c19 = new DoorRightTile(29,"NPB 1.19");
	public static Tile npb1c20 = new DoorRightTile(30,"NPB 1.20");
	public static Tile npb1c21 = new DoorRightTile(31,"NPB 1.21");
	public static Tile npb1c22 = new DoorRightTile(32,"NPB 1.22");
	public static Tile npb1c23 = new DoorRightTile(33,"NPB 1.23");
	public static Tile npb1c24 = new DoorRightTile(34,"NPB 1.24");
	public static Tile npb1c25 = new DoorRightTile(35,"NPB 1.25");
	
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
