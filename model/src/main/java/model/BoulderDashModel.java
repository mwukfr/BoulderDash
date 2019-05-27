package model;

import java.sql.SQLException;
import java.util.Observable;

import contract.IModel;
import entity.HelloWorld;

/**
 * The Class BoulderDashModel.
 *
 * @author Antoine Merlingeas
 */
public final class BoulderDashModel extends Observable implements IModel {


	/**
	 * Constructor of the BoulderDashModel.
	 */
	public BoulderDashModel() {
	}

	/**
     * Method for the hit of the player.
     */
	/*
	 * (non-Javadoc)
	 *
	 * @see contract.IModel#getMessage()
	 */
	public boolean Hit() {
		return true;
	}

	/**
     * Create Map.
     */
	public void CreateMap() {
		//switch case 10
		}

	/**
     * Can set the Mobile object after they're moving.
     */
	/*
	 * (non-Javadoc)
	 *
	 * @see contract.IModel#getMessage(java.lang.String)
	 */
	//A réfléchir
	public void setMobilesHavesMoved() {

	}
	/**
	 * Can count the diamond and open the exit.
	 */
	//dans entity?
	public void CounterDiamond() {
		
	}

	/**
     * Gets the observable.
     *
     * @return the observable
     */
	/*
	 * (non-Javadoc)
	 *
	 * @see contract.IModel#getObservable()
	 */
	//déjà là
	public Observable getObservable() {
		return this;
	}
}
