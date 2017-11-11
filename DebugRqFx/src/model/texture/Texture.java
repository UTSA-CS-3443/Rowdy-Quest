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
	public static Image grass, dirt, sidewalk, road, carpet, wall, floor;
	/**
	 * Two different door images for doors that are facing down or up. handle of right side of doorRight
	 * and left side of doorLeft.
	 */
	public static Image doorRight, doorLeft;

	/**
	 * black is just the parts of the map the user wont see. like behind doors, and just 
	 * void areas of the map
	 */
	public static Image black;
	
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
		
		
	}

}
