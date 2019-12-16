package Mavenprograms;

import org.testng.annotations.Test;

import bsh.util.Util;
import common.Assert;

import org.testng.annotations.BeforeTest;

import static org.testng.Assert.assertEquals;

import java.io.File;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.html5.Utils;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class HmsAlert {
	private static final String FileUtils = null;
	public WebDriver driver;
	
  @Test
  public void login() throws Exception {
	  driver.findElement(By.name("username")).sendKeys("fdfdgd");
	  driver.findElement(By.name("password")).sendKeys("wtwtwtw");
	  driver.findElement(By.name("submit")).click();
	  Thread.sleep(3000);
	  driver.switchTo().alert().accept();
	  driver.findElement(By.name("username")).sendKeys("admin");
	  driver.findElement(By.name("password")).sendKeys("admin");
	  driver.findElement(By.name("submit")).click();
  }
  @Test (priority=1)
  public void popup() throws Exception {
	  driver.findElement(By.linkText("Feedback")).click();
	  String parent = driver.getWindowHandle();
	  for(String chaild : driver.getWindowHandles()) {
		  driver.switchTo().window(chaild);
	  }
	  Thread.sleep(3000);
	  driver.findElement(By.id("name")).sendKeys("ramya");
	  driver.findElement(By.id("email")).sendKeys("rammidrums@gmail.com");
	 new Select(driver.findElement(By.id("car"))).selectByVisibleText("Audi");
	  List<WebElement> list = new Select(driver.findElement(By.id("car"))).getOptions();
	  System.out.println(list.get(2).getText());
	  for (int i = 0; i < list.size(); i++) {
		  System.out.println(list.get(i).getText());
		
	}
	 driver.findElement(By.name("radio")).click();
	 driver.findElement(By.xpath("/html/body/div[2]/div/div/form/ul/li[5]/label/input")).click();
	 driver.findElement(By.xpath("/html/body/div[2]/div/div/form/ul/li[6]/input")).sendKeys("C:\\Users\\91991\\Pictures\\Camera Roll\\WIN_20191213_10_51_33_Pro.jpg");
	  driver.findElement(By.id("message")).sendKeys("i love you shiri");
	  driver.findElement(By.xpath("/html/body/div[2]/div/div/form/p/button[1]")).click();
	  Thread.sleep(2000);
	  driver.switchTo().window(parent);}
  @Test (priority=2)
  public void registation() {
	  driver.findElement(By.linkText("Registration")).click();
	 List<WebElement> rim= new Select(driver.findElement(By.name("PATIENT_CAT"))).getOptions();
	  System.out.println(rim.get(3).getText());
	  for (int i = 0; i < rim.size(); i++) {
		  System.out.println(rim.get(i).getText());}
		
	}
	@Test (priority=3)
	public void valid() {
   List<WebElement> kim = new Select(driver.findElement(By.name("TITLE"))).getOptions();
	  for (int i = 0; i < kim.size(); i++) {
		  System.out.println(kim.get(i).getText());}
		
	}
	 @Test (priority=4)
	 public void gender() {
 List<WebElement> sir = new Select(driver.findElement(By.name("SEX"))).getOptions();
    for (int i = 0; i < sir.size(); i++) {
    	System.out.println(sir.get(i).getText());}}
   @Test (priority=5)
   public void suma(){
    WebElement ntr = new Select(driver.findElement(By.name("SEX"))).getFirstSelectedOption();
    	//System.out.println(ntr.getText());
    	if (ntr.getText().equalsIgnoreCase("Select ")) {
    		System.out.println("YES");
			
		}
		else {System.out.println("NO");
			
		}	
		}
    @Test (priority=6)
    public void rama() {
   WebElement ntr2=	new Select(driver.findElement(By.name("PLANGUAGE"))).getFirstSelectedOption();
	//System.out.println(ntr2.getText());
	if (ntr2.getText().equalsIgnoreCase("Select ")) {
		System.out.println("RIGHT");
		
	} else {System.out.println("RONG");}

	}
  @Test (priority=7)
  public void boolea() {
boolean	printcondition = driver.findElement(By.linkText("Logout")).isDisplayed();
System.out.println(printcondition);
       WebElement logout = driver.findElement(By.linkText("Logout"));
       if (logout.isEnabled()) { System.out.println("is Display");
		
	} else {System.out.println("is not Display");}

	}
    @Test (priority=8)
    public void asha() {
    	boolean printcondition1 = driver.findElement(By.name("submit")).isDisplayed();
    	System.out.println(printcondition1);
    	WebElement save = driver.findElement(By.name("submit")); 
    	if (save.isEnabled()) {System.out.println("good ramesh");
			
		} else {System.out.println("bad Ramesh");}

		}
    @Test (priority=9)
    public void madhu() {
    	boolean printcondition2 = driver.findElement(By.xpath("//*[@id=\"form1\"]/div[1]/table/tbody/tr[18]/td[3]/input")).isDisplayed();
    	System.out.println(printcondition2);
    	WebElement clear = driver.findElement(By.xpath("//*[@id=\"form1\"]/div[1]/table/tbody/tr[18]/td[3]/input"));
    if (clear.isEnabled()) {System.out.println("love you ramesh");
		
	} else {System.out.println("hate you ramsh");}

	}
    @Test (priority=10)
    public void contains() {
    List<WebElement> mama = new Select(driver.findElement(By.name("BLOOD_GRP_CODE"))).getOptions();
    //System.out.println(mama);
    if (mama.get(4).getText().contains("AB-")) {System.out.println("its visible");
		
	} else {System.out.println("not visible");}

	}
  @Test
  public void asse() {
	  
	  }
	
  
  @BeforeTest
  public void openurl() throws Exception {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\91991\\Downloads\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("http://www.computechis.com/DemoSite");
	  driver.manage().window().maximize();
	 /// manage().deleteAllCookies();
	  Thread.sleep(3000);
	  
	  
  }

  private Options manage() {
	// TODO Auto-generated method stub
	return null;
}
@AfterTest
  public void afterTest() {
  }

}
