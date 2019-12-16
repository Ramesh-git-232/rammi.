package Mavenprograms;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class AjaxyControl {
	public WebDriver driver;
  @Test(priority=2)
  public void testing() {
	  driver.findElement(By.name("q")).sendKeys("google");
	  List<WebElement> list=driver.findElements(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[2]/div[2]/ul/li[8]/div/div[2]/div/span/b"));
	  for (int i = 0; i < list.size(); i++) {System.out.println(list.get(i).getText());
	  if (list.get(i).getText().contains("google pixel 3")) {list.get(i).click(); break;
		
	 }
	  }	
	}
@Test(priority=1)
public void manual() {
	driver.findElement(By.name("q")).sendKeys("suma");
	List<WebElement> mis= driver.findElements(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[2]/div[2]/ul/li[9]/div/div[2]/div/span/b"));
	for (int i = 0; i < mis.size(); i++) {System.out.println(mis.get(i).getText());
	if (mis.get(i).getText().contains("sumanth movies")) { mis.get(i).click(); break;
		
	}
		
	}
	  
  }
  @BeforeTest
  public void openurl() throws Exception {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\91991\\Downloads\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("http://google.com");
	  driver.manage().window().maximize();
	  Thread.sleep(3000);
	  
	  
	  
	  
  }

  @AfterTest
  public void afterTest() {
  }

}
