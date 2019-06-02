package entity;

import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

/**
 * LimitBlock class inherits of Static.
 * @author Sacha
 *
 */
public class LimitBlock extends Static {
	
	/**
	 * Variable.
	 */
	private static Image limitBlockPicture;

	/**
	 * Variable.
	 */
	protected static boolean isBreakable;
	
	/**
	 * Variable.
	 */
	protected static boolean isMobile;
	
	/**
	 * Variable.
	 */
	protected static boolean isCollectable;
	
	/**
	 * Variable.
	 */
	protected static boolean isUnique;
	
	/**
	 * Constructor.
	 */
	public LimitBlock() {
		
	}

	/**
	 * @return the limitBlockPicture
	 */
	public static Image getLimitBlockPicture() {
		return limitBlockPicture;
	}

	/**
	 * @param limitBlockPicture the limitBlockPicture to set
	 */
	public static void setLimitBlockPicture(Image limitBlockPicture) {
		LimitBlock.limitBlockPicture = limitBlockPicture;
	}
	
	/**
	 * Method.
	 */
	public void BoulderPicture() {
        try {
            setLimitBlockPicture(ImageIO.read(new File("LimitBlock.png")));
        }
        catch(IOException exc) {
            exc.printStackTrace();
        }
	}
}