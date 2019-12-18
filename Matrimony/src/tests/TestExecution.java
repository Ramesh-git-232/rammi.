package tests;

import org.testng.annotations.Test;

public class TestExecution {
	@Test
	public static void loginverify() throws Exception {
		Repository.verifylogin();
		Thread.sleep(4000);

}
}