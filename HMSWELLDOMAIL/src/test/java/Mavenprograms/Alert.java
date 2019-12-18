package Mavenprograms;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class Alert {
	public WebDriver driver;
	
	
  @Test(priority=1)
  public void login() throws Exception {
	  driver.findElement(By.name("username")).sendKeys("fdfdgd");
	  driver.findElement(By.name("password")).sendKeys("wtwtwtw");
	  driver.findElement(By.name("submit")).click();
	  Thread.sleep(3000);
	  driver.switchTo().alert().accept();
	  driver.findElement(By.name("username")).sendKeys("admin");
	  driver.findElement(By.name("password")).sendKeys("admin");
	  driver.findElement(By.name("submit")).click();}
  @Test (priority=2)
  public void popup() throws Exception {
	  driver.findElement(By.linkText("Feedback")).click();
	  Thread.sleep(5000);
	  String parent = driver.getWindowHandle();
	  for(String chaild : driver.getWindowHandles()) {
		  driver.switchTo().window(chaild);
		  Thread.sleep(3000);
		  driver.findElement(By.id("name")).sendKeys("ramya");
		  driver.findElement(By.id("email")).sendKeys("rammidrums@gmail.com");
		 new Select(driver.findElement(By.id("car"))).selectByVisibleText("Audi");
		  List<WebElement> list = new Select(driver.findElement(By.id("car"))).getOptions();
		  System.out.println(list.get(2).getText());
		  for (int i = 0; i < list.size(); i++) {
			  System.out.println(list.get(i).getText());
			  driver.findElement(By.name("radio")).click();
				 driver.findElement(By.xpath("/html/body/div[2]/div/div/form/ul/li[5]/label/input")).click();
				 driver.findElement(By.xpath("/html/body/div[2]/div/div/form/ul/li[6]/input")).sendKeys("C:\\Users\\91991\\Pictures\\Camera Roll\\WIN_20191213_10_51_33_Pro.jpg");
				  driver.findElement(By.id("message")).sendKeys("i love you shiri");
				  driver.findElement(By.xpath("/html/body/div[2]/div/div/form/p/button[1]")).click();
				  Thread.sleep(2000);
				  driver.switchTo().window(parent);}
	  
	  
	  
	  
	  }
	  
	  
  }
  @BeforeTest
  public void openurl() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\91991\\Downloads\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("http://www.computechis.com/DemoSite");
	  driver.manage().window().maximize();
	 /// manage().deleteAllCookies();
	  Thread.sleep(3000);
	  
	  
  }

  @AfterTest
  public void afterTest() {
  }

}
