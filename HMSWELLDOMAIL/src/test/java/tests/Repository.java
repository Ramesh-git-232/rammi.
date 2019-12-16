package tests;

import org.testng.annotations.Test;

import PageObjectmodel.Locators;
import PageObjectmodel.TestData;

import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Repository {
	public static WebDriver driver;
	//login
  @Test
  public static void login() {
	  driver.findElement(Locators.username1).sendKeys(TestData.username1);
		driver.findElement(Locators.Password).sendKeys(TestData.Password);
		driver.findElement(Locators.Login).click();
  }
  @BeforeTest
  public void setup() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\91991\\Downloads\\chromedriver.exe");
	  driver = new ChromeDriver();
		driver.get(TestData.url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS );  
  }

  @AfterTest
  public void afterTest() {
  }

}
