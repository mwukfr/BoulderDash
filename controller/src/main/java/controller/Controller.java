package controller;

import contract.ControllerOrder;
import contract.IController;
import contract.IModel;
import contract.IView;
import java.awt.event.KeyEvent;    //Only need this if we use a KeyListener here!!!
import java.awt.event.KeyListener; //Only need this if we use a KeyListener here!!!


/**
 * The Class Controller.
 * 
 * @author mwukfr
 */
public final class Controller implements IController {

	/** The view. */
	private IView view;

	/** The model. */
	private IModel model;

	/**
	 * Instantiates a new controller.
	 *
	 * @param view
	 *          the view
	 * @param model
	 *          the model
	 */
	public Controller(final IView view, final IModel model) {
		this.setView(view);
		this.setModel(model);
	}

	/**
     * Control. Indicates the keys to use.
     */
	/*
	 * (non-Javadoc)
	 *
	 * @see contract.IController#control()
	 */
	public void control() {
		this.view.printMessage("Appuyer sur les touches 'E', 'F', 'D' ou 'I', pour afficher Hello world dans la langue d votre choix.");
	}

	/**
     * Sets the view.
     *
     * @param pview
     *            the new view
     */
	//changed from private to public
	public void setView(final IView pview) {
		this.view = pview;
	}

	/**
	 * Sets the model.
	 *
	 * @param model
	 *          the new model
	 */
	//changed from private to public
	public void setModel(final IModel model) {
		this.model = model;
	}

	/**
     * Order perform.
     *
     * @param controllerOrder
     *            the controller order
     */
	/*
	 * (non-Javadoc)
	 *
	 * @see contract.IController#orderPerform(contract.ControllerOrder)
	 */
	public void orderPerform(final ControllerOrder controllerOrder) {
		switch (controllerOrder) {
			case Level1:
				//do stuff
				break;
			case Level2:
				//do stuff
				break;
			case Level3:
				//do stuff
				break;
			case Level4:
				//do stuff
				break;
			case Level5:
				//do stuff
				break;
			default:
				break;
		}
	}
	
	/**
	 * Main game loop.
	 */
	// Remove void - changed from private to public
	public void gameLoop() {
		//TODO - while maybe

	}
	
	/**
	 * Defines what happens when the game is launched. Includes the gameLoop(), death message and game restart.
	 */
	// Remove void
	public void playGame() {
		this.gameLoop();
		//Display a message when you die ?
		//Restart game on death ?	
	}

	//@Override - set by default
	public void Controller(IView view, IModel model) {
		// TODO Auto-generated method stub
		
	}

	//@Override - set by default
	public void KeyListener(KeyEvent keyEvent) {
		// TODO Auto-generated method stub
		
	}


}
