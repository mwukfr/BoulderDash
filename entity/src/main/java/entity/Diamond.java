package entity;

/**
 * Diamond class inherits of Mobile.
 * 
 * @author Sacha
 *
 */
public class Diamond extends Mobile {
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
	 * Constructor.
	 */

}
