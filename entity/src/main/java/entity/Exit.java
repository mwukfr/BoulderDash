package entity;

/**
 * Exit class inherits of Static.
 * @author Sacha
 *
 */
public class Exit extends Static {

	/**
	 * Variable.
	 */
	private Exit exit;
	
	/**
	 * Getter of exit.
	 * @return
	 */
	public Exit getExit() {
		return exit;
	}
	
	/**
	 * Setter of exit.
	 * @param exit
	 */
	public void setExit(Exit exit) {
		this.exit = exit;
	}
	
	/**
	 * Constructor of Exit.
	 */
	public Exit() {
		super();
		this.setBreakable(false);
	}
	
}