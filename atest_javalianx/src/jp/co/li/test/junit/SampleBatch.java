package jp.co.li.test.junit;

import static org.junit.Assert.assertEquals;
import jp.co.li.TestJunit.TestS;
import jp.co.li.TestJunit.NoExitTestCase.ExitException;

import org.junit.Test;

/**
 * FugaFugaをFugeFugeするバッチ�I尖.<br>
 * 0:屎械�K阻<br>
 * 1:��械�K阻
 *
 * @author boss_ape
 */
public class SampleBatch extends SystemExitStub 
{
	@Test
	public void testExit() throws Exception {
		try {
			String arg[] = { "", "" };
			TestS.main(arg);
		} catch (ExitException e) {
			// Assert(42, e.status);
System.out.println(e.status);
			

e.printStackTrace();

			assertEquals(e.status,0);
		}
	}
}
