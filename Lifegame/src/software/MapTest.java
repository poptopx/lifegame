package software;

import static org.junit.Assert.*;

import java.awt.Graphics;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class MapTest {
	Map m = new Map();
	Graphics g;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		
	}

	@Test
	public void testMap() {
		assertEquals(m.getmapsize(),50);
		assertEquals(m.getgridsize(),20);
	}

	@Test
	public void testSetmapsize() {
		m.setmapsize(100);
		assertEquals(m.getmapsize(),100);

	}

	@Test
	public void testGetmapsize() {
		m.setmapsize(100);
		assertEquals(m.getmapsize(),100);
	}

	@Test
	public void testGetgridsize() {
		m.setmapsize(50);
		assertEquals(m.getmapsize(),50);
	}

	@Test
	public void testSetgridsize() {
		m.setgridsize(50);
		assertEquals(m.getgridsize(),50);
	}


	

}
