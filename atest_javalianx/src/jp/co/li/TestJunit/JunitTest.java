package jp.co.li.TestJunit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class JunitTest {

	@Before
	public void beforTest() {
		System.out.println("beforTest....");

	}

	@Test
	public void testAdd() {
		System.out.println("Start....");
		try {
			TestS ddd = new TestS();
			String arg[] = { "", "" };
			ddd.main(arg);

		} catch (Exception ex) {

		} finally {

		}
	}
	
	@After
	public void mockSystemExit(@Mocked("exit") System mockSystem)
	{
	    // Called by code under test:
	    System.exit(); // will not exit the program
	}
}
