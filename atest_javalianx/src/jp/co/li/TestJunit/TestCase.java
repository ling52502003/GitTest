package jp.co.li.TestJunit;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCase extends NoExitTestCase {

	@Test
	public void testExit() {
		try {
			String arg[] = { "", "" };
			TestS.main(arg);
		} catch (ExitException e) {
			// Assert(42, e.status);
			System.out.println(e.status);
			assertEquals(e.status, 0);
		}
	}

	@Test
	public void testExit参数没有() {
		try {
			TestS.main(null);
		} catch (ExitException e) {
			// Assert(42, e.status);
			System.out.println(e.status);
			assertEquals(e.status, 1);
		}
	}
}
