package Mavenprograms;

import org.testng.annotations.Test;

import com.google.common.io.Files;

import org.testng.annotations.BeforeTest;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class Hms {
	public WebDriver driver;
	
  @Test (priority = 1)
  public void login() throws Exception {
	  driver.findElement(By.name("username")).sendKeys("dfgsfsf");
	  driver.findElement(By.name("password")).sendKeys("sdsfs");
	  driver.findElement(By.name("submit")).click();
	  Thread.sleep(3000);
	  driver.switchTo().alert().accept();
	  
	  driver.findElement(By.name("username")).sendKeys("admin");
	  driver.findElement(By.name("password")).sendKeys("admin");
	  driver.findElement(By.name("submit")).click();}
 @Test (priority = 2)
  public void registation() throws Exception {
	 driver.findElement(By.linkText("Registration")).click();
     driver.findElement(By.name("PATIENT_CAT")).click();
     new Select(driver.findElement(By.name("PATIENT_CAT"))).selectByVisibleText("Self");
     driver.findElement(By.name("TITLE")).click();
     new Select(driver.findElement(By.name("TITLE"))).selectByVisibleText("Others");
     driver.findElement(By.name("PNT_NAME")).sendKeys("ravi");
     driver.findElement(By.name("LAST_NAME")).sendKeys("ravi");
     driver.findElement(By.name("DOB")).sendKeys("20-08-1996");
    // new Select(driver.findElement(By.name("DOB"))).selectByVisibleText("20-08-1996");
     driver.findElement(By.name("AGE")).sendKeys("12");
     driver.findElement(By.name("SEX")).click();
     new Select(driver.findElement(By.name("SEX"))).selectByVisibleText("Male");
     driver.findElement(By.name("MTRL_STATUS")).click();
     new Select(driver.findElement(By.name("MTRL_STATUS"))).selectByVisibleText("Single");
     driver.findElement(By.name("RELIGION")).click();
     new Select(driver.findElement(By.name("RELIGION"))).selectByVisibleText("Hindu");
     driver.findElement(By.name("PLANGUAGE")).click();
     new Select(driver.findElement(By.name("PLANGUAGE"))).selectByVisibleText("Telugu");
     driver.findElement(By.name("RELATION")).click();
     new Select(driver.findElement(By.name("RELATION"))).selectByVisibleText("Brother");
     driver.findElement(By.name("PAT_IDENTITY")).click();
     new Select(driver.findElement(By.name("PAT_IDENTITY"))).selectByVisibleText("Voter ID");
     driver.findElement(By.name("PAT_IDENTITY_PROOF")).sendKeys("2623535652425265");
     driver.findElement(By.name("NATIONALITY")).click();
     new Select(driver.findElement(By.name("NATIONALITY"))).selectByVisibleText("Indian");
     driver.findElement(By.name("IS_MLC")).click();
     new Select(driver.findElement(By.name("IS_MLC"))).selectByVisibleText("No");
     driver.findElement(By.name("EDUCATION")).click();
     new Select(driver.findElement(By.name("EDUCATION"))).selectByVisibleText("B.Sc");
     driver.findElement(By.name("OCCUPATION")).click();
     new Select(driver.findElement(By.name("OCCUPATION"))).selectByVisibleText("Employee");
     driver.findElement(By.name("BLOOD_GRP_CODE")).click();
     new Select(driver.findElement(By.name("BLOOD_GRP_CODE"))).selectByVisibleText("A+");
     driver.findElement(By.name("CITIZENSHIP")).click();
     new Select(driver.findElement(By.name("CITIZENSHIP"))).selectByVisibleText("Indian");
     driver.findElement(By.name("SC_PROOF")).click();
     new Select(driver.findElement(By.name("SC_PROOF"))).selectByVisibleText("No");
     driver.findElement(By.name("ADDRESS1")).sendKeys("dddf44356ffdd");
     driver.findElement(By.name("MOBILE_NO")).sendKeys("9912516013");
     driver.findElement(By.name("EMAIL_ID")).sendKeys("rdsdd@gmail.com");
     driver.findElement(By.name("COUNTRY_CODE")).click();
     new Select(driver.findElement(By.name("COUNTRY_CODE"))).selectByVisibleText("India");
     driver.findElement(By.name("ZIP")).sendKeys("507161");
     driver.findElement(By.name("image")).sendKeys("C:\\Users\\91991\\Desktop\\sham.exe");
     Thread.sleep(3000);
  // Runtime.getRuntime().exec("C:\\Users\\91991\\Desktop\\sham.exe");
     driver.findElement(By.name("submit")).click();
     Thread.sleep(3000);


	  
	  
	  
	  
  }
  @BeforeTest
  public void opnurl() throws Exception {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\91991\\Downloads\\selennium\\chromedriver_win32\\chromedriver.exe");
			  driver = new ChromeDriver();
			  driver.get("http://www.computechis.com/DemoSite");
			  driver.manage().window().maximize();
			  File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			  Files.copy(screenshotFile, new File("C:\\Users\\91991\\Pictures\\Screenshots.png"));
	  Thread.sleep(2000); 
	  
	  
  }

  @AfterTest
  public void afterTest() {
  }

}
