package model;

import java.sql.SQLException;
import java.util.Observable;
import contract.IModel;

/**
 * The BoulderDashModel Class.
 *
 * @author Antoine
 */
public final class BoulderDashModel extends Observable {


	/**
	 * The Constructor for BoulderDashModel.
	 */
	public BoulderDashModel() {
	}

	/**
     * True or False - Tells us if a player gets killed.
     */
	public boolean Hit() {
		return true;
	}

	/**
     * Creates the maps.
     */
	public void CreateMap() {
		//switch case 10
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
	public void DiamondCounter() {
		
	}

	/**
     * Gets the observable.
     *
     * @return the observable
     */
	//already here, are we using it?
	public Observable getObservable() {
		return this;
	}
}
