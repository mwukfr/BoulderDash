package entity;

/**
 * Wall class inherits of Static.
 * @author Sacha
 *
 */
public class Wall extends Static {

	/**
	 * Variable.
	 */
	private Wall wall;
	
	/**
	 * Getter of wall.
	 * @return
	 */
	public Wall getWall() {
		return wall;
	}
	
	/**
	 * Setter of wall.
	 * @param wall
	 */
	public void setWall(Wall wall) {
		this.wall = wall;
	}
	
	/**
	 * Constructor of Wall.
	 */
	public Wall() {
		super();
		this.setBreakable(true);
	}
	
}
