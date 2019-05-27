package entity;

/**
 * Dirt class inherits of Static.
 * @author Sacha
 *
 */
public class Dirt extends Static {

	/**
	 * Variable.
	 */
	private Dirt dirt;
	
	/**
	 * Getter of dirt.
	 * @return
	 */
	public Dirt getDirt() {
		return dirt;
	}
	
	/**
	 * Setter of dirt.
	 * @param dirt
	 */
	public void setDirt(Dirt dirt) {
		this.dirt = dirt;
	}
	
	/**
	 * Constructor of Dirt.
	 */
	public Dirt() {
		super();
		this.setBreakable(true);
	}
}
