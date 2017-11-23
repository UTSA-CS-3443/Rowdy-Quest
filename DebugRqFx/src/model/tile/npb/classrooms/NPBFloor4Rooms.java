package model.tile.npb.classrooms;

import java.util.ArrayList;

import model.tile.Tile;

/**
 * 
 * @author Marlene Garza
 *
 */

public class NPBFloor4Rooms {
	public static ArrayList<Tile> npb4List = new ArrayList<>();

	/**
	 * 1st column starting from bottom on the right side of the hallway
	 */	
	
	public static Tile npb4c0 = new DoorRightTile(185,"NPB 4.S1");
	public static Tile npb4c1 = new DoorTopTile(186,"NPB 4.120-3");
	public static Tile npb4c2 = new DoorTopTile(187,"NPB 4.108");
	public static Tile npb4c3 = new DoorTopTile(188,"NPB 4.106");
	public static Tile npb4c4 = new DoorTopTile(189,"NPB 4.102");
	public static Tile npb4c5 = new DoorTopTile(190,"NPB 4.102A17-1");
	public static Tile npb4c6 = new DoorTopTile(191,"NPB 4.146");
	public static Tile npb4c7 = new DoorTopTile(192,"NPB 4.102-1");
	public static Tile npb4c8 = new DoorTopTile(193,"NPB 4.E3");
	
	/**
	 *  right column starting on the bottom 
	 */
	
	public static Tile npb4c9 = new DoorBottomTile(194,"NPB 4.120");
	public static Tile npb4c10 = new DoorBottomTile(195,"NPB 4.120V-1");
	public static Tile npb4c11 = new DoorBottomTile(196,"NPB 4.120");
	
	
	/**
	 * Far row starting at left towards the top 
	 */
	
	public static Tile npb4c12 = new DoorRightTile(197,"NPB 4.112");
	public static Tile npb4c13 = new DoorRightTile(198,"NPB 4.110");
	


/**
 * Bottom row starting at left
 */
	
	public static Tile npb4c14 = new DoorLeftTile(199,"NPB 4.152");
	public static Tile npb4c15 = new DoorLeftTile(200,"NPB 4.150");
	public static Tile npb4c16 = new DoorLeftTile(201,"NPB 4.4.148");

	/**
	 * Top row starting at left
	 */
	
	public static Tile npb4c17 = new DoorRightTile(202,"NPB 4.154");
	public static Tile npb4c18 = new DoorRightTile(203,"NPB 4.156");
	
	public static Tile npb4c19 = new DoorRightTile(204, "NPB 4.170");
	
	public NPBFloor4Rooms(){

	npb4List.add(npb4c0);
	npb4List.add(npb4c1);
	npb4List.add(npb4c4);
	npb4List.add(npb4c3);
	npb4List.add(npb4c4);
	npb4List.add(npb4c5);
	npb4List.add(npb4c6);
	npb4List.add(npb4c7);
	npb4List.add(npb4c8);

	
	npb4List.add(npb4c9);
	npb4List.add(npb4c10);
	npb4List.add(npb4c11);
	
	npb4List.add(npb4c12);
	npb4List.add(npb4c13);
	
	npb4List.add(npb4c14);
	npb4List.add(npb4c15);
	npb4List.add(npb4c16);
	
	npb4List.add(npb4c17);
	npb4List.add(npb4c18);
	


	
	}
}


