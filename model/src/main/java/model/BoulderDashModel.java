package model;

//import java.sql.SQLException;
import java.util.Observable;

import entity.Player;
//import contract.IModel;

/**
 * The BoulderDashModel Class.
 *
 * @author Antoine
 */
public final class BoulderDashModel extends Observable {
	
	Player player;


	/**
	 * Constructor of BoulderDashModel.
	 */
	public BoulderDashModel() {
	}

	/**
     * True or False - Tells us if a player gets killed.
     */
	
	public boolean Hit() {
		if (Boulder [X.Y] = Player[X.Y]) 
		{
		return true;
		}
		
	}



	/**
     * Set the mobile once it's moved.
     */
	//Maybe not here!
	public void setMobilesHaveMoved() {

	}
	/**
	 * Counts the amount of diamonds collected - opens the exit.
	 */
	//Maybe not here!
	/*private int DiamondCounter = 8;
	public void DiamondCounter() {
		if (Diamond[X.Y] = Player[X.Y]) {
			DiamondCounter --;
		}
		if (DiamondCounter == 0) {
			System.out.println("La sortie est ouverte");
			
		}
	}*/
	
	/**
     * Gets the observable.
     *
     * @return the observable
     */
	//already here, are we using it?
	public Observable getObservable() {
		return this;
	}//permet d'avoir les sprites vieux, après je dois t'avouer, que genre déjà on va essayer d'avoir un truc fonctionnel
	
	public void move() {
	}
	
	/**
	 * Move up.
	 */
	public void moveUP() {
		player[X.Y+1];
	}
	/**
	 * Move down.
	 */
	public void moveDOWN() {
		player[X.Y-1];
	}
	
	/**
	 * Move left.
	 */
	public void moveLEFT() {
		player[X-1.Y];
	}
	
	/**
	 * Move right.
	 */
	public void moveRIGHT() {
		player[X+1.Y];
	}
	
}
