package entity;

public class Entity {

	/**
	 * Variables false by default.
	 */
	private boolean isBreakable = false;
	
	/**
	 * Variables false by default.
	 */
	private boolean isMobile;
	
	/**
	 * Variables false by default.
	 */
	private boolean isCollectable = false;
	
	/**
	 * Variables false by default.

	 */
	private boolean isUnique = false;
	
	/**
	 * Boolean method IsBreakable.
	 */
	public boolean IsBreakable(boolean isBreakable) {
		return isBreakable;
	}
	
	/**
	 * Boolean method IsMobile.
	 */
	public boolean IsMobile(boolean isMobile) {
		return isMobile;
	}
	
	/**
	 * Boolean method IsCollectable.
	 */
	public boolean IsCollectable(boolean isCollectable) {
		return isCollectable;
	}
	
	/**
	 * Boolean method IsUnique.
	 */
	public boolean IsUnique(boolean isUnique) {
		return isUnique;
	}
	
	/**
	 * Constructor.
	 */
	public Entity() {
		
	}


}
