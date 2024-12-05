package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class NewTest2 {
		WebDriver driver;
  
  @Test
  public void printTitle() {
	  driver.get("http://127.0.0.1/orangehrm-2.5.0.2/login.php");
	  String title = driver.getTitle();
	  System.out.println(title);
	  Assert.assertEquals(title, "OrangeHRM - New Level of HR Management");
  }
  @BeforeClass
  public void launchBrowser() {
	  driver = new FirefoxDriver();
	  
  }

  @AfterClass
  public void closeBrowser() {
	  driver.close();
  }	

}
