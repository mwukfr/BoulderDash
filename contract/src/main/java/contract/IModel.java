package contract;

import java.sql.Connection;
import java.util.Observable;
import entity.Entity;

/**
 * The Interface IModel.
 *
 * @author mwukfr
 */
public interface IModel {

	/**
	 * Connect to database.
	 * @return
	 */
	//this shit don't work - set in diagram though.
	//public DBConnection getInstance();
	
	/**
	 * open switch case ?
	 * @return
	 */
	public boolean open();
	
	/**
	 * Get the database connection.
	 */
	public Connection getConnection();
	
	/**
	 * URL - Login - Password.
	 */
	public void DBProperties();
	
	/**
	 * Retrieve URL.
	 * @return
	 */
	public String getURL();
	
	/**
	 * Define URL.
	 * @param URL
	 * @return
	 */
	public String setURL(String URL);
	
	/**
	 * Retrieve Login.
	 * @return
	 */
	public String getLogin();
	
	/**
	 * Define Login.
	 * @param Login
	 * @return
	 */
	public String setLogin(String Login);
	
	/**
	 * Retrieve Password.
	 * @return
	 */
	public String getPassword();
	
	/**
	 * Define Password.
	 * @param Password
	 * @return
	 */
	//Set as void in class diagram (contract) can't be a void here - what to do ?
	public String setPassword(String Password);
	
	/**
	 * Get attribute.
	 */
	public void getAttribute();
	
	/**
	 * Set attribute.
	 */
	//wasn't a String - what goes in it ? - should be in View.
	public void setAttribute(String attribute);
	
	//dunno wtf this is yet
	public void BoulderDashModel();
	
	/**
	 * Get player, enemy...anything mobile.
	 */
	public void getMobile();
	
	/**
	 * Add player, enemy...
	 */
	public void addMobile();
	
	/**
	 * Remove player, enemy...
	 */
	public void removeMobile();
	
	/**
	 * Inform our program that mobile has moved.
	 */
	public void setMobileHasMoved();
	
	//dunno wtf this is yet
	public void Mobile();
	
	/**
	 * Coordinate X.
	 * @return
	 */
	public double getX();	
	
	/**
	 * Set coordinate X.
	 * @return
	 */
	//was a void in class diagram - this right ?
	public double setX();
	
	/**
	 * Coordinate Y.
	 * @return
	 */
	public double getY();
	
	/**
	 * Set coordinate Y.
	 * @return
	 */
	//was a void in class diagram - this right ?
	public double setY();
	
	/**
	 * Get the speed, how fast should a mobile move?
	 */
	public void getSpeed();
	
	/**
	 * Move.
	 */
	public void move();
	
	/**
	 * Move up.
	 */
	public void moveUP();
	
	/**
	 * Move down.
	 */
	public void moveDOWN();
	
	/**
	 * Move left.
	 */
	public void moveLEFT();
	
	/**
	 * Move right.
	 */
	public void moveRIGHT();
	
	/**
	 * Get the case needed.
	 */
	public void getCase();
	
	/**
	 * Get the required images.
	 */
	public void getImages();
	
	/**
	 * @return the observable
	 */
	//This was already here, what should we do with it ? Why is it deprecated ?
	Observable getObservable();
}
