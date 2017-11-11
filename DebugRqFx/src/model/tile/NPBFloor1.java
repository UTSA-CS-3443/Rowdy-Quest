package model.tile;

import java.util.ArrayList;

import model.tile.local.DoorLeftTile;
import model.tile.local.DoorRightTile;
/**
 * 
 * @author Brandon Black
 * This class will build an arrayList of all the classrooms on NPB floor 1
 *
 */

public class NPBFloor1{

	/**
	 * Static ArrayList of Rooms to be used in Tile class to add them to 
	 * the ArrayList of Tiles
	 */
	public static ArrayList<Tile> classRoom = new ArrayList<>();
	
	
	/**
	 * Gonna create every new classroom here
	 * Order starts from top left of map, moves to the right, and 
	 * then goes back to the left and starts again from left to right
	 */
	/**
	 * Top row of NPB Floor1
	 */
	public static Tile npb1c0 = new DoorRightTile(10,"3");
	public static Tile npb1c1 = new DoorRightTile(11,"4");
	public static Tile npb1c2 = new DoorRightTile(12,"5");
	public static Tile npb1c3 = new DoorRightTile(13,"6");
	public static Tile npb1c4 = new DoorRightTile(14,"7");
	public static Tile npb1c5 = new DoorRightTile(15,"8");
	public static Tile npb1c6 = new DoorRightTile(16,"9");
	public static Tile npb1c7 = new DoorRightTile(17,"10");
	
	/**
	 * 2nd row of NPB Floor1 Left side handle
	 */
	public static Tile npb1c8 = new DoorLeftTile(18,"11");
	public static Tile npb1c9 = new DoorLeftTile(19,"12");
	public static Tile npb1c10 = new DoorLeftTile(20,"13");
	public static Tile npb1c11 = new DoorLeftTile(21,"14");
	public static Tile npb1c12 = new DoorLeftTile(22,"15");
	public static Tile npb1c13 = new DoorLeftTile(23,"16");
	public static Tile npb1c14 = new DoorLeftTile(24,"17");
	public static Tile npb1c15 = new DoorLeftTile(25,"18");
	public static Tile npb1c16 = new DoorLeftTile(26,"19");
	public static Tile npb1c17 = new DoorLeftTile(27,"20");
	
	/**
	 * Third row of NPB Floor1
	 */
	public static Tile npb1c18 = new DoorRightTile(28,"21");
	public static Tile npb1c19 = new DoorRightTile(29,"22");
	public static Tile npb1c20 = new DoorRightTile(30,"23");
	public static Tile npb1c21 = new DoorRightTile(31,"24");
	public static Tile npb1c22 = new DoorRightTile(32,"25");
	public static Tile npb1c23 = new DoorRightTile(33,"26");
	public static Tile npb1c24 = new DoorRightTile(34,"27");
	public static Tile npb1c25 = new DoorRightTile(35,"28");
	
	/**
	 * Adds all classrooms to the arrayList
	 */
	public NPBFloor1() {
		classRoom.add(npb1c0);
		classRoom.add(npb1c1);
		classRoom.add(npb1c2);
		classRoom.add(npb1c3);
		classRoom.add(npb1c4);
		classRoom.add(npb1c5);
		classRoom.add(npb1c6);
		classRoom.add(npb1c7);
		
		classRoom.add(npb1c18);
		classRoom.add(npb1c19);
		classRoom.add(npb1c20);
		classRoom.add(npb1c21);
		classRoom.add(npb1c22);
		classRoom.add(npb1c23);
		classRoom.add(npb1c24);
		classRoom.add(npb1c25);
		
		classRoom.add(npb1c8);
		classRoom.add(npb1c9);
		classRoom.add(npb1c10);
		classRoom.add(npb1c11);
		classRoom.add(npb1c12);
		classRoom.add(npb1c13);
		classRoom.add(npb1c14);
		classRoom.add(npb1c15);
		classRoom.add(npb1c16);
		classRoom.add(npb1c17);
	}
	
}
