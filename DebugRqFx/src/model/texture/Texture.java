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

	///////////////////////////////////////////////////////////////////////////
	// FIELDS
	///////////////////////////////////////////////////////////////////////////
	
	/**
	 * Texture images
	 *
	 */
	public static Image grass, dirt, sidewalk, road, carpet, wall, floor, stairsWallTop, stairsCornerTopLeft,
			stairsCornerBottomLeft, stairsWallLeft, stairsVertical, elevatorHorizontal, elevatorVertical,
			stairsWallRight, stairsCornerBottomRight, stairsCornerTopRight, doorRight, doorLeft, doorRightFound,
			doorLeftFound, black, npbOuterDoorDown, npbOuterDoorLeft, npbOuterDoorRight, npbOuterDoorUp,
			npbExteriorDoorRight, npbExteriorDoorDown, doorTop, doorBottom, doorTopFound, doorBottomFound;

	///////////////////////////////////////////////////////////////////////////
	//   INIT
	///////////////////////////////////////////////////////////////////////////
	
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
		wall = TextureSheet.textures.crop(303, 1352, 145, 145);
		floor = TextureSheet.textures.crop(1352, 2251, 148, 148);
		black = TextureSheet.textures.crop(0, 2101, 145, 145);
		doorRightFound = TextureSheet.textures.crop(2101, 1548, 145, 145);
		doorLeftFound = TextureSheet.textures.crop(2297, 1550, 150, 150);
		stairsWallLeft = TextureSheet.textures.crop(2105, 612, 150, 150);
		stairsCornerTopLeft = TextureSheet.textures.crop(2297, 613, 150, 150);
		npbOuterDoorDown = TextureSheet.textures.crop(1798, 138, 148, 148);
		npbOuterDoorLeft = TextureSheet.textures.crop(1968, 139, 148, 148);
		npbOuterDoorRight = TextureSheet.textures.crop(1972, 316, 148, 148);
		elevatorHorizontal = TextureSheet.textures.crop(2167, 144, 148, 148);
		npbExteriorDoorRight = TextureSheet.textures.crop(1928, 474, 146, 146);
		npbOuterDoorUp = TextureSheet.textures.crop(1799, 315, 148, 148);
		stairsCornerBottomLeft = TextureSheet.textures.crop(2299, 785, 150, 150);
		stairsVertical = TextureSheet.textures.crop(2160, 438, 150, 150);
		stairsWallTop = TextureSheet.textures.crop(2330, 440, 150, 150);
		stairsWallRight = TextureSheet.textures.crop(2106, 783, 150, 150);
		elevatorVertical = TextureSheet.textures.crop(2351, 143, 149, 149);
		stairsCornerBottomRight = TextureSheet.textures.crop(2471, 785, 150, 150);
		stairsCornerTopRight = TextureSheet.textures.crop(2470, 614, 150, 150);
		npbExteriorDoorDown = TextureSheet.textures.crop(1927, 636, 146, 146);
		doorTop = TextureSheet.textures.crop(1721, 1342, 150, 150);
		doorBottom = TextureSheet.textures.crop(1911, 1341, 150, 150);
		doorTopFound = TextureSheet.textures.crop(1721, 1547, 150, 150);
		doorBottomFound = TextureSheet.textures.crop(1911, 1546, 150, 150);		

		// These are coordinates for open elevator door if we ever use one
		// elevatorVertical = TextureSheet.textures.crop(2622, 408, 148, 148);

	}

}
