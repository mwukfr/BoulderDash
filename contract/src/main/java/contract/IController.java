package contract;

import contract.IModel;
import contract.IView;
import java.awt.event.*;

/**
 * The Interface IController.
 * 
 * @author mwukfr
 */
public interface IController {
	
	/**
	 * Control.
	 */
	public void control();

	/**
	 * Order perform.
	 *
	 * @param controllerOrder
	 *          the controller order
	 */
	public void orderPerform(ControllerOrder controllerOrder);
	
	/**
	 * Set interfaces.
	 * @return 
	 */
	public void Controller (IView view, IModel model);

	/**
	 * Model interface method.
	 * @param model
	 */
	public void setModel(IModel model);

	/**
	 * View interface method.
	 * @param view
	 */
	public void setView(IView view);
	
	/**
	 * Main game loop.
	 */
	void gameLoop();
	
	/**
	 * Loop of what happens when game is launched until death.
	 */
	public void playGame();
	
	/**
	 * KeyListener - when key is clicked - program listens.
	 * @param keyEvent
	 */
	public void KeyListener(KeyEvent keyEvent);
}
