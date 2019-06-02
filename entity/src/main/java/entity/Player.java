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
	private Image up;
	
	/**
	 * Variable.
	 */
	private Image down;
	
	/**
	 * Variable.
	 */
	private Image left;
	
	/**
	 * Variable.
	 */
	private Image right;
	
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
	public Image getLeft() {
		return left;
	}

	/**
	 * @param left the left to set
	 */
	public void setLeft(Image left) {
		this.left = left;
	}

	/**
	 * @return the right
	 */
	public Image getRight() {
		return right;
	}

	/**
	 * @param right the right to set
	 */
	public void setRight(Image right) {
		this.right = right;
	}

	/**
	 * @return the down
	 */
	public Image getDown() {
		return down;
	}

	/**
	 * @param down the down to set
	 */
	public void setDown(Image down) {
		this.down = down;
	}

	/**
	 * @return the up
	 */
	public Image getUp() {
		return up;
	}

	/**
	 * @param up the up to set
	 */
	public void setUp(Image up) {
		this.up = up;
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