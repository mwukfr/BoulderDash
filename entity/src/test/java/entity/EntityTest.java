package entity;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class EntityTest {
	/**
	 * Object boulder type Boulder.
	 */
	private Boulder boulder;
	/**
	 * Object diamond type Diamond.
	 */
	private Diamond diamond;
	/**
	 * Object dirt type Dirt.
	 */
	private Dirt dirt;
	/**
	 * Object exit type Exit.
	 */
	private Exit exit;
	/**
	 * Object limitBlock type LimitBlock.
	 */
	private LimitBlock limitBlock;
	/**
	 * Object player type Player.
	 */
	private Player player;
	/**
	 * Object wall type Wall.
	 */
	private Wall wall;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		this.boulder = new Boulder(null, null);
		this.diamond = new Diamond(null, null);
		this.dirt = new Dirt();
		this.exit = new Exit();
		this.limitBlock = new LimitBlock();
		this.player = new Player(null, null);
		this.wall = new Wall();
		
	}

	
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method IsBreakable for all objects.
	 */
	@Test
	public void testIsBreakable() {
		
		final boolean excepted = false;
		System.out.println("Boulder isBreakable : " + Boulder.isBreakable);
		assertEquals(excepted,Boulder.isBreakable);
		
		final boolean excepted1 = false;
		System.out.println("Diamond isBreakable : " + Diamond.isBreakable);
		assertEquals(excepted1,Diamond.isBreakable);
		
		final boolean excepted2 = true;
		System.out.println("Dirt isBreakable : " + Dirt.isBreakable);
		assertEquals(excepted2,Dirt.isBreakable);
		
		final boolean excepted3 = false;
		System.out.println("Exit isBreakable : " + Exit.isBreakable);
		assertEquals(excepted3,Exit.isBreakable);
		
		final boolean excepted4 = false;
		System.out.println("LimitBlock isBreakable : " + LimitBlock.isBreakable);
		assertEquals(excepted4,LimitBlock.isBreakable);
		
		final boolean excepted5 = false;
		System.out.println("Player isBreakable : " + Player.isBreakable);
		assertEquals(excepted5,Player.isBreakable);

	}

	/**
	 * Test method IsMobile for all objects.
	 */
	@Test
	public void testIsMobile() {
		
		final boolean excepted = true;
		System.out.println("Boulder isMobile : " + Boulder.isMobile);
		assertEquals(excepted,Boulder.isMobile);
		
		final boolean excepted1 = true;
		System.out.println("Diamond isMobile : " + Diamond.isMobile);
		assertEquals(excepted1,Diamond.isMobile);
		
		final boolean excepted2 = false;
		System.out.println("Dirt isMobile : " + Dirt.isMobile);
		assertEquals(excepted2,Dirt.isMobile);
		
		final boolean excepted3 = false;
		System.out.println("Exit isMobile : " + Exit.isMobile);
		assertEquals(excepted3,Exit.isMobile);
		
		final boolean excepted4 = false;
		System.out.println("LimitBlock isMobile : " + LimitBlock.isMobile);
		assertEquals(excepted4,LimitBlock.isMobile);
		
		final boolean excepted5 = true;
		System.out.println("Player isMobile : " + Player.isMobile);
		assertEquals(excepted5,Player.isMobile);
		
	}

	
	/**
	 * Test method IsCollectable for all objects.
	 */
	@Test
	public void testIsCollectable() {
		
		final boolean excepted = false;
		System.out.println("Boulder isCollectable : " + Boulder.isCollectable);
		assertEquals(excepted,Boulder.isCollectable);
		
		final boolean excepted1 = true;
		System.out.println("Diamond isCollectable : " + Diamond.isCollectable);
		assertEquals(excepted1,Diamond.isCollectable);
		
		final boolean excepted2 = true;
		System.out.println("Dirt isCollectable : " + Dirt.isCollectable);
		assertEquals(excepted2,Dirt.isCollectable);
		
		final boolean excepted3 = false;
		System.out.println("Exit isCollectable : " + Exit.isCollectable);
		assertEquals(excepted3,Exit.isCollectable);
		
		final boolean excepted4 = false;
		System.out.println("LimitBlock isCollectable : " + LimitBlock.isCollectable);
		assertEquals(excepted4,LimitBlock.isCollectable);
		
		final boolean excepted5 = false;
		System.out.println("Player isCollectable : " + Player.isCollectable);
		assertEquals(excepted5,Player.isCollectable);
	}

	/**
	 * Test method IsUnique for all objects.
	 */
	@Test
	public void testIsUnique() {
		
		final boolean excepted = false;
		System.out.println("Boulder isUnique : " + Boulder.isUnique);
		assertEquals(excepted,Boulder.isUnique);
		
		final boolean excepted1 = false;
		System.out.println("Diamond isUnique : " + Diamond.isUnique);
		assertEquals(excepted1,Diamond.isUnique);
		
		final boolean excepted2 = false;
		System.out.println("Dirt isUnique : " + Dirt.isUnique);
		assertEquals(excepted2,Dirt.isUnique);
		
		final boolean excepted3 = true;
		System.out.println("Exit isUnique : " + Exit.isUnique);
		assertEquals(excepted3,Exit.isUnique);
		
		final boolean excepted4 = false;
		System.out.println("LimitBlock isUnique : " + LimitBlock.isUnique);
		assertEquals(excepted4,LimitBlock.isUnique);
		
		final boolean excepted5 = true;
		System.out.println("Player isUnique : " + Player.isUnique);
		assertEquals(excepted5,Player.isUnique);
	}

}

