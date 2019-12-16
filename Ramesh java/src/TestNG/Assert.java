package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Assert {
	public WebDriver driver;
	
	
  @Test
  public void login() {
	  String ExpectedTitle = "Welcome: Mercury Tours";
	  String ActualTitle = driver.getTitle();
	 
	  
	  try{

	  Assert.assertEquals(ExpectedTitle, ActualTitle);
	  
	  System.out.println("TitleMatched");
	  
	  }
	  catch (Throwable t){
		  
		
	  System.out.println("Not Equals");}
	  
	  
	 

	
}
private static void assertEquals(String expectedTitle, String actualTitle) {
	// TODO Auto-generated method stub
	
}
@BeforeTest
  public void openurl() throws Exception {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\91991\\Downloads\\selennium\\chromedriver_win32\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("http://demo.guru99.com/test/newtours/");
	  driver.manage().window().maximize();
	  Thread.sleep(2000);  
	  
	  
  }

  @AfterTest
  public void afterTest() {
  }

}
