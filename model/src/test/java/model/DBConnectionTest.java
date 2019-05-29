package model;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class DBConnectionTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	/**@Test
	public DBConnection getInstance() {
		fail("Not yet implemented");
		//must return DBConnection result (dude i don't know how to do this shit, i want to die)
	}
	**/
	@Test
	public Boolean open() {
	return true;
	}

}
