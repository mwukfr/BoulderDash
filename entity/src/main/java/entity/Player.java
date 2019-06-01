package entity;

/**
 * Player class inherits of Mobile.
 * @author Sacha
 *
 */
public class Player extends Mobile {
	private int countDiamond;
	
	/**
	 * Constructor.
	 */
	public Player(Integer x, Integer y) {
		super(x, y);
		// TODO Auto-generated constructor stub
		alive = true;
	}

	private boolean alive;
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
	 * Variables.
	 */
	protected static boolean isUnique = true;
	
	
	/**
	 * Method for Diamond counter.
	 */
	public void CounterDiamond() {
		this.setCountDiamond(this.getCountDiamond() - 1);
	}
	
	//public boolean Alive(boolean alive) {
	//	return alive = true;
	//}
	
	/**
	 * Change the value of alive.
	 * @param alive
	 */
	public void Die(boolean alive) {
		alive = false;
	}

	/**
	 * @return the countDiamond
	 */
	public int getCountDiamond() {
		return countDiamond;
	}

	/**
	 * @param countDiamond the countDiamond to set
	 */
	public void setCountDiamond(int countDiamond) {
		this.countDiamond = countDiamond;
	}
}