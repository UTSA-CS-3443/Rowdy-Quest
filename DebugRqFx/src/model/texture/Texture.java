package model.texture;

import javafx.scene.image.Image;

/**
 * 
 * @author Tyler Clarkson
 * @author Brandon Black
 *
 *         This class defines static images for every texture used in the game
 *         and a static method to initialize them
 */
public class Texture {

	/**
	 * Texture images
	 *
	 */
	public static Image grass, dirt, sidewalk, road, carpet, wall, floor, stairsWallTop, stairsCornerTopRight, elevatorHorizontal;
	/**
	 * Two different door images for doors that are facing down or up. handle of right side of doorRight
	 * and left side of doorLeft.
	 * doorRightFound and doorLeftFound will be images of the door that
	 * appears to be highlighted. If the user searches for the room number of
	 * that particular door, that door will change images to appear highlighted.
	 */
	public static Image doorRight, doorLeft, doorRightFound, doorLeftFound;

	/**
	 * black is just the parts of the map the user wont see. like behind doors, and just 
	 * void areas of the map
	 */
	public static Image black;
	
	public static Image npbOuterDoorDown, npbOuterDoorLeft, npbOuterDoorRight, npbOuterDoorUp;
	public static Image npbExteriorDoorRight;
	
	/**
	 * Trying out a classroom
	 */
	public static Image npbc1;
	/**
	 * Initialize the Textures based on the TextureSheet
	 */
	public static void init() {
		grass = TextureSheet.textures.crop(752, 602, 64, 64);
		dirt = TextureSheet.textures.crop(452, 901, 148, 148);
		sidewalk = TextureSheet.textures.crop(0, 192, 32, 32);
		road = TextureSheet.textures.crop(160, 192, 32, 32);
		carpet = TextureSheet.textures.crop(1, 902, 148, 148);
		doorRight = TextureSheet.textures.crop(0, 1800, 150, 150);
		doorLeft = TextureSheet.textures.crop(0, 1951, 150, 150);
		wall = TextureSheet.textures.crop(303,1352, 145, 145);
		floor = TextureSheet.textures.crop(1352, 2251, 148, 148);
		black = TextureSheet.textures.crop(0,2101, 145, 145);
		doorRightFound = TextureSheet.textures.crop(1, 2552, 145, 145);
		doorLeftFound = TextureSheet.textures.crop(1, 2403, 150, 150);
		stairsWallTop = TextureSheet.textures.crop(2105, 612, 150, 150);
		stairsCornerTopRight = TextureSheet.textures.crop(2297, 613, 150, 150);
		npbOuterDoorDown = TextureSheet.textures.crop(1798, 138, 148, 148);
		npbOuterDoorLeft = TextureSheet.textures.crop(1968, 139, 148, 148);
		npbOuterDoorRight = TextureSheet.textures.crop(1972, 316, 148, 148);
		elevatorHorizontal = TextureSheet.textures.crop(2167, 144, 148, 148);
		npbExteriorDoorRight = TextureSheet.textures.crop(1928, 474, 146, 146);
		npbOuterDoorUp = TextureSheet.textures.crop(1799, 315, 148, 148);


		
	}

}
