package entity;

import java.awt.Image;
import java.io.*;
import javax.imageio.ImageIO;

/**
 * Player class inherits of Mobile.
 * @author Sacha
 *
 */
public class Player extends Mobile {
	/**
	 * Variable.
	 */
	private int countDiamond;
	
	/**
	 * Variable.
	 */
	private static Image up;
	
	/**
	 * Variable.
	 */
	private static Image down;
	
	/**
	 * Variable.
	 */
	private static Image left;
	
	/**
	 * Variable.
	 */
	private static Image right;
	
	/**
	 * Variables.
	 */
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
	 * Constructor.
	 */
	public Player(Integer x, Integer y) {
		super(x, y);
		// TODO Auto-generated constructor stub
		this.setAlive(true);
	}
	
	/**
	 * Method for Diamond counter.
	 */
	public void CounterDiamond() {
		this.setCountDiamond(this.getCountDiamond() - 1);
	}
	
	/**
	 * Change the value of alive.
	 * @param alive
	 */
	public void Die(boolean alive) {
		this.setAlive(false);
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

	/**
	 * @return the alive
	 */
	public boolean isAlive() {
		return alive;
	}

	/**
	 * @param alive the alive to set
	 */
	public void setAlive(boolean alive) {
		this.alive = alive;
	}

	/**
	 * @return the left
	 */
	public static Image getLeft() {
		return left;
	}

	/**
	 * @param left the left to set
	 */
	public static void setLeft(Image left) {
		Player.left = left;
	}

	/**
	 * @return the right
	 */
	public static Image getRight() {
		return right;
	}

	/**
	 * @param right the right to set
	 */
	public static void setRight(Image right) {
		Player.right = right;
	}

	/**
	 * @return the down
	 */
	public static Image getDown() {
		return down;
	}

	/**
	 * @param down the down to set
	 */
	public static void setDown(Image down) {
		Player.down = down;
	}

	/**
	 * @return the up
	 */
	public static Image getUp() {
		return up;
	}

	/**
	 * @param up the up to set
	 */
	public static void setUp(Image up) {
		Player.up = up;
	}
	
	
	/**
	 * Method.
	 */
	public void Left() {
		try {
			setLeft(ImageIO.read(new File("Left.png")));
		}
		catch(IOException exc) {
			exc.printStackTrace();
		}
	}

	/**
	 * Method.
	 */
	public void Right() {
		try {
			setRight(ImageIO.read(new File("right.png")));
		}
		catch(IOException exc) {
			exc.printStackTrace();
		}
	}
	
	
	/**
	 * Method.
	 */
	public void Up() {
        try {
            setUp(ImageIO.read(new File("Up.png")));
        }
        catch(IOException exc) {
            exc.printStackTrace();
        }
	}
	
	/**
	 * Method.
	 */
	public void Down() {
        try {
            setDown(ImageIO.read(new File("Down.png")));
        }
        catch(IOException exc) {
            exc.printStackTrace();
        }
	}

}