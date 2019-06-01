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
		System.out.println("LGTM - everything looks good");
	}

	private IView view;
	private IModel model;
	ControllerOrder controllerOrder;

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testController() {
		this.testSetView();
		this.testSetModel();
	}

	@Test
	public void testControl() {
	}

	@Test
	public void testSetView() {
		this.view = view;
	}

	@Test
	public void testSetModel() {
		this.model = model;
	}
	
	@Test
	public void testOrderPerform() {
		//should be testing switch case here.
	}

	@Test
	public void testGameLoop() {
	}

	@Test
	public void testPlayGame() {
		this.testGameLoop();
	}

	@Test
	public void testKeyListener() {
	}

}
