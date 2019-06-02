package entity;

import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

/**
 * Wall class inherits of Static.
 * @author Sacha
 *
 */
public class Wall extends Static {
	
	
	private static Image wallPicture;

	/**
	 * Variables false by default.
	 */
	protected static boolean isBreakable = true;
	
	/**
	 * Variables false by default.
	 */
	protected static boolean isMobile;
	
	/**
	 * Variables false by default.
	 */
	protected static boolean isCollectable;
	
	/**
	 * Variable.
	 */
	protected static boolean isUnique;
	
	/**
	 * Constructor.
	 */
	public Wall() {
		
	}

	/**
	 * @return the wallPicture
	 */
	public static Image getWallPicture() {
		return wallPicture;
	}

	/**
	 * @param wallPicture the wallPicture to set
	 */
	public static void setWallPicture(Image wallPicture) {
		Wall.wallPicture = wallPicture;
	}
	
	/**
	 * Method.
	 */
	public void WallPicture() {
        try {
            setWallPicture(ImageIO.read(new File("Wall.png")));
        }
        catch(IOException exc) {
            exc.printStackTrace();
        }
	}
}
