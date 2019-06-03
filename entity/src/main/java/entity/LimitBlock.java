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
	private Image limitBlockPicture;

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
	 * Method to associate a picture to LimitBlock.
	 */
	public Image LimitBlockPicture() {
        try {
            setLimitBlockPicture(ImageIO.read(new File("LimitBlock.png")));
        }
        catch(IOException exc) {
            exc.printStackTrace();
        }
		return this.limitBlockPicture;
	}

	/**
	 * @return the limitBlockPicture
	 */
	public Image getLimitBlockPicture() {
		return limitBlockPicture;
	}

	/**
	 * @param limitBlockPicture the limitBlockPicture to set
	 */
	public void setLimitBlockPicture(Image limitBlockPicture) {
		this.limitBlockPicture = limitBlockPicture;
	}
}