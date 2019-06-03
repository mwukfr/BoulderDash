package entity;

import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

/**
 * Diamond class inherits of Mobile.
 * 
 * @author Sacha
 *
 */
public class Diamond extends Mobile {
	
	/**
	 * Variable.
	 */
	private Image diamondPicture;
	
	/**
	 * Constructor.
	 * @param x
	 * @param y
	 */
	public Diamond(Integer x, Integer y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * Variables false by default.
	 */
	protected static boolean isBreakable;
	
	/**
	 * Variables false by default.
	 */
	protected static boolean isMobile = true;
	
	/**
	 * Variables false by default.
	 */
	protected static boolean isCollectable = true;
	
	/**
	 * Variables false by default.
	 */
	protected static boolean isUnique;
	
	/**
	 * @return the diamondPicture
	 */
	public Image getDiamondPicture() {
		return diamondPicture;
	}

	/**
	 * @param diamondPicture the diamondPicture to set
	 */
	public void setDiamondPicture(Image diamondPicture) {
		this.diamondPicture = diamondPicture;
	}
	
	/**
	 * Method.
	 */
	public Image DiamondPicture() {
        try {
            setDiamondPicture(ImageIO.read(new File("Diamond.png")));
        }
        catch(IOException exc) {
            exc.printStackTrace();
        }
		return this.diamondPicture;
	}



}
