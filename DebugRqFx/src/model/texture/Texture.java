package model.texture;

import javafx.scene.image.Image;

/**
 * 
 * @author Tyler Clarkson
 *
 *         This class defines static images for every texture used in the game
 *         and a static method to initialize them
 */
public class Texture {

	/**
	 * Texture images
	 */
	public static Image grass, dirt, sidewalk, road, carpet;

	/**
	 * Initialize the Textures based on the TextureSheet
	 */
	public static void init() {
		grass = TextureSheet.textures.crop(752, 602, 64, 64);
		dirt = TextureSheet.textures.crop(452, 901, 148, 148);
		sidewalk = TextureSheet.textures.crop(0, 192, 32, 32);
		road = TextureSheet.textures.crop(160, 192, 32, 32);
		carpet = TextureSheet.textures.crop(1, 902, 148, 148);
	}

}
