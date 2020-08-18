package TestCases;



import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class junitbasic {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Executed Before Class");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("Executed After Class");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("Executed Before test");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("Executed after test");
	}
	

	@Test
	public void test1() {
		System.out.println("test1");
	}
		
		@Test
		public void test2() {
			System.out.println("test2");
	}

}
