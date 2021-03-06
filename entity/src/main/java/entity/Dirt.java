package entity;

import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

/**
 * Dirt class inherits of Static.
 * @author Sacha
 *
 */
public class Dirt extends Static {

	private Image dirtPicture;
	
	/**
	 * Variable.
	 */
	protected static boolean isBreakable = true;
	
	/**
	 * Variables.
	 */
	protected static boolean isMobile;
	
	/**
	 * Variables.
	 */
	protected static boolean isCollectable;
	
	/**
	 * Variable.
	 */
	protected static boolean isUnique;
	
	/**
	 * Constructor.
	 */
	public Dirt() {
		
	}

	/**
	 * @return the dirtPicture
	 */
	public Image getDirtPicture() {
		return dirtPicture;
	}

	/**
	 * @param dirtPicture the dirtPicture to set
	 */
	public void setDirtPicture(Image dirtPicture) {
		this.dirtPicture = dirtPicture;
	}
	
	/**
	 * Method to associate a picture to Dirt.
	 */
	public Image DirtPicture() {
        try {
            setDirtPicture(ImageIO.read(new File("Dirt.png")));
        }
        catch(IOException exc) {
            exc.printStackTrace();
        }
		return this.dirtPicture;
	}
}
