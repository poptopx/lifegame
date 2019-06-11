package software;

import static org.junit.Assert.*;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class LifegameTest extends Applet{
	private static  Lifegame lg = new  Lifegame();
	Graphics g =this.getGraphics();
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		lg.m.map[3][9]=1;
		
		lg.m.map[4][1]=1;
		lg.m.map[4][2]=1;
		
		
		lg.m.map[1][1]=1;
		lg.m.map[1][2]=1;
		lg.m.map[1][3]=1;
		
		lg.m.map[8][1]=1;
		lg.m.map[8][2]=1;
		lg.m.map[8][3]=1;
		lg.m.map[8][4]=1;


	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void testInit() {
		lg.init();
		assertEquals(lg.flag ,false);
		System.out.println(lg.t.time);
		Color  s =lg.getBackground();
		assertEquals(s.getRed(),199);
		assertEquals(s.getBlue(),204);
		assertEquals(s.getGreen(),237);
	}
	@Test
	public void testGetlifenumber() {
		lg.m.getlifenumber();
		assertEquals(lg.m.lifenumber[3][8] ,1);
		assertEquals(lg.m.lifenumber[3][9] ,0);
		assertEquals(lg.m.lifenumber[3][10] ,1);

		assertEquals(lg.m.lifenumber[4][1] ,1);
		assertEquals(lg.m.lifenumber[4][2] ,1);
		assertEquals(lg.m.lifenumber[4][3] ,1);
		assertEquals(lg.m.lifenumber[5][2] ,2);
		
		assertEquals(lg.m.lifenumber[1][1] ,1);
		assertEquals(lg.m.lifenumber[1][2] ,2);
		assertEquals(lg.m.lifenumber[1][3] ,1);
		assertEquals(lg.m.lifenumber[1][4] ,1);
		assertEquals(lg.m.lifenumber[2][1] ,2);
		assertEquals(lg.m.lifenumber[2][2] ,3);
		assertEquals(lg.m.lifenumber[2][3] ,2);
		assertEquals(lg.m.lifenumber[2][4] ,1);
		
		assertEquals(lg.m.lifenumber[7][2] ,3);
		assertEquals(lg.m.lifenumber[7][4] ,2);
		assertEquals(lg.m.lifenumber[8][1] ,1);
		assertEquals(lg.m.lifenumber[8][2] ,2);
		assertEquals(lg.m.lifenumber[8][3] ,2);
		assertEquals(lg.m.lifenumber[8][4] ,1);
		assertEquals(lg.m.lifenumber[9][1] ,2);
		assertEquals(lg.m.lifenumber[9][3] ,3);

		


	}

	@Test
	public void testNewmap() {
		lg.m.newmap();
		assertEquals(lg.m.map[3][8] ,0);
		assertEquals(lg.m.map[3][9] ,0);
		
		assertEquals(lg.m.map[4][1] ,0);
		assertEquals(lg.m.map[4][2] ,0);
		assertEquals(lg.m.map[4][3] ,0);

		assertEquals(lg.m.map[1][1] ,0);
		assertEquals(lg.m.map[1][2] ,1);
		assertEquals(lg.m.map[1][3] ,0);
		assertEquals(lg.m.map[1][4] ,0);
		assertEquals(lg.m.map[2][1] ,0);
		assertEquals(lg.m.map[2][2] ,1);
		assertEquals(lg.m.map[2][3] ,0);
		assertEquals(lg.m.map[2][4] ,0);
		
		assertEquals(lg.m.map[7][1] ,0);
		assertEquals(lg.m.map[7][2] ,1);
		assertEquals(lg.m.map[7][3] ,1);
		assertEquals(lg.m.map[7][4] ,0);
		assertEquals(lg.m.map[8][1] ,0);
		assertEquals(lg.m.map[8][2] ,1);
		assertEquals(lg.m.map[8][3] ,1);
		assertEquals(lg.m.map[8][4] ,0);
		assertEquals(lg.m.map[9][1] ,0);
		assertEquals(lg.m.map[9][2] ,1);
		assertEquals(lg.m.map[9][3] ,1);
		assertEquals(lg.m.map[9][4] ,0);
	}

	@Ignore
	public void testPaintGraphics() {
		lg.repaint();
		System.out.println(lg.getSize());
		System.out.println(lg.getLocation());
		
	}

	@Ignore
	public void testUpdateGraphics() {
		//lg.m.updateMap( g);
	}

	
	

	@Ignore
	public void testMouseClicked() {
		fail("Not yet implemented");
	}

	@Ignore
	public void testMousePressed() {
		fail("Not yet implemented");
	}

	@Ignore
	public void testMouseReleased() {
		fail("Not yet implemented");
	}

	@Ignore
	public void testMouseEntered() {
		fail("Not yet implemented");
	}

	@Ignore
	public void testMouseExited() {
		fail("Not yet implemented");
	}

	@Ignore
	public void testMouseDragged() {
		fail("Not yet implemented");
	}

	@Ignore
	public void testMouseMoved() {
		fail("Not yet implemented");
	}

	@Ignore
	public void testKeyTyped() {
		fail("Not yet implemented");
	}

	@Ignore
	public void testKeyPressed() {
		fail("Not yet implemented");
	}

	@Ignore
	public void testKeyReleased() {
		fail("Not yet implemented");
	}

	@Ignore
	public void testRun() {
		fail("Not yet implemented");
	}

}
