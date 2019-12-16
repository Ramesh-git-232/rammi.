package Mavenprograms;

import org.testng.annotations.Test;
import org.testng.reporters.Files;

import jxl.read.biff.File;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;

public class IRCTC {
	
	private static final Files FileUtils = null;
	public WebDriver driver;
	
	
  @Test
  public void login() throws Exception {
	  driver.findElement(By.xpath("//*[@id=\"origin\"]/span/input")).sendKeys("HYDERABAD DECAN - HYB");
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//*[@id=\"destination\"]/span/input")).sendKeys("DELHI - DLI");
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//*[@id=\"divMain\"]/div/app-main-page/div[1]/div/div[1]/div/div/div[1]/div/app-jp-input/div[3]/form/div[3]/p-calendar/span/button/span[1]")).click();
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//*[@id=\"divMain\"]/div/app-main-page/div[1]/div/div[1]/div/div/div[1]/div/app-jp-input/div[3]/form/div[3]/p-calendar/span/div/table/tbody/tr[5]/td[5]/a")).click();
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//*[@id=\"journeyClass\"]/div/div[3]/span")).click();
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//*[@id=\"journeyClass\"]/div/div[4]/div/ul/li[5]/span")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//*[@id=\"divMain\"]/div/app-main-page/div[1]/div/div[1]/div/div/div[1]/div/app-jp-input/div[3]/form/div[6]/div[1]/label")).click();
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//*[@id=\"divMain\"]/div/app-main-page/div[1]/div/div[1]/div/div/div[1]/div/app-jp-input/div[3]/form/div[7]/button")).click();
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//*[@id=\"ui-accordiontab-0-content\"")).click();
	  Thread.sleep(3000);
  }
	// It will execute after every test execution 
	@AfterMethod
	public void tearDown(ITestResult result)
	{
	 
	// Here will compare if test is failing then only it will enter into if condition
	if(ITestResult.FAILURE==result.getStatus())
	{
	try 
	{
	// Create refernce of TakesScreenshot
	TakesScreenshot ts=(TakesScreenshot)driver;
	 
	// Call method to capture screenshot
	java.io.File source=ts.getScreenshotAs(OutputType.FILE);
	 
	// Copy files to specific location here it will save all screenshot in our project home directory and
	// result.getName() will return name of test case so that screenshot name will be same
//	FileUtils.copyFile(source, new File("C:/selenium/error.png"));
	 
	System.out.println("Screenshot taken");
	} 
	catch (Exception e)
	{
	 
	System.out.println("Exception while taking screenshot "+e.getMessage());
	} 
	 
	}
	
	  
  }
  
		
	
private void takeSnapShot(org.openqa.selenium.WebDriver driver2, String string) {
	// TODO Auto-generated method stub
	
}
@BeforeTest
  public void openurl() throws Exception {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\91991\\Downloads\\selennium\\chromedriver_win32\\chromedriver.exe");
	  driver = new ChromeDriver();
	  // WebDriver driver =new ChromeDriver(options);
	  driver.get("https://www.irctc.co.in/nget/train-search");
	  driver.manage().window().maximize();
	  Thread.sleep(3000);
	  
	   
	  
	  
	  
	  
	  
  }

  @AfterTest
  public void afterTest() {
  }

}
