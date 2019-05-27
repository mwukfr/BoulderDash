package entity;
/**
 * Static class inherits of Entity.
 * @author Sacha
 *
 */
public class Static extends Entity {

	/** 
	 * Variables.
	 */
	private boolean breakable;
	
	/**
	 * Getter of breakable.
	 * @return
	 */
	public boolean getBreakable() {
		return breakable;
	}
	
	/**
	 * Setter of breakable.
	 * @param breakable
	 */
	public void setBreakable(boolean breakable) {
		this.breakable = breakable;
	}
	
	/**
	 * Constructor of Static class.
	 */
	public Static() {
		
	}
}
