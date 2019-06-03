package entity;

import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

/**
 * Exit class inherits of Static.
 * @author Sacha
 *
 */
public class Exit extends Static {

	/**
	 * Variable.
	 */
	private Image exitPicture;
	
	/**
	 * Variables.
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
	 * Variables.
	 */
	protected static boolean isUnique = true;
	
	/**
	 * Constructor.
	 */
	public Exit() {
		
	}

	/**
	 * @return the exitPicture
	 */
	public Image getExitPicture() {
		return exitPicture;
	}

	/**
	 * @param exitPicture the exitPicture to set
	 */
	public  void setExitPicture(Image exitPicture) {
		this.exitPicture = exitPicture;
	}
	
	/**
	 * Method.
	 */
	public Image ExitPicture() {
        try {
            setExitPicture(ImageIO.read(new File("Exit.png")));
        }
        catch(IOException exc) {
            exc.printStackTrace();
        }
		return this.exitPicture;
	}
}