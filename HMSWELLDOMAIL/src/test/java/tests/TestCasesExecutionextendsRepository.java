package tests;

import org.testng.annotations.Test;

public class TestCasesExecutionextendsRepository {


	@Test(priority = 0)
	public void verifylogin() throws InterruptedException {
		Repository.login();
		Thread.sleep(5000);

	}

}
