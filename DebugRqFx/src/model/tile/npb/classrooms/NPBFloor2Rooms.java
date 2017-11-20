package model.tile.npb.classrooms;

import java.util.ArrayList;

import controller.events.LocalEvents;
import model.tile.Tile;

/***
 * 
 * @author Marlene Garza
 *
 */
public class NPBFloor2Rooms {
	public static ArrayList<Tile> npb2List = new ArrayList<>();

	
	
	/** 
	 * Going to create the room numbers on the left side of the 2nd floor of the 
	 * NPB building.
	 *
	 */
	
	
	private Tile npb2c0 = new DoorTopTile(62,"NPB 2.208");
	private Tile npb2c1 = new DoorTopTile(63,"NPB 2.212");
	private Tile npb2c2 = new DoorTopTile(64,"NPB 2.220");
	private Tile npb2c3 = new DoorTopTile(65,"NPB 2.228");
	private Tile npb2c4 = new DoorTopTile(66,"NPB 2.230");
	private Tile npb2c5 = new DoorTopTile(67,"NPB 2.234");
	private Tile npb2c6 = new DoorTopTile(68,"NPB 2.238");
	private Tile npb2c7 = new DoorTopTile(69,"NPB 2.242");
	private Tile npb2c8 = new DoorTopTile(70,"NPB 2.246");
	private Tile npb2c9 = new DoorTopTile(71,"NPB 2.250");
	private Tile npb2c10 = new DoorTopTile(72,"NPB 2.254");
	private Tile npb2c11 = new DoorTopTile(73,"NPB 2.258");
	

	/***
	 *  Going to create the second column on the right side
	 *  
	 */
	
	
	private Tile npb2c12 = new DoorBottomTile(74,"NPB 2.232");
	private Tile npb2c13 = new DoorBottomTile(75,"NPB 2.236");
	private Tile npb2c14 = new DoorBottomTile(76,"NPB 2.240");
	private Tile npb2c15 = new DoorBottomTile(77,"NPB 2.244");
	private Tile npb2c16 = new DoorBottomTile(78,"NPB 2.248");
	private Tile npb2c17 = new DoorBottomTile(79,"NPB 2.252");
	private Tile npb2c18 = new DoorBottomTile(80,"NPB 2.256");
	

/**
 *  Creating the room 
 *  Numbers of the 3rd column 
 *  
 */
    private Tile npb2c19 = new DoorTopTile(81,"NPB 2.S1");
    private Tile npb2c20 = new DoorTopTile(82,"NPB 2.106");
    private Tile npb2c21 = new DoorTopTile(83,"NPB 2.104");
    private Tile npb2c22 = new DoorTopTile(84,"NPB 2.102");
    private Tile npb2c23 = new DoorTopTile(85,"NPB 2.124");
    private Tile npb2c24 = new DoorTopTile(86,"NPB 2.134");
    private Tile npb2c25 = new DoorTopTile(87,"NPB 2.134");
    private Tile npb2c26 = new DoorTopTile(88,"NPB 2.140");
    private Tile npb2c27 = new DoorTopTile(89,"NPB 2.S2");
    
    
    /**
     * 
     * creating the rooms for the 4th far right colum
     * 
     */
    private Tile npb2c28 = new DoorBottomTile(90,"NPB 2.110");
    private Tile npb2c29 = new DoorBottomTile(91,"NPB 2.112");
    private Tile npb2c30 = new DoorBottomTile(92,"NPB 2.116");
    private Tile npb2c31 = new DoorBottomTile(93,"NPB 2.118");
    private Tile npb2c32 = new DoorBottomTile(94,"NPB 2.118");
    private Tile npb2c33 = new DoorBottomTile(95,"NPB 2.132");
    private Tile npb2c34 = new DoorBottomTile(96,"NPB 2.132");
    private Tile npb2c35 = new DoorBottomTile(97,"NPB 2.138");
    private Tile npb2c36 = new DoorBottomTile(98,"NPB 2.146");
    


    /**
     *  Creating the room numbers for the bottom row
    */
    
	private Tile npb2c37 = new DoorLeftTile(99,"NPB 2.260");
	private Tile npb2c38 = new DoorLeftTile(100,"NPB 2.262");
	private Tile npb2c39 = new DoorLeftTile(101,"NPB 2.152");
	private Tile npb2c40 = new DoorLeftTile(102,"NPB 2.152");
	
	/** Room numbers for the top row
	 *
	 */
	
	private Tile npb2c41 = new DoorRightTile(103,"NPB 2.206");
	private Tile npb2c42 = new DoorRightTile(104,"NPB 2.204");
	private Tile npb2c43 = new DoorRightTile(105,"NPB 2.202");
	private Tile npb2c44 = new DoorRightTile(106,"NPB 2.208");

	
	
	public NPBFloor2Rooms() {
		
		npb2List.add(npb2c0);
		npb2List.add(npb2c1);
		npb2List.add(npb2c2);
		npb2List.add(npb2c3);
		npb2List.add(npb2c4);
		npb2List.add(npb2c5);
		npb2List.add(npb2c6);
		npb2List.add(npb2c7);
		npb2List.add(npb2c8);
		npb2List.add(npb2c9);
		npb2List.add(npb2c10);
		npb2List.add(npb2c11);
		
		
		npb2List.add(npb2c12);
		npb2List.add(npb2c13);
		npb2List.add(npb2c14);
		npb2List.add(npb2c15);
		npb2List.add(npb2c16);
		npb2List.add(npb2c17);
	    npb2List.add(npb2c18);

	    
	    npb2List.add(npb2c19);
		npb2List.add(npb2c20);
		npb2List.add(npb2c21);
		npb2List.add(npb2c22);
		npb2List.add(npb2c23);
		npb2List.add(npb2c24);
		npb2List.add(npb2c25);
		npb2List.add(npb2c26);
		npb2List.add(npb2c27);
		
		
		npb2List.add(npb2c28);
		npb2List.add(npb2c29);
		npb2List.add(npb2c30);
		npb2List.add(npb2c31);
		npb2List.add(npb2c32);
		npb2List.add(npb2c33);
		npb2List.add(npb2c34);
		npb2List.add(npb2c35);
		npb2List.add(npb2c36);

	
		npb2List.add(npb2c37);
		npb2List.add(npb2c38);
		npb2List.add(npb2c39);
		npb2List.add(npb2c40);
		
		npb2List.add(npb2c41);
		npb2List.add(npb2c42);
		npb2List.add(npb2c43);
		npb2List.add(npb2c44);
		
		LocalEvents.NPBList.add(NPBFloor2Rooms.npb2List);
	
	}


}


