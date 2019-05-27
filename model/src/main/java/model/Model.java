package model;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Observable;
import contract.IModel;

/**
 * The Class Model.
 *
 * @author Antoine
 */
public final class Model extends Observable implements IModel {

	/**
     * Gets the observable.
     *
     * @return the observable
     */
	public Observable getObservable() {
		return this;
	}

	/**
	 * Either open or not.
	 */
	//Maybe a switch case
	public boolean open() {
		return false;
	}

	/**
	 * Get the connection to the database.
	 */
	public Connection getConnection() {
		return null;
	}

	/**
	 * Get the database properties.
	 */
	public void DBProperties() {
		
	}

	/**
	 * Retrieve URL.
	 * @return
	 */
	public String getURL() {
		return null;
	}
	
	/**
	 * Define URL.
	 * @param URL
	 * @return
	 */
	public String setURL(String URL) {
		return null;
	}
	
	/**
	 * Retrieve Login.
	 * @return
	 */
	public String getLogin() {
		return null;
	}
	
	/**
	 * Define Login.
	 * @param Login
	 * @return
	 */
	public String setLogin(String Login) {
		return null;
	}
	
	/**
	 * Retrieve Password.
	 * @return
	 */
	public String getPassword() {
		return null;
	}
	
	/**
	 * Define Password.
	 * @param Password
	 * @return
	 */
	//Set as void in class diagram (contract) can't be a void here - what to do ?
	public String setPassword(String Password) {
		return null;
	}
	
	/**
	 * Get attribute.
	 */
	public void getAttribute() {
	}
	
	/**
	 * Set attribute.
	 */
	//wasn't a String - what goes in it ? - should be in View.
	public void setAttribute(String attribute) {
	}
	
	//dunno wtf this is yet
	public void BoulderDashModel() {
	}
	
	/**
	 * Get player, enemy...anything mobile.
	 */
	public void getMobile() {
	}
	
	/**
	 * Add player, enemy...
	 */
	public void addMobile() {
	}
	
	/**
	 * Remove player, enemy...
	 */
	public void removeMobile() {
	}
	
	/**
	 * Inform our program that mobile has moved.
	 */
	public void setMobileHasMoved() {
	}
	
	//dunno wtf this is yet
	public void Mobile() {
	}
	
	/**
	 * Coordinate X.
	 * @return
	 */
	public double getX() {
		return 0;
	}	
	
	/**
	 * Set coordinate X.
	 * @return
	 */
	//was a void in class diagram - this right ?
	public double setX() {
		return 0;
	}
	
	/**
	 * Coordinate Y.
	 * @return
	 */
	public double getY() {
		return 0;
	}
	
	/**
	 * Set coordinate Y.
	 * @return
	 */
	//was a void in class diagram - this right ?
	public double setY() {
		return 0;
	}
	
	/**
	 * Get the speed, how fast should a mobile move?
	 */
	public void getSpeed() {
	}
	
	/**
	 * Move.
	 */
	public void move() {
	}
	
	/**
	 * Move up.
	 */
	public void moveUP() {
	}
	
	/**
	 * Move down.
	 */
	public void moveDOWN() {
	}
	
	/**
	 * Move left.
	 */
	public void moveLEFT() {
	}
	
	/**
	 * Move right.
	 */
	public void moveRIGHT() {
	}
	
	/**
	 * Get the case needed.
	 */
	public void getCase() {
	}
	
	/**
	 * Get the required images.
	 */
	public void getImages() {
	}
}
