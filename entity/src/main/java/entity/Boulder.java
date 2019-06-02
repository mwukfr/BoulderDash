package entity;


import java.awt.Image;
import java.io.*;
import javax.imageio.ImageIO;

/**
 * Boulder class inherits of Mobile.
 * 
 * @author Sacha
 *
 */
public class Boulder extends Mobile {

	/**
	 * Variable.
	 */
	private static Image boulderPicture;
	/**
	 * Constructor.
	 * @param x
	 * @param y
	 */
	public Boulder(Integer x, Integer y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}

	/**
	 * Variable.
	 */
	protected static boolean isBreakable;
	
	/**
	 * Variable.
	 */
	protected static boolean isMobile = true;
	
	/**
	 * Variable.
	 */
	protected static boolean isCollectable;
	
	/**
	 * Variable.
	 */
	protected static boolean isUnique;
	
	/**
	 * @return the boulderPicture
	 */
	public static Image getBoulderPicture() {
		return boulderPicture;
	}

	/**
	 * @param boulderPicture the boulderPicture to set
	 */
	public static void setBoulderPicture(Image boulderPicture) {
		Boulder.boulderPicture = boulderPicture;
	}
	
	/**
	 * Method.
	 */
	public void BoulderPicture() {
        try {
            setBoulderPicture(ImageIO.read(new File("Boulder.png")));
        }
        catch(IOException exc) {
            exc.printStackTrace();
        }
	}
	
}
