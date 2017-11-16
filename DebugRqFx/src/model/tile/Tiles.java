package model.tile;

import model.tile.local.Black;
import model.tile.local.Dirt;
import model.tile.local.Grass;
import model.tile.local.Road;
import model.tile.local.Sidewalk;
import model.tile.npb.Carpet;
import model.tile.npb.Floor;
import model.tile.npb.Wall;
import model.tile.npb.classrooms.DoorLeftTile;
import model.tile.npb.classrooms.DoorRightTile;
import model.tile.npb.classrooms.NPBFloor1Rooms;
import model.tile.npb.classrooms.NPBFloor2Rooms;
import model.tile.npb.classrooms.NPBFloor3Rooms;
import model.tile.npb.portals.elevators.ElevatorHorizontal;
import model.tile.npb.portals.elevators.NPBFloor1Elevator;
import model.tile.npb.portals.elevators.NPBFloor2Elevator;
import model.tile.npb.portals.elevators.NPBFloor3Elevator;
import model.tile.npb.portals.elevators.NPBFloor4Elevator;
import model.tile.npb.portals.exteriorDoors.NpbExteriorDoorDown;
import model.tile.npb.portals.exteriorDoors.NpbExteriorDoorRight;
import model.tile.npb.portals.exteriorDoors.NpbOuterDoorDown;
import model.tile.npb.portals.exteriorDoors.NpbOuterDoorLeft;
import model.tile.npb.portals.exteriorDoors.NpbOuterDoorRight;
import model.tile.npb.portals.exteriorDoors.NpbOuterDoorUp;
import model.tile.npb.portals.stairs.StairsCornerBottomLeft;
import model.tile.npb.portals.stairs.StairsCornerBottomRight;
import model.tile.npb.portals.stairs.StairsCornerTopLeft;
import model.tile.npb.portals.stairs.StairsCornerTopRight;
import model.tile.npb.portals.stairs.StairsVertical;
import model.tile.npb.portals.stairs.StairsWallLeft;
import model.tile.npb.portals.stairs.StairsWallRight;
import model.tile.npb.portals.stairs.StairsWallTop;

/**
 * 
 * @author Tyler Clarkson
 * 
 *         This class constructs all tiles, assigning them an index
 *
 */
public class Tiles {

	///////////////////////////////////////////////////////////////////////////
	// INIT
	///////////////////////////////////////////////////////////////////////////

	public static void init() {

		// 0 grass tile
		Tile grass = new Grass(0);

		// 1 dirt tile
		Tile dirt = new Dirt(1);

		// 2 road tile
		Tile road = new Road(2);

		// 3 sidewalk tile
		Tile sidewalk = new Sidewalk(3);

		// 4 carpet tile
		Tile carpet = new Carpet(4);

		// 5 right facing classroom door
		Tile doorRight = new DoorRightTile(5, "1");

		// 6 left facing classroom door
		Tile doorLeft = new DoorLeftTile(6, "2");

		// 7 wall tile
		Tile wall = new Wall(7);

		//8 tile floor tile
		Tile floor = new Floor(8);

		// 9 black tile for empty space
		Tile black = new Black(9);

		/*
		 * 10 - 35
		 * This will build the arrayList of classrooms for Floor 1 of NPB Static to have
		 * access everywhere. We will be able to access the classroom numbers in a for
		 * loop like f1.get(i).getRoomNumber().
		 */
		NPBFloor1Rooms f1 = new NPBFloor1Rooms();

		/*
		 * TODO put npb stairs in separate class like room numbers
		 */
		
		// 36 stairs portal from npb floor 1 to 2
		Tile npbFloor1toFloor2StairsWall = new StairsWallLeft(36);

		Tile npbFloor1StairsCorner = new StairsCornerTopLeft(37);

		Tile npbOuterDoorDown = new NpbOuterDoorDown(38);

		Tile npbOuterDoorleft = new NpbOuterDoorLeft(39);

		Tile npbOuterDoorRightMiddle = new NpbOuterDoorRight(40);

		Tile elevatorHorizontal = new ElevatorHorizontal(41);

		Tile npbExteriorDoorRightMiddle = new NpbExteriorDoorRight(42);

		Tile npbOuterDoorUp = new NpbOuterDoorUp(43);

		Tile npbFloor2toFloor1StairsWall = new StairsWallLeft(44);

		Tile npbFloor2toFloor1StairsCorner = new StairsCornerBottomLeft(45);

		Tile npbOuterDoorRightBottom = new NpbOuterDoorRight(46);

		Tile npbExteriorDoorRightBottom = new NpbExteriorDoorRight(47);

		Tile npbFloor1toFloor2Stairs = new StairsVertical(48);

		Tile npbFloor2toFloor1Stairs = new StairsVertical(49);

		Tile stairsWallTop = new StairsWallTop(50);

		Tile npbFloor1toFloor2Elevator = new NPBFloor1Elevator(51);

		Tile npbFloor2Elevator = new NPBFloor2Elevator(52);

		Tile npbFloor3Elevator = new NPBFloor3Elevator(53);

		Tile npbFloor4Elevator = new NPBFloor4Elevator(54);

		Tile stairsWallRight = new StairsWallRight(55);

		Tile npbFloor2toFloor1StairsRightCorner = new StairsCornerBottomRight(56);

		Tile npbFloor1toFloor2StairsRightCorner = new StairsCornerTopRight(57);

		Tile npbExteriorDoorDown = new NpbExteriorDoorDown(58);
		
		Tile stairsWallLeft = new StairsWallLeft(59);
		
		Tile npbFloor2toFloor3StairsLeftCorner = new StairsCornerTopLeft(60);
		
		Tile npbFloor3toFloor2StairsRightCorner = new StairsCornerBottomLeft(61);
		
		/*
		 * 62 - 105
		 * This will build the arrayList of classrooms for Floor 1 of NPB Static to have
		 * access everywhere. We will be able to access the classroom numbers in a for
		 * loop like f1.get(i).getRoomNumber().
		 */
		NPBFloor2Rooms f2 = new NPBFloor2Rooms();
		/**
		 * This uses IDs from 107 - 182
		 */
		NPBFloor3Rooms f3 = new NPBFloor3Rooms();
	}
}
