package unitTest;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestWatcher;

import unit.HowLong;

public class HowLongTest {
	private HowLong how;
	@Rule
	public TestWatcher testwatcher = new TestWatcher() {
		protected void failed(Throwable e, org.junit.runner.Description description) {
			System.out.println("FAILED --> " + description.getMethodName());
		};

		protected void succeeded(org.junit.runner.Description description) {
			System.out.println("SUCCEED --> " + description.getMethodName());
		};
	};

	@Before
	public void beforeTest() {
		how = new HowLong();
	}

	@After
	public void afterTest() {
		how = null;
	}

	@Test
	public void indexTest() {
		int realSum = how.index("Momento more");
		int expectedSum = 5;
		org.junit.Assert.assertEquals(expectedSum, realSum);
	}
}