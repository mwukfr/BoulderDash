package controller;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import contract.ControllerOrder;
import contract.IModel;
import contract.IView;

public class ControllerTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	private IView view;
	private IModel model;
	ControllerOrder controllerOrder;

	@Before
	public void setUp() throws Exception {
		//System.out.println("Starting Test.");
		ControllerOrder controllerOrder;
	}

	@After
	public void tearDown() throws Exception {
		//System.out.println("Ending Test.");
	}

	@Test
	public void testController() {
		this.testSetView();
		this.testSetModel();
		System.out.println("testController OP.");
	}

	@Test
	public void testControl() {
		System.out.println("testControl OP.");
	}

	@Test
	public void testSetView() {
		this.view = view;
		System.out.println("testSetView OP.");
	}

	@Test
	public void testSetModel() {
		this.model = model;
		System.out.println("testSetModel OP.");
	}
	
	@Test
	public void testOrderPerform() {
		//should be testing switch case here.
		System.out.println("testOrderPerform default in switch case OP.");
	}

	@Test
	public void testGameLoop() {
		System.out.println("testGameLoop OP.");
	}

	@Test
	public void testPlayGame() {
		this.testGameLoop();
		System.out.println("testPlayGame OP.");
	}

	@Test
	public void testKeyListener() {
		System.out.println("testKeyListener OP.");
	}

}
