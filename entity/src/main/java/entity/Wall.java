package entity;

/**
 * Wall class inherits of Static.
 * @author Sacha
 *
 */
public class Wall extends Static {

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
}
