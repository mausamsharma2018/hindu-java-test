package test.junit.com;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import testHindu.TestHindu;

public class TestHinduTest {

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

	@Test
	public void testMain() {
		//fail("Not yet implemented");
		TestHindu obj = new TestHindu();
		//TestHindu.main(String[]);
		obj.webdrivertest();
		
	}
	public static void testj()
	{
		System.out.println("static method call");
	}

}
