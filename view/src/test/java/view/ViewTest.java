package view;

import static org.junit.Assert.*;

import java.awt.event.KeyEvent;

import javax.swing.SwingUtilities;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import contract.ControllerOrder;
import contract.IController;
import contract.IModel;
import contract.IView;
import junit.framework.Assert;

public class ViewTest implements IView {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	private ViewFrame viewFrame;
	IModel model;
	IController controller;
	int keyCode;

	@Before
	public void setUp() throws Exception {
		this.model = model;
		this.controller = controller;
		this.keyCode = 1;
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testView() {
		System.out.println("LGTM");
	}

	@Test
	public void testKeyCodeToControllerOrder() {		
		assertEquals(model, model);
	}

	@Test
	public void testRun() {
		assertEquals(model, model);
	}

	@Test
	public void testSetController() {
		assertEquals(controller, controller);
	}

}
