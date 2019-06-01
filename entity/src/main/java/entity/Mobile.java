package entity;

/**
 * Mobile class inherits of Entity
 * 
 * @author Sacha
 * 
 */
public class Mobile extends Entity {
	/**
	 * Variable.
	 */
	protected Integer y;
	
	/**
	 * Variable.
	 */
	private Integer x;
	
	//private int coordinate[][] = { {getX()},{getY()} };
	
	/**
	 * Variables isMobile is true for all subclass.
	 */
	protected boolean isMobile = true;
	
	/**
	 * Constructor.
	 */
	public Mobile(Integer x, Integer y) {
		this.x = x;
		this.y = y;
	}

	/**
	 * @return the y
	 */
	public Integer getY() {
		return this.y;
	}

	/**
	 * @param y the y to set
	 */
	public void setY(Integer y) {
		this.y = y;
	}

	/**
	 * @return the x
	 */
	public Integer getX() {
		return this.x;
	}

	/**
	 * @param x the x to set
	 */
	public void setX(Integer x) {
		this.x = x;
	}
	
	//public int coordinate(Integer x, Integer y) {
	//	return x + y;
		
	//}
	
	//public int[][] getCoordinate() {
	//	return coordinate;
	//}
	
	//public void setCoordinate(int[][] coordinate) {
	//	this.coordinate = coordinate;
	//}
	
	
}
