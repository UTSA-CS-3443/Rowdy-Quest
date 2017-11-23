package model.tile.npb.classrooms;

import java.util.ArrayList;

import controller.events.LocalEvents;
import model.tile.Tile;

/**
 * @author Marlene Garza
 * 
 *
 */

public class NPBFloor5Rooms {
	
	public static ArrayList<Tile> npb5List = new ArrayList<>();
	/**
	 * Far Left column of doors starting from bottom 
	 */
	
	public static Tile npb5c0 = new DoorTopTile(205,"NPB 5.S1");
	public static Tile npb5c1 = new DoorTopTile(206,"NPB 5.110");
	public static Tile npb5c2 = new DoorTopTile(207,"NPB 5.108");
	public static Tile npb5c3 = new DoorTopTile(208,"NPB 5.106");
	public static Tile npb5c4 = new DoorTopTile(209,"NPB 5.102");
	public static Tile npb5c5 = new DoorTopTile(210,"NPB 5.126-1");
	public static Tile npb5c6 = new DoorTopTile(211,"NPB 5.140A");
	public static Tile npb5c7 = new DoorTopTile(212,"NPB 5.140");
	public static Tile npb5c8 = new DoorTopTile(213,"NPB 5.146");
	public static Tile npb5c9 = new DoorLeftTile(214,"NPB 5.140-1");
	public static Tile npb5c10 = new DoorRightTile(215,"NPB 5.180-A");
	public static Tile npb5c11 = new DoorTopTile(216,"NPB 5.S2");
	
	
	/**
	 * 2nd column starting from bottom 
	 */
	public static Tile npb5c12 = new DoorBottomTile(217,"NPB 5.102-2");
	public static Tile npb5c13 = new DoorBottomTile(218,"NPB 5.122");
	public static Tile npb5c14 = new DoorBottomTile(219,"NPB 5.130");
	
	
	/**
	 * Top row starting at left
	 */
	public static Tile npb5c15 = new DoorRightTile(220,"NPB 5.180");
	
	/**
	 * First row starting at bottom starting at left
	 */
	
	public static Tile npb5c16 = new DoorLeftTile(221,"NPB 5.102-1");
	
	
	/**
	 * Top row towards the top starting at left
	 */
	public static Tile npb5c17 = new DoorRightTile(222,"NPB 5.156");
	public static Tile npb5c18 = new DoorRightTile(223,"NPB 5.152");
	
	/**
	 * Bottom row towards the top starting at left
	 */
	public static Tile npb5c19 = new DoorLeftTile(224,"NPB 5.154");
	public static Tile npb5c20 = new DoorLeftTile(225,"NPB 5.150");
	public static Tile npb5c21 = new DoorLeftTile(226,"NPB 5.148");

	
	
	public NPBFloor5Rooms(){
		npb5List.add(npb5c0);
		npb5List.add(npb5c1);
		npb5List.add(npb5c2);
		npb5List.add(npb5c3);
		npb5List.add(npb5c4);
		npb5List.add(npb5c5);
		npb5List.add(npb5c6);
		npb5List.add(npb5c7);
		npb5List.add(npb5c8);
		npb5List.add(npb5c9);
		npb5List.add(npb5c10);
		npb5List.add(npb5c11);
		npb5List.add(npb5c12);
		npb5List.add(npb5c13);
		npb5List.add(npb5c14);
		npb5List.add(npb5c15);
		npb5List.add(npb5c16);
		npb5List.add(npb5c17);
		npb5List.add(npb5c18);
		npb5List.add(npb5c19);
		npb5List.add(npb5c20);
		npb5List.add(npb5c21);



		LocalEvents.NPBList.add(NPBFloor5Rooms.npb5List);

		}


	
	
}
