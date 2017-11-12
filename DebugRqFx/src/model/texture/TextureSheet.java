package model.texture;

import javafx.scene.image.Image;
import javafx.scene.image.PixelReader;
import javafx.scene.image.WritableImage;

/**
 * 
 * @author Tyler Clarkson
 *
 *         This class defines a static TextureSheet that can be used to create
 *         texture images that will be assigned to Texture objects and used with
 *         Tile objects
 * 
 */
public class TextureSheet {

	/**
	 * Static TextureSheet to be used with Textures class
	 */
	public static TextureSheet textures = new TextureSheet(new Image("/textures/RQtiles.png"));

	/**
	 * Image to be used for TextureSheet
	 */
	private Image img;

	/**
	 * Constructor
	 * 
	 * @param img
	 */
	public TextureSheet(Image img) {
		this.img = img;
	}

	/**
	 * Used to crop a specific Texture from the TextureSheet
	 * 
	 * @param x
	 *            x position where image starts
	 * @param y
	 *            y position where image starts
	 * @param w
	 *            width of image
	 * @param h
	 *            height of image
	 * @return texture the sub image that has been cropped out of the larger image
	 */
	public Image crop(int x, int y, int w, int h) {
		PixelReader reader = this.img.getPixelReader();
		WritableImage texture = new WritableImage(reader, x, y, w, h);
		return texture;
	}
}
